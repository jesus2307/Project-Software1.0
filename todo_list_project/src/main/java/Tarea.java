public class Tarea { // Define la clase Tarea que representa una tarea individual.
    private String descripcion; // Atributo privado que almacena la descripción de la tarea.
    private boolean completada; // Atributo privado que indica si la tarea ha sido completada o no.

    public Tarea(String descripcion) { // Constructor de la clase Tarea que recibe una descripción.
        this.descripcion = descripcion; // Asigna la descripción proporcionada al atributo descripcion.
        this.completada = false; // Inicializa el atributo completada como falso (pendiente).
    }

    public void completar() { // Método público que marca la tarea como completada.
        this.completada = true; // Cambia el valor de completada a verdadero.
    }

    public boolean estaCompletada() { // Método público que devuelve el estado de la tarea (completada o no).
        return completada; // Devuelve el valor del atributo completada.
    }

    public String getDescripcion() { // Método público que devuelve la descripción de la tarea.
        return descripcion; // Devuelve el valor del atributo descripcion.
    }

    @Override
    public String toString() { // Sobrescribe el método toString para dar una representación en texto de la tarea.
        return descripcion + (completada ? " (completada)" : " (pendiente)"); // Devuelve la descripción junto con su estado (completada o pendiente).
    }
}
