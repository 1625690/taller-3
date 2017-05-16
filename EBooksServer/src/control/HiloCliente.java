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

/**
 *
 * @author invitado
 */
public class HiloCliente extends Thread{
    
    //----------------------------------------------------------------------
    // COMANDOS
    //----------------------------------------------------------------------
    
    /**
     * Comand de recibido
     */
    private static String CMD_OK = "OK";
    
    /**
     * Comando de error
     */
    private static String CMD_ER = "ER";
    
    /**
     * Comando para cerrar
     */
    private static String CMD_NO = "CLOSE";
    
    private static String CONSULTAR_LIBRO = "CONSULTAR";

    
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
            while(true){
                
                //Recibe el paquete
                Paquete packet = (Paquete)lector.readObject();
                String comando = packet.getComando();
                if(comando == CONSULTAR_LIBRO){
                    Paquete p = (Paquete)lector.readObject();
                    Libro lib = (Libro)p.getObjeto();
                    Libro buscado = libreria.buscarLibroTitulo(lib.getTitulo());
                    escritor.writeObject(buscado);
                    escritor.flush();
                    escritor.close();
                    
                }
            }
            
        }catch(Exception e){
            
        }      
    }    
}
