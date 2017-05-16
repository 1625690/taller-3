/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author CristianSteven
 */
public class HiloServer extends Thread{
    
    private ServerSocket server;

    public HiloServer() {
        try{
            server = new ServerSocket(4200);
        }
        catch(IOException Exception){
            
        }
        
    }
 
}
