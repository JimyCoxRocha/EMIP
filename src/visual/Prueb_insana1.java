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
public class Prueb_insana1 extends javax.swing.JPanel {
private AdmConsulta_Medica  admConsulta_Medica= AdmConsulta_Medica.getAdmConsulta_Medica();
    /**
     * Creates new form Prueb_insana1
     */
    public Prueb_insana1() {
        initComponents();
        //tbPaciente.setOpaque(true);
        btnGuardar.setBackground(new Color(255,255,255));
        btnGuardar.setOpaque(true);
        btnGuardar1.setBackground(new Color(255,255,255));
        btnGuardar1.setOpaque(true);
        cmbValor.setBackground(new Color(255,255,255));
        admConsulta_Medica.setIndexCriterio(0);
        cmbValor.setSelectedIndex(0);
        admConsulta_Medica.cargarCriterio(lbltipo_Examen_Descripcion , lblPaciente, lblCriterio, lblRango_inicial,
        lblRango_final, lblEstado, lblUnidad_Medida, lblRango_normal_inicial, lblRango_normal_final);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUnidad_Medida = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lbl4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lbl5 = new javax.swing.JLabel();
        btnGuardar1 = new javax.swing.JButton();
        lbl6 = new javax.swing.JLabel();
        lblRango_inicial = new javax.swing.JLabel();
        lblRango_final = new javax.swing.JLabel();
        lblRango_normal_inicial = new javax.swing.JLabel();
        lbltipo_Examen_Descripcion = new javax.swing.JLabel();
        lblRango_normal_final = new javax.swing.JLabel();
        lblPaciente = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lblCriterio = new javax.swing.JLabel();
        cmbValor = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        setPreferredSize(new java.awt.Dimension(636, 390));
        setRequestFocusEnabled(false);

        lbl2.setText("Rango final:");

        lbl7.setText("Valor:");

        lbl3.setText("Rango normal inicial:");

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        lbl4.setText("Rango normal final:");

        btnGuardar.setText("< Anterior");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lbl5.setText("Estado:");

        btnGuardar1.setText("Siguiente >");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        lbl6.setText("Unidad de medida:");

        lbltipo_Examen_Descripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl1.setText("Rango inicial:");

        lblCriterio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cmbValor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habrá valor", "Campo sin valor" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUnidad_Medida, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl5)
                                .addGap(18, 18, 18)
                                .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl2)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblRango_final, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl1)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblRango_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl3)
                                    .addComponent(lbl4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(lblRango_normal_final, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblRango_normal_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(lbl7)
                        .addGap(18, 18, 18)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmbValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
            .addComponent(lbltipo_Examen_Descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCriterio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbltipo_Examen_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl1)
                            .addComponent(lblRango_inicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblRango_final, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRango_normal_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(lblRango_normal_final, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl5)
                        .addGap(18, 18, 18)
                        .addComponent(lbl6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUnidad_Medida, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl7)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        if(admConsulta_Medica.validarIngresoCriterio(txtValor.getText(), cmbValor.getSelectedIndex())){
            admConsulta_Medica.guardarCriterio(txtValor.getText(),admConsulta_Medica.getIndexCriterio());
            admConsulta_Medica.setIndexCriterio(admConsulta_Medica.getIndexCriterio()+1);
            //admConsulta_Medica.setcargatTxtValorCriterio(txtValor);
            admConsulta_Medica.cargarCriterio(lbltipo_Examen_Descripcion , lblPaciente, lblCriterio, lblRango_inicial,
            lblRango_final, lblEstado, lblUnidad_Medida, lblRango_normal_inicial, lblRango_normal_final);
            
        }else{
            JOptionPane.showMessageDialog(null, "Antes de continuar, ingrese el dato.\nSi no contiene información especifique en el recuadro de al lado.");
        }
        cmbValor.setSelectedIndex(0);
        txtValor.setText("");
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        cmbValor.setSelectedIndex(0);
        if(admConsulta_Medica.getIndexCriterio()>0){
            admConsulta_Medica.setIndexCriterio(admConsulta_Medica.getIndexCriterio()-1);
            admConsulta_Medica.setcargatTxtValorCriterio(txtValor);
            admConsulta_Medica.cargarCriterio(lbltipo_Examen_Descripcion , lblPaciente, lblCriterio, lblRango_inicial,
            lblRango_final, lblEstado, lblUnidad_Medida, lblRango_normal_inicial, lblRango_normal_final);
        }else{
            JOptionPane.showMessageDialog(null,"Final");
            admConsulta_Medica.setIndexCriterio(0);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JComboBox<String> cmbValor;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lblCriterio;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblRango_final;
    private javax.swing.JLabel lblRango_inicial;
    private javax.swing.JLabel lblRango_normal_final;
    private javax.swing.JLabel lblRango_normal_inicial;
    private javax.swing.JLabel lblUnidad_Medida;
    private javax.swing.JLabel lbltipo_Examen_Descripcion;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
