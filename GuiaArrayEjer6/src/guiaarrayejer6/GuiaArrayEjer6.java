package guiaarrayejer6;
import javax.swing.JOptionPane;
public class GuiaArrayEjer6 {
    
    public static void main(String[] args) {
        String nombresPokemonA[]= new String[5];
        String nombresPokemonB[]= new String[5];
        String respuesta="";
        String nombresPokemonC[]= new String[5];
        
        JOptionPane.showMessageDialog(null,"Acontinuacion llenaremos la primer lista!");
        for(int i=0;i<5;i++){
            nombresPokemonA[i]= JOptionPane.showInputDialog("Lista 1 de Pokemon\nIngrese el nombre de su pokemon #"+(i+1)+" :");
        }
        
        JOptionPane.showMessageDialog(null,"Acontinuacion llenaremos la segunda lista!");
        for(int i=0;i<5;i++){
            nombresPokemonB[i]= JOptionPane.showInputDialog("Lista 2 de Pokemon\nIngrese el nombre de su pokemon #"+(i+1)+" :");
        }
        
        for(int i=0;i<5;i++){
             nombresPokemonC[i] = nombresPokemonA[i] + " , " +nombresPokemonB[i];       
        }
        
        for(int i=0;i<5;i++){
            respuesta += "Posición " + (i+1) + " : "+ nombresPokemonC[i]+"\n";
        }
        
        JOptionPane.showMessageDialog(null,"Sumando ambas listas en la misma psocion el resultado es:\n"+respuesta);
    }
    
}
