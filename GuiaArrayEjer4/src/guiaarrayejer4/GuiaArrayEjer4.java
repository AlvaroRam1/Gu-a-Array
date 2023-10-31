package guiaarrayejer4;
import javax.swing.JOptionPane;
public class GuiaArrayEjer4 {
    public static void main(String[] args) {
    
     String pokemon [] = new String[5],lista ="";
       
       for (int i=0;i<5;i++){
           
           pokemon [i] = JOptionPane.showInputDialog("Ingrese el nombre de su pokemon #"+(i+1)+" :");   
       }
       
       for (int i=0;i<5;i++){
           
           lista += "Posición " + (5-i) + " : " +pokemon [5-i-1]+"\n";
       }
       
       JOptionPane.showMessageDialog(null, "Pokemon de orden inverso:\n"+lista);   
    
       
        
    }
    
}
