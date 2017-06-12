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
    
    /**
     * Marca si el libro esta en oferta
     */
    private boolean enOferta;
    
    /**
     * Periodo de oferta del libro
     */
    private PeriodoOferta oferta;
    
    /**
     * Ruta del libro en txt
     */
    private String ruta;
    
    /**
     * Calificacion
     */
    private int calificacion;
    //----------------------------------------------------------------------
    // CONSTRUCTOR
    //----------------------------------------------------------------------
    /**
     * Clase que representa un libro
     * @param isbn - Identificador
     * @param numPag
     * @param titulo
     * @param resumen
     * @param autor
     * @param precio
     * @param categoria
     * @param esBestSeller
     * @param rangoEdad 
     */
    public Libro(String isbn, int numPag, String ruta, String titulo, String resumen, String autor, double precio, String categoria, boolean esBestSeller, String rangoEdad) {
        this.ruta = ruta;
        this.numPag = numPag;
        this.titulo = titulo;
        this.resumen = resumen;
        this.autor = autor;
        this.precio = precio;
        this.categoria = categoria;
        this.esBestSeller = esBestSeller;
        this.rangoEdad = rangoEdad;
        this.ISBN = isbn;
        this.enOferta = false;
        this.oferta = null;
        calificacion = 0;
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
        if(oferta == null){
            return precio;
        }else{
            this.precio = precio - (precio*(oferta.getPorcentajeDescuento()/100));
        }
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isEnOferta() {
        return enOferta;
    }

    public void setEnOferta(boolean enOferta) {
        this.enOferta = enOferta;
    }   

    public PeriodoOferta getOferta() {
        return oferta;
    }

    public void setOferta(PeriodoOferta oferta) {
        this.oferta = oferta;
    }    

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }   

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    
    
    /**
     * Comparacion
     * @param objeto
     */
    @Override
    public boolean equals(Object objeto){
        Libro o = (Libro)objeto;
        return o.getTitulo().equals(this.titulo);
    }
}
