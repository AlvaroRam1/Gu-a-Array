package guiaarrayejer18;
import javax.swing.JOptionPane;
public class GuiaArrayEjer18 {
//diagonal principal sean 1 y el resto 0.
    public static void main(String[] args) {
        int n = 7;
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0; 
                }
            }
        }

        String mensaje = "Matriz:\n";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mensaje += matriz[i][j] + " ";
            }
            mensaje += "\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}

