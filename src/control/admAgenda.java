package control;

import Datos.Conexion;
import com.toedter.calendar.JDateChooser;
import model.*;
import datos.*;
import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author domar1299
 */
public class admAgenda {

    ArrayList<Registro> reg = null;

    public admAgenda() {
        reg = new ArrayList<>();
    }

    private static admAgenda admagenda;
    DatosAgenda datosagenda = new DatosAgenda();

    public static admAgenda getadmAgenda() {
        if (admagenda == null) {
            admagenda = new admAgenda();
        }
        return admagenda;
    }


    public void guardar(int codigo, String nombre, String cedula, String Hora, LocalDate fecha, String obs, int p) {
        String resp = "";
        if (Conexion.getConnectionDB() != null) {
            resp = datosagenda.ingresar(codigo, nombre, cedula, Hora, obs, fecha, p, Conexion.getConnectionDB());
            JOptionPane.showMessageDialog(null, resp);
        }
    }

    public void llenarAgenda(JTable jtagenda) {
        reg.clear();
        int nro = 0;
        String E = "";
        if (Conexion.getConnectionDB()!= null) {
            reg = datosagenda.consultarTodo(Conexion.getConnectionDB());
            if (reg.size() > 0) {
                DefaultTableModel modelo = (DefaultTableModel) jtagenda.getModel();
                for (Registro r : reg) {
                    modelo.addRow(new Object[1]);
                    jtagenda.setValueAt(r.getExamen_id(), nro, 0);
                    jtagenda.setValueAt(r.getCedula(), nro, 1);
                    jtagenda.setValueAt(r.getNombre(), nro, 2);
                    jtagenda.setValueAt(r.getFecha(), nro, 3);
                    jtagenda.setValueAt(r.getHora(), nro, 4);
                    jtagenda.setValueAt(r.getObservacion(), nro, 5);
                    jtagenda.setValueAt(r.getEstado(), nro, 6);
                    nro++;
                }

            }
        }
    }

    public void buscar(int Codigo, JTextField txtCedula, JTextField txtNombre, JLabel lblcodigopaciente) {
        reg.clear();
        if (Conexion.getConnectionDB() != null) {
            reg = datosagenda.filtrar(Conexion.getConnectionDB(), Codigo);
            if (reg.size() > 0) {
                for (Registro regis : reg) {
                    txtCedula.setText(regis.getPaciente().getCedula());
                    txtNombre.setText(regis.getPaciente().getApellido() + " " + regis.getPaciente().getNombre());
                    lblcodigopaciente.setText("" + regis.getPaciente_id());
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra es examen");

            }
        }
    }

    public void eliminar(int codigo) {
        String resp = "";
        if (Conexion.getConnectionDB() != null) {
            resp = datosagenda.eliminar(codigo, Conexion.getConnectionDB());
            JOptionPane.showMessageDialog(null, resp);
        }
    }

    public void editar(int codigo, String Hora, LocalDate fecha, String obs) {
        String resp = "";
        if (Conexion.getConnectionDB() != null) {
            resp = datosagenda.editar(codigo, Hora, obs, fecha, Conexion.getConnectionDB());
            JOptionPane.showMessageDialog(null, resp);
        }
    }

    public void entregar(int c) {
        String resp = "";
        if (Conexion.getConnectionDB() != null) {
            resp = datosagenda.entregado(c, Conexion.getConnectionDB());
            JOptionPane.showMessageDialog(null, resp);
        }
    }

    public void FiltroFecha(JTable jtagenda, String FechaFiltro) {
        reg.clear();
        int nro = 0;
        if (Conexion.getConnectionDB() != null) {
            reg = datosagenda.filtrarFecha(Conexion.getConnectionDB(), FechaFiltro);
            if (reg.size() > 0) {
                DefaultTableModel modelo = (DefaultTableModel) jtagenda.getModel();
                for (Registro r : reg) {
                    modelo.addRow(new Object[1]);
                    jtagenda.setValueAt(r.getExamen_id(), nro, 0);
                    jtagenda.setValueAt(r.getCedula(), nro, 1);
                    jtagenda.setValueAt(r.getNombre(), nro, 2);
                    jtagenda.setValueAt(r.getFecha(), nro, 3);
                    jtagenda.setValueAt(r.getHora(), nro, 4);
                    jtagenda.setValueAt(r.getObservacion(), nro, 5);
                    jtagenda.setValueAt(r.getEstado(), nro, 6);
                    nro++;
                }

            }
        }
    }
}
