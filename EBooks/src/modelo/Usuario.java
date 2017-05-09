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
    
    private String nick;
    
    private String password;
    
    public Usuario(String nick, String password){
        this.nick = nick;
        this.password = password;
        
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
