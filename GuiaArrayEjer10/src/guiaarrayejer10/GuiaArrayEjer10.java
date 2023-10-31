package guiaarrayejer10;
import javax.swing.JOptionPane;
public class GuiaArrayEjer10 {

    public static void main(String[] args) {
      
        int[] numeros = new int[10];
        int llenar;
        
        // Leer 5 elementos numéricos ordenados de forma creciente
        for (int i = 0; i < 5; i++) {
            llenar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en la posicion #"+(i+1)));
            numeros[i]=llenar;
        }
        
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a insertar"));
        
        // Insertar N en el lugar adecuado para mantener el arreglo ordenado
        int i;
        for (i = 4; i >= 0 && numeros[i] > N; i--) {
            numeros[i + 1] = numeros[i];
        }
        numeros[i+1] = N;
        
        // Mostrar el arreglo resultante
        String respuesta = "Arreglo resultante:\n";
        for (int x = 0; x < 6; x++) {
            respuesta += "Posición #" + (x + 1) + " : " + numeros[x] + "\n";
        }
        
        JOptionPane.showMessageDialog(null, respuesta);
    }
    
}
