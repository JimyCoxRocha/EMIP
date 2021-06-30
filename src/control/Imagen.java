/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Andres Cox
 */
public class Imagen {
    ImageIcon pantalla=new ImageIcon();
    private static Imagen imagen= null;

    public static Imagen getImagen() {
        if(imagen==null){
            imagen=new Imagen();
        }
        return imagen;
    }
    
    
    public ImageIcon vistoBueno(){
            ImageIcon icon1 = new ImageIcon(getClass().getResource("/imagen/img1.png"));
            return icon1;
    }
    public ImageIcon vistoIncompleto(){
            ImageIcon icon2 = new ImageIcon(getClass().getResource("/imagen/img2.png"));
            return icon2;
    }
    public ImageIcon vistoBuenolbl(){
            ImageIcon icon1 = new ImageIcon(getClass().getResource("/imagen/lbl1.png"));
            return icon1;
    }
    public ImageIcon vistoIncompletolbl(){
            ImageIcon icon2 = new ImageIcon(getClass().getResource("/imagen/lbl2.png"));
            return icon2;
    }
    
    /*********************************VENTANA PRINCIPAL*******************************************/
    public ImageIcon panelControl(JLabel lblPanelControl){
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagen/PanelControl.png"));
        icon = new ImageIcon(icon.getImage().getScaledInstance(lblPanelControl.getWidth(), lblPanelControl.getHeight(), Image.SCALE_DEFAULT));
        return icon;
    }

    Icon registrarAnalisis(JButton btnRegistrarAnalisis) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagen/RegistrarAnalisis.png"));
        icon = new ImageIcon(icon.getImage().getScaledInstance(btnRegistrarAnalisis.getWidth(), btnRegistrarAnalisis.getHeight(), Image.SCALE_DEFAULT));
        return icon;
    }

    Icon registrarPaciente(JButton btnRegistrarPaciente) {
        pantalla = new ImageIcon(getClass().getResource("/imagen/RegistrarPaciente.png"));
        pantalla = new ImageIcon(pantalla.getImage().getScaledInstance(btnRegistrarPaciente.getWidth(), btnRegistrarPaciente.getHeight(), Image.SCALE_DEFAULT));
        return pantalla;
    }

    Icon registrarCita(JButton btnRegistrarCita) {
        pantalla = new ImageIcon(getClass().getResource("/imagen/RegistrarCita.png"));
        pantalla = new ImageIcon(pantalla.getImage().getScaledInstance(btnRegistrarCita.getWidth(), btnRegistrarCita.getHeight(), Image.SCALE_DEFAULT));
        return pantalla;
    }

    Icon declaracionHelen(JLabel lblHelen) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagen/Helen.png"));
         icon = new ImageIcon(icon.getImage().getScaledInstance(lblHelen.getWidth(), lblHelen.getHeight(), Image.SCALE_DEFAULT));
        return icon;
    }

    Icon presentarPaciente(JButton lblPaciente) {
        pantalla = new ImageIcon(getClass().getResource("/imagen/HistorialPaciente.png"));
        pantalla = new ImageIcon(pantalla.getImage().getScaledInstance(lblPaciente.getWidth(), lblPaciente.getHeight(), Image.SCALE_DEFAULT));
        return pantalla;
    }

    Icon presentarCita(JButton lblCitas) {
        pantalla = new ImageIcon(getClass().getResource("/imagen/Cita.png"));
        pantalla = new ImageIcon(pantalla.getImage().getScaledInstance(lblCitas.getWidth(), lblCitas.getHeight(), Image.SCALE_DEFAULT));
        return pantalla;
    }

    Icon presentarComprobante(JButton lblComprobante) {
        pantalla = new ImageIcon(getClass().getResource("/imagen/Comprobante.png"));
        pantalla = new ImageIcon(pantalla.getImage().getScaledInstance(lblComprobante.getWidth(), lblComprobante.getHeight(), Image.SCALE_DEFAULT));
        return pantalla;
    }

    Icon EMIP(JButton btnEmip) {
        pantalla = new ImageIcon(getClass().getResource("/imagen/Emip.png"));
        pantalla = new ImageIcon(pantalla.getImage().getScaledInstance(btnEmip.getWidth(), btnEmip.getHeight(), Image.SCALE_DEFAULT));
        return pantalla;
    }
    /*********************************************************************************************/
}
