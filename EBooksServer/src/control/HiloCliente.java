/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import modelo.*;
import common.*;
import java.util.HashMap;

/**
 *
 * @author invitado
 */
public class HiloCliente extends Thread{
    
    //----------------------------------------------------------------------
    // COMANDOS
    //----------------------------------------------------------------------
    
    private static String CONSULTAR_LIBRO = "CONSULTAR";
    
    private static String CONSULTAR_POR_CATEGORIA = "CONSULTAR_CATEGORIAS";
    
    private static String CERRAR = "CLOSE";

    
    //----------------------------------------------------------------------
    // ATRIBUTOS
    //----------------------------------------------------------------------
    
    /**
     * Libreria
     */
    private EBooks libreria;
    
    /**
     * Socket del cliente
     */
    private Socket conexion;
    
    /**
     * Stream de lectura
     */
    private ObjectInputStream lector;
    
    /**
     * Stream de escritura
     */
    private ObjectOutputStream escritor;
    
    
    //----------------------------------------------------------------------
    // CONSTRUCTOR
    //----------------------------------------------------------------------

    public HiloCliente(EBooks libreria, Socket cliente) {
        
        super();
        this.libreria = libreria;
        conexion = cliente;
        try {
            //Se inicializan los flujos de Lectura - Escritura
            lector = new ObjectInputStream(conexion.getInputStream());
            escritor = new ObjectOutputStream(conexion.getOutputStream());
            
        } catch (IOException e) {
            
        }
        
    }
    
    //----------------------------------------------------------------------
    // METODOS
    //----------------------------------------------------------------------
    
    /**
     * Consulta un libro
     * @param isbn
     * @return - Objeto de la clase libro, null si no encuentra el libro
     */
    public Libro consultarLibro(String isbn){
        return libreria.buscarLibroISBN(isbn);
    }

    @Override
    public void run() {
        try{
            boolean terminar = true;
            while(terminar){
                
                //Recibe el paquete
                Paquete packet = (Paquete)lector.readObject();
                String comando = packet.getComando();
                if(comando.equals(CONSULTAR_LIBRO)){
                    Paquete p = (Paquete)lector.readObject();
                    Libro lib = (Libro)p.getObjeto();
                    Libro buscado = libreria.buscarLibroTitulo(lib.getTitulo());
                    escritor.writeObject(buscado);
                    escritor.flush();
                                 
                }
                else if(comando.equals(CONSULTAR_POR_CATEGORIA)){
                    Paquete p = (Paquete)lector.readObject();
                    String categoria = (String)p.getObjeto();
                    HashMap lista = libreria.darLibrosPorCategoria(categoria);
                    escritor.writeObject(lista);
                    escritor.flush();
                      
                }else if(comando.equals(CERRAR)){
                    escritor.close();
                    terminar = false;                    
                }               
            }
            
        }catch(Exception e){
            
        }      
    }    
}
