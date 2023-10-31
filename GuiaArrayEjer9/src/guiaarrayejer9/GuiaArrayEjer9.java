package guiaarrayejer9;
import javax.swing.JOptionPane;
public class GuiaArrayEjer9 {

    public static void main(String[] args) {
     int numeros[]= new int[10];
     int llenar;
     
     for (int i=0; i<10; i++){
         llenar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en la posicion #"+(i+1)));
         numeros[i] = llenar;
     }
     
     JOptionPane.showMessageDialog(null,"Acontinuacion vamos hacer un cambio");
     
      int desplazar = numeros[9]; // Guardamos el último elemento en una variable

        for (int i = 9; i > 0; i--) {
            numeros[i] = numeros[i - 1]; // Desplazamos los elementos hacia la derecha
        }

        numeros[0] = desplazar; 
     
      String respuesta = "";
        for (int i = 0; i<10; i++){
            respuesta += "Posicion # "+(i+1)+" : "+ numeros[i] +"\n";
        }
      JOptionPane.showMessageDialog(null,respuesta);
     
    }
    
}
