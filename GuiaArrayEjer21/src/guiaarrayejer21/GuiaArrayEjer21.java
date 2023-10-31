package guiaarrayejer21;
import javax.swing.JOptionPane;
public class GuiaArrayEjer21 {

    public static void main(String[] args) {
        
     int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del array:"));

        int[] arrayOriginal = new int[n];

        for (int i = 0; i < n; i++) {
            String input = JOptionPane.showInputDialog("Ingrese el número en la posición " + (i + 1));
            arrayOriginal[i] = Integer.parseInt(input);
        }

        int[] arrayInvertido = new int[n];

        for (int i = 0; i < n; i++) {
            arrayInvertido[i] = arrayOriginal[n - 1 - i];
        }

        String resultadoOriginal = "Array Original: ";
        for (int elemento : arrayOriginal) {
            resultadoOriginal += elemento + " ";
        }

        String resultadoInvertido = "Array Invertido: ";
        for (int elemento : arrayInvertido) {
            resultadoInvertido += elemento + " ";
        }

        JOptionPane.showMessageDialog(null, resultadoOriginal + "\n" + resultadoInvertido, "Resultado", -1);

    }
    
}
