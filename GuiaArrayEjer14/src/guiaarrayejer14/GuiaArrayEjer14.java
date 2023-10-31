package guiaarrayejer14;
import javax.swing.JOptionPane;
public class GuiaArrayEjer14 {

    public static void main(String[] args) {
    int[] numerosDesordenados = {64, 25, 12, 22, 11, 1, 77, 36, 98, 45};
    int cambio;
    
     for (int i=0; i<9; i++){
         for(int j=0; j<9; j++){
             if (numerosDesordenados[j]>numerosDesordenados[j+1]){
                 cambio =  numerosDesordenados[j];
                 numerosDesordenados[j]=numerosDesordenados[j+1];
                 numerosDesordenados[j+1]=cambio;
             }
         }
     }
     
     String respuesta1="";
     for (int i=0; i<10; i++){
        respuesta1 += numerosDesordenados[i]+"  -  " ;  
     }
     
     String respuesta2="";
     for (int i=9; i>=0; i--){
        respuesta2 += numerosDesordenados[i]+"  -  "  ;  
     }
     
     JOptionPane.showMessageDialog(null,"Arreglo ordenado en forma creciente:  "+respuesta1+"\n\n"+
             "Arreglo ordenado en forma decreciente:  "+respuesta2);
     }
    
}
