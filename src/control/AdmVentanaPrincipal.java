/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Andres Cox
 */
public class AdmVentanaPrincipal {
    public static AdmVentanaPrincipal admVentanaPrincipal = null;
    
    public Imagen img = Imagen.getImagen();
    
    public static AdmVentanaPrincipal getAdmVentanaPrincipal(){
        if(admVentanaPrincipal==null){
            admVentanaPrincipal=new AdmVentanaPrincipal();
        }
        return admVentanaPrincipal;
    }
    
   public void llenarlbls(JLabel lblPanelControl, JLabel lblHelen , JButton btnRegistrarAnalisis, JButton btnRegistrarPaciente, JButton btnRegistrarCita,
           JButton   lblPaciente, JButton lblCitas, JButton lblComprobante, JButton btnEmip) {
        lblPanelControl.setIcon(img.panelControl(lblPanelControl));
        lblHelen.setIcon(img.declaracionHelen(lblHelen));
        btnRegistrarAnalisis.setIcon(img.registrarAnalisis(btnRegistrarAnalisis));
        btnRegistrarPaciente.setIcon(img.registrarPaciente(btnRegistrarPaciente));
        btnRegistrarCita.setIcon(img.registrarCita(btnRegistrarCita));
        btnEmip.setIcon(img.EMIP(btnEmip));
        
        lblPaciente.setIcon(img.presentarPaciente(lblPaciente));
        lblCitas.setIcon(img.presentarCita(lblCitas));
        lblComprobante.setIcon(img.presentarComprobante(lblComprobante));

        
        
        //lblRegistrado.setIcon(img.vistoBuenolbl());
        
    }
}
