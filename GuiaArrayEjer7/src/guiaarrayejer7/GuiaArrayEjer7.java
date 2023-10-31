package guiaarrayejer7;
import javax.swing.JOptionPane;
public class GuiaArrayEjer7 {
     public static void main(String[] args) {
  
        int[] numeros = new int[10];

        // Leer los 10 números
        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Introduce el número " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(input);
        }

        // Verificar si están ordenados
        String mensaje = "Los números están desordenados.";

        boolean creciente = true;
        boolean decreciente = true;

        for (int i = 0; i < 9; i++) {
            if (numeros[i] > numeros[i + 1]) {
                creciente = false;
            } else if (numeros[i] < numeros[i + 1]) {
                decreciente = false;
            }
        }

        if (creciente && !decreciente) {
            mensaje = "Los números están ordenados de forma creciente.";
        } else if (decreciente && !creciente) {
            mensaje = "Los números están ordenados de forma decreciente.";
        } else if (creciente && decreciente) {
            mensaje = "Todos los números son idénticos.";
        }

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, mensaje);
    }
}









