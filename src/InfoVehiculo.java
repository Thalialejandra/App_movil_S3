// Importar Scanner para leer datos desde el teclado
import java.util.Scanner;

// Declaración de la clase pública InfoVehiculo
public class InfoVehiculo {
    // Método principal que se ejecuta al iniciar el programa
    public static void main(String[] args) {
        // Creación de un objeto Scanner llamado "sc" que captura los datos ingresados por el usuario
        Scanner sc = new Scanner(System.in);

        // Mensaje inicial
        System.out.println("Ingresa los datos de tu vehículo");

        // Validar marca: No puede estar vacía ni contener solo espacios
        String marca = "";
        while (marca.isEmpty()) {
            System.out.print("MARCA: ");
            marca = sc.nextLine().trim();
            if (marca.isEmpty()) {
                System.out.println("Error: La marca no puede quedar vacía. Por favor, ingresa un valor válido.");
            }
        }

        // Validar modelo: No puede estar vacío
        String modelo = "";
        while (modelo.isEmpty()) {
            System.out.print("MODELO: ");
            modelo = sc.nextLine().trim();
            if (modelo.isEmpty()) {
                System.out.println("Error: El modelo no puede quedar vacío. Por favor, ingresa un valor válido.");
            }
        }

        // Validar cilindrada: No puede estar vacía
        String cilindrada = "";
        while (cilindrada.isEmpty()) {
            System.out.print("CILINDRADA: ");
            cilindrada = sc.nextLine().trim();
            if (cilindrada.isEmpty()) {
                System.out.println("Error: La cilindrada no puede quedar vacía. Por favor, ingresa un valor válido.");
            }
        }

        // Validar tipo de combustible: No puede estar vacío
        String combustible = "";
        while (combustible.isEmpty()) {
            System.out.print("TIPO DE COMBUSTIBLE: ");
            combustible = sc.nextLine().trim();
            if (combustible.isEmpty()) {
                System.out.println("Error: El tipo de combustible no puede quedar vacío. Por favor, ingresa un valor válido.");
            }
        }

        // Validar capacidad de pasajeros: Debe ser un entero positivo
        int capacidad = 0;
        boolean valido = false;
        while (!valido) {
            System.out.print("Ingresa la capacidad de pasajeros: ");
            if (sc.hasNextInt()) {
                capacidad = sc.nextInt();
                if (capacidad > 0) {
                    valido = true; // Salir si es válido
                } else {
                    System.out.println("Error: La capacidad de pasajeros debe ser mayor que 0.");
                }
            } else {
                System.out.println("Error: Debes ingresar un número entero válido.");
                sc.next(); // Limpiar la entrada inválida
            }
        }

        // Mostrar los datos ingresados
        System.out.println("\n=== Datos del Vehículo ===");
        System.out.println("MARCA: " + marca);
        System.out.println("MODELO: " + modelo);
        System.out.println("CILINDRADA: " + cilindrada);
        System.out.println("TIPO DE COMBUSTIBLE: " + combustible);
        System.out.println("CAPACIDAD: " + capacidad + " pasajeros");

        // Cerrar el Scanner para liberar recursos
        sc.close();
    }
}

