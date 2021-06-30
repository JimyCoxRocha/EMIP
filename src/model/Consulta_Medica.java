/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Andres Cox
 */
public class Consulta_Medica {
    int consulta_id;
    Paciente paciente;
    String malestar_Descripcion;
    String peso;
    String estatura;

    public int getConsulta_id() {
        return consulta_id;
    }

    public void setConsulta_id(int consulta_id) {
        this.consulta_id = consulta_id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getMalestar_Descripcion() {
        return malestar_Descripcion;
    }

    public void setMalestar_Descripcion(String malestar_Descripcion) {
        this.malestar_Descripcion = malestar_Descripcion;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }
    
    
}
