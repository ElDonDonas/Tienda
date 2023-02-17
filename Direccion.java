// Clase para representar la información de la tienda
package ProyectoFinalP3;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

class Direccion {

    private String ruc;
    private String direccion;
    private String telefono;

    public Direccion(String ruc, String direccion, String telefono) {
        this.ruc = ruc;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

  
}
