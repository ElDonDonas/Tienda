//Muestra los datos de la tienda
package ProyectoFinalP3;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaDatosTienda extends JFrame {
    private JLabel etiquetaRuc;
    private JLabel etiquetaDireccion;
    private JLabel etiquetaTelefono;

    public VentanaDatosTienda() {
        super("Datos de la Tienda");
        setLayout(new FlowLayout());
        etiquetaRuc = new JLabel();
        etiquetaDireccion = new JLabel();
        etiquetaTelefono = new JLabel();
        add(etiquetaRuc);
        add(etiquetaDireccion);
        add(etiquetaTelefono);
        pack();
        setLocationRelativeTo(null);
    }

    public void actualizarDatos(String ruc, String direccion, String telefono) {
        etiquetaRuc.setText("RUC: " + ruc);
        etiquetaDireccion.setText("Dirección: " + direccion);
        etiquetaTelefono.setText("Teléfono: " + telefono);
    }
}
