/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import Datos.datosPaciente;
import Datos.datosRegistroAnalisis;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.Criterio;
import model.Detalle_Examen;
import model.ExamenRealizado;
import model.Paciente;
/**
 *
 * @author Andres Cox
 */
public class AdmConsulta_Medica {
    private static AdmConsulta_Medica admConsulta_Medica;
    public datosPaciente datos= new datosPaciente();
    public ArrayList<Paciente> pacientes= new ArrayList<Paciente>();
    public ArrayList<Detalle_Examen> listaExamenes= new ArrayList<Detalle_Examen>();
    public ArrayList<ExamenRealizado> examenes = new ArrayList<ExamenRealizado>();
    public ArrayList<Criterio> criterios = new ArrayList<Criterio>();
    public Imagen img = new Imagen();
    public datosRegistroAnalisis registros = new datosRegistroAnalisis();
    
    
    private int indexExamenes=0;
    private int indexDetalle_Examenes=0;
    private int indexCriterio=0;
    private int indexMaximoCriterio=0;
    private int indexPaciente=0;
    private int flag=0;
    
    private LocalDate indexFecha=null;

    JTable tbRegistroAnalisis = null;
    JButton btnRegistrarAnalisis = null;       

    public int getIndexMaximoCriterio() {
        return indexMaximoCriterio;
    }

    public void setIndexMaximoCriterio(int indexMaximoCriterio) {
        this.indexMaximoCriterio = indexMaximoCriterio;
    }

    public JButton getBtnRegistrarAnalisis() {
        return btnRegistrarAnalisis;
    }

    public void setBtnRegistrarAnalisis(JButton btnRegistrarAnalisis) {
        this.btnRegistrarAnalisis = btnRegistrarAnalisis;
    }
    
    
    
    public int getIndexDetalle_Examenes() {
        return indexDetalle_Examenes;
    }

    public void setIndexDetalle_Examenes(int indexDetalle_Examenes) {
        this.indexDetalle_Examenes = indexDetalle_Examenes;
    }

    
    
    public LocalDate getIndexFecha() {
        return indexFecha;
    }

    public void setIndexFecha(LocalDate indexFecha) {
        this.indexFecha = indexFecha;
    }
    
    public int getIndexCriterio() {
        return indexCriterio;
    }

    public void setIndexCriterio(int indexCriterio) {
        this.indexCriterio = indexCriterio;
    }

    public int getIndexPaciente() {
        return indexPaciente;
    }

    public void setIndexPaciente(int indexPaciente) {
        this.indexPaciente = indexPaciente;
    }

    public int getIndexExamenes() {
        return indexExamenes;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public void setIndexExamenes(int indexExamenes) {
        this.indexExamenes = indexExamenes;
    }
    
    public static AdmConsulta_Medica getAdmConsulta_Medica(){
        if(admConsulta_Medica==null){
            admConsulta_Medica=new AdmConsulta_Medica();
        }
        return admConsulta_Medica;
    }
    public boolean validarPaciente(String cedula, String nombre, String apellido, int sexo, String telefono, int opc){
        boolean flag = false;
       if((cedula.isEmpty())||(nombre.isEmpty())||(apellido.isEmpty())||(telefono.isEmpty())||(sexo==0)){
           JOptionPane.showMessageDialog(null, "Asegúrese de ingresar datos importantes como: \nCédula\nNombre\nApellido\nTelefono\nSexo");
           flag=false;
       }else if((cedula.length()!=10)&&(opc==1)){
           JOptionPane.showMessageDialog(null, "Recuerde que la cèdula debe tener 10 dígitos");
           flag=false;
       }else{
           flag=true;
       }
       
       return flag;
    }
    public void paciente(String cedula, String nombre, String apellido, String direccion, Date fecha, String sexo, String telefono){
        LocalDate fechaIngresad=fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        Paciente paciente= new Paciente();
        paciente.setCedula(cedula);
        paciente.setNombre(nombre);
        paciente.setApellido(apellido);
        paciente.setDireccion(direccion);
        paciente.setFecha_Naci(fechaIngresad);
        paciente.setTelefono(telefono);
        
        datos.valores(paciente);
    }

    public void llenarGrid(JTable tbPaciente, String opcBusqueda) {
        DefaultTableModel modelo=(DefaultTableModel)tbPaciente.getModel();
        int nro=0;
        /*******************************************************************/
        pacientes.clear();
        pacientes=datos.consultarTodos(opcBusqueda);
        if(pacientes.size()>0){
            for(Paciente paciente : pacientes){
                //if((opcion==0)||(opcion==1&&(funcion.getFecha().isBefore(fechaInicial)))||(opcion==2&&(funcion.getFecha().isAfter(fechaInicial)))||((opcion==3)&&(funcion.getFecha().isAfter(fechaInicial))&&(funcion.getFecha().isBefore(fechaFinal)))||((opcion==4)&&(funcion.getFecha().isEqual(fechaInicial)))){
                    modelo.addRow(new Object[1]);
                    tbPaciente.setValueAt(paciente.getCedula(), nro, 0);
                    tbPaciente.setValueAt(paciente.getNombre(), nro, 1);
                    tbPaciente.setValueAt(paciente.getApellido(), nro, 2);
                    tbPaciente.setValueAt(paciente.getTelefono(), nro, 3);
                    nro++;
                //}
            }
            if(!opcBusqueda.equals("all")){
                tbPaciente.setRowSelectionInterval(0, 0);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Uy, aparentemente no hay registros de este paciente. Por favor, ingrese otro numero de cedula o registre el paciente");
        }
        
        /*******************************************************************/
    }
    public void consulta(JTable tbPaciente){
        
    }
/**************************************************************/
    public void llenarGridExamen(JTable tbExamenes, String opcBusqueda) {
        DefaultTableModel modelo=(DefaultTableModel)tbExamenes.getModel();
        int nro=0;
        /*******************************************************************/
        listaExamenes.clear();
        listaExamenes=datos.consultarTodosExamenes(opcBusqueda);
        if(listaExamenes.size()>0){
            for(Detalle_Examen examenes : listaExamenes){
                //if((opcion==0)||(opcion==1&&(funcion.getFecha().isBefore(fechaInicial)))||(opcion==2&&(funcion.getFecha().isAfter(fechaInicial)))||((opcion==3)&&(funcion.getFecha().isAfter(fechaInicial))&&(funcion.getFecha().isBefore(fechaFinal)))||((opcion==4)&&(funcion.getFecha().isEqual(fechaInicial)))){
                    modelo.addRow(new Object[1]);
                    tbExamenes.setValueAt(examenes.getTipo_Examen_Descripcion(), nro, 0);
                    tbExamenes.setValueAt(examenes.getDetalle(), nro, 1);
                    nro++;
                //}
            }
            if(!opcBusqueda.equals("all")){
                tbExamenes.setRowSelectionInterval(0, 0);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Uy, aparentemente no hay registros de ese tipo de análisis. Por favor, ingrese otro o registre uno nuevo");
        }
        
        /*******************************************************************/
    }

    public void llenarGridAnalisis(JTable tbRegistroAnalisis) {
        tbRegistroAnalisis.setDefaultRenderer(Object.class,new IconCellRenderer());
        tbRegistroAnalisis.setEnabled(false);
        //para seleccionar
        DefaultTableModel modelo=(DefaultTableModel)tbRegistroAnalisis.getModel();
        
        int nro=0;
        TableColumnModel columnModel = tbRegistroAnalisis.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(5);
        columnModel.getColumn(1).setPreferredWidth(170);
        /*******************************************************************/
        
        /*******************************************************************/
        //listaExamenes=datos.consultarTodosExamenes(opcBusqueda);
        //JOptionPane.showMessageDialog(null,listaExamenes.get(index).getTipo_Examen_Descripcion()+" Este: "+listaExamenes.get(index).getCriterios().get(0).getCriterio_Descripcion());
        if(listaExamenes.get(indexExamenes).getCriterios().size()>0){
            for(Criterio criterios : listaExamenes.get(indexExamenes).getCriterios()){
                //if((opcion==0)||(opcion==1&&(funcion.getFecha().isBefore(fechaInicial)))||(opcion==2&&(funcion.getFecha().isAfter(fechaInicial)))||((opcion==3)&&(funcion.getFecha().isAfter(fechaInicial))&&(funcion.getFecha().isBefore(fechaFinal)))||((opcion==4)&&(funcion.getFecha().isEqual(fechaInicial)))){
                    modelo.addRow(new Object[1]);
                    
                    tbRegistroAnalisis.setValueAt(new JLabel(new ImageIcon(getClass().getResource("/imagen/img2.png"))), nro, 0);
                    
                    tbRegistroAnalisis.setValueAt(criterios.getCriterio_Descripcion(), nro, 1);
                    nro++;
                //}
            }
            indexMaximoCriterio=nro;
                tbRegistroAnalisis.setRowSelectionInterval(0, indexCriterio);
        }else{
            JOptionPane.showMessageDialog(null, "Uy, aparentemente no hay registros de ese tipo de análisis. Por favor, ingrese otro o registre uno nuevo");
        }
        this.tbRegistroAnalisis = tbRegistroAnalisis;
    }

    public void llenarCriterio(JTable tbCriterios, JLabel lblExamen) {
                DefaultTableModel modelo=(DefaultTableModel)tbCriterios.getModel();
        int nro=0;
        /*******************************************************************/
        if(examenes.size()>0){
            
            for(ExamenRealizado examen : examenes){
            
                //JOptionPane.showMessageDialog(null, "Entró 2");
                if(examen.getExamen_Realizado_ID()==indexExamenes){
                    //JOptionPane.showMessageDialog(null, "Entró 3");
                 for(Detalle_Examen detalle : examen.getDetalle_Exam()){
                            if(detalle.getExamen_Realizado_ID()==indexDetalle_Examenes){
                                lblExamen.setText(detalle.getDetalle());
                                for(Criterio criterio : detalle.getCriterios()){
                                    modelo.addRow(new Object[1]);
                                    tbCriterios.setValueAt(criterio.getCriterio_Descripcion(),nro, 0);
                                    tbCriterios.setValueAt(criterio.getValor(),nro, 1);
                                    tbCriterios.setValueAt(criterio.getUnidad_Medida(),nro, 2);
                                    tbCriterios.setValueAt(criterio.getRango_Inicial(),nro, 3);
                                    tbCriterios.setValueAt(criterio.getRango_Final(),nro, 4);
                                    tbCriterios.setValueAt(criterio.getRango_Normal_Inicial(),nro, 5);
                                    tbCriterios.setValueAt(criterio.getRango_Normal_Final(),nro, 6);
                                    tbCriterios.setValueAt(criterio.getUnidad_Medida(),nro, 7);
                                    nro++;
                                }
                            }
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Uy, aparentemente no hay registros de este paciente. Por favor, ingrese otro numero de cedula o registre el paciente");
        }
    }

    public void llenarHistorial(JTable tbPaciente, String opcBusqueda) {
        DefaultTableModel modelo=(DefaultTableModel)tbPaciente.getModel();
        int nro=0;
        /*******************************************************************/
        examenes.clear();
        examenes=datos.consultarHistorial(opcBusqueda, pacientes.get(indexPaciente));
        if(examenes.size()>0){
            for(ExamenRealizado examen : examenes){
                //if((opcion==0)||(opcion==1&&(funcion.getFecha().isBefore(fechaInicial)))||(opcion==2&&(funcion.getFecha().isAfter(fechaInicial)))||((opcion==3)&&(funcion.getFecha().isAfter(fechaInicial))&&(funcion.getFecha().isBefore(fechaFinal)))||((opcion==4)&&(funcion.getFecha().isEqual(fechaInicial)))){
                    for(Detalle_Examen detalle : examen.getDetalle_Exam()){
                        modelo.addRow(new Object[1]);
                        tbPaciente.setValueAt(detalle.getDetalle(),nro, 0);
                        tbPaciente.setValueAt(examen.getFecha(), nro, 1);
                        tbPaciente.setValueAt(detalle.getExamen_Realizado_ID(),nro, 2);
                        tbPaciente.setValueAt(examen.getExamen_Realizado_ID(),nro, 3);
                        nro++;
                    }
                
                
                //}
            }
            if(!opcBusqueda.equals("all")){
                tbPaciente.setRowSelectionInterval(0, 0);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Uy, aparentemente no hay registros de este paciente. Por favor, ingrese otro numero de cedula o registre el paciente");
        }
    }
/**************************************************************/    
    public void cargarCriterio(JLabel lbltipo_Examen_Descripcion, JLabel lblPaciente, JLabel lblCriterio, JLabel lblRango_inicial, JLabel lblRango_final, JLabel lblEstado, JLabel lblUnidad_Medida, JLabel lblRango_normal_inicial, JLabel lblRango_normal_final) {
        if(indexCriterio<indexMaximoCriterio&&indexCriterio>=0){
            lbltipo_Examen_Descripcion.setText(listaExamenes.get(indexExamenes).getTipo_Examen_Descripcion());
            lblPaciente.setText("("+pacientes.get(indexPaciente).getCedula()+" | "+pacientes.get(indexPaciente).getApellido()+")");
            lblCriterio.setText(listaExamenes.get(indexExamenes).getCriterios().get(indexCriterio).getCriterio_Descripcion());
            
            lblRango_inicial.setText(listaExamenes.get(indexExamenes).getCriterios().get(indexCriterio).getRango_Inicial());
            lblRango_final.setText(listaExamenes.get(indexExamenes).getCriterios().get(indexCriterio).getRango_Final());
            lblEstado.setText(listaExamenes.get(indexExamenes).getCriterios().get(indexCriterio).getEstado());
            lblUnidad_Medida.setText(listaExamenes.get(indexExamenes).getCriterios().get(indexCriterio).getUnidad_Medida());
            lblRango_normal_inicial.setText(listaExamenes.get(indexExamenes).getCriterios().get(indexCriterio).getRango_Normal_Inicial());
            lblRango_normal_final.setText(listaExamenes.get(indexExamenes).getCriterios().get(indexCriterio).getRango_Final());
            borrar();
            this.llenarGridAnalisis(this.tbRegistroAnalisis);
        }else if(indexCriterio<0){
            JOptionPane.showMessageDialog(null, "Ya no hay más registros");
            indexCriterio=0;
        }else{
            flag=1;
            JOptionPane.showMessageDialog(null, "Ya puede registrar el paciente");
            indexCriterio=indexMaximoCriterio;
        }
            
            if(flag==0){
                btnRegistrarAnalisis.setEnabled(false);
            }else{
               btnRegistrarAnalisis.setEnabled(true); 
            }
    }

    public void llenarlbls(JLabel lblNoRegistrado, JLabel lblRegistrado) {
        lblNoRegistrado.setIcon(img.vistoIncompletolbl());
        lblRegistrado.setIcon(img.vistoBuenolbl());
        
    }
/**************************************************************/
        private void borrar(){
        DefaultTableModel modelo=(DefaultTableModel)tbRegistroAnalisis.getModel();
        if(modelo.getRowCount()!=0){
            while(modelo.getRowCount()>0)
            {
                modelo.removeRow(0);
            }
        } 
    }
    private int contar(){
        int cantidad=0;
        DefaultTableModel modelo=(DefaultTableModel)tbRegistroAnalisis.getModel();
        cantidad=modelo.getRowCount();
        return cantidad;
    }

    public boolean validarIngresoCriterio(String txtValor, int cmbValor) {
        boolean valor=false;
        if(txtValor.isEmpty()&&cmbValor==0){
            valor=false;
        }else if(!txtValor.isEmpty()&&cmbValor==1){
            valor=false;
        }else{
            valor = true;
        }
        
        return valor;
    }

    public void guardarCriterio(String text, int indexCriterio) {
        if(text.isEmpty()){
            text="";
        }
        listaExamenes.get(indexExamenes).getCriterios().get(indexCriterio).setValor(text);
    }
    
    public void setcargatTxtValorCriterio(JTextField lblText){
        lblText.setText(listaExamenes.get(indexExamenes).getCriterios().get(indexCriterio).getValor());
    }

    public void registrarAnalisis() {
        registros.consultarHistorial(pacientes.get(indexPaciente), listaExamenes.get(indexExamenes),
                listaExamenes.get(indexExamenes).getCriterios());
    }

    public void llenarCriteriok(JTextField jHematies, JTextField jPlacitos, JTextField jBacterias, JTextField jCilindros, JTextField jCristales, JTextField jCel, JTextField jFil) {
          int nro=0;
          
        if(examenes.size()>0){
         Criterio criterio = new Criterio();
            for(ExamenRealizado examen : examenes){
            
                //JOptionPane.showMessageDialog(null, "Entró 2");
                if(examen.getExamen_Realizado_ID()==indexExamenes){
                    //JOptionPane.showMessageDialog(null, "Entró 3");
                 for(Detalle_Examen detalle : examen.getDetalle_Exam()){
                            if(detalle.getExamen_Realizado_ID()==indexDetalle_Examenes){
                               
                              criterio = detalle.getCriterios().get(0);
                              jHematies.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(1);
                              jPlacitos.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(2);
                              jCel.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(3);
                              jFil.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(4);
                              jCristales.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(5);
                              jCilindros.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(6);
                              jBacterias.setText(criterio.getValor());
                                }
                            }
                    }
                }
        
        }else{
            JOptionPane.showMessageDialog(null, "Uy, aparentemente no hay registros de este paciente. Por favor, ingrese otro numero de cedula o registre el paciente");
        }
    }

    public void llenarCriterioj(JTextField jHematies, JTextField jPlacitos, JTextField jBacterias, JTextField jCilindros, JTextField jCristales, JTextField jCel, JTextField jFil, JTextField jNitritos, JTextField JCuerpos, JTextField JHemoglobina, JTextField jleucocitos, JTextField jasc, JTextField jAlbuminas) {
       int nro=0;
       if(examenes.size()>0){
         Criterio criterio = new Criterio();
            for(ExamenRealizado examen : examenes){
            
                //JOptionPane.showMessageDialog(null, "Entró 2");
                if(examen.getExamen_Realizado_ID()==indexExamenes){
                    //JOptionPane.showMessageDialog(null, "Entró 3");
                 for(Detalle_Examen detalle : examen.getDetalle_Exam()){
                            if(detalle.getExamen_Realizado_ID()==indexDetalle_Examenes){
                               
                              criterio = detalle.getCriterios().get(0);
                              jHematies.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(1);
                              jPlacitos.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(2);
                              jCel.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(3);
                              jFil.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(4);
                              jCristales.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(5);
                              jCilindros.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(6);
                              jBacterias.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(7);
                              jNitritos.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(8);
                              JCuerpos.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(9);
                              JHemoglobina.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(10);    
                              jleucocitos.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(11);
                              jasc.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(12);
                              jAlbuminas.setText(criterio.getValor());
                                }
                            }
                    }
                }
        
        }else{
            JOptionPane.showMessageDialog(null, "Uy, aparentemente no hay registros de este paciente. Por favor, ingrese otro numero de cedula o registre el paciente");
        }
       
    }

    public void llenarCriteriol(JTextField jHematies, JTextField jPlacitos, JTextField jBacterias, JTextField jCilindros, JTextField jCristales, JTextField jCel, JTextField jFil, JTextField jNitritos, JTextField JCuerpos, JTextField JHemoglobina, JTextField jleucocitos, JTextField jasc, JTextField jAlbuminas, JTextField jldl) {
        int nro=0;
       if(examenes.size()>0){
         Criterio criterio = new Criterio();
            for(ExamenRealizado examen : examenes){
            
                //JOptionPane.showMessageDialog(null, "Entró 2");
                if(examen.getExamen_Realizado_ID()==indexExamenes){
                    //JOptionPane.showMessageDialog(null, "Entró 3");
                 for(Detalle_Examen detalle : examen.getDetalle_Exam()){
                            if(detalle.getExamen_Realizado_ID()==indexDetalle_Examenes){
                               
                              criterio = detalle.getCriterios().get(0);
                              jHematies.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(1);
                              jPlacitos.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(2);
                              jCel.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(3);
                              jFil.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(4);
                              jCristales.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(5);
                              jCilindros.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(6);
                              jBacterias.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(7);
                              jNitritos.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(8);
                              JCuerpos.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(9);
                              JHemoglobina.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(10);    
                              jleucocitos.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(11);
                              jasc.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(12);
                              jAlbuminas.setText(criterio.getValor());
                              criterio = detalle.getCriterios().get(13);
                              jldl.setText(criterio.getValor());
                                }
                            }
                    }
                }
        
        }else{
            JOptionPane.showMessageDialog(null, "Uy, aparentemente no hay registros de este paciente. Por favor, ingrese otro numero de cedula o registre el paciente");
        }
    }


/**************************************************************/
}
