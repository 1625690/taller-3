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
import java.util.HashMap;
import java.util.Iterator;
import modelo.*;

/**
 *
 * @author invitado
 */
public class Controladora {   
    
    public static void main(String[] args) {
        
        EBooks libreria = new EBooks();
        //LECTURA DE LA PERSISTENCIA
        try{
            File archivo = new File("liberia.txt");
            if(archivo.exists()){
                ObjectInputStream lectura = new ObjectInputStream(new FileInputStream(archivo));
                libreria = (EBooks)lectura.readObject();
                lectura.close();
            }
        }
        catch(Exception e){
            
        }
        
        //APERTURA DEL SERVIDOR
        try{
            //Crea el Hilo del servidor que escucha las conexiones
            HiloServer server = new HiloServer();
            server.start();
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        

        
        //ESCRITURA DE LA PERSISTENCIA
        try{            
            ObjectOutputStream escritura = new ObjectOutputStream(new FileOutputStream("libreria.txt", false));
            escritura.writeObject(libreria);  
            escritura.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
