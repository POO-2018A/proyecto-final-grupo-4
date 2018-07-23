
package juegoproyecto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.applet.AudioClip;


public class Ventana extends javax.swing.JFrame {
    
 
    static public ArrayList<Personajes> ListaInfoPersonajes = new ArrayList<Personajes>();
    List<String> ListaMarvel = new ArrayList<String>();
    DefaultComboBoxModel listaMarvelModel = 
            new DefaultComboBoxModel(ListaMarvel.toArray());
    
    List<String> ListaCapcom = new ArrayList<String>();
    DefaultComboBoxModel listaCapcomModel = 
            new DefaultComboBoxModel(ListaCapcom.toArray());
       ClsControlador controller = new ClsControlador();
     
       
       int op;
       int MoC;
       static String imagenj1;
       static String imagen2;
       static String imagen3;
       static String NPersonaje1;
       static String NPersonaje2;
       static String NUsuario1;
       static String NUsuario2;
       boolean activarbtnJugar1 = false;
       boolean activarbtnJugar2 = false;
       
    
    public Ventana () {
                   
        initComponents();
        
            boxJugador1.setEnabled(true);
            boxJugador2.setEnabled(true);
            VentanaRegistro.jugadores = controller.extraerObjetos("jugadores.dat");
            boxJugador1.setModel(new DefaultComboBoxModel(VentanaRegistro.jugadores.toArray()));
            boxJugador2.setModel(new DefaultComboBoxModel(VentanaRegistro.jugadores.toArray())); 
            
           
          /* jugadores = controller.extraerObjetos("jugadores.dat");
            boxJugador1.setModel(new DefaultComboBoxModel(jugadores.toArray()));
            boxJugador2.setModel(new DefaultComboBoxModel(jugadores.toArray())); */
            btnJugar.setEnabled(false);
            btnJugador1.setEnabled(false);
            btnJugador2.setEnabled(false);
            
            
        
    
        
        
        ListaMarvel.add("Iron Man");ListaMarvel.add("Hulk");ListaMarvel.add("Captain America");ListaMarvel.add("Thor");
        ListaMarvel.add("Spider-Man");ListaMarvel.add("Wolverine");ListaMarvel.add("Storm");ListaMarvel.add("Phoenix");
        ListaMarvel.add("Cyclops");ListaMarvel.add("Magneto");ListaMarvel.add("Human Torch");ListaMarvel.add("Thing");
        ListaMarvel.add("Invisible Woman");ListaMarvel.add("Mister Fantastic");ListaMarvel.add("Galactus");
        ListaMarvel.add("DOMINO");ListaMarvel.add("ZEITGEIST");ListaMarvel.add("BEDLAM");ListaMarvel.add("DeadPool");
        ListaMarvel.add("COLOSSUS");
        
        ListaCapcom.add("Ryu");ListaCapcom.add("Ken");ListaCapcom.add("M.Bison");ListaCapcom.add("Chun-li");
        ListaCapcom.add("Zangief");ListaCapcom.add("Dante");ListaCapcom.add("Trish");ListaCapcom.add("Mundus");
        ListaCapcom.add("Vergil");ListaCapcom.add("Sparda");ListaCapcom.add("Leon S. Kennedy");ListaCapcom.add("Chris Redfield");
        ListaCapcom.add("Albert Wesker");ListaCapcom.add("Jill Valentine");ListaCapcom.add("Nemesis");ListaCapcom.add("Mega Man");
        ListaCapcom.add("Proto Man");ListaCapcom.add("Bass");ListaCapcom.add("Zero");ListaCapcom.add("Vile");            
            
        for (int i = 0; i < ListaMarvel.size(); i++) {
            listaMarvelModel.addElement(ListaMarvel.get(i)); 
            listaCapcomModel.addElement(ListaCapcom.get(i)); 
            
        }
        

        for (int i = 0; i < ListaMarvel.size(); i++) {
            
            if (i<5) {
            Personajes Tanque = new Personajes (ListaMarvel.get(i),800,600,100,175,50,20);
            ListaInfoPersonajes.add(Tanque);
                
            }else if (i<10){
            Personajes Luchadores = new Personajes (ListaMarvel.get(i),500,600,100,250,100,20);
            ListaInfoPersonajes.add(Luchadores);
                
            }else if (i<15){
            Personajes Neutrales = new Personajes (ListaMarvel.get(i),500,1000,75,175,100,30);
            ListaInfoPersonajes.add(Neutrales);
                
            }else if (i<20){
            Personajes Hibridos = new Personajes (ListaMarvel.get(i),400,1300,75,250,200,40);

            ListaInfoPersonajes.add(Hibridos);
                
            }     
             
        }

        for (int i = 0; i < ListaCapcom.size(); i++) {
            
            if (i<5) {
            Personajes Tanque = new Personajes (ListaCapcom.get(i),800,600,100,175,50,20);
            ListaInfoPersonajes.add(Tanque);
                
            }else if (i<10){
            Personajes Luchadores = new Personajes (ListaCapcom.get(i),500,600,100,250,100,20);
            ListaInfoPersonajes.add(Luchadores);
                
            }else if (i<15){
            Personajes Neutrales = new Personajes (ListaCapcom.get(i),500,1000,75,175,100,30);
            ListaInfoPersonajes.add(Neutrales);
                
            }else if (i<20){
            Personajes Hibridos = new Personajes (ListaCapcom.get(i),400,1300,75,250,200,40);

            ListaInfoPersonajes.add(Hibridos);
                
            }     
             
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxJugador1 = new javax.swing.JComboBox<>();
        boxPersonajes = new javax.swing.JComboBox<>();
        boxJugador2 = new javax.swing.JComboBox<>();
        boxMoC = new javax.swing.JComboBox<>();
        ImagenJugador1 = new javax.swing.JLabel();
        ImagenJugador2 = new javax.swing.JLabel();
        ImagenPersonaje = new javax.swing.JLabel();
        btnJugador1 = new javax.swing.JButton();
        btnJugador2 = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        btnRegJugador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boxJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxJugador1ActionPerformed(evt);
            }
        });
        getContentPane().add(boxJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 100, -1));

        boxPersonajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPersonajesActionPerformed(evt);
            }
        });
        getContentPane().add(boxPersonajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, -1, -1));

        boxJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxJugador2ActionPerformed(evt);
            }
        });
        getContentPane().add(boxJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 100, -1));

        boxMoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marvel", "Capcom" }));
        boxMoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMoCActionPerformed(evt);
            }
        });
        getContentPane().add(boxMoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, -1, -1));

        ImagenJugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ImagenJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 230, 280));

        ImagenJugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ImagenJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 240, 280));

        ImagenPersonaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ImagenPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 240, 300));

        btnJugador1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        btnJugador1.setText("Seleccionar Personaje");
        btnJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugador1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 160, 30));

        btnJugador2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        btnJugador2.setText("Seleccionar Personaje");
        btnJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugador2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, -1, 30));

        btnJugar.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, -1, -1));

        btnRegJugador.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        btnRegJugador.setText("Registrar Jugador");
        btnRegJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegJugadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        jLabel1.setText("JUGADOR1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 80, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("JUGADOR2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 80, -1));

        btnSalir.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 110, 40));

        Actualizar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Actualizar.setText("Actualizar Usuarios");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        lbl1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl1.setText("PERSONAJES");
        getContentPane().add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 240, 50));

        lbl2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl2.setForeground(new java.awt.Color(204, 0, 0));
        lbl2.setText("USUARIOS");
        getContentPane().add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Marvel-vs-capcom.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxPersonajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPersonajesActionPerformed

        btnJugador1.setEnabled(true); 
        btnJugador2.setEnabled(true); 
        
        
        op = boxPersonajes.getSelectedIndex();
        MoC = boxMoC.getSelectedIndex();

        switch (op){
            case 0:
                if (MoC==0){
                    
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/IronMan.jpg"));
                    imagenj1 = "Imagenes/IronMan.jpg";

                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Ryu.jpg"));
                    imagenj1 = "Imagenes/Ryu.jpg";
                }
                break;
            case 1:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Hulk.jpg"));
                    imagenj1 = "Imagenes/Hulk.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Ken.jpg"));
                    imagenj1 = "Imagenes/Ken.jpg";
                }
                break;
            case 2:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/CapitanAmerica.jpg"));
                    imagenj1 = "Imagenes/CapitanAmerica.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/M.Bison.jpg"));
                    imagenj1 = "Imagenes/M.Bison.jpg";
                }
                break;
            case 3:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Thor.jpg"));
                    imagenj1 = "Imagenes/Thor.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Chun-li.jpg"));
                    imagenj1 = "Imagenes/Chun-li.jpg";
                }
                break;
            case 4:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/SpiderMan.jpg"));
                    imagenj1 = "Imagenes/SpiderMan.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Zangief.jpg"));
                    imagenj1 = "Imagenes/Zangief.jpg";
                }
                break;
            case 5:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Wolverine.jpg"));
                    imagenj1 = "Imagenes/Wolverine.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Dante.jpg"));
                    imagenj1 = "Imagenes/Dante.jpg";
                }
                break;
            case 6:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Storm.jpg"));
                    imagenj1 = "Imagenes/Storm.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Trish.jpg"));
                    imagenj1 = "Imagenes/Trish.jpg";
                }
                break;
            case 7:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Phoenix.jpg"));
                    imagenj1 = "Imagenes/Phoenix.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Mundus.jpg"));
                    imagenj1 = "Imagenes/Mundus.jpg";
                }
                break;
            case 8:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Cyclops.jpg"));
                    imagenj1 = "Imagenes/Cyclops.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Vergil.jpg"));
                    imagenj1 = "Imagenes/Vergil.jpg";
                }
                break;
            case 9:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Magneto.jpg"));
                    imagenj1 = "Imagenes/Magneto.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Sparda.jpg"));
                    imagenj1 = "Imagenes/Sparda.jpg";
                }
                break;
            case 10:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/LaAntorchaHumana.jpg"));
                    imagenj1 = "Imagenes/LaAntorchaHumana.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/LeonKennedy.jpg"));
                    imagenj1 = "Imagenes/LeonKennedy.jpg";
                }
                break;
            case 11:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/LaMole.jpg"));
                    imagenj1 = "Imagenes/LaMole.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/ChrisRedfield.jpg"));
                    imagenj1 = "Imagenes/ChrisRedfield.jpg";
                }
                break;
            case 12:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/MujerInvisible.jpg"));
                    imagenj1 = "Imagenes/MujerInvisible.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/AlbertWesker.jpg"));
                    imagenj1 = "Imagenes/AlbertWesker.jpg";
                }
                break;
            case 13:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/MrFantastico.jpg"));
                    imagenj1 = "Imagenes/MrFantastico.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/JillValentine.jpg"));
                    imagenj1 = "Imagenes/JillValentine.jpg";
                }
                break;
            case 14:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Galactus.jpg"));
                    imagenj1 = "Imagenes/Galactus.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Nemesis.jpg"));
                    imagenj1 = "Imagenes/Nemesis.jpg";
                }
                break;
            case 15:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Domino.jpg"));
                    imagenj1 = "Imagenes/Domino.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Megaman.jpg"));
                    imagenj1 = "Imagenes/Megaman.jpg";
                }
                break;
            case 16:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/bedlam.jpg"));
                    imagenj1 = "Imagenes/bedlam.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Protoman.png"));
                    imagenj1 = "Imagenes/Protoman.png";
                }
                break;
            case 17:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/bedlam.jpg"));
                    imagenj1 = "Imagenes/bedlam.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Bass.jpg"));
                    imagenj1 = "Imagenes/Bass.jpg";
                }
                break;
            case 18:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/DeadPool.jpg"));
                    imagenj1 = "Imagenes/DeadPool.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Zero.jpg"));
                    imagenj1 = "Imagenes/Zero.jpg";
                }
                break;
            case 19:
                if (MoC==0){
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Colosus.jpg"));
                    imagenj1 = "Imagenes/Colosus.jpg";
                }else{
                    ImagenPersonaje.setIcon(new ImageIcon("Imagenes/Vile.png"));
                    imagenj1 = "Imagenes/Vile.png";
                }
                break;
                 
                
                
        }
        
    }//GEN-LAST:event_boxPersonajesActionPerformed

    private void boxMoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMoCActionPerformed
        
                                
        int op = boxMoC.getSelectedIndex();
        
        if (op == 0){   
                boxPersonajes.setModel(listaMarvelModel);        
        }
        
        if (op == 1){      
                boxPersonajes.setModel(listaCapcomModel);         
        } 
        
    }//GEN-LAST:event_boxMoCActionPerformed

    private void btnJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugador2ActionPerformed
        
        activarbtnJugar1 = true;
        imagen3 = imagenj1;
        
         ImagenJugador2.setIcon(new ImageIcon(imagenj1));
         if (MoC ==0){
         NPersonaje2 = ListaMarvel.get(op);
         }else{
         NPersonaje2 = ListaCapcom.get(op);
         }
         
         if (activarbtnJugar1 && activarbtnJugar2){
            btnJugar.setEnabled(true);             
         }
        
    }//GEN-LAST:event_btnJugador2ActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed

        NUsuario1 = ""+boxJugador1.getSelectedItem();
        NUsuario2 = ""+boxJugador2.getSelectedItem();
        
        dispose();
        
        Ventana2 obj2 = new Ventana2();
        obj2.setVisible(true);
        obj2.setLocationRelativeTo(null); 
      

    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugador1ActionPerformed
        
        activarbtnJugar2 = true;        
        imagen2 = imagenj1;
        ImagenJugador1.setIcon(new ImageIcon(imagenj1));
         
         if (MoC ==0){
         NPersonaje1 = ListaMarvel.get(op);
         }else{
         NPersonaje1 = ListaCapcom.get(op);
         }
         
         if (activarbtnJugar1 && activarbtnJugar2){
            btnJugar.setEnabled(true);             
         }
    }//GEN-LAST:event_btnJugador1ActionPerformed

    private void btnRegJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegJugadorActionPerformed
        
        dispose();
 
        VentanaRegistro obj3 = new VentanaRegistro();
        obj3.setVisible(true);
        obj3.setLocationRelativeTo(null); 
        
    }//GEN-LAST:event_btnRegJugadorActionPerformed

    private void boxJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxJugador1ActionPerformed
        
        
    }//GEN-LAST:event_boxJugador1ActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        
            VentanaRegistro.jugadores = controller.extraerObjetos("jugadores.dat");
            boxJugador1.setModel(new DefaultComboBoxModel(VentanaRegistro.jugadores.toArray()));
            boxJugador2.setModel(new DefaultComboBoxModel(VentanaRegistro.jugadores.toArray())); 
        
    }//GEN-LAST:event_ActualizarActionPerformed

    private void boxJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxJugador2ActionPerformed

    }//GEN-LAST:event_boxJugador2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel ImagenJugador1;
    private javax.swing.JLabel ImagenJugador2;
    private javax.swing.JLabel ImagenPersonaje;
    private javax.swing.JComboBox<String> boxJugador1;
    private javax.swing.JComboBox<String> boxJugador2;
    private javax.swing.JComboBox<String> boxMoC;
    private javax.swing.JComboBox<String> boxPersonajes;
    private javax.swing.JButton btnJugador1;
    private javax.swing.JButton btnJugador2;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnRegJugador;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    // End of variables declaration//GEN-END:variables
}
