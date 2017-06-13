/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import tipografia.*;

import java.awt.Color;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

/**
 *
 * @author JhonCarlos
 */
public class SummaryUserUAL extends javax.swing.JPanel {
    Color transparencia, colorFondoUL, colorFondoUAL, colorFuenteUL, colorFuenteUAL;
    Fuente garamondRegular, garamondItalic, verdanaRegular, verdanaBold;
    
    /**
     * Creates new form SummaryUser
     */
    public SummaryUserUAL() {
        initComponents();
                
        this.transparencia = new Color(0,0,0,0);
        
        garamondRegular = new Fuente(3);
        garamondItalic = new Fuente(2);
        verdanaRegular = new Fuente(4);
        verdanaBold = new Fuente(5);
        
        this.setBackground(transparencia);
        
        this.jPanelInfo.setBackground(transparencia);
        this.jPanelImgPerfil.setBackground(transparencia);
        this.establecerMedidas();
        
        this.jLabelImgPerfil.setHorizontalAlignment(SwingConstants.CENTER);
        this.jLabelImgPerfil.setVerticalAlignment(SwingConstants.CENTER);
        
        //Agregar fuentes
        this.jLabelNombre.setFont(garamondItalic.fuenteAgregar(18f));
        this.jLabelApellido.setFont(garamondRegular.fuenteAgregar(16f));
        this.jLabelCelular.setFont(verdanaRegular.fuenteAgregar(14f));
        this.jLabelMail.setFont(verdanaRegular.fuenteAgregar(14f));
        this.jLabelCumple.setFont(verdanaRegular.fuenteAgregar(14f));
        this.jLabelEdad.setFont(verdanaRegular.fuenteAgregar(14f));
        this.jButtonInfoUsuario.setFont(verdanaRegular.fuenteAgregar(12f));
    }
    
    public void establecerMedidas(){
        int anchuraPortada = (int) Math.floor((this.getWidth() * 2/5) - 20);
        int anchuraInfo = (int) Math.floor((this.getWidth() * 3/5) - 10);
        int altura = (int) Math.floor(this.getHeight() - 20);
        Point pImgPerfil = new Point(10,10);
        Point pInfo = new Point(anchuraPortada + 20, 10);
        
        this.jPanelImgPerfil.setSize(anchuraPortada, altura);
        this.jPanelImgPerfil.setLocation(pImgPerfil);
        this.jPanelInfo.setLocation(pInfo);
        this.jPanelInfo.setSize(anchuraInfo, altura);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelImgPerfil = new javax.swing.JPanel();
        jLabelImgPerfil = new javax.swing.JLabel();
        jPanelInfo = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jLabelMail = new javax.swing.JLabel();
        jLabelCumple = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jButtonInfoUsuario = new javax.swing.JButton();

        setBackground(new java.awt.Color(201, 178, 169));

        jPanelImgPerfil.setBackground(new java.awt.Color(201, 164, 171));
        jPanelImgPerfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelImgPerfil.setBackground(new java.awt.Color(79, 79, 79));
        jLabelImgPerfil.setForeground(new java.awt.Color(79, 79, 79));
        jLabelImgPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PerfilUAL.png"))); // NOI18N

        javax.swing.GroupLayout jPanelImgPerfilLayout = new javax.swing.GroupLayout(jPanelImgPerfil);
        jPanelImgPerfil.setLayout(jPanelImgPerfilLayout);
        jPanelImgPerfilLayout.setHorizontalGroup(
            jPanelImgPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImgPerfilLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelImgPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelImgPerfilLayout.setVerticalGroup(
            jPanelImgPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImgPerfilLayout.createSequentialGroup()
                .addComponent(jLabelImgPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelInfo.setBackground(new java.awt.Color(201, 164, 171));

        jLabelNombre.setFont(new java.awt.Font("Adobe Garamond Pro", 2, 16)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(65, 60, 60));
        jLabelNombre.setText("(Nombre)");

        jLabelApellido.setFont(new java.awt.Font("Adobe Garamond Pro", 1, 16)); // NOI18N
        jLabelApellido.setForeground(new java.awt.Color(65, 60, 60));
        jLabelApellido.setText("(Apellido)");

        jLabelCelular.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabelCelular.setForeground(new java.awt.Color(65, 60, 60));
        jLabelCelular.setText("(Celular)");

        jLabelMail.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabelMail.setForeground(new java.awt.Color(65, 60, 60));
        jLabelMail.setText("(E-Mail)");

        jLabelCumple.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabelCumple.setForeground(new java.awt.Color(65, 60, 60));
        jLabelCumple.setText("(Fecha de cumpleaños)");

        jLabelEdad.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabelEdad.setForeground(new java.awt.Color(65, 60, 60));
        jLabelEdad.setText("(Edad)");

        jButtonInfoUsuario.setBackground(new java.awt.Color(201, 178, 169));
        jButtonInfoUsuario.setForeground(new java.awt.Color(65, 60, 60));
        jButtonInfoUsuario.setText("Información Usuario");

        javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
        jPanelInfo.setLayout(jPanelInfoLayout);
        jPanelInfoLayout.setHorizontalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonInfoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelApellido)
                            .addComponent(jLabelCelular)
                            .addComponent(jLabelMail)
                            .addComponent(jLabelCumple)
                            .addComponent(jLabelEdad))
                        .addGap(0, 209, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelApellido)
                .addGap(18, 18, 18)
                .addComponent(jLabelCelular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCumple)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEdad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonInfoUsuario)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelImgPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelImgPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInfoUsuario;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCumple;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelImgPerfil;
    private javax.swing.JLabel jLabelMail;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanelImgPerfil;
    private javax.swing.JPanel jPanelInfo;
    // End of variables declaration//GEN-END:variables
}