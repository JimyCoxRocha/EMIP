/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;
import control.AdmConsulta_Medica;
import java.awt.Color;
import javax.swing.JOptionPane;
/**
 *
 * @author Andres Cox
 */
public class FrmConsulta_MedicaAntigua extends javax.swing.JFrame {
    private AdmConsulta_Medica admConsulta_Medica = AdmConsulta_Medica.getAdmConsulta_Medica();
    /**
     * Creates new form FrmConsulta_Medica
     */
    public FrmConsulta_MedicaAntigua() {
        initComponents();
        txtCedula.setVisible(true);
        jLabel2.setVisible(true);
        txtPasaporte.setVisible(false);
        lblPasaporte.setForeground(Color.gray);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cedulaypasaporte = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCedula = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNombre = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtApellido = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtTelefono = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        rdCedula = new javax.swing.JRadioButton();
        rdPasaporte = new javax.swing.JRadioButton();
        lblPasaporte = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPasaporte = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Cédula:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Dirección:");

        jLabel5.setText("Fecha de nacimiento:");

        jLabel6.setText("Sexo:");

        jScrollPane1.setViewportView(txtCedula);
        txtCedula.getAccessibleContext().setAccessibleName("txtCedula");

        jScrollPane2.setViewportView(txtNombre);
        txtNombre.getAccessibleContext().setAccessibleName("txtNombre");

        jScrollPane3.setViewportView(txtApellido);
        txtApellido.getAccessibleContext().setAccessibleName("txtApellido");

        jScrollPane6.setViewportView(txtDireccion);
        txtDireccion.getAccessibleContext().setAccessibleName("txtDireccion");

        jButton1.setText("Agregar paciente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane7.setViewportView(txtTelefono);

        jLabel7.setText("Telefono:");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja", "Masculino", "Femenino" }));

        cedulaypasaporte.add(rdCedula);
        rdCedula.setSelected(true);
        rdCedula.setText("Cédula");
        rdCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdCedulaActionPerformed(evt);
            }
        });

        cedulaypasaporte.add(rdPasaporte);
        rdPasaporte.setText("Pasaporte");
        rdPasaporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdPasaporteActionPerformed(evt);
            }
        });

        lblPasaporte.setText("Pasaporte:");

        jScrollPane4.setViewportView(txtPasaporte);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(jdcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPasaporte, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rdCedula)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdPasaporte))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdCedula)
                            .addComponent(rdPasaporte))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPasaporte)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(85, 85, 85))
        );

        jLabel1.getAccessibleContext().setAccessibleName("lblNombre");
        jButton1.getAccessibleContext().setAccessibleName("btnAgregar");
        jButton2.getAccessibleContext().setAccessibleName("btnCancelar");
        jLabel7.getAccessibleContext().setAccessibleName("txtTelefono");
        cmbSexo.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Agregar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "Bien");
        String identi="";
        int flag=0;
//admConsulta_Medica.cargarValores(txtCedula.getText(), txtNombre.getText(), txtApellido.getText(), txtDireccion.getText(), txtFecha.getText(), txtSexo.getText());
        if(rdCedula.isSelected()){
            flag=1;
            identi=txtCedula.getText();
        }else{
            flag=2;
            identi=txtPasaporte.getText();
        }
        if(admConsulta_Medica.validarPaciente(identi, txtNombre.getText(), txtApellido.getText(), cmbSexo.getSelectedIndex(), txtTelefono.getText(),flag)==true){
            admConsulta_Medica.paciente(identi, txtNombre.getText(), txtApellido.getText(), txtDireccion.getText(), jdcFecha.getDate(), (String)cmbSexo.getSelectedItem(), txtTelefono.getText());
        }else{
            JOptionPane.showMessageDialog(null, "Por favor, ingrese bien los valores");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rdCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdCedulaActionPerformed
        txtCedula.setVisible(true);
        jLabel2.setForeground(Color.getHSBColor(0, 0, 0));
        jLabel2.setVisible(true);
        txtPasaporte.setVisible(false);
        lblPasaporte.setForeground(Color.gray);
    }//GEN-LAST:event_rdCedulaActionPerformed

    private void rdPasaporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdPasaporteActionPerformed
        txtCedula.setVisible(false);
        jLabel2.setForeground(Color.gray);
        txtPasaporte.setVisible(true);
        lblPasaporte.setForeground(Color.getHSBColor(0, 0, 0));
        lblPasaporte.setVisible(true);
    }//GEN-LAST:event_rdPasaporteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup cedulaypasaporte;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel lblPasaporte;
    private javax.swing.JRadioButton rdCedula;
    private javax.swing.JRadioButton rdPasaporte;
    private javax.swing.JTextPane txtApellido;
    private javax.swing.JTextPane txtCedula;
    private javax.swing.JTextPane txtDireccion;
    private javax.swing.JTextPane txtNombre;
    private javax.swing.JTextPane txtPasaporte;
    private javax.swing.JTextPane txtTelefono;
    // End of variables declaration//GEN-END:variables
}