package guiaarrayejer19;
import javax.swing.JOptionPane;
public class GuiaArrayEjer19 {

    public static void main(String[] args) {
              int[][] tabla = new int[4][4];

        // Pedir al usuario que ingrese los valores de la tabla
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                String input = JOptionPane.showInputDialog("Ingrese el valor en la posición [" + i + "][" + j + "]:");
                tabla[i][j] = Integer.parseInt(input);
            }
        }

        // Verificar si la tabla es simétrica
        boolean simetrica = true;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (tabla[i][j] != tabla[j][i]) {
                    simetrica = false;
                    break;
                }
            }
            if (!simetrica) {
                break;
            }
        }

        // Mostrar el resultado
        if (simetrica) {
            JOptionPane.showMessageDialog(null, "La tabla es simétrica.");
        } else {
            JOptionPane.showMessageDialog(null, "La tabla no es simétrica.");
        }
    }
    
}
