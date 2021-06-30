/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import control.AdmConsulta_Medica;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres Cox
 */
public class FrmRegistroExamen extends javax.swing.JFrame {
    private AdmConsulta_Medica  admConsulta_Medica= AdmConsulta_Medica.getAdmConsulta_Medica();
    /**
     * Creates new form FrmRegistroExamen
     */
    public FrmRegistroExamen() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        btnRegistrarAnalisis.setEnabled(false);
        admConsulta_Medica.llenarGridExamen(tbExamenes,"all");
        
        
        
        Color fondoPrincipal = new Color(140, 174, 212);
        Color fondoBlanco = new Color(255, 255, 255);
        
        jPanel1.setBackground(fondoPrincipal);
        //tbPaciente.setOpaque(true);
        btnBuscar.setBackground(Color.WHITE);
        btnBuscar.setOpaque(true);
        btnBuscar1.setBackground(fondoBlanco);
        btnBuscar1.setOpaque(true);
        btnRegistrarAnalisis.setBackground(fondoBlanco);
        btnRegistrarAnalisis.setOpaque(true);
        btnCancelar.setBackground(fondoBlanco);
        btnCancelar.setOpaque(true);
        tbExamenes.setFillsViewportHeight(true);
    }
    /******************************BORRAR GRID********************************/
    private void borrar(){
        DefaultTableModel modelo=(DefaultTableModel)tbExamenes.getModel();
        if(modelo.getRowCount()!=0){
            while(modelo.getRowCount()>0)
            {
                modelo.removeRow(0);
            }
        } 
    }
    private int contar(){
        int cantidad=0;
        DefaultTableModel modelo=(DefaultTableModel)tbExamenes.getModel();
        cantidad=modelo.getRowCount();
        return cantidad;
    }
    /*************************************************************************/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnRegistrarAnalisis = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbExamenes = new javax.swing.JTable();
        btnBuscar1 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTipoExamen = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar análisis");

        btnCancelar.setText("Salir");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRegistrarAnalisis.setText("Registrar análisis");
        btnRegistrarAnalisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAnalisisActionPerformed(evt);
            }
        });

        tbExamenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Exámen", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
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
        tbExamenes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbExamenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbExamenesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbExamenesMousePressed(evt);
            }
        });
        tbExamenes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbExamenesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbExamenes);

        btnBuscar1.setText("Presentar todos");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtTipoExamen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTipoExamenKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoExamenKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtTipoExamen);

        jLabel1.setText("Buscar tipo Exámen");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrarAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        borrar();
        admConsulta_Medica.llenarGridExamen(tbExamenes,"all");

    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void tbExamenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbExamenesMouseClicked
        
    }//GEN-LAST:event_tbExamenesMouseClicked

    private void tbExamenesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbExamenesKeyPressed

    }//GEN-LAST:event_tbExamenesKeyPressed

    private void txtTipoExamenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoExamenKeyPressed
        
    }//GEN-LAST:event_txtTipoExamenKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        borrar();
        btnRegistrarAnalisis.setEnabled(false);
        admConsulta_Medica.llenarGridExamen(tbExamenes,txtTipoExamen.getText());
        if(contar()>0){
            btnRegistrarAnalisis.setEnabled(true);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarAnalisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAnalisisActionPerformed
        admConsulta_Medica.setIndexExamenes(tbExamenes.getSelectedRow());
        FrmRegistro_Analisis frmRegistro_Analisis = new FrmRegistro_Analisis(this,true);
        frmRegistro_Analisis.setVisible(true);
    }//GEN-LAST:event_btnRegistrarAnalisisActionPerformed

    private void tbExamenesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbExamenesMousePressed
        btnRegistrarAnalisis.setEnabled(true);
    }//GEN-LAST:event_tbExamenesMousePressed

    private void txtTipoExamenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoExamenKeyTyped
        char letra=evt.getKeyChar();
        if(((letra>='0'&&letra<='9')||(letra==' '))){
            evt.consume();
        }else{
        }
    }//GEN-LAST:event_txtTipoExamenKeyTyped

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrarAnalisis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbExamenes;
    private javax.swing.JTextPane txtTipoExamen;
    // End of variables declaration//GEN-END:variables
}