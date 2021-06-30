/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Andres Cox
 */
public class ExamenRealizado {
    private int Examen_Realizado_ID;
    private LocalDate fecha;
    private Paciente paciente_ID;
    private ArrayList<Detalle_Examen> detalle_Exam= new ArrayList<Detalle_Examen>();
    private String doctor;

    public int getExamen_Realizado_ID() {
        return Examen_Realizado_ID;
    }

    public void setExamen_Realizado_ID(int Examen_Realizado_ID) {
        this.Examen_Realizado_ID = Examen_Realizado_ID;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente_ID() {
        return paciente_ID;
    }

    public void setPaciente_ID(Paciente paciente_ID) {
        this.paciente_ID = paciente_ID;
    }

    public ArrayList<Detalle_Examen> getDetalle_Exam() {
        return detalle_Exam;
    }

    public void setDetalle_Exam(ArrayList<Detalle_Examen> detalle_Exam) {
        this.detalle_Exam = detalle_Exam;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    
}
