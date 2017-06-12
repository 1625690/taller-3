/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author CristianSteven
 */
public class UsuarioLibreria extends Usuario{

    private Calendar fechaCumple;
    
    private double saldo;
    
    private int edad;
    
    private ArrayList<Recarga> recargas;
       
    public UsuarioLibreria(String nick, String password, String nombre, String numeroCelular, String email, Calendar fechaCumple, double saldo) {
        super(nick, password, nombre, numeroCelular, email);
        this.fechaCumple = fechaCumple;
        this.saldo = saldo;
        recargas = new ArrayList<Recarga>();
        
    }
    
    public void agregarRecarga(double valor){
        recargas.add(new Recarga(valor));
        this.saldo += valor;
    }

    public Calendar getFechaCumple() {
        return fechaCumple;
    }

    public void setFechaCumple(Calendar fechaCumple) {
        this.fechaCumple = fechaCumple;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Recarga> getRecargas() {
        return recargas;
    }

    public void setRecargas(ArrayList<Recarga> recargas) {
        this.recargas = recargas;
    }    
}
