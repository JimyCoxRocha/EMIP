/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class datosPaciente {
    public void valores(Paciente paciente) {
        //JOptionPane.showMessageDialog(null, "AA");
        Connection cn = Conexion.getConnectionDB();
        String msj;
        //JOptionPane.showMessageDialog(null, "Se creo");
        
        PreparedStatement pst;
        
        
        String sql="INSERT INTO Paciente (nombre, apellido, direccion, cedula_Pasaporte, Fecha_Naci, sexo, telefono) "
                + "VALUES (?,?,?,?,?,?,?)";
        try{
            //Statement statement = cn.createStatement();
            //statement.executeUpdate("INSERT INTO Paciente (nombre, apellido, direccion, cedula_Pasaporte, fecha_Naci, sexo, telefono, nacionalidad) "
              //  + "VALUES ('aNDRES','Cox','asdf','0958657843','2019-12-12','M','2938492','Ecuador')");
        java.sql.Date fecha = java.sql.Date.valueOf(paciente.getFecha_Naci());
        pst=cn.prepareStatement(sql);
        pst.setString(1, paciente.getNombre());
        pst.setString(2, paciente.getApellido());
        pst.setString(3, paciente.getDireccion());
        pst.setString(4, paciente.getCedula());
        //pst.setString(5, paciente.getFecha_Naci());
        pst.setDate(5, fecha);
        pst.setString(6, paciente.getSexo());
        pst.setString(7, paciente.getTelefono());
        pst.executeUpdate();
        pst.close();
        //JOptionPane.showMessageDialog(null, "El paciente: "+paciente.getNombre()+"ha sido agregado a la base de datos.");
        }catch (SQLException e){
            msj=e.getMessage();
            JOptionPane.showMessageDialog(null, msj);
        }
    }
    
    
    
    public ArrayList<Paciente> consultarTodos(String opcBusqueda){//(Connection con, String cedula)
        
        Connection cn = Conexion.getConnectionDB();
        ArrayList<Paciente> lista = new ArrayList<>();
        String Sql;
        if(opcBusqueda.equals("all")){
            Sql="SELECT *FROM Paciente";
        }else{
            Sql="SELECT Paciente_ID, nombre, apellido, direccion, cedula_Pasaporte, Fecha_Naci, sexo, telefono, Fecha_Naci FROM Paciente WHERE cedula_Pasaporte='"+opcBusqueda+"'";
        }
        //¡String Sql="SELECT * FROM autor WHERE cedula='"+cedula+"'";
        //cod_Funcion,cod_pelicula,cod_complejo,horario1,horario2,formato,fecha, complejo.detalle, complejo.cod_sala, "+ "pelicula.titulo, pelicula.sinopsis,pelicula.actores, pelicula.categoria,*/ 
        Paciente paciente=null;        
        Statement st = null;
        ResultSet rs=null;
        try{
            st=cn.createStatement();
            rs=st.executeQuery(Sql);
            while(rs.next()){
                paciente=new Paciente();
                
                paciente.setPaciente_id(rs.getInt("Paciente_ID"));
                
                paciente.setNombre(rs.getString("nombre"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setDireccion(rs.getString("direccion"));
                paciente.setCedula(rs.getString("cedula_Pasaporte"));
                paciente.setSexo(rs.getString("sexo"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setFecha_Naci((rs.getDate("Fecha_Naci")).toLocalDate());
                //JOptionPane.showMessageDialog(null, "Mira esto: "+rs.getString("nombre"));
                lista.add(paciente);
            }
            st.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());   
        }    
        return lista;
    }
 public ArrayList<ExamenRealizado> consultarHistorial(String opcBusqueda, Paciente paciente){
     Connection cn = Conexion.getConnectionDB();
        ArrayList<ExamenRealizado> lista = new ArrayList<>();
        String Sql;
        ArrayList<Detalle_Examen> detalle_Examenes= null;
        ArrayList <Criterio> criterios = null;
        Criterio criterio = null;
        int validacion=0;
        
        Detalle_Examen detalle_Examen = null;
        /*if(opcBusqueda.equals("all")){
            
                    
        }else{
            Sql="SELECT Paciente_ID, nombre, apellido, direccion, cedula_Pasaporte, Fecha_Naci, sexo, telefono, Fecha_Naci FROM Paciente WHERE cedula_Pasaporte='"+opcBusqueda+"'";
        }*/
        
        //¡String Sql="SELECT * FROM autor WHERE cedula='"+cedula+"'";
        //cod_Funcion,cod_pelicula,cod_complejo,horario1,horario2,formato,fecha, complejo.detalle, complejo.cod_sala, "+ "pelicula.titulo, pelicula.sinopsis,pelicula.actores, pelicula.categoria,*/ 
        ExamenRealizado examen=null;        
        /**************************/
        Statement st = null;
        ResultSet rs=null;
        /***************************/
        Statement st2 = null;
        ResultSet rs2=null;
        /***************************/
        Statement st3 = null;
        ResultSet rs3=null;
        /***************************/
        try{
            st=cn.createStatement();
            rs=st.executeQuery("{call dbo.sp_Ingreso_Paciente("+paciente.getPaciente_id()+")}");
            while(rs.next()){
                examen=new ExamenRealizado();
                examen.setExamen_Realizado_ID(rs.getInt("Examen_Realizado_ID"));
                examen.setFecha((rs.getDate("fecha")).toLocalDate());
                examen.setPaciente_ID(paciente);
                /******************************************************************/
                detalle_Examenes= new ArrayList<Detalle_Examen>();
                //listaCriterio = new ArrayList<Criterio>();
                st2=cn.createStatement();
                rs2=st2.executeQuery("{call dbo.sp_Ingreso_Examen_Realizado("+paciente.getPaciente_id()+","+examen.getExamen_Realizado_ID()+")}");
                if(examen.getExamen_Realizado_ID()!=validacion){
                    validacion=examen.getExamen_Realizado_ID();
                    while(rs2.next()){
                        detalle_Examen =new Detalle_Examen();
                        detalle_Examen.setExamen_Realizado_ID(rs2.getInt("Tipo_Examen_ID"));
                        detalle_Examen.setDetalle(rs2.getString("Descripcion"));
                        detalle_Examen.setTipo_Examen_Descripcion(rs2.getString("Descripcion"));
                        /******************************************************************/
                        /******************************************************************/
                            criterios = new ArrayList <Criterio>();
                            //listaCriterio = new ArrayList<Criterio>();
                            st3=cn.createStatement();
                            rs3=st3.executeQuery("{call dbo.sp_Ingreso_Examen_Tipo("+paciente.getPaciente_id()+","+examen.getExamen_Realizado_ID()+","+detalle_Examen.getExamen_Realizado_ID()+")}");
                            while(rs3.next()){
                                criterio = new Criterio();
                                criterio.setCriterio_ID(rs3.getInt("Criterio_ID"));
                                criterio.setCriterio_Descripcion(rs3.getString("criterio_Descripcion"));
                                criterio.setEstado(rs3.getString("estado"));
                                criterio.setRango_Final(rs3.getString("rango_Final"));
                                criterio.setRango_Inicial(rs3.getString("rango_Inicial"));
                                criterio.setRango_Normal_Final(rs3.getString("Rango_Normal_Final"));
                                criterio.setRango_Normal_Inicial(rs3.getString("Rango_Normal_Inicial"));
                                criterio.setUnidad_Medida(rs3.getString("unidad_Medida"));
                                criterio.setValor(rs3.getString(("valor")));

                                criterios.add(criterio);
                            }

                            detalle_Examen.setCriterios(criterios);
                            st3.close();
                        /******************************************************************/
                        /******************************************************************/
                        detalle_Examenes.add(detalle_Examen);
                    }
                }
                examen.setDetalle_Exam(detalle_Examenes);
                st2.close();
                /******************************************************************/
                //JOptionPane.showMessageDialog(null, "Mira esto: "+rs.getString("nombre"));
                lista.add(examen);
            }
            st.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());   
        }    
        return lista;
 }
    
    public ArrayList<Detalle_Examen> consultarTodosExamenes(String opcBusqueda) {
        Connection cn = Conexion.getConnectionDB();
        ArrayList<Detalle_Examen> lista = new ArrayList<Detalle_Examen>();
        ArrayList<Criterio> listaCriterio;
        String Sql1;
        String Sql;
        if(opcBusqueda.equals("all")){
            Sql="SELECT DISTINCT TPC.Tipo_examen_ID,TP.Tipo_Examen_ID,TP.Descripcion,TP.Detalle\n" +
                "from Tipo_Examen TP\n" +
                "INNER JOIN Prueba TPC ON TPC.Tipo_examen_ID=TP.Tipo_Examen_ID\n" +
                "INNER JOIN Criterio C ON C.Criterio_ID=TPC.Criterio_ID ORDER BY TP.Tipo_Examen_ID";
        }else{
            Sql="SELECT Paciente_ID, nombre, apellido, direccion, cedula_Pasaporte, Fecha_Naci, sexo, telefono, Fecha_Naci FROM Paciente WHERE cedula_Pasaporte='"+opcBusqueda+"'";
            JOptionPane.showMessageDialog(null, "Ingresó al ELSE");
        }
        Detalle_Examen tipoExamen=null;
        Criterio criterio=null;
        Statement st = null;
        ResultSet rs=null;
        /***********************/
        Statement st1 = null;
        ResultSet rs1=null;
        /***********************/
        try{
            st=cn.createStatement();
            rs=st.executeQuery(Sql);
            
            
            
            while(rs.next()){
                st1=cn.createStatement();
                tipoExamen=new Detalle_Examen();
                tipoExamen.setExamen_Realizado_ID(rs.getInt("Tipo_Examen_ID"));
                tipoExamen.setTipo_Examen_Descripcion(rs.getString("Descripcion"));
                tipoExamen.setDetalle(rs.getString("Detalle"));
                rs1=st1.executeQuery("SELECT C.Criterio_ID, C.criterio_descripcion, C.rango_inicial, C.rango_final,\n" +
                "C.rango_normal_inicial, C.rango_normal_final, C.estado, C.unidad_medida\n" +
                "from Tipo_Examen TP \n" +
                "INNER JOIN Prueba TPC ON TPC.Tipo_examen_ID=TP.Tipo_Examen_ID\n" +
                "INNER JOIN Criterio C ON C.Criterio_ID=TPC.Criterio_ID\n" +
                "WHERE TP.Tipo_Examen_ID="+tipoExamen.getExamen_Realizado_ID()+"\n" +
                "ORDER BY TP.Tipo_Examen_ID");
                listaCriterio = new ArrayList<Criterio>();
                while(rs1.next()){
                    criterio=new Criterio();
                    criterio.setCriterio_ID(rs1.getInt("Criterio_ID"));
                    criterio.setCriterio_Descripcion(rs1.getString("criterio_descripcion"));
                    criterio.setRango_Inicial(rs1.getString("rango_inicial"));
                    criterio.setRango_Final(rs1.getString("rango_final"));
                    criterio.setRango_Normal_Inicial(rs1.getString("rango_normal_inicial"));
                    criterio.setRango_Normal_Final(rs1.getString("rango_normal_final"));
                    criterio.setEstado(rs1.getString("estado"));
                    criterio.setUnidad_Medida(rs1.getString("unidad_medida"));
                    listaCriterio.add(criterio);
                }
                tipoExamen.setCriterios(listaCriterio);
                st1.close();
                
                lista.add(tipoExamen);
            }
            st.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());   
        }
        return lista;
    }

}
