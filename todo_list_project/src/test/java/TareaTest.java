import org.junit.jupiter.api.Test; // Importa la anotación @Test de JUnit para indicar métodos de prueba.
import static org.junit.jupiter.api.Assertions.*; // Importa métodos de aserción de JUnit, como assertTrue y assertFalse.

public class TareaTest { // Define la clase TareaTest para realizar pruebas unitarias en la clase Tarea.

    @Test
    public void testCompletar() { // Método de prueba para verificar el comportamiento del método completar() de Tarea.
        Tarea tarea = new Tarea("Descripción de prueba"); // Crea una nueva instancia de Tarea con una descripción de prueba.
        assertFalse(tarea.estaCompletada()); // Verifica que la tarea no esté completada inicialmente (debería ser false).
        tarea.completar(); // Llama al método completar() para marcar la tarea como completada.
        assertTrue(tarea.estaCompletada()); // Verifica que la tarea esté marcada como completada después de llamar al método (debería ser true).
    }
}
