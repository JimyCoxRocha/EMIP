/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import model.Registro;

/**
 *
 * @author domar1299
 */
public class DatosAgenda {

    public String ingresar(int codigo, String nombre, String cedula, String Hora, String obs, LocalDate fecha,int p, Connection conexion) {
        PreparedStatement pst;
        String msj="";
        java.sql.Date fechas = java.sql.Date.valueOf(fecha);
        String sql="INSERT INTO Agenda(fecha_Agenda,Hora_Agenda,paciente_id,nombre,cedula,observacion,CodigoExamen) VALUES(?,?,?,?,?,?,?)";
        
        try{
            pst=conexion.prepareStatement(sql);
            pst.setDate(1, fechas);
            pst.setString(2, Hora);
            pst.setInt(3, p);
            pst.setString(4, nombre);
            pst.setString(5, cedula);
            pst.setString(6, obs);
            pst.setInt(7, p);
            pst.executeUpdate();
            pst.close();
            msj="Registro Guardado";
        }catch(SQLException ex){
            msj=ex.getMessage();
        }
        return msj;
    }

    public ArrayList<Registro> consultarTodo(Connection conexion) {
      ArrayList<Registro> lista = new ArrayList<>();

        String sql = "SELECT fecha_Agenda, cedula, nombre, Hora_Agenda, observacion, CodigoExamen, Entregado from Agenda order by fecha_Agenda ";

        Registro r = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                r = new Registro();
                r.setCedula(rs.getString("cedula"));
                r.setNombre(rs.getString("nombre"));
                r.setFecha(rs.getDate("fecha_Agenda").toLocalDate());
                r.setHora(rs.getString("Hora_Agenda"));
                r.setObservacion(rs.getString("observacion"));
                r.setExamen_id(rs.getInt("CodigoExamen"));
                r.setEstado(rs.getString("Entregado"));
                lista.add(r);
            }
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;}

    public ArrayList<Registro> filtrar(Connection conexion, int Codigo) {
         ArrayList<Registro> lista = new ArrayList<>();
 String sql ="  select cedula_Pasaporte, apellido, nombre, Examen_Realizado.Paciente_ID,Examen_Realizado.Examen_Realizado_ID"
+"  from Examen_Realizado" 
+"      inner join Paciente  on Examen_Realizado.Paciente_ID=Paciente.Paciente_ID"
+"	   where Examen_Realizado_ID="+Codigo+""
+" Except" 
+" SELECT a.cedula, p.apellido, p.nombre, e.Paciente_ID,a.CodigoExamen"
+" FROM Agenda a"
+"	inner join Paciente p on a.Paciente_ID=p.Paciente_ID "
+"	inner join Examen_Realizado e  on e.Examen_Realizado_ID=a.CodigoExamen";
        
       /* String sql ="select cedula_Pasaporte, apellido, nombre, Examen_Realizado.Paciente_ID "
                    +"from Examen_Realizado  "
                    +"inner join Paciente  on Examen_Realizado.Paciente_ID=Paciente.Paciente_ID "
                    +"where Examen_Realizado_ID="+Codigo+"";*/
        Registro r = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                r = new Registro();
                r.getPaciente().setCedula(rs.getString("cedula_Pasaporte"));
                r.getPaciente().setApellido(rs.getString("apellido"));
                r.getPaciente().setNombre(rs.getString("nombre"));
               //r.getPaciente().setPaciente_id(rs.getInt("p.Paciente_ID"));
               // r.getExamenRealizado().setPaci_id(rs.getInt("Examen_Realizado.Paciente_ID"));
                //r.setExamen_id(rs.getInt("e.Paciente_ID"));
                r.setPaciente_id(rs.getInt("Paciente_ID"));

                lista.add(r);
            }
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;}

    public String eliminar(int codigo, Connection conexion) {
        PreparedStatement pst;
        String msj="";
        
        String sql="delete from Agenda where CodigoExamen="+codigo+"";
        
        try{
            pst=conexion.prepareStatement(sql);
            //pst.setInt(1, codigo);
            pst.executeUpdate();
            pst.close();
            msj="Registro Eliminado";
        }catch(SQLException ex){
            msj=ex.getMessage();
        }
        return msj; }

    public String editar(int codigo, String Hora, String obs, LocalDate fecha, Connection conexion) {
        PreparedStatement pst;
        String msj="";
        java.sql.Date fechas = java.sql.Date.valueOf(fecha);
        String sql="update Agenda set fecha_Agenda=?, Hora_Agenda=?, observacion=? where CodigoExamen=?";
        
        try{
            pst=conexion.prepareStatement(sql);
            pst.setDate(1, fechas);
            pst.setString(2, Hora);
            pst.setString(3, obs);
            pst.setInt(4, codigo);
            pst.executeUpdate();
            pst.close();
            msj="Registro Editado";
        }catch(SQLException ex){
            msj=ex.getMessage();
        }
        return msj; }

    public String entregado(int c, Connection conexion) {
        PreparedStatement pst;
        String msj="";
        String m="Entregado";
        String sql="update Agenda set Entregado=? where CodigoExamen=?";
        
        try{
            pst=conexion.prepareStatement(sql);
            pst.setString(1, m);
            pst.setInt(2, c);
            pst.executeUpdate();
            pst.close();
            msj="Entregado Correctamente";
        }catch(SQLException ex){
            msj=ex.getMessage();
        }
        return msj; 
    }

    public ArrayList<Registro> filtrarFecha(Connection conexion, String FechaFiltro) {
       ArrayList<Registro> lista = new ArrayList<>();

        String sql ="select fecha_Agenda, CodigoExamen, cedula, nombre, Hora_Agenda, observacion, Entregado from Agenda "
                    +"where fecha_Agenda='"+FechaFiltro+"'"+" order by fecha_Agenda";
        Registro r = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                r = new Registro();
               
                r.setCedula(rs.getString("cedula"));
                r.setNombre(rs.getString("nombre"));
                r.setHora(rs.getString("Hora_Agenda"));
                r.setEstado(rs.getString("Entregado"));
                r.setObservacion(rs.getString("observacion"));
                r.setExamen_id(rs.getInt("CodigoExamen"));
                 r.setFecha(rs.getDate("fecha_Agenda").toLocalDate());
                lista.add(r);
            }
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;}

    }
    

