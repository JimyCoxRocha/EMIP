
package control;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;

public class Validacion1 {
    
    public int toEntero(String msj){
        String entrada="";
        int entero=0;
        boolean b=false;
        do{
                entrada=JOptionPane.showInputDialog(null,msj);
            try{
            entero=Integer.parseInt(entrada);
            b=true;

            }catch(NumberFormatException x){
                JOptionPane.showMessageDialog(null, "Se esperaba un numero");
            }catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "gracias");
                break;
            }
        }while(!b);
        return entero;
    }
    
    
    public LocalDate toFecha(String msj){
        LocalDate fecha=null;

        try{
            fecha=LocalDate.parse(msj);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: ");
            System.out.println(e.getMessage());

        }

        return fecha;
    }
    
    public LocalTime toHora(String msj){
        LocalTime hora=null;

        try{
            hora=LocalTime.parse(msj);
        }catch(DateTimeException e){
            JOptionPane.showMessageDialog(null, "Error: se esperaba hora hh:mm");
            System.out.println(e.getMessage());

        }

        return hora;
    }
    
     public String toCedula (String msj){
        boolean longitud = false, numerico = false;
        String cedula ="";
        do{
            cedula = JOptionPane.showInputDialog(msj);
            if(cedula.length()!=10){
                longitud=false;
                JOptionPane.showMessageDialog(null,"Error: Debe tener 10 digitos ");
            }else {longitud = true;}
            try {
                Integer.parseInt(cedula);
                numerico = true;
            } catch (NumberFormatException x ){
                numerico = false;
                JOptionPane.showMessageDialog(null, "Error: Solo se aceptan numeros");
            }
        }while (!longitud || !numerico);
    return cedula;
    }
     
     public LocalDate Fechas(Date fehca){
         LocalDate fecha=null;
         try{
         fecha = fehca.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
         }catch(DateTimeException e){
         JOptionPane.showMessageDialog(null,"Error: se esperaba fecha aaaa-mm-dd");
         }
         return fecha;
     }
}
