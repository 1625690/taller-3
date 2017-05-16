/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import vista.*;
import common.Paquete;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import modelo.*;

/**
 * Clase que inicializa el cliente de la aplicacion EBooks
 * @author CristianSteven
 */
public class Ejecutable {
    
        //----------------------------------------------------------------------
    // COMANDOS
    //----------------------------------------------------------------------
    
    private static String CONSULTAR_LIBRO = "CONSULTAR";
    
    private static String CONSULTAR_POR_CATEGORIA = "CONSULTAR_CATEGORIAS";
    
    private static String CERRAR = "CLOSE";
    
    private static Socket socket;
    
    private static String IP = "";
    
    private static int PORT = 4200;
    
    private static ObjectInputStream lector;
    
    private static ObjectOutputStream escritor;
    
    // JHON REVISA ESTE METODO
    public static void consultarLibroTitulo(String titulo) {
        
        Paquete packet = new Paquete(CONSULTAR_LIBRO, null);
        
        try{
            //Manda un paquete con el comando consultar libro por titulo al servidor
            escritor.writeObject(packet);
            escritor.flush();
            //Recibe el paquete de respuesta
            packet = (Paquete)lector.readObject();
            //Comprueba si el libro recibido en el paquete es nulo
            //Si no es nulo, arma el objeto libro
            if(packet.getObjeto()!=null){
                //Con este libro trabajamos para mostrarlo en la interfaz
                Libro recibido = (Libro)packet.getObjeto();
            }
        }catch(Exception e){
            
        }
        
    }
    
    public static void main(String args[])throws UnknownHostException, IOException{
        try{
            socket = new Socket(InetAddress.getByAddress(null), PORT);
            System.out.println("Conectado");
            lector = new ObjectInputStream(socket.getInputStream());
            escritor = new ObjectOutputStream(socket.getOutputStream());
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            
        }
    }
    
}
