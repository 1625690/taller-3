/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import modelo.*;

/**
 *
 * @author CristianSteven
 */
public class HiloServer extends Thread{
    
    private ServerSocket server;      
    private static HiloCliente hiloCliente;
    private EBooks libreria;
    private Socket cliente;
    
    public HiloServer(EBooks libreria) {
        try{
            server = new ServerSocket(4200);
            this.libreria = libreria;
        }
        catch(IOException Exception){
            
        }       
    }
    
    public void run(){
        try{
            while(true){
                System.out.println("Esperando clientes");
                cliente = server.accept();   
                hiloCliente = new HiloCliente(libreria, cliente);
                hiloCliente.start();
                System.out.println("Se ha conectado un cliente");
            }
        }catch(Exception e){
                
        }        
    }
}
