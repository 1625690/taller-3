/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.io.Serializable;
import modelo.Libro;

/**
 * Esta clase representa un mensaje enviado por el flujo
 * Se compone de un String que va a ser el comando y un objeto que puede ser un libro
 * @author CristianSteven
 */
public class Paquete implements Serializable{
    
    private String comando;
   
    private Object objeto;

    public Paquete(String comando, Object objeto) {
        this.comando = comando;
        this.objeto = objeto;
    }
    
    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setLibro(Object objeto) {
        this.objeto = objeto;
    }
    
}
