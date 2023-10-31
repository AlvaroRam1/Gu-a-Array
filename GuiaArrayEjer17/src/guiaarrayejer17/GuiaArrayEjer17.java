package guiaarrayejer17;
import javax.swing.JOptionPane;
public class GuiaArrayEjer17 {

    public static void main(String[] args) {
        int[][] matrizOriginal = new int[3][3];

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                String entrada = JOptionPane.showInputDialog("Ingrese un valor para la fila " + (fila + 1) + ", columna " + (columna + 1));
                matrizOriginal[fila][columna] = Integer.parseInt(entrada);
            }
        }

        String mensajeOriginal = "Matriz Original:\n";
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                mensajeOriginal += matrizOriginal[fila][columna] + "\t";
            }
            mensajeOriginal += "\n";
        }
        JOptionPane.showMessageDialog(null, mensajeOriginal);

        
        int[][] matrizTranspuesta = new int[3][3];
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                matrizTranspuesta[fila][columna] = matrizOriginal[columna][fila];
            }
        }

        String mensajeTranspuesta = "Matriz Transpuesta:\n";
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                mensajeTranspuesta += matrizTranspuesta[fila][columna] + "\t";
            }
            mensajeTranspuesta += "\n";
        }
        JOptionPane.showMessageDialog(null, mensajeTranspuesta);
    }
}



    
    

