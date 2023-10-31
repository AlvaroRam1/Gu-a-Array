package guiaarrayejer20;
import javax.swing.JOptionPane;
public class GuiaArrayEjer20 {

    public static void main(String[] args) {

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String input = JOptionPane.showInputDialog("Ingrese el valor de la matriz 1 en la fila " + (i + 1) + " y columna " + (j + 1));
                matriz1[i][j] = Integer.parseInt(input);
            }
        }

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String input = JOptionPane.showInputDialog("Ingrese el valor de la matriz 2 en la fila " + (i + 1) + " y columna " + (j + 1));
                matriz2[i][j] = Integer.parseInt(input);
            }
        }

        
        int[][] suma = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        String resultado = "La suma de las matrices es:\n";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado += suma[i][j] + "\t";
            }
            resultado += "\n";
        }

        JOptionPane.showMessageDialog(null, resultado, "Resultado", -1);
    }
    
}
