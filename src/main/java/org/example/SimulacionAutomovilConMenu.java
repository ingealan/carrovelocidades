//Nombre: Alan Solano
//Fecha:3/11/2024
//Detalle:Menu para simulacion del carro
package org.example;

import java.util.Scanner;

public class SimulacionAutomovilConMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los datos del carro al usuario
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Motor: ");
        String motor = scanner.nextLine();
        System.out.print("Tipo de Combustible: ");
        String tipoCombustible = scanner.nextLine();
        System.out.print("Tipo de Automóvil: ");
        String tipoAutomovil = scanner.nextLine();
        System.out.print("Número de Puertas: ");
        int numeroPuertas = scanner.nextInt();
        System.out.print("Número de Asientos: ");
        int numeroAsientos = scanner.nextInt();
        System.out.print("Velocidad Máxima (km/h): ");
        int velocidadMaxima = scanner.nextInt();
        System.out.print("Color: ");
        String color = scanner.next();

        // Crear una instancia del automóvil con los datos ingresados
        Automovil miAuto = new Automovil(marca, modelo, motor, tipoCombustible, tipoAutomovil,
                numeroPuertas, numeroAsientos, velocidadMaxima, color);

        // Mostrar los atributos del automóvil
        miAuto.mostrarAtributos();

        // Menú de acciones
        int opcion;
        do {
            System.out.println("\n--- Menú de Simulación de Automóvil ---");
            System.out.println("1. Acelerar");
            System.out.println("2. Desacelerar");
            System.out.println("3. Frenar");
            System.out.println("4. Calcular Tiempo de Llegada");
            System.out.println("5. Mostrar Atributos del Automóvil");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la velocidad a incrementar (km/h): ");
                    int incremento = scanner.nextInt();
                    miAuto.acelerar(incremento);
                    break;
                case 2:
                    System.out.print("Ingrese la velocidad a reducir (km/h): ");
                    int decremento = scanner.nextInt();
                    miAuto.desacelerar(decremento);
                    break;
                case 3:
                    miAuto.frenar();
                    break;
                case 4:
                    System.out.print("Ingrese la distancia al destino (km): ");
                    double distancia = scanner.nextDouble();
                    miAuto.calcularTiempoLlegada(distancia);
                    break;
                case 5:
                    miAuto.mostrarAtributos();
                    break;
                case 0:
                    System.out.println("Saliendo de la simulación. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
