/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author invitado
 */
public class EBooks implements Serializable{

     
    //----------------------------------------------------------------------
    // ATRIBUTOS
    //----------------------------------------------------------------------
    
    private HashMap usuarios;
    
    /**
     * Hashmap de libros
     */
    private HashMap libros;
    
    private HashMap ofertas;
    
    //----------------------------------------------------------------------
    // CONSTRUCTOR
    //----------------------------------------------------------------------
    
    /**
     * 
     */
    public EBooks(){
        usuarios = new HashMap();
        libros = new HashMap();
        ofertas = new HashMap();
    }
    
    //----------------------------------------------------------------------
    // METODOS ADMINISTRADOR
    //----------------------------------------------------------------------
    
    /**
     * Busca un libro por ISBN y retorna el objeto
     * @param isbn String con el isbn
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
    
        /**
     * Busca un libro por Titulo y retorna el objeto
     * @param titulo String con el titulo
     * @return null si no lo encuentra
     */
    public Libro buscarLibroTitulo(String titulo){
        Libro buscado = null;
        
        for (Iterator iterator = libros.values().iterator(); iterator.hasNext();) {
            
            buscado = (Libro)iterator.next();
            if(buscado.getTitulo().equalsIgnoreCase(titulo)){
                return buscado;
            }
        }        
        return buscado;
    }
    
    /**
     * Agrega un libro al hashmap de libro
     * @param isbn
     * @param numPag
     * @param titulo
     * @param resumen
     * @param autor
     * @param precio
     * @param categoria
     * @param esBestSeller
     * @param rangoEdad
     * @return - True si el libro pudo ser agregado
     */
    public boolean agregarLibro(String isbn, int numPag, String titulo, String resumen, String autor, double precio, String categoria, boolean esBestSeller, String rangoEdad){
        boolean agregado = false;
        Libro l = new Libro(isbn, numPag, titulo, resumen, autor, precio, categoria, esBestSeller, rangoEdad);
        if(libros.put(isbn, l) == null){
            agregado = true;
        }
        return agregado;
    }
    
    /**
     * ELimina un libro dado su ISBN
     * @param isbn
     * @return - true si el libro fue eliminado correctamente
     */
    public boolean eliminarLibro(String isbn){
        boolean eliminado = false;
        if(libros.remove(isbn) != null){
            eliminado = true;
        }
        return eliminado;
    }
    
    /**
     * Busca si el libro existe en la libreria por isbn
     * @param isbn
     * @return true si se encuentra
     */
    public boolean existeLibro(String isbn){        
        return libros.containsKey(isbn);
    }

    /**
     * Crea un periodo de oferta
     * @return 
     */
    public boolean crearPeriodoOferta(String nombre, Calendar fechaInicio, Calendar fechaFin, int porcentajeDescueto){
        boolean creado = false;
        PeriodoOferta periodo = new PeriodoOferta(nombre, fechaInicio, fechaFin, porcentajeDescueto);
        if(libros.put(nombre, periodo) == null){
            creado = true;
        }
        return creado;
    }
    
    /**
     * Modifica un libro dado los parámetros
     * @param isbn
     * @param numPag
     * @param titulo
     * @param resumen
     * @param autor
     * @param precio
     * @param categoria
     * @param esBestSeller
     * @param rangoEdad 
     */
    public void modificarLibro(String isbn, int numPag, String titulo, String resumen, String autor, double precio, String categoria, boolean esBestSeller, String rangoEdad){
        
        Libro lib = buscarLibroISBN(isbn);
        lib.setAutor(autor);
        lib.setCategoria(categoria);
        lib.setEsBestSeller(esBestSeller);
        lib.setTitulo(titulo);
        lib.setResumen(resumen);
        lib.setNumPag(numPag);
        lib.setPrecio(precio);        
   
    }
    
    /**
     * Coloca un libro en oferta si existe
     * @param isbn
     * @param nombreOferta
     * @return 
     */
    public boolean colocarLibroEnOferta(String isbn, String nombreOferta){
        boolean colocado = false;
        Libro l = buscarLibroISBN(isbn);
        
        PeriodoOferta periodo = (PeriodoOferta)ofertas.get(nombreOferta);
        if(l != null && periodo != null){
            l.setEnOferta(true);
            l.setOferta(periodo);
            libros.put(isbn, l);
            colocado = true;
        }
        
        return colocado;
    }
    
    /**
     * Metodo que da una lista de los libros por categoria
     * @param categoria categoria de los libros
     * @return un hashMap con los libros de esa categoria
     */
    public HashMap darLibrosPorCategoria(String categoria){
        HashMap lista = new HashMap();
        Libro buscado = null;
        for (Iterator iterator = libros.values().iterator(); iterator.hasNext();) {
            
            buscado = (Libro)iterator.next();
            if(buscado.getCategoria().equals(categoria)){
                lista.put(buscado.getISBN(), buscado);
            }
        }          
        return lista;
    }
    
    //----------------------------------------------------------------------
    // GETS Y SETTERS
    //----------------------------------------------------------------------
    
    public HashMap getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashMap usuarios) {
        this.usuarios = usuarios;
    }

    public HashMap getLibros() {
        return libros;
    }

    public void setLibros(HashMap libros) {
        this.libros = libros;
    }

    public HashMap getOfertas() {
        return ofertas;
    }

    public void setOfertas(HashMap ofertas) {
        this.ofertas = ofertas;
    }   
   
}
