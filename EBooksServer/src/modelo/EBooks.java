/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
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
    
    /**
     * Hashmap de usuarios
     */
    private HashMap usuarios;
    
    /**
     * Hashmap de libros
     */
    private HashMap libros;
    
    /**
    * 
    */
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
    // MANEJO DE LIBROS
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
     * @param ruta
     * @param titulo
     * @param resumen
     * @param autor
     * @param precio
     * @param categoria
     * @param esBestSeller
     * @param rangoEdad
     * @return - True si el libro pudo ser agregado
     */
    public boolean agregarLibro(String isbn, String ruta, int numPag, String titulo, String resumen, String autor, double precio, String categoria, boolean esBestSeller, String rangoEdad){
        
        Libro l = new Libro(isbn, numPag, ruta, titulo, resumen, autor, precio, categoria, esBestSeller, rangoEdad);
        if(libros.containsKey(isbn) == false){
            libros.put(isbn, l);
            return false;
        }
        return true;
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
     * @param nombre
     * @param fechaInicio
     * @param fechaFin
     * @param porcentajeDescueto
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
     * Retorna un string con el libro indicado a leer segun una ruta
     * @param ruta
     * @return un string con el contenido del libro, null en caso contrario
     */
    public String leerLibro(String ruta){
        String libro = null;        
        try {           
            File archivo = new File(ruta);
            BufferedReader lectura = new BufferedReader(new FileReader(archivo));
            if(archivo.exists()){
                //Construye el libro
                StringBuilder lib = new StringBuilder();
                String linea = lectura.readLine();
                while(lectura != null){
                    lib.append(linea);
                    linea = lectura.readLine();
                }
                lectura.close();
                libro = lib.toString();
            }            
           
        } catch (Exception e) {
        }
        return libro;
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
        for (Iterator iterator = libros.values().iterator(); iterator.hasNext();) {
            
            Libro buscado = (Libro)iterator.next();
            if(buscado.getCategoria().equals(categoria)){
                lista.put(buscado.getISBN(), buscado);
            }
        }          
        return lista;
    }
    
    /**
     * Retorna un hashmap con los libros que son best seller
     * @return 
     */
    public HashMap darLibrosBestSeller(){
        HashMap lista = new HashMap();        
        for (Iterator iterator = libros.values().iterator(); iterator.hasNext();) {            
            Libro buscado = (Libro)iterator.next();
            if(buscado.isEsBestSeller() == true){
                lista.put(buscado.getISBN(), buscado);
            }
        }          
        return lista;
    }
    
    /**
     * Retorna un hashmap con los libros que estan en oferta
     * @return 
     */
    public HashMap darLibrosEnOferta(){
        HashMap lista = new HashMap();        
        for (Iterator iterator = libros.values().iterator(); iterator.hasNext();) {            
            Libro buscado = (Libro)iterator.next();
            if(buscado.isEnOferta() == true){
                lista.put(buscado.getISBN(), buscado);
            }
        }          
        return lista;
    }
    
    //----------------------------------------------------------------------
    // MANEJO USUARIOS
    //----------------------------------------------------------------------
    
    /**
     * 
     * @param nick
     * @param password
     * @param nombre
     * @param numeroCelular
     * @param email
     * @param cargo
     * @param autorizado
     * @return 
     */
    public boolean agregarUsuarioAdministrador(String nick, String password, String nombre, String numeroCelular, String email, String cargo, boolean autorizado){
        UsuarioAdministrador u = new UsuarioAdministrador(nick, password, nombre, numeroCelular, email, cargo, autorizado);
        if(usuarios.containsKey(nick) == false){
           usuarios.put(nick, u);
           return true;
        }
        return false;
    }
    
    /**
     * 
     * @param nick
     * @param password
     * @param nombre
     * @param numeroCelular
     * @param email
     * @param fechaCumple
     * @param saldo
     * @return 
     */
    public boolean agregarUsuarioLibreria(String nick, String password, String nombre, String numeroCelular, String email, Calendar fechaCumple, double saldo){
        UsuarioLibreria u = new UsuarioLibreria(nick, password, nombre, numeroCelular, email, fechaCumple, saldo);
        if(usuarios.containsKey(nick) == false){
           usuarios.put(nick, u);
           return true;
        }
        return false;
    }
    
    public UsuarioAdministrador buscarUsuarioPorNick(String nick){
        UsuarioAdministrador buscado = null;        
        for (Iterator iterator = usuarios.values().iterator(); iterator.hasNext();){
            
            buscado = (UsuarioAdministrador)iterator.next();
            if(buscado.getNick().equalsIgnoreCase(nick)){
                return buscado;
            }
        }        
        return buscado;
    }
    
    public void recargarSaldo(String nick, double saldo){
        UsuarioLibreria u = (UsuarioLibreria)usuarios.get(nick);
        u.agregarRecarga(saldo);        
    }
    
    public ArrayList librosMejorCalificados(){
        ArrayList lista = new ArrayList();
        for (Iterator iterator = libros.values().iterator(); iterator.hasNext();) {
            
            
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
