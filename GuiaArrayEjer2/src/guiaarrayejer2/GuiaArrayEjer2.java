package guiaarrayejer2;
import javax.swing.JOptionPane;
public class GuiaArrayEjer2 {

    public static void main(String[] args) {
        
       double numeros [] = new double [5];
       double numeroPo=0, numeroNe=0, mediaPo=0,mediaNe=0;
       int contadorCeros = 0;
       for(int i=0; i<5 ; i++){
           int entrada = Integer.parseInt(JOptionPane.showInputDialog("Posicion: "+(i+1)+
                   "\nIngrese su numero: "));
           
           numeros[i]=entrada;
           
           if (numeros[i]>0){ // si el valor ingreado es mayor a 0 lo va almacenando y lo suma 
               numeroPo += numeros[i];
           } else if (numeros[i]<0){ // si el valor ingreado es menor a 0 lo va almacenando y lo suma
               numeroNe += numeros[i];
           } else { 
              contadorCeros++;
           }   
       }     
       // calcular las medias de los numeros positivos y negativos
       mediaPo= numeroPo/5;
       mediaNe= numeroNe/5;
       
       JOptionPane.showMessageDialog(null, "Media de numeros positivos: "+mediaPo+
               "\nMedia de numeros negativos: "+mediaNe+
               "\nCeros ingresados: "+contadorCeros);
       
    }
    
}
