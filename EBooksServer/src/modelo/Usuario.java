/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 * Clase que representa un usuario
 * @author invitado
 */
public class Usuario implements Serializable {
    
    private String nombre;
        
    private String numeroCelular;
    
    private String email;
      
    private String password;
    
    private String nick;
    
    public Usuario(String nick, String password, String nombre, String numeroCelular, String email){
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.email = email;
        this.nick = nick;
        this.password = password;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }   

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Comparacion de usuario
     * @param objeto
     */
    @Override
    public boolean equals(Object objeto){
        Usuario o = (Usuario)objeto;
        return o.getNick().equals(this.nick);
    }
   
}
