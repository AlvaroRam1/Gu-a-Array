package guiaarrayejer22;
import javax.swing.JOptionPane;
public class GuiaArrayEjer22 {

    public static void main(String[] args) {
        int filas = 8;
        int columnas = 6;

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = 0;
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) {
                    matriz[i][j] = 1;
                }
            }
        }

        String resultado = "Matriz 'marco' de 8x6:\n";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado += matriz[i][j] + " ";
            }
            resultado += "\n";
        }

        JOptionPane.showMessageDialog(null, resultado, "Matriz 'marco'", -1);
    }
    
}
