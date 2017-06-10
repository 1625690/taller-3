/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipografia;

import java.awt.Font;
import java.io.InputStream;

/**
 *
 * @author JhonCarlos
 */
public class Fuente {
    //Número para elegir cuál de las fuentes se cargará.
    int seleccionFuente;
    private Font font = null;
    
    /*
    String fontName = "<nombre de la fuente>";
    try{
        Carga de fuente solicitada
    }
    catch (Exception ex) {
        Carga de fuente por defecto
    }
    */
    
    public Fuente(int seleccionFuente){
        this.seleccionFuente = seleccionFuente;
        String fontName = "";
        
        switch(this.seleccionFuente){
            case 0:
                fontName = "AGaramondPro-Bold.otf";
                try{
                    InputStream is = getClass().getResourceAsStream(fontName);
                    font = Font.createFont(Font.TRUETYPE_FONT, is);
                }
                catch (Exception ex){
                    System.err.println("La fuente " + fontName + "no fue cargada. Se aplicará una por defecto.");
                    font = new Font("Arial", Font.PLAIN, 18);
                }
                break;
                
            case 1:
                fontName = "AGaramondPro-BoldItalic.otf";
                try{
                    InputStream is = getClass().getResourceAsStream(fontName);
                    font = Font.createFont(Font.TRUETYPE_FONT, is);
                }
                catch (Exception ex){
                    System.err.println("La fuente " + fontName + "no fue cargada. Se aplicará una por defecto.");
                    font = new Font("Arial", Font.PLAIN, 18);
                }
                break;
            
            case 2:
                fontName = "AGaramondPro-Italic.otf";
                try{
                    InputStream is = getClass().getResourceAsStream(fontName);
                    font = Font.createFont(Font.TRUETYPE_FONT, is);
                }
                catch (Exception ex){
                    System.err.println("La fuente " + fontName + "no fue cargada. Se aplicará una por defecto.");
                    font = new Font("Arial", Font.PLAIN, 18);
                }
                break;
            
            case 3:
                fontName = "AGaramondPro-Regular.otf";
                try{
                    InputStream is = getClass().getResourceAsStream(fontName);
                    font = Font.createFont(Font.TRUETYPE_FONT, is);
                }
                catch (Exception ex){
                    System.err.println("La fuente " + fontName + "no fue cargada. Se aplicará una por defecto.");
                    font = new Font("Arial", Font.PLAIN, 18);
                }
                break;
            
            case 4:
                fontName = "verdana.ttf";
                try{
                    InputStream is = getClass().getResourceAsStream(fontName);
                    font = Font.createFont(Font.TRUETYPE_FONT, is);
                }
                catch (Exception ex){
                    System.err.println("La fuente " + fontName + "no fue cargada. Se aplicará una por defecto.");
                    font = new Font("Arial", Font.PLAIN, 18);
                }
                break;
            
            case 5:
                fontName = "verdanab.ttf";
                try{
                    InputStream is = getClass().getResourceAsStream(fontName);
                    font = Font.createFont(Font.TRUETYPE_FONT, is);
                }
                catch (Exception ex){
                    System.err.println("La fuente " + fontName + "no fue cargada. Se aplicará una por defecto.");
                    font = new Font("Arial", Font.PLAIN, 18);
                }
                break;
            
            case 6:
                fontName = "verdanai.ttf";
                try{
                    InputStream is = getClass().getResourceAsStream(fontName);
                    font = Font.createFont(Font.TRUETYPE_FONT, is);
                }
                catch (Exception ex){
                    System.err.println("La fuente " + fontName + "no fue cargada. Se aplicará una por defecto.");
                    font = new Font("Arial", Font.PLAIN, 18);
                }
                break;
            
            case 7:
                fontName = "verdanaz.ttf";
                try{
                    InputStream is = getClass().getResourceAsStream(fontName);
                    font = Font.createFont(Font.TRUETYPE_FONT, is);
                }
                catch (Exception ex){
                    System.err.println("La fuente " + fontName + "no fue cargada. Se aplicará una por defecto.");
                    font = new Font("Arial", Font.PLAIN, 18);
                }
                break;
        }
    }
    
    
    public Font fuenteAgregar(float tamano){
        Font tfont = font.deriveFont(this.seleccionFuente, tamano);
        return tfont;
    }
}
