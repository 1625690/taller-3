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
        
        try{
            File archivo = new File("libros.txt");
            if(archivo.exists()){
                ObjectInputStream lectura = new ObjectInputStream(new FileInputStream(archivo));
                libreria.setLibros((HashMap)lectura.readObject());
                Iterator i = libreria.getLibros().values().iterator();
                while(i.hasNext()){
                    Libro l = (Libro)i.next();
                    System.out.println(l.getISBN() + " - " + l.getTitulo() + " - " + l.getAutor());
                }
                lectura.close();
            }
        }
        catch(Exception e){
            
        }
        
        libreria.modificarLibro("12232", 200, "El principito", "asdfdgdfdf", "Antoine de Saint-Exupery", 10000, 
                "Infantil", true, "4-99");
        
           try{            
            ObjectOutputStream escritura = new ObjectOutputStream(new FileOutputStream("libros.txt", false));
            escritura.writeObject(libreria.getLibros());  
            escritura.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
