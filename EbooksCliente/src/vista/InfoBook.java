/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.sun.awt.AWTUtilities;
import tipografia.*;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;


/**
 *
 * @author JhonCarlos
 */
public class InfoBook extends javax.swing.JFrame {
    Color transparencia;
    int x,y;
    ImageIcon starHoover, starVacia, starLlena;
    Icon aux1, aux2, aux3, aux4, aux5, aux6, aux7;
    
    /**
     * Creates new form Prueba
     */
    public InfoBook() {
        initComponents();
        
        //Iconos de estrellas
        this.starHoover = new ImageIcon("/iconos/EstrellaHoover.png");
        this.starVacia = new ImageIcon("/iconos/EstrellaVacia.png");
        this.starLlena = new ImageIcon("/iconos/EstrellaLlena.png");
        
        //Posición
        this.setLocationRelativeTo(null);
        
        //Forma redondeada
        Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,27,27);
        AWTUtilities.setWindowShape(this, forma);
        
        transparencia = new Color(0,0,0,0);
        
        
        this.setResizable(false);
        //this.setBorder(new Background(0));
        jPanelContenedorPrincipal.setBorder(new Background(0));
        contenedorSecundario.setBackground(transparencia);
        this.jScrollPane2.setOpaque(true);
        //this.jScrollPane1.setOpaque(false);
        //this.jTextAreaCategoria.setBackground(transparencia);
        this.jScrollPane1.setBackground(transparencia);
        
        
        this.jTextAreaCategoria.setEditable(false);
        this.jTextAreaSinopsis.setEditable(false);
        
        //Instanciar fuentes
        Fuente garamondRegular = new Fuente(3);
        Fuente garamondItalic = new Fuente(2);
        Fuente garamondBold = new Fuente(0);
        Fuente garamondDoble = new Fuente(1);
        Fuente verdanaRegular = new Fuente(4);
        Fuente verdanaBold = new Fuente(5);
        
        //Establecer fuentes
        this.jLabelTitulo.setFont(garamondItalic.fuenteAgregar(24f));
        this.jLabelTitulo2.setFont(garamondRegular.fuenteAgregar(18f));
        this.jLabelAutor.setFont(verdanaRegular.fuenteAgregar(12f));
        this.jLabelISBN.setFont(verdanaRegular.fuenteAgregar(12f));
        this.jLabelNumPaginas.setFont(verdanaRegular.fuenteAgregar(12f));
        this.jLabelPorcentajeLectura.setFont(verdanaRegular.fuenteAgregar(12f));
        this.jLabelRangoEdad.setFont(verdanaRegular.fuenteAgregar(12f));
        this.jTextAreaSinopsis.setFont(verdanaRegular.fuenteAgregar(10f));
        this.jTextAreaCategoria.setFont(verdanaRegular.fuenteAgregar(12f));
        this.jButtonOpcionLibro.setFont(verdanaRegular.fuenteAgregar(12f));
        
        //Fuentes de indicadores de campo
        this.jLabelInd1.setFont(verdanaBold.fuenteAgregar(12f));
        this.jLabelInd2.setFont(verdanaBold.fuenteAgregar(12f));
        this.jLabelInd3.setFont(verdanaBold.fuenteAgregar(12f));
        this.jLabelInd4.setFont(verdanaBold.fuenteAgregar(12f));
        this.jLabelInd5.setFont(verdanaBold.fuenteAgregar(12f));
        this.jLabelInd6.setFont(verdanaBold.fuenteAgregar(12f));
        this.jLabelInd7.setFont(verdanaBold.fuenteAgregar(12f));
        this.jLabelInd8.setFont(verdanaBold.fuenteAgregar(12f));
        this.jLabelInd9.setFont(verdanaBold.fuenteAgregar(12f));
        
        agregarMouseListeners();
        
        //Agregar funcion de comprobación de clic en estrellas para inhabilitarlas.
        
    }
        
    //Agregar definicion de valores para algoritmo de rankeo
    public void agregarMouseListeners(){
        this.jLabelEstrella1.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                aux1 = jLabelEstrella1.getIcon();
                aux2 = jLabelEstrella2.getIcon();
                aux3 = jLabelEstrella3.getIcon();
                aux4 = jLabelEstrella4.getIcon();
                aux5 = jLabelEstrella5.getIcon();
                jLabelEstrella1.setIcon(starHoover);
                jLabelEstrella2.setIcon(starVacia);
                jLabelEstrella3.setIcon(starVacia);
                jLabelEstrella4.setIcon(starVacia);
                jLabelEstrella5.setIcon(starVacia);
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                jLabelEstrella1.setIcon(aux1);
                jLabelEstrella2.setIcon(aux2);
                jLabelEstrella3.setIcon(aux3);
                jLabelEstrella4.setIcon(aux4);
                jLabelEstrella5.setIcon(aux5);
            }
            
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jLabelEstrella1.setIcon(starLlena);
                jLabelEstrella2.setIcon(starVacia);
                jLabelEstrella3.setIcon(starVacia);
                jLabelEstrella4.setIcon(starVacia);
                jLabelEstrella5.setIcon(starVacia);
            }
        });
        
        this.jLabelEstrella2.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                aux1 = jLabelEstrella1.getIcon();
                aux2 = jLabelEstrella2.getIcon();
                aux2 = jLabelEstrella2.getIcon();
                aux3 = jLabelEstrella3.getIcon();
                aux4 = jLabelEstrella4.getIcon();
                aux5 = jLabelEstrella5.getIcon();
                jLabelEstrella1.setIcon(starHoover);
                jLabelEstrella2.setIcon(starHoover);
                jLabelEstrella3.setIcon(starVacia);
                jLabelEstrella4.setIcon(starVacia);
                jLabelEstrella5.setIcon(starVacia);
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                jLabelEstrella1.setIcon(aux1);
                jLabelEstrella2.setIcon(aux2);
                jLabelEstrella3.setIcon(aux3);
                jLabelEstrella4.setIcon(aux4);
                jLabelEstrella5.setIcon(aux5);
            }
            
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jLabelEstrella1.setIcon(starLlena);
                jLabelEstrella2.setIcon(starLlena);
                jLabelEstrella3.setIcon(starVacia);
                jLabelEstrella4.setIcon(starVacia);
                jLabelEstrella5.setIcon(starVacia);
            }
        });
        
        this.jLabelEstrella3.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                aux1 = jLabelEstrella1.getIcon();
                aux2 = jLabelEstrella2.getIcon();
                aux2 = jLabelEstrella2.getIcon();
                aux3 = jLabelEstrella3.getIcon();
                aux4 = jLabelEstrella4.getIcon();
                aux5 = jLabelEstrella5.getIcon();
                jLabelEstrella1.setIcon(starHoover);
                jLabelEstrella2.setIcon(starHoover);
                jLabelEstrella3.setIcon(starHoover);
                jLabelEstrella4.setIcon(starVacia);
                jLabelEstrella5.setIcon(starVacia);
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                jLabelEstrella1.setIcon(aux1);
                jLabelEstrella2.setIcon(aux2);
                jLabelEstrella3.setIcon(aux3);
                jLabelEstrella4.setIcon(aux4);
                jLabelEstrella5.setIcon(aux5);
            }
            
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jLabelEstrella1.setIcon(starLlena);
                jLabelEstrella2.setIcon(starLlena);
                jLabelEstrella3.setIcon(starLlena);
                jLabelEstrella4.setIcon(starVacia);
                jLabelEstrella5.setIcon(starVacia);
            }
        });
        
        this.jLabelEstrella4.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                aux1 = jLabelEstrella1.getIcon();
                aux2 = jLabelEstrella2.getIcon();
                aux2 = jLabelEstrella2.getIcon();
                aux3 = jLabelEstrella3.getIcon();
                aux4 = jLabelEstrella4.getIcon();
                aux5 = jLabelEstrella5.getIcon();
                jLabelEstrella1.setIcon(starHoover);
                jLabelEstrella2.setIcon(starHoover);
                jLabelEstrella3.setIcon(starHoover);
                jLabelEstrella4.setIcon(starHoover);
                jLabelEstrella5.setIcon(starVacia);
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                jLabelEstrella1.setIcon(aux1);
                jLabelEstrella2.setIcon(aux2);
                jLabelEstrella3.setIcon(aux3);
                jLabelEstrella4.setIcon(aux4);
                jLabelEstrella5.setIcon(aux5);
            }
            
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jLabelEstrella1.setIcon(starLlena);
                jLabelEstrella2.setIcon(starLlena);
                jLabelEstrella3.setIcon(starLlena);
                jLabelEstrella4.setIcon(starLlena);
                jLabelEstrella5.setIcon(starVacia);
            }
        });
        
        this.jLabelEstrella5.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt){
                aux1 = jLabelEstrella1.getIcon();
                aux2 = jLabelEstrella2.getIcon();
                aux2 = jLabelEstrella2.getIcon();
                aux3 = jLabelEstrella3.getIcon();
                aux4 = jLabelEstrella4.getIcon();
                aux5 = jLabelEstrella5.getIcon();
                jLabelEstrella1.setIcon(starHoover);
                jLabelEstrella2.setIcon(starHoover);
                jLabelEstrella3.setIcon(starHoover);
                jLabelEstrella4.setIcon(starHoover);
                jLabelEstrella5.setIcon(starHoover);
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt){
                jLabelEstrella1.setIcon(aux1);
                jLabelEstrella2.setIcon(aux2);
                jLabelEstrella3.setIcon(aux3);
                jLabelEstrella4.setIcon(aux4);
                jLabelEstrella5.setIcon(aux5);
            }
            
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jLabelEstrella1.setIcon(starLlena);
                jLabelEstrella2.setIcon(starLlena);
                jLabelEstrella3.setIcon(starLlena);
                jLabelEstrella4.setIcon(starLlena);
                jLabelEstrella5.setIcon(starLlena);
            }
        });
              
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContenedorPrincipal = new javax.swing.JPanel();
        jButtonCerrarUL = new javax.swing.JButton();
        jButtonMinimizarUL = new javax.swing.JButton();
        jButtonOpcionLibro = new javax.swing.JButton();
        contenedorSecundario = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabelPortada = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelTitulo2 = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jLabelISBN = new javax.swing.JLabel();
        jLabelNumPaginas = new javax.swing.JLabel();
        jLabelInd1 = new javax.swing.JLabel();
        jLabelInd7 = new javax.swing.JLabel();
        jLabelInd2 = new javax.swing.JLabel();
        jLabelInd3 = new javax.swing.JLabel();
        jLabelInd4 = new javax.swing.JLabel();
        jLabelRangoEdad = new javax.swing.JLabel();
        jLabelInd5 = new javax.swing.JLabel();
        jLabelPorcentajeLectura = new javax.swing.JLabel();
        jLabelInd6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaCategoria = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelInd8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaSinopsis = new javax.swing.JTextArea();
        jLabelEstrella1 = new javax.swing.JLabel();
        jLabelEstrella2 = new javax.swing.JLabel();
        jLabelEstrella3 = new javax.swing.JLabel();
        jLabelEstrella4 = new javax.swing.JLabel();
        jLabelEstrella5 = new javax.swing.JLabel();
        jLabelInd9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelContenedorPrincipal.setBackground(new java.awt.Color(69, 54, 55));
        jPanelContenedorPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(69, 60, 70), new java.awt.Color(69, 60, 70)));
        jPanelContenedorPrincipal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelContenedorPrincipalMouseDragged(evt);
            }
        });
        jPanelContenedorPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelContenedorPrincipalMouseClicked(evt);
            }
        });

        jButtonCerrarUL.setBackground(new java.awt.Color(69, 54, 55));
        jButtonCerrarUL.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButtonCerrarUL.setForeground(new java.awt.Color(201, 178, 169));
        jButtonCerrarUL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CerrarUL.png"))); // NOI18N
        jButtonCerrarUL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarULActionPerformed(evt);
            }
        });

        jButtonMinimizarUL.setBackground(new java.awt.Color(69, 54, 55));
        jButtonMinimizarUL.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButtonMinimizarUL.setForeground(new java.awt.Color(201, 178, 169));
        jButtonMinimizarUL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/MinimizarUL.png"))); // NOI18N
        jButtonMinimizarUL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinimizarULActionPerformed(evt);
            }
        });

        jButtonOpcionLibro.setBackground(new java.awt.Color(69, 54, 55));
        jButtonOpcionLibro.setForeground(new java.awt.Color(229, 229, 229));
        jButtonOpcionLibro.setText("Opción Libro");

        contenedorSecundario.setBackground(new java.awt.Color(69, 54, 55));

        jPanel4.setBackground(new java.awt.Color(79, 79, 79));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPortada, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPortada, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
        );

        jLabelTitulo.setFont(new java.awt.Font("Adobe Garamond Pro", 2, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(229, 229, 229));
        jLabelTitulo.setText("(Título)");

        jLabelTitulo2.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 18)); // NOI18N
        jLabelTitulo2.setForeground(new java.awt.Color(229, 229, 229));
        jLabelTitulo2.setText("(Título 2)");

        jLabelAutor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelAutor.setForeground(new java.awt.Color(229, 229, 229));
        jLabelAutor.setText("(Autor)");

        jLabelISBN.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelISBN.setForeground(new java.awt.Color(229, 229, 229));
        jLabelISBN.setText("(ISBN)");

        jLabelNumPaginas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelNumPaginas.setForeground(new java.awt.Color(229, 229, 229));
        jLabelNumPaginas.setText("(# Páginas)");

        jLabelInd1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelInd1.setForeground(new java.awt.Color(229, 229, 229));
        jLabelInd1.setText("ISBN:");

        jLabelInd7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelInd7.setForeground(new java.awt.Color(229, 229, 229));
        jLabelInd7.setText("Páginas:");

        jLabelInd2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelInd2.setForeground(new java.awt.Color(229, 229, 229));
        jLabelInd2.setText("Categoría");

        jLabelInd3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelInd3.setForeground(new java.awt.Color(229, 229, 229));
        jLabelInd3.setText("Calificación:");

        jLabelInd4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelInd4.setForeground(new java.awt.Color(229, 229, 229));
        jLabelInd4.setText("Rango de Edad:");

        jLabelRangoEdad.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelRangoEdad.setForeground(new java.awt.Color(229, 229, 229));
        jLabelRangoEdad.setText("(Rango de edad)");

        jLabelInd5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelInd5.setForeground(new java.awt.Color(229, 229, 229));
        jLabelInd5.setText("% Lectura:");

        jLabelPorcentajeLectura.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelPorcentajeLectura.setForeground(new java.awt.Color(229, 229, 229));
        jLabelPorcentajeLectura.setText("(% Lectura)");

        jLabelInd6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelInd6.setForeground(new java.awt.Color(229, 229, 229));
        jLabelInd6.setText("Best Seller:");

        jScrollPane1.setBackground(new java.awt.Color(69, 54, 55));

        jTextAreaCategoria.setBackground(new java.awt.Color(69, 54, 55));
        jTextAreaCategoria.setColumns(20);
        jTextAreaCategoria.setForeground(new java.awt.Color(229, 229, 229));
        jTextAreaCategoria.setLineWrap(true);
        jTextAreaCategoria.setRows(5);
        jTextAreaCategoria.setText("Categoría\nCategoria");
        jTextAreaCategoria.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextAreaCategoria);

        jLabelInd8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelInd8.setForeground(new java.awt.Color(229, 229, 229));
        jLabelInd8.setText("Sinopsis");

        jScrollPane2.setBackground(new java.awt.Color(69, 54, 55));

        jTextAreaSinopsis.setBackground(new java.awt.Color(69, 54, 55));
        jTextAreaSinopsis.setColumns(20);
        jTextAreaSinopsis.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTextAreaSinopsis.setForeground(new java.awt.Color(229, 229, 229));
        jTextAreaSinopsis.setLineWrap(true);
        jTextAreaSinopsis.setRows(5);
        jTextAreaSinopsis.setText("Bistritz, 3 de mayo. Salí de Münich a las 8:35 de la noche del primero de mayo, llegué a Viena a la mañana siguiente, temprano; debí haber llegado a las seis cuarenta y seis; el tren llevaba una hora de retraso. Budapest parece un lugar maravilloso, a juzgar por lo poco que pude ver de ella desde el tren y por la pequeña caminata que di por sus calles. Temí alejarme mucho de la estación, ya que, como habíamos llegado tarde, saldríamos lo más cerca posible de la hora fijada. La impresión que tuve fue que\nestábamos saliendo del oeste y entrando al este. Por el más occidental de los espléndidos puentes sobre el Danubio, que aquí es de gran anchura y profundidad, llegamos a los lugares en otro tiempo sujetos al dominio de los turcos.");
        jTextAreaSinopsis.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextAreaSinopsis);

        jLabelEstrella1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/EstrellaLlena.png"))); // NOI18N

        jLabelEstrella2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/EstrellaLlena.png"))); // NOI18N

        jLabelEstrella3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/EstrellaLlena.png"))); // NOI18N

        jLabelEstrella4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/EstrellaVacia.png"))); // NOI18N

        jLabelEstrella5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/EstrellaVacia.png"))); // NOI18N

        javax.swing.GroupLayout contenedorSecundarioLayout = new javax.swing.GroupLayout(contenedorSecundario);
        contenedorSecundario.setLayout(contenedorSecundarioLayout);
        contenedorSecundarioLayout.setHorizontalGroup(
            contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorSecundarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorSecundarioLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorSecundarioLayout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                            .addGroup(contenedorSecundarioLayout.createSequentialGroup()
                                .addGroup(contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelInd4)
                                    .addComponent(jLabelInd7)
                                    .addComponent(jLabelAutor)
                                    .addComponent(jLabelInd1)
                                    .addComponent(jLabelTitulo)
                                    .addComponent(jLabelTitulo2)
                                    .addComponent(jLabelInd6)
                                    .addComponent(jLabelInd5)
                                    .addComponent(jLabelInd2)
                                    .addComponent(jLabelInd3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenedorSecundarioLayout.createSequentialGroup()
                                        .addGroup(contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelNumPaginas)
                                            .addComponent(jLabelISBN)
                                            .addComponent(jLabelRangoEdad))
                                        .addContainerGap(100, Short.MAX_VALUE))
                                    .addGroup(contenedorSecundarioLayout.createSequentialGroup()
                                        .addGroup(contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelPorcentajeLectura)
                                            .addGroup(contenedorSecundarioLayout.createSequentialGroup()
                                                .addComponent(jLabelEstrella1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelEstrella2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelEstrella3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelEstrella4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelEstrella5)))
                                        .addGap(0, 82, Short.MAX_VALUE))))))
                    .addGroup(contenedorSecundarioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelInd8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(contenedorSecundarioLayout.createSequentialGroup()
                        .addGroup(contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        contenedorSecundarioLayout.setVerticalGroup(
            contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorSecundarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorSecundarioLayout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTitulo2)
                        .addGap(21, 21, 21)
                        .addComponent(jLabelAutor)
                        .addGap(18, 18, 18)
                        .addGroup(contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelInd1)
                            .addComponent(jLabelISBN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(contenedorSecundarioLayout.createSequentialGroup()
                                .addGroup(contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelInd7)
                                    .addComponent(jLabelNumPaginas))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelInd4)
                                    .addComponent(jLabelRangoEdad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenedorSecundarioLayout.createSequentialGroup()
                                        .addComponent(jLabelInd6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabelInd5)
                                            .addComponent(jLabelPorcentajeLectura))
                                        .addGap(9, 9, 9)
                                        .addGroup(contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(contenedorSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabelInd3)
                                                .addComponent(jLabelEstrella1))
                                            .addComponent(jLabelEstrella2)))
                                    .addComponent(jLabelEstrella4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelEstrella5, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabelEstrella3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelInd2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInd8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelInd9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelInd9.setForeground(new java.awt.Color(229, 229, 229));
        jLabelInd9.setText("Información de Libro");

        javax.swing.GroupLayout jPanelContenedorPrincipalLayout = new javax.swing.GroupLayout(jPanelContenedorPrincipal);
        jPanelContenedorPrincipal.setLayout(jPanelContenedorPrincipalLayout);
        jPanelContenedorPrincipalLayout.setHorizontalGroup(
            jPanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorSecundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelContenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonOpcionLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelContenedorPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelInd9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMinimizarUL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCerrarUL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelContenedorPrincipalLayout.setVerticalGroup(
            jPanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonCerrarUL, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(jButtonMinimizarUL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelInd9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorSecundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonOpcionLibro)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMinimizarULActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarULActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);

    }//GEN-LAST:event_jButtonMinimizarULActionPerformed

    private void jButtonCerrarULActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarULActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCerrarULActionPerformed

    private void jPanelContenedorPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelContenedorPrincipalMouseClicked
        // TODO add your handling code here:
        // Para recibir coordenadas de posición de ventana.
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanelContenedorPrincipalMouseClicked

    private void jPanelContenedorPrincipalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelContenedorPrincipalMouseDragged
        // TODO add your handling code here:
        Point p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x-x,p.y-y);
    }//GEN-LAST:event_jPanelContenedorPrincipalMouseDragged

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InfoBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorSecundario;
    private javax.swing.JButton jButtonCerrarUL;
    private javax.swing.JButton jButtonMinimizarUL;
    private javax.swing.JButton jButtonOpcionLibro;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelEstrella1;
    private javax.swing.JLabel jLabelEstrella2;
    private javax.swing.JLabel jLabelEstrella3;
    private javax.swing.JLabel jLabelEstrella4;
    private javax.swing.JLabel jLabelEstrella5;
    private javax.swing.JLabel jLabelISBN;
    private javax.swing.JLabel jLabelInd1;
    private javax.swing.JLabel jLabelInd2;
    private javax.swing.JLabel jLabelInd3;
    private javax.swing.JLabel jLabelInd4;
    private javax.swing.JLabel jLabelInd5;
    private javax.swing.JLabel jLabelInd6;
    private javax.swing.JLabel jLabelInd7;
    private javax.swing.JLabel jLabelInd8;
    private javax.swing.JLabel jLabelInd9;
    private javax.swing.JLabel jLabelNumPaginas;
    private javax.swing.JLabel jLabelPorcentajeLectura;
    private javax.swing.JLabel jLabelPortada;
    private javax.swing.JLabel jLabelRangoEdad;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelContenedorPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaCategoria;
    private javax.swing.JTextArea jTextAreaSinopsis;
    // End of variables declaration//GEN-END:variables
}
