
package juegoproyecto;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VentanaRegistro extends javax.swing.JFrame {
 public static ArrayList<Object> jugadores = new ArrayList<>();
    int cont = 0;
  
    ClsControlador controller = new ClsControlador();
    Ventana window = new Ventana ();

    public VentanaRegistro() {
        initComponents();
         jugadores = controller.extraerObjetos("jugadores.dat");
        llenarCombo();
        llenarGrid();
        
        if(jugadores.size() > 0){
            ClsJugadores ultimo = (ClsJugadores) jugadores.get(jugadores.size()-1);
            cont = ultimo.getId();
        }
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }
    
    
     public void llenarCombo(){
        if(jugadores.size() > 0){
            cbxJugadores.setEnabled(true);
            jugadores = controller.extraerObjetos("jugadores.dat");
            cbxJugadores.setModel(new DefaultComboBoxModel(jugadores.toArray()));
        }else{
            cbxJugadores.setEnabled(false);
        }
    }
     
        
    
    public void llenarGrid(){
        if(jugadores.size() > 0){
            ClsJugadores jug = new ClsJugadores();
            DefaultTableModel model = (DefaultTableModel) tblJugadores.getModel();
            for(int i = 0; i < jugadores.size(); i ++){
                jug = (ClsJugadores) jugadores.get(i);
                Object jugadoresN [] = {jug.getId(),jug.getNombre(),jug.getApellido(),jug.getCedula() , jug.getUsuario()};
                model.insertRow(i, jugadoresN);
            }
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxJugadores = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJugadores = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxJugadoresActionPerformed(evt);
            }
        });
        getContentPane().add(cbxJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 130, -1));

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel2.setText("Apellido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel3.setText("Cedula");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel4.setText("Usuario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 140, -1));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 140, -1));
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 140, -1));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 140, -1));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 90, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 90, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 90, -1));

        jButton4.setText("Volver a Seleccion de personajes");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        tblJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Cedula", "Usuario"
            }
        ));
        jScrollPane1.setViewportView(tblJugadores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 370, 120));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fr.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        dispose();
        VentanaRegistro.jugadores = controller.extraerObjetos("jugadores.dat");
        JuegoProyecto.window.setVisible(true);
        JuegoProyecto.window.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        ClsJugadores jugadorSeleccionado = (ClsJugadores)cbxJugadores.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) tblJugadores.getModel();
        model.removeRow(cbxJugadores.getSelectedIndex());
        jugadores.remove(jugadorSeleccionado);
        controller.escribirObjeto("jugadores.dat", jugadores);
        llenarCombo();
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCrear.setEnabled(true);
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtCedula.setText(null);
        txtUsuario.setText(null);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        if(!(txtNombre.getText().equals("")||txtApellido.getText().equals("")||txtCedula.getText().equals("")||txtUsuario.getText().equals(""))){
        
        
         cont++;
        ClsJugadores jugador = new ClsJugadores(cont, txtNombre.getText(),txtApellido.getText(), txtCedula.getText(), txtUsuario.getText());
        jugadores.add(jugador);
        controller.escribirObjeto("jugadores.dat", jugadores);
        jugadores = controller.extraerObjetos("jugadores.dat");
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtCedula.setText(null);
        txtUsuario.setText(null);
        btnModificar.setEnabled(false); 
        llenarCombo();
        
        Object jugadoresN [] = {jugador.getId(),jugador.getNombre(),jugador.getApellido(),jugador.getCedula() , jugador.getUsuario()};
        DefaultTableModel model = (DefaultTableModel) tblJugadores.getModel();
        model.addRow(jugadoresN);
        
        }else{
            JOptionPane.showMessageDialog(this, "Llene todos los campos");
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void cbxJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxJugadoresActionPerformed
        ClsJugadores jugadorSeleccionado = (ClsJugadores)cbxJugadores.getSelectedItem();
        txtNombre.setText(jugadorSeleccionado.getNombre());
        txtApellido.setText(jugadorSeleccionado.getApellido());
        txtCedula.setText(jugadorSeleccionado.getCedula());
        txtUsuario.setText(jugadorSeleccionado.getUsuario());
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnCrear.setEnabled(false);
    }//GEN-LAST:event_cbxJugadoresActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
                if(!(txtNombre.getText().equals("")||txtApellido.getText().equals("")||txtCedula.getText().equals("")||txtUsuario.getText().equals(""))){
        
        ClsJugadores jugadorSeleccionado = (ClsJugadores)cbxJugadores.getSelectedItem();
        jugadorSeleccionado.setNombre(txtNombre.getText());
        jugadorSeleccionado.setApellido(txtApellido.getText());
        jugadorSeleccionado.setCedula(txtCedula.getText());
        jugadorSeleccionado.setUsuario(txtUsuario.getText());
        

        Object jugadoresD [] = {jugadorSeleccionado.getId(),jugadorSeleccionado.getNombre(),jugadorSeleccionado.getApellido(),jugadorSeleccionado.getCedula(),jugadorSeleccionado.getUsuario()};
        DefaultTableModel model = (DefaultTableModel) tblJugadores.getModel();
        model.removeRow(cbxJugadores.getSelectedIndex());
        jugadores.remove(cbxJugadores.getSelectedIndex());
        model.insertRow(cbxJugadores.getSelectedIndex(), jugadoresD);
        jugadores.add(cbxJugadores.getSelectedIndex(), jugadorSeleccionado);
        controller.escribirObjeto("jugadores.dat", jugadores);
        llenarCombo();
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtCedula.setText(null);
        txtUsuario.setText(null);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCrear.setEnabled(true);
        
                }else{
            JOptionPane.showMessageDialog(this, "Llene todos los campos");
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed
      
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxJugadores;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblJugadores;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
