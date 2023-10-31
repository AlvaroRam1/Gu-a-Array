package guiaarrayejer28;

import java.util.Scanner;

public class GuiaArrayEjer28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la cantidad de estudiantes y períodos académicos
        int numEstudiantes, numPeriodos;
        do {
            System.out.print("Ingrese la cantidad de estudiantes (entre 1 y 10): ");
            numEstudiantes = scanner.nextInt();
        } while (numEstudiantes < 1 || numEstudiantes > 10);
        do {
            System.out.print("Ingrese la cantidad de periodos academicos (entre 3 y 5): ");
            numPeriodos = scanner.nextInt();
        } while (numPeriodos < 3 || numPeriodos > 5);

        // Crear una matriz para almacenar las calificaciones de los estudiantes
        double[][] calificaciones = new double[numEstudiantes][numPeriodos];

        int opcion;
        do {
            // Mostrar el menú de opciones
            System.out.println("\nMenu de Opciones:");
            System.out.println("1. Ingresar calificaciones por periodo.");
            System.out.println("2. Ingresar calificaciones por estudiante.");
            System.out.println("3. Ver calificaciones.");
            System.out.println("4. Salir.");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ingresarCalificacionesPorPeriodo(calificaciones);
                    break;
                case 2:
                    ingresarCalificacionesPorEstudiante(calificaciones);
                    break;
                case 3:
                    verCalificaciones(calificaciones);
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion no válida. Intentelo de nuevo.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }

    public static void ingresarCalificacionesPorPeriodo(double[][] calificaciones) {
        Scanner scanner = new Scanner(System.in);
        
        int numPeriodo;
        do {
            System.out.print("Ingrese el numero de periodo (entre 1 y " + calificaciones[0].length + "): ");
            numPeriodo = scanner.nextInt();
        } while (numPeriodo < 1 || numPeriodo > calificaciones[0].length);
        
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingrese la calificacion del estudiante " + (i + 1) + " para el periodo " + numPeriodo + ": ");
            calificaciones[i][numPeriodo - 1] = scanner.nextDouble();
        }
    }

    public static void ingresarCalificacionesPorEstudiante(double[][] calificaciones) {
        Scanner scanner = new Scanner(System.in);
        
        int numEstudiante;
        do {
            System.out.print("Ingrese el numero de estudiante (entre 1 y " + calificaciones.length + "): ");
            numEstudiante = scanner.nextInt();
        } while (numEstudiante < 1 || numEstudiante > calificaciones.length);

        int numPeriodo;
        do {
            System.out.print("Ingrese el numero de periodo (entre 1 y " + calificaciones[0].length + "): ");
            numPeriodo = scanner.nextInt();
        } while (numPeriodo < 1 || numPeriodo > calificaciones[0].length);

        System.out.print("Ingrese la calificacion del estudiante " + numEstudiante + " para el periodo " + numPeriodo + ": ");
        calificaciones[numEstudiante - 1][numPeriodo - 1] = scanner.nextDouble();
    }

    public static void verCalificaciones(double[][] calificaciones) {
        System.out.println("\nCalificaciones por periodo:");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print("Periodo " + (j + 1) + ": " + calificaciones[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
}
