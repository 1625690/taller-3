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
                Iterator i = libreria.getLibros().values().iterator();
                while(i.hasNext()){
                    Libro l = (Libro)i.next();
                    System.out.println(l.getISBN() + " - " + l.getTitulo());
                }
            }
        }
        catch(Exception e){
            
        }
        
        libreria.agregarLibro("000012", 200, "El tunel", "asdddsasad", "Ernesto Sabato", 10000, "Realismo magico", false, "16-99");
        
        try{            
            ObjectOutputStream escritura = new ObjectOutputStream(new FileOutputStream("libros.txt", false));
            escritura.writeObject(libreria.getUsuarios());
            escritura.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
