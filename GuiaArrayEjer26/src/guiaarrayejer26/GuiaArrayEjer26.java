package guiaarrayejer26;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class GuiaArrayEjer26 {

    public static void main(String[] args) {
        int filas;
        int asientosTotales;
        int ventasTotales = 0;
        int[] microbus;

        do {
            filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas (entre 6 y 10):"));
        } while (filas < 6 || filas > 10);

        asientosTotales = filas * 4;
        microbus = new int[asientosTotales];

        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Menú de Opciones:\n" +
                "1. Ver Distribución\n" +
                "2. Vender Asientos\n" +
                "3. Devolver Asientos\n" +
                "4. Mostrar la Caja\n" +
                "5. Salir\n" +
                "Seleccione una opción:"
            ));

            switch (opcion) {
                case 1:
                    mostrarDistribucion(microbus);
                    break;
                case 2:
                    ventasTotales += venderAsientos(microbus);
                    break;
                case 3:
                    ventasTotales -= devolverAsientos(microbus);
                    break;
                case 4:
                    mostrarCaja(ventasTotales);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 5);
    }

    public static void mostrarDistribucion(int[] microbus) {
        StringBuilder salida = new StringBuilder("Distribución de Asientos:\n");
        for (int i = 0; i < microbus.length; i++) {
            salida.append("Asiento ").append(i + 1).append(": ").append(microbus[i] == 0 ? "Disponible" : "Ocupado").append("\n");
        }
        JOptionPane.showMessageDialog(null, salida.toString());
    }

    public static int venderAsientos(int[] microbus) {
        int asientosAVender = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la cantidad de asientos a vender (1 o 2):"));
        int disponibles = 0;

        for (int i = 0; i < microbus.length; i++) {
            if (microbus[i] == 0) {
                disponibles++;
                if (asientosAVender == 2 && i + 1 < microbus.length && microbus[i + 1] == 0) {
                    microbus[i] = 1;
                    microbus[i + 1] = 1;
                    return asientosAVender;
                } else if (asientosAVender == 1) {
                    microbus[i] = 1;
                    return asientosAVender;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "No hay suficientes asientos disponibles.");
        return 0;
    }

    public static int devolverAsientos(int[] microbus) {
        int asientosADevolver = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la cantidad de asientos a devolver:"));
        int ocupados = 0;

        for (int i = 0; i < microbus.length; i++) {
            if (microbus[i] == 1) {
                ocupados++;
                microbus[i] = 0;
                if (asientosADevolver == 2) {
                    if (i + 1 < microbus.length && microbus[i + 1] == 1) {
                        microbus[i + 1] = 0;
                        return asientosADevolver;
                    }
                } else if (asientosADevolver == 1) {
                    return asientosADevolver;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "No hay suficientes asientos ocupados para devolver.");
        return 0;
    }

    public static void mostrarCaja(int ventasTotales) {
        JOptionPane.showMessageDialog(null, "Total de ventas acumulado hasta el momento: " + ventasTotales);
       
    }
    
}
