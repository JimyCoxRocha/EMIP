/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {
    private int Id;
    private int paciente_id;
    private int examen_id;
    private String nombre;
    private String cedula;
    private Paciente paciente=new Paciente();
    private ExamenRealizado examenRealizado=new ExamenRealizado();
    private LocalDate fecha;
    private String  hora;
    private String observacion;
    private String estado;

    public Registro(int Id, int paciente_id, int examen_id, String nombre, String cedula, LocalDate fecha, String hora, String observacion, String estado) {
        this.Id = Id;
        this.paciente_id = paciente_id;
        this.examen_id = examen_id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.fecha = fecha;
        this.hora = hora;
        this.observacion = observacion;
        this.estado=estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(int paciente_id) {
        this.paciente_id = paciente_id;
    }

    public int getExamen_id() {
        return examen_id;
    }

    public void setExamen_id(int examen_id) {
        this.examen_id = examen_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public ExamenRealizado getExamenRealizado() {
        return examenRealizado;
    }

    public void setExamenRealizado(ExamenRealizado examenRealizado) {
        this.examenRealizado = examenRealizado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
public Registro(){
    }
    

}
