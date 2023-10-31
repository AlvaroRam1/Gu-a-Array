package guiaarrayejer11;
import javax.swing.JOptionPane;
public class GuiaArrayEjer11 {

    public static void main(String[] args) {
     int numeros [] = new int [10];
     int llenar;
     
     for (int i =0; i<10 ; i++){
      llenar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en la posicion: "+(i+1)));
      numeros[i]=llenar;
     }
     
     JOptionPane.showMessageDialog(null,"Haremos una eliminacion");
     int eliminar;
     eliminar = Integer.parseInt(JOptionPane.showInputDialog("Cual numero desea eliminar:"));
     
     for (int i = eliminar - 1; i < 9; i++) {
                numeros[i] = numeros[i + 1];
            }
            numeros[9] = 0; // Establecer el último elemento en 0

            String respuesta = "";
            for (int i = 0; i < 10; i++) {
                respuesta += "Posición #" + (i + 1) + " : " + numeros[i] + "\n";
            }
        
        JOptionPane.showMessageDialog(null, respuesta);
    }
    
}
