package guiaarrayejer3;
import javax.swing.JOptionPane;
public class GuiaArrayEjer3 {
   public static void main(String[] args) {
        int n=0;
        double entrada=0;
       
         n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números:"));
        double numeros[] = new double[n];

        for (int i = 0; i < n; i++) {
            entrada = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":"));
            numeros[i] = entrada;
        }

        String resultado = "";

        for (int i = 0; i < n / 2; i++) {
            resultado += numeros[i] + ", "; // por ejemplo 1.0, 2.0,
            resultado += numeros[n - i - 1] + ", "; // por ejemplo 10.0, 9.0, 
        }

        // Si la cantidad de números es impar, agregar el elemento central
        if (n % 2 != 0) {
            resultado += numeros[n / 2];
        }

        JOptionPane.showMessageDialog(null, "Números en el orden deseado: " + resultado);       


   }
    
}
