/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import modelo.*;

/**
 *
 * @author CristianSteven
 */
public class HiloServer extends Thread{
    
    private ServerSocket server;      
    private static HiloCliente hiloCliente;
    private EBooks libreria;
    private Socket cliente;
    
    public HiloServer() {
        try{
            //CARGA LOS DATOS DEL SERVER
            File archivo = new File("libreria.txt");
            if(archivo.exists()){
                ObjectInputStream lectura = new ObjectInputStream(new FileInputStream(archivo));
                libreria = (EBooks)lectura.readObject();
                lectura.close();
            }            
            for (Iterator iterator = libreria.getLibros().values().iterator(); iterator.hasNext();) {
            
                Libro buscado = (Libro)iterator.next();
                System.out.println(buscado.getISBN() + " - " + buscado.getTitulo() + " - " + buscado.getCategoria());
            } 
            //libreria.modificarLibro("00001", 200, "El amor en los tiempos del colera", "asdasd", "Gabriel garcia", 15500, "Colombia", true, "25");
            //libreria.agregarLibro("25223", 52, "Brujeria", "asdasd", "Miguel Angel", 20000, "Fantasia", false, "18-99");
//            ObjectOutputStream escritura = new ObjectOutputStream(new FileOutputStream("libreria.txt", false));
//            escritura.writeObject(libreria);  
//            escritura.close();  
        }
        catch(IOException e){
            
        }catch(ClassNotFoundException e){
            
        }
    }
    
    public void run(){
        try{
            //Inicia el serverSocket
            server = new ServerSocket(4200);
            boolean terminar = false;
            while(!terminar){
                System.out.println("Esperando clientes");
                cliente = server.accept();  
                System.out.println("Se ha conectado un cliente");
                hiloCliente = new HiloCliente(libreria, cliente);
                hiloCliente.start();
                               
            }
            //ESCRITURA AL CERRAR EL SERVER
            ObjectOutputStream escritura = new ObjectOutputStream(new FileOutputStream("libreria.txt", false));
            escritura.writeObject(libreria);  
            escritura.close();
            
        }catch(Exception e){
                
        }
    }
}
