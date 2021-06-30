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
public class Criterio {
   
   private int Criterio_ID;
   private String criterio_Descripcion;
   private String rango_Inicial;
   private String rango_Final;
   
   private String Rango_Normal_Inicial;
   private String Rango_Normal_Final;
   private String estado;
   private String unidad_Medida;
   
   private String valor;

    public String getRango_Normal_Inicial() {
        return Rango_Normal_Inicial;
    }

    public String getRango_Normal_Final() {
        return Rango_Normal_Final;
    }

   
    public int getCriterio_ID() {
        return Criterio_ID;
    }

    public void setCriterio_ID(int Criterio_ID) {
        this.Criterio_ID = Criterio_ID;
    }

    public String getCriterio_Descripcion() {
        return criterio_Descripcion;
    }

    public void setCriterio_Descripcion(String criterio_Descripcion) {
        this.criterio_Descripcion = criterio_Descripcion;
    }

    public String getRango_Inicial() {
        return rango_Inicial;
    }

    public void setRango_Inicial(String rango_Inicial) {
        this.rango_Inicial = rango_Inicial;
    }

    public String getRango_Final() {
        return rango_Final;
    }

    public void setRango_Final(String rango_Final) {
        this.rango_Final = rango_Final;
    }


    public void setRango_Normal_Inicial(String Rango_Normal_Inicial) {
        this.Rango_Normal_Inicial = Rango_Normal_Inicial;
    }
    
    public void setRango_Normal_Final(String Rango_Normal_Final) {
        this.Rango_Normal_Final = Rango_Normal_Final;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUnidad_Medida() {
        return unidad_Medida;
    }

    public void setUnidad_Medida(String unidad_Medida) {
        this.unidad_Medida = unidad_Medida;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
   
   
   
}
