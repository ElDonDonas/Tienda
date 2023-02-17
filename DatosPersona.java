/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProyectoFinalP3;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paul Jaramillo
 */
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DatosPersona extends JFrame {

    private JTable tablaPersonas;
    private Personal personal;

    public DatosPersona() {
        initComponents();
        // Inicializar la variable personal
        personal = new Personal();

        // Llenar la tabla con los datos de la lista de personas al iniciar la ventana
        actualizarTablaPersonas();
    }

    private void initComponents() {
        // Crear la tabla con las columnas necesarias
        String[] columnas = {"Nombre", "Identificación", "Edad", "Celular", "Cargo"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        tablaPersonas = new JTable(modelo);
        tablaPersonas.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        // Agregar la tabla a un scroll pane
        JScrollPane scrollPane = new JScrollPane(tablaPersonas);

        // Crear el contenedor principal
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(panel);

        // Ajustar el tamaño de la ventana para que se ajuste al contenido
        pack();
    }

    // Métodos para obtener y modificar la tabla
    public JTable getTablaPersonas() {
        return tablaPersonas;
    }

    public void setTablaPersonas(JTable tablaPersonas) {
        this.tablaPersonas = tablaPersonas;
    }
    
    public void mostrarDatos(List<Persona> personas) {
    // Crea un modelo de tabla vacío con los nombres de columna deseados
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Nombre");
    modelo.addColumn("Identificación");
    modelo.addColumn("Edad");
    modelo.addColumn("Celular");
    modelo.addColumn("Cargo");

    // Agrega una fila por cada persona en la lista
    for (Persona persona : personas) {
        Object[] fila = new Object[5];
        fila[0] = persona.getNombre();
        fila[1] = persona.getIdentificacion();
        fila[2] = persona.getEdad();
        fila[3] = persona.getCelular();
        fila[4] = persona.getCargo();
        modelo.addRow(fila);
    }

    // Asigna el modelo de tabla creado a la tabla de la interfaz gráfica
    tablaPersonas.setModel(modelo);
}






    public void actualizarTablaPersonas() {
        DefaultTableModel modelo = (DefaultTableModel) getTablaPersonas().getModel();
        modelo.setRowCount(0); // Limpiar la tabla

        // Obtener la lista de personas de la clase Personal
        List<Persona> personas = personal.getPersonas();

        // Llenar la tabla con los datos de las personas
        for (Persona persona : personas) {
            Object[] fila = {persona.getNombre(), persona.getIdentificacion(), persona.getEdad(), persona.getCelular(), persona.getCargo()};
            modelo.addRow(fila);
        }
    }

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosPersona().setVisible(true);
            }
        });
    }
}
