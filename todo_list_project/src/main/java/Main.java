import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDeTareas lista = new ListaDeTareas();
        
        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Completar tarea");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Descripción de la tarea: ");
                    String descripcion = scanner.nextLine();
                    lista.agregarTarea(new Tarea(descripcion));
                    break;
                case 2:
                    lista.mostrarTareas();
                    break;
                case 3:
                    System.out.print("Número de tarea a completar: ");
                    int indice = scanner.nextInt() - 1;
                    lista.completarTarea(indice);
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
