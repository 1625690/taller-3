/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author invitado
 */
public class UserException extends Exception{

    public UserException() {
        super("El usuario o la contraseña no existen");
        
    }
    
}
