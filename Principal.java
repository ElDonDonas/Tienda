package ProyectoFinalP3;

import java.lang.reflect.Array;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
import ProyectoFinalP3.VProducto;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashSet;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        CrearModelo();
        setLocationRelativeTo(null);
        VProducto ventana = new VProducto();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DatosTienda = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Tienda Ruben's");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        DatosTienda.setText("Ver información de la tienda");
        DatosTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatosTiendaActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Modificar Producto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Motrar Productos ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Ingresar Datos Persona");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Mostrar Datos Persona");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(DatosTienda)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addGap(27, 27, 27)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DatosTienda)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Productos registrados");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable.setDefaultEditor(Object.class, null);
        jTable.setRowSelectionAllowed(true);
        jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTable.setColumnSelectionAllowed(true);
        jTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable.setSurrendersFocusOnKeystroke(true);
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(jTable);
        jTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTable.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(174, 174, 174)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DatosTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatosTiendaActionPerformed
//Creación de un objeto Direccion con RUC, dirección y número de teléfono
        Direccion datosTienda = new Direccion("123456789", "Calle 1", "555-555");

//Recuperación de los datos del objeto Direccion
        String ruc = datosTienda.getRuc();
        String direccion = datosTienda.getDireccion();
        String telefono = datosTienda.getTelefono();

//Creación de un objeto VentanaDatosTienda
        VentanaDatosTienda ventanaDatosTienda = new VentanaDatosTienda();
        //Agranda el tamaño de la ventana
        ventanaDatosTienda.setSize(200, 150);
//Actualización de los datos en la VentanaDatosTienda
        ventanaDatosTienda.actualizarDatos(ruc, direccion, telefono);

//Hacer visible la VentanaDatosTienda
        ventanaDatosTienda.setVisible(true);
    }//GEN-LAST:event_DatosTiendaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VProducto ventana = new VProducto();
        ventana.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        List<Producto> DatosGuardados = VProducto.guardar;
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();

        // Limpia la tabla antes de agregar los nuevos datos
        modelo.setRowCount(0);

        // Recorre la lista de productos y agrega cada uno a la tabla
        for (Producto p : DatosGuardados) {
            Object[] fila = {p.getNombre(), p.getCantidad(), p.getPrecioCompra(), p.getPrecioVenta(), p.getFechaElaboracion(), p.getFechaVencimiento(), p.getCodigo()};
            modelo.addRow(fila);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Obtener la fila seleccionada en la jTable
        int selectedRow = jTable.getSelectedRow();
        // Verificar si hay una fila seleccionada
        if (selectedRow == -1) {
            // Mostrar un mensaje de advertencia si no hay ninguna fila seleccionada
            JOptionPane.showMessageDialog(this, "Por favor seleccione una fila para modificar", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        // Pedir al usuario que introduzca un nuevo nombre
        String nombre = JOptionPane.showInputDialog("Introduce el nuevo nombre");
        // Actualizar el valor de la columna "Nombre" en la jTable
        jTable.setValueAt(nombre, selectedRow, 0);
        // Pedir al usuario que introduzca una nueva cantidad
        String cantidad = JOptionPane.showInputDialog("Introduce la nueva cantidad");
        // Actualizar el valor de la columna "Cantidad" en la jTable
        jTable.setValueAt(cantidad, selectedRow, 1);
        // Pedir al usuario que introduzca un nuevo valor de compra
        String valorCompra = JOptionPane.showInputDialog("Introduce el nuevo valor de compra");
        // Actualizar el valor de la columna "Valor de compra" en la jTable
        jTable.setValueAt(valorCompra, selectedRow, 2);
        // Pedir al usuario que introduzca un nuevo valor de venta
        String valorVenta = JOptionPane.showInputDialog("Introduce el nuevo valor de venta");
        // Actualizar el valor de la columna "Valor de venta" en la jTable
        jTable.setValueAt(valorVenta, selectedRow, 3);
        // Pedir al usuario que introduzca una nueva fecha de elaboración
        String fechaElaboracion = JOptionPane.showInputDialog("Introduce la nueva fecha de elaboración");
        // Actualizar el valor de la columna "Fecha de elaboración" en la jTable
        jTable.setValueAt(fechaElaboracion, selectedRow, 4);
        // Pedir al usuario que introduzca una nueva fecha de vencimiento
        String fechaVencimiento = JOptionPane.showInputDialog("Introduce la nueva fecha de vencimiento");
        // Actualizar el valor de la columna "Fecha de vencimiento" en la jTable
        jTable.setValueAt(fechaVencimiento, selectedRow, 5);
        // Pedir al usuario que introduzca un nuevo código
        String codigo = JOptionPane.showInputDialog("Introduce el nuevo código");
        // Actualizar el valor de la columna "Código" en la jTable
        jTable.setValueAt(codigo, selectedRow, 6);

    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Personal ventana = new Personal();
        ventana.setVisible(true);    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DatosPersona ventana = new DatosPersona();
        ventana.setVisible(true);     }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);

            }
        });
    }

    DefaultTableModel M;

    private void CrearModelo() {
            try {
        if (jTable != null) {
            M = (new DefaultTableModel(
                    null, new String[]{
                        "Nombre", "Cantidad", "Compra", "Venta",
                        "Elaboración", "Vencimiento", "Codigo"}));
            jTable.setModel(M);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error");
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DatosTienda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
