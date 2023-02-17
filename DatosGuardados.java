// Clase que guarda los datos ingresados
package ProyectoFinalP3;

import java.util.ArrayList;
import java.util.List;

public class DatosGuardados {

    // Instancia única de la clase
    private static DatosGuardados instance = null;
    // Lista para guardar los productos (agregamos un vector)
    private List<Producto> guardar;

    // Constructor privado para implementar el patrón Singleton
    private DatosGuardados() {
        // Inicializar la lista de productos guardados
        guardar = new ArrayList<>();
    }

    // Método estático para obtener la única instancia de la clase
    public static DatosGuardados getInstance() {
        // Verificar si la instancia aún no ha sido creada
        if (instance == null) {
            // Crear una nueva instancia
            instance = new DatosGuardados();
        }
        // Devolver la instancia existente
        return instance;
    }

    // Método para obtener la lista de productos guardados
    public List<Producto> getGuardar() {
        return guardar;
    }

    // Método para agregar un producto a la lista de productos guardados
    public void agregarProducto(Producto producto) {
        guardar.add(producto);
    }

}
