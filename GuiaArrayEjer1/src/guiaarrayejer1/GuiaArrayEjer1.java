package guiaarrayejer1;
import javax.swing.JOptionPane;
public class GuiaArrayEjer1 {

    public static void main(String[] args) {

        int nElementos, posicion = 0;
        String resultado = "";

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));

        int[] numeros = new int[nElementos];// Da el tamaño del vector 

        JOptionPane.showMessageDialog(null, "Digite los elementos del arreglo");

        for (int i = 0; i < nElementos; i++) {
            // llena el vector 
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Digite un numero: "));
            
            resultado += "Posición " + (i + 1) + " : " + numeros[i] + "\n";

        }

        JOptionPane.showMessageDialog(null, "Los numeros del arreglo son:\n" + resultado);
    }
    
}
