/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
 

/**
 *
 * @author CristianSteven
 */
public class UsuarioAdministrador extends Usuario{
    
    private boolean autorizado;
    
    private String cargo;
    
    public UsuarioAdministrador(String nick, String password, String nombre, String numeroCelular, String email, String cargo, boolean autorizado) {
        super(nick, password, nombre, numeroCelular, email);
        this.cargo = cargo;
        this.autorizado = autorizado;
    }        

    public boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    
    
}
