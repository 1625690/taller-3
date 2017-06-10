/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;

/**
 * 
 * @author CristianSteven
 */
public class Recarga {
    //CLASE NO IMPLEMENTADA EN LA INTERFAZ
    
    private String consecutivo;
    
    private Calendar fecha;
    
    private double valor;
    
    private int hora;

    public Recarga(double valor){
        this.valor = valor;
        this.fecha = Calendar.getInstance();
        this.hora = fecha.get(Calendar.HOUR_OF_DAY);
    }

    public String getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    
}
