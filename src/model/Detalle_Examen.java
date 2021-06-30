/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Andres Cox
 */
public class Detalle_Examen {
   private int examen_Realizado_ID;
   private String tipo_Examen_Descripcion;
   private ArrayList <Criterio> criterios = new ArrayList <Criterio>();
   private String detalle; 

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
   
    public int getExamen_Realizado_ID() {
        return examen_Realizado_ID;
    }

    public void setExamen_Realizado_ID(int examen_Realizado_ID) {
        this.examen_Realizado_ID = examen_Realizado_ID;
    }

    public String getTipo_Examen_Descripcion() {
        return tipo_Examen_Descripcion;
    }

    public void setTipo_Examen_Descripcion(String tipo_Examen_Descripcion) {
        this.tipo_Examen_Descripcion = tipo_Examen_Descripcion;
    }

    public ArrayList<Criterio> getCriterios() {
        return criterios;
    }

    public void setCriterios(ArrayList<Criterio> criterios) {
        this.criterios = criterios;
    }
   
   
   
   
}
