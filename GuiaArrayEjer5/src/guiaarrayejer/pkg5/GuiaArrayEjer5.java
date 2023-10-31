package guiaarrayejer.pkg5;
import javax.swing.JOptionPane;
public class GuiaArrayEjer5 {
    public static void main(String[] args) {
       int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del array:"));
    int numeros []=new int[n];
    
    for (int i=0; i<n; i++){
        
        int llenar = Integer.parseInt(JOptionPane.showInputDialog("Posicion : "+(i+1)+"\nIngrese su numero :"));
        numeros [i]= llenar;
        
    }
    
    int maximo = numeros[0];
    int minimo = numeros [0];
    
    for (int i=1; i<n ; i++){
        
        if (numeros[i]>maximo){
            
            maximo = numeros[i];
            
        } else if (numeros[i]<minimo){
            
            minimo = numeros[i];
        }
    }
        JOptionPane.showMessageDialog(null,"El valor maximo es: "+maximo);
        JOptionPane.showMessageDialog(null,"El valor minimo es: "+minimo);
    }
    
}
