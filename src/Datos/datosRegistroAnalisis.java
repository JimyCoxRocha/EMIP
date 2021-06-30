/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Criterio;
import model.Detalle_Examen;
import model.ExamenRealizado;
import model.Paciente;

/**
 *
 * @author Andres Cox
 */
public class datosRegistroAnalisis {
    
    public void consultarHistorial(Paciente paciente, Detalle_Examen detalle_Examen, ArrayList<Criterio> criterios){
     Connection cn = Conexion.getConnectionDB();
     java.sql.Date fecha = java.sql.Date.valueOf(LocalDate.now());
        ArrayList<ExamenRealizado> lista = new ArrayList<>();
        String Sql;
        int codigo1=0;
        int codigoPrueba=0;
        //ArrayList<Detalle_Examen> detalle_Examenes= null;
        //ArrayList <Criterio> criterios = null;
        //Criterio criterio = null;
        //Detalle_Examen detalle_Examen = null;
        //ExamenRealizado examen=null;        
        /**************************/
        Statement st = null;
        ResultSet rs=null;
        /***************************/
        Statement st2 = null;
        ResultSet rs2=null;
        /***************************/
        Statement st3 = null;
        ResultSet rs3=null;
        PreparedStatement pst;
        /***************************/
        try{
            JOptionPane.showMessageDialog(null, "Datos: "+fecha+","+paciente.getPaciente_id());
            CallableStatement proc = cn.prepareCall("{call dbo.sp_Insertar_Examen_Realizado(?, ?, ?)}");
            //fecha, paciente.getPaciente_id(), 1
            proc.setDate(1, fecha);
            proc.setInt(2, paciente.getPaciente_id());
            proc.setInt(3, 1);
            //https://www.jc-mouse.net/base-de-datos/procedimientos-almacenados-en-java
            // parametros de salida
            proc.execute();//Tipo String
            /************************************************************************************/
            st2=cn.createStatement();
            rs2=st2.executeQuery("{call dbo.sp_Buscar_Ultimo_Examen}");
            while(rs2.next()){
                codigo1=rs2.getInt("Examen_Realizado_ID");
            }
            st2.close();
            /************************************************************************************/
            
            for(Criterio criterio: criterios){
                
                st2=cn.createStatement();
                rs2=st2.executeQuery("{call dbo.sp_Buscar_Prueba("+detalle_Examen.getExamen_Realizado_ID()+","+criterio.getCriterio_ID()+")}");
                
                while(rs2.next()){
                    codigoPrueba=rs2.getInt("Prueba_ID");
                }
                st2.close();
                 //pst=cn.prepareStatement("{call dbo.sp_Insertar_Detalle_Examen("+codigo1+","+codigoPrueba+","+criterio.getValor()+")}");
                 CallableStatement proc2 = cn.prepareCall("{call dbo.sp_Insertar_Detalle_Examen(?, ?, ?)}");
            //fecha, paciente.getPaciente_id(), 1
                proc2.setInt(1, codigo1);
                proc2.setInt(2, codigoPrueba);
                proc2.setString(3, criterio.getValor());
                proc2.execute();
                proc2.close();
                
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());   
        }    
        
    }

    
}
