/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import control.AdmConsulta_Medica;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres Cox
 */
public class FrmRegistro_Analisis extends javax.swing.JDialog {
    private AdmConsulta_Medica  admConsulta_Medica= AdmConsulta_Medica.getAdmConsulta_Medica();
    
    /**
     * Creates new form FrmRegistro_Analisis
     */
    public FrmRegistro_Analisis(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        //JOptionPane.showMessageDialog(null, indiceAlmacenado);
        admConsulta_Medica.llenarGridAnalisis(tbRegistroAnalisis);
        admConsulta_Medica.llenarlbls(lblNoRegistrado, lblRegistrado);
        
        admConsulta_Medica.setIndexCriterio(tbRegistroAnalisis.getSelectedRow());
        admConsulta_Medica.setBtnRegistrarAnalisis(btnRegistrarAnalisis);
        //admConsulta_Medica.setIndexCriterio(tbRegistroAnalisis.getSelectedRow());
        Prueb_insana1 pi= new Prueb_insana1();
        pi.setVisible(true);
        pi.setSize(651, 415);
        
        panelContenedor.removeAll();
        panelContenedor.add(pi);
        panelContenedor.revalidate();
        panelContenedor.repaint();
        
        
        
        Color fondoPrincipal = new Color(140, 174, 212);
        Color fondoBlanco = new Color(255, 255, 255);
        
        jPanel1.setBackground(fondoPrincipal);
        //tbPaciente.setOpaque(true);
        btnRegistrarAnalisis.setBackground(fondoBlanco);
        btnRegistrarAnalisis.setOpaque(true);
        btnCancelar.setBackground(fondoBlanco);
        btnCancelar.setOpaque(true);
        tbRegistroAnalisis.setFillsViewportHeight(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegistrarAnalisis = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        panelContenedor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRegistroAnalisis = new javax.swing.JTable();
        lblNoRegistrado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblRegistrado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar valores de an??lisis");

        btnRegistrarAnalisis.setText("Registrar an??lisis");
        btnRegistrarAnalisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAnalisisActionPerformed(evt);
            }
        });

        btnCancelar.setText("Salir");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        panelContenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelContenedor.setPreferredSize(new java.awt.Dimension(651, 415));
        panelContenedor.setRequestFocusEnabled(false);
        panelContenedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelContenedorMouseClicked(evt);
            }
        });
        panelContenedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelContenedorKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tbRegistroAnalisis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Tipo de An??lisis"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbRegistroAnalisis.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbRegistroAnalisis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRegistroAnalisisMouseClicked(evt);
            }
        });
        tbRegistroAnalisis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbRegistroAnalisisKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbRegistroAnalisis);
        if (tbRegistroAnalisis.getColumnModel().getColumnCount() > 0) {
            tbRegistroAnalisis.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel2.setText("Valores no registrados:");

        jLabel3.setText("Valores registrados:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnRegistrarAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lblNoRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(287, 287, 287)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblNoRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(8, 8, 8))))))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                    .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*************************************************************************/
    private void tbRegistroAnalisisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRegistroAnalisisMouseClicked
        //btnRegistrarAnalisis.setEnabled(true);
    }//GEN-LAST:event_tbRegistroAnalisisMouseClicked

    private void tbRegistroAnalisisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbRegistroAnalisisKeyPressed

    }//GEN-LAST:event_tbRegistroAnalisisKeyPressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarAnalisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAnalisisActionPerformed
        admConsulta_Medica.registrarAnalisis();
        admConsulta_Medica.setIndexCriterio(0);
        this.dispose();
//        FrmCriterio frmCriterio = new FrmCriterio();
//        frmCriterio.setVisible(true);

    }//GEN-LAST:event_btnRegistrarAnalisisActionPerformed

    private void panelContenedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelContenedorKeyPressed

    }//GEN-LAST:event_panelContenedorKeyPressed

    private void panelContenedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContenedorMouseClicked

    }//GEN-LAST:event_panelContenedorMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrarAnalisis;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNoRegistrado;
    private javax.swing.JLabel lblRegistrado;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JTable tbRegistroAnalisis;
    // End of variables declaration//GEN-END:variables
}
