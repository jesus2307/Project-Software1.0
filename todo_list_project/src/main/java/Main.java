import java.util.Scanner; // Importa la clase Scanner para la entrada de datos desde el teclado.

public class Main { // Define la clase principal llamada Main.
    public static void main(String[] args) { // Método principal que ejecuta el programa.
        Scanner scanner = new Scanner(System.in); // Crea una instancia de Scanner para leer la entrada del usuario.
        ListaDeTareas lista = new ListaDeTareas(); // Crea una instancia de ListaDeTareas para gestionar las tareas.

        while (true) { // Bucle infinito para mostrar el menú repetidamente hasta que el usuario elija salir.
            System.out.println("\nMenú:"); // Muestra el menú de opciones.
            System.out.println("1. Agregar tarea"); // Opción 1 para agregar una tarea.
            System.out.println("2. Mostrar tareas"); // Opción 2 para mostrar las tareas.
            System.out.println("3. Completar tarea"); // Opción 3 para marcar una tarea como completada.
            System.out.println("4. Salir"); // Opción 4 para salir del programa.
            System.out.print("Elige una opción: "); // Pide al usuario que elija una opción.
            int opcion = scanner.nextInt(); // Lee la opción ingresada por el usuario como un número entero.
            scanner.nextLine(); // Limpia el buffer del scanner después de leer un número.

            switch (opcion) { // Estructura switch para gestionar las opciones del menú.
                case 1:
                    System.out.print("Descripción de la tarea: "); // Pide al usuario la descripción de una nueva tarea.
                    String descripcion = scanner.nextLine(); // Lee la descripción de la tarea como una cadena de texto.
                    lista.agregarTarea(new Tarea(descripcion)); // Crea una nueva tarea con la descripción y la agrega a la lista.
                    break;
                case 2:
                    lista.mostrarTareas(); // Llama al método mostrarTareas() para mostrar todas las tareas de la lista.
                    break;
                case 3:
                    System.out.print("Número de tarea a completar: "); // Pide al usuario el número de la tarea a completar.
                    int indice = scanner.nextInt() - 1; // Lee el número de la tarea y ajusta el índice (restando 1).
                    lista.completarTarea(indice); // Llama al método completarTarea() para marcar la tarea especificada como completada.
                    break;
                case 4:
                    System.out.println("Saliendo del programa."); // Muestra un mensaje de salida.
                    scanner.close(); // Cierra el scanner para liberar el recurso de entrada.
                    return; // Sale del programa.
                default:
                    System.out.println("Opción inválida."); // Muestra un mensaje de error si la opción no es válida.
            }
        }
    }
}
