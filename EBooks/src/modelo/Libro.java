/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 * Representa un libro
 * @author invitado
 */
public class Libro implements Serializable {
    
  
    //----------------------------------------------------------------------
    // ATRIBUTOS
    //----------------------------------------------------------------------
    
    /**
     * Numero de paginas del libro
     */
    private int numPag;
    
    /**
     * Titulo del libro
     */
    private String titulo;
    
    /**
     * Resumen del libro
     */
    private String resumen;
    
    /**
     * Autor del libro
     */
    private String autor;
    
    /**
     * Precio del libro
     */
    private double precio;
    
    /**
     * Categoria del libro
     */
    private String categoria;
    
    /**
     * Es best Seller
     */
    private boolean esBestSeller;
    
    /**
     * Rango de edad al publico
     */
    private String rangoEdad;
    
    /**
     * Identificador del libro
     */
    private String ISBN;
    
    //----------------------------------------------------------------------
    // CONSTRUCTOR
    //----------------------------------------------------------------------

    public Libro(String isbn, int numPag, String titulo, String resumen, String autor, double precio, String categoria, boolean esBestSeller, String rangoEdad) {
        this.numPag = numPag;
        this.titulo = titulo;
        this.resumen = resumen;
        this.autor = autor;
        this.precio = precio;
        this.categoria = categoria;
        this.esBestSeller = esBestSeller;
        this.rangoEdad = rangoEdad;
        this.ISBN = isbn;
    }
    
    //----------------------------------------------------------------------
    // GETS Y SETTERS
    //----------------------------------------------------------------------

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isEsBestSeller() {
        return esBestSeller;
    }

    public void setEsBestSeller(boolean esBestSeller) {
        this.esBestSeller = esBestSeller;
    }

    public String getRangoEdad() {
        return rangoEdad;
    }

    public void setRangoEdad(String rangoEdad) {
        this.rangoEdad = rangoEdad;
    }
    
    /**
     * Comparacion
     */
    public boolean equals(Object objeto){
        Libro o = (Libro)objeto;
        if (o.getTitulo().equals(this.titulo)) {
            return true;
        }else{
            return false;
        }
    }
}
