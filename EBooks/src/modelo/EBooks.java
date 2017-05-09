/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.*;

/**
 *
 * @author invitado
 */
public class EBooks {
    
    
    private HashMap libros;
    
    
    public EBooks(){
        this.libros = new HashMap();
    }
    
    /**
     * Busca un libro por ISBN y retorna el objeto
     * @param isbn -  String con el isbn
     * @return null si no lo encuentra
     */
    public Libro buscarLibroISBN(String isbn){
        Libro buscado = null;
        
        for (Iterator iterator = libros.values().iterator(); iterator.hasNext();) {
            
            buscado = (Libro)iterator.next();
            if(buscado.getISBN().equalsIgnoreCase(isbn)){
                return buscado;
            }
        }        
        return buscado;
    }
    
    public boolean agregarLibro(String isbn, int numPag, String titulo, String resumen, String autor, double precio, String categoria, boolean esBestSeller, String rangoEdad){
        boolean agregado = false;
        Libro l = new Libro(isbn, numPag, titulo, resumen, autor, precio, categoria, esBestSeller, rangoEdad);
        if(libros.put(isbn, l) == null){
            agregado = true;
        }
        return agregado;
    }
    
    public boolean eliminarLibro(String isbn){
        boolean eliminado = false;
        if(libros.remove(isbn) != null){
            eliminado = true;
        }
        return eliminado;
    }
    
    public boolean existeLibro(String isbn){        
        return libros.containsKey(isbn);
    }
    
    public boolean modificarLibro(String isbn, int numPag, String titulo, String resumen, String autor, double precio, String categoria, boolean esBestSeller, String rangoEdad){
        boolean modificado = false;
        
        Libro lib = buscarLibroISBN(isbn);
        
        return modificado;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
