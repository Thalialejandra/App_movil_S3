// Importar Scanner - esta clase va a permitir leer datos desde el teclado 
import java.util.Scanner;

// Se declara la clase pública InfoVehiculo
public class InfoVehiculo {
    // Este es el método principal que se ejecuta al iniciar el programa
    public static void main(String[] args) {
        // Creación de un objeto Scanner llamado "sc" que captura los datos que ingresa el usuario
        Scanner sc = new Scanner(System.in);

        // SOLICITUD DE LOS DATOS
        // Mostrar un mensaje inicial indicando que se ingresarán los datos del vehículo
        System.out.println("Ingresa los datos de tu vehículo");

        // Pedir al usuario que ingrese la marca del vehículo
        System.out.print("MARCA: ");
        String marca = sc.nextLine().trim(); // Se guarda la marca en una variable String y se eliminan espacios extras

        // Pedir al usuario que ingrese el modelo del vehículo
        System.out.print("MODELO: ");
        String modelo = sc.nextLine().trim(); // Se guarda el modelo en una variable String

        // Pedir al usuario que ingrese la cilindrada del vehículo
        System.out.print("CILINDRADA: ");
        String cilindrada = sc.nextLine().trim(); // Se guarda la cilindrada en una variable String

        // Pedir al usuario que ingrese el tipo de combustible del vehículo
        System.out.print("TIPO DE COMBUSTIBLE: ");
        String combustible = sc.nextLine().trim(); // Se guarda el combustible en una variable String

        // Inicializamos la capacidad de pasajeros como 0
        int capacidad = 0;
        // Variable para controlar si se ingresó un número válido
        boolean valido = false;

        // VALIDANDO EL DATO INGRESADO DE CAPACIDAD
        // Ciclo que se repite hasta que el usuario ingrese un número entero positivo
        while (!valido) {
            System.out.print("Ingresa la capacidad de pasajeros: ");
            // Revisamos si el usuario ingresó un número entero
            if (sc.hasNextInt()) {
                capacidad = sc.nextInt(); // Guardamos el número en la variable capacidad
                if (capacidad > 0) { // Validamos que sea mayor que 0
                    valido = true; // Si es válido, salimos del ciclo
                } else {
                    // Mensaje de error si el número es menor o igual a 0
                    System.out.println("La capacidad de pasajeros debe ser mayor que 0.");
                }
            } else {
                // Mensaje de error si no es un número entero
                System.out.println("Ingresa un número válido.");
                sc.next(); // Limpiar la entrada inválida para volver a pedir el dato
            }
        }

        // MOSTRANDO LOS RESULTADOS AL EJECUTAR
        // Imprimir todos los datos que ingresó el usuario
        System.out.println("\n=== Datos del Vehículo ===");
        System.out.println("MARCA: " + marca);
        System.out.println("MODELO: " + modelo);
        System.out.println("CILINDRADA: " + cilindrada);
        System.out.println("COMBUSTIBLE: " + combustible);
        System.out.println("CAPACIDAD: " + capacidad + " pasajeros");

        // Cerrar el Scanner para liberar recursos
        sc.close();
    }
}
