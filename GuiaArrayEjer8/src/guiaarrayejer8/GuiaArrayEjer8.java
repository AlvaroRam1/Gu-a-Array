package guiaarrayejer8;
import javax.swing.JOptionPane; 
public class GuiaArrayEjer8 {
    public static void main(String[] args) {
        int numeros[] = new int [10];
        int ingresar;
        
        for (int i = 0; i<8; i++){
            ingresar= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en la posicion "+(i+1)+" :"));
            numeros[i]= ingresar;
        }
        
        int cambio, posicion;
        
        cambio= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desea caambiar :"));
        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion que desea mover su numero :"));
        
        for(int i = numeros.length-1; i > posicion; i--){
            numeros[i]= numeros[i-1];
        }
        numeros[posicion-1]=cambio;
        
        
        String respuesta = "";
        for (int i = 0; i<10; i++){
            respuesta += "Posicion # "+(i+1)+" : "+numeros[i]+"\n";
        }
        
        
        
        JOptionPane.showMessageDialog(null,respuesta);
    }
    
}
