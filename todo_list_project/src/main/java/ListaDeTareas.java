import java.util.List; // Importa la interfaz List de la biblioteca estándar de Java, que permite crear listas de elementos.
import java.util.ArrayList; // Importa la clase ArrayList, que implementa la interfaz List, para crear listas redimensionables.

public class ListaDeTareas { // Define la clase principal llamada ListaDeTareas.
    private List<Tarea> tareas = new ArrayList<>(); // Crea una lista privada de objetos Tarea llamada "tareas" usando ArrayList.

    public void agregarTarea(Tarea tarea) { // Método público para agregar una nueva tarea a la lista.
        tareas.add(tarea); // Agrega la tarea especificada a la lista "tareas".
    }

    public void mostrarTareas() { // Método público para mostrar todas las tareas en la lista.
        for (int i = 0; i < tareas.size(); i++) { // Itera sobre cada tarea en la lista "tareas".
            System.out.println((i + 1) + ". " + tareas.get(i)); // Muestra el número de la tarea y la tarea misma.
        }
    }

    public void completarTarea(int indice) { // Método público para marcar una tarea como completada según su índice.
        if (indice >= 0 && indice < tareas.size()) { // Verifica si el índice está dentro de los límites de la lista.
            tareas.get(indice).completar(); // Llama al método completar() de la tarea en el índice especificado.
        }
    }
}
