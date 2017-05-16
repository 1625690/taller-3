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
        //APERTURA DEL SERVIDOR
        try{
            //Crea el Hilo del servidor que escucha las conexiones
            HiloServer server = new HiloServer(libreria);
            server.start();           
            
            
        }catch(Exception e){
            
        }
    }
}
