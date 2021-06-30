
package Model;

public class Usuario {
    private int usuarioId;
    private String cedula;
    private String contraseña;

    public Usuario(int usuarioId, String cedula, String contraseña) {
        this.usuarioId = usuarioId;
        this.cedula = cedula;
        this.contraseña = contraseña;
    }
    public Usuario(){
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
