/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

/**
 *
 * @author JhonCarlos
 */
public class Background implements Border{
    public BufferedImage back;
    public int selector;    //Para definir el tipo de ventana. 0 - UL, 1 - UAL
    
 
    public Background(int selector){
        this.selector = selector;
        
        switch(this.selector){
            case 0:
                try {
                    URL imagePath = new URL(getClass().getResource("../imagenes/Fondo UL.jpg").toString());
                    back = ImageIO.read(imagePath);
                } catch (IOException ex) {          
                    System.out.println("No se pudo cargar el fondo de escritorio.");
                }
                break;
            
            case 1:
                try {
                    URL imagePath = new URL(getClass().getResource("../imagenes/Fondo UAL.jpg").toString());
                    back = ImageIO.read(imagePath);
                } catch (IOException ex) {          
                    System.out.println("No se pudo cargar el fondo de escritorio.");
                }
                break;       
        }
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(back, (x + (width - back.getWidth())/2),(y + (height - back.getHeight())/2), null);
    }
 
    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }
 
    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}
