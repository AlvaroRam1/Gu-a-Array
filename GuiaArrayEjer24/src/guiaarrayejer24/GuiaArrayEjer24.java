package guiaarrayejer24;
import javax.swing.JOptionPane;
public class GuiaArrayEjer24 {

    public static void main(String[] args) {
     
        int[] arrayOriginal = {1, 2, 2, 3, 4, 4, 5};
        int n = arrayOriginal.length;

        // Eliminar duplicados
        int newSize = 0;
        int[] arraySinDuplicados = new int[n];

        for (int i = 0; i < n; i++) {
            boolean esDuplicado = false;

            for (int j = 0; j < newSize; j++) {
                if (arrayOriginal[i] == arraySinDuplicados[j]) {
                    esDuplicado = true;
                    break;
                }
            }

            if (!esDuplicado) {
                arraySinDuplicados[newSize] = arrayOriginal[i];
                newSize++;
            }
        }

        // Copiar los elementos de arraySinDuplicados a resultado
        int[] resultado = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            resultado[i] = arraySinDuplicados[i];
        }

        // Imprimir el array original y el array sin duplicados
        System.out.print("Array Original: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arrayOriginal[i] + " ");
        }
        System.out.println();

        System.out.print("Array Sin Duplicados: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(resultado[i] + " ");
        }
        System.out.println();
    }
    
}
