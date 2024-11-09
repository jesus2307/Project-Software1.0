# Project-Software1.0

# Todo List Project
![Texto alternativo]([ruta/a/la/imagen](/jesus2307/Project-Software1.0/blob/main/diagrama_clases_todo_list.png))

### Descripción del Proyecto

Este proyecto implementa una aplicación básica de lista de tareas en Java, diseñada para ayudar a los usuarios a gestionar sus tareas pendientes. La aplicación permite a los usuarios crear, completar y visualizar el estado de sus tareas. Además, se integra con JUnit para facilitar la verificación de la funcionalidad mediante pruebas unitarias.

### Características

- **Gestión de Tareas**: Crear y almacenar tareas con un nombre y un estado de completado.
- **Marcado de Tareas**: Posibilidad de marcar tareas como completadas.
- **Pruebas Unitarias**: Uso de JUnit 5 para realizar pruebas unitarias sobre las funcionalidades clave.

### Estructura del Proyecto

El proyecto está organizado de la siguiente manera:

- **src/main/java**: Contiene las clases principales:
  - `Tarea`: Clase que representa una tarea con un nombre y un estado de completado.
  - `ListaDeTareas`: Clase para gestionar una lista de tareas.
  - `Main`: Punto de entrada de la aplicación.

- **src/test/java**: Contiene las pruebas unitarias:
  - `TareaTest`: Pruebas unitarias para verificar las funcionalidades de la clase `Tarea`.

- **pom.xml**: Archivo de configuración de Maven que incluye las dependencias necesarias, como JUnit para realizar las pruebas.

### Instalación

1. Clona este repositorio:

   ```bash
   git clone https://github.com/tu_usuario/todo-list.git
   cd todo-list
Compila el proyecto y ejecuta las pruebas:

```bash
mvn clean test

mvn compile exec:java -Dexec.mainClass="Main"
