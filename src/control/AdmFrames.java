/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Andres Cox
 */
public class AdmFrames {
    private static AdmFrames admFrames=null;
     ArrayList<javax.swing.JFrame> admventanas = new ArrayList<javax.swing.JFrame>();
    private int contadorVentanas=0;
    public static AdmFrames getVentanas() {
        if(admFrames==null){
            admFrames=new AdmFrames();
        }
        return admFrames;
    }

    public int getContadorVentanas() {
        return contadorVentanas;
    }

    public void setContadorVentanas(int contadorVentanas) {
        this.contadorVentanas = contadorVentanas;
    }

    
    
    
}
