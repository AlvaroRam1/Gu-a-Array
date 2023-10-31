package guiaarrayejer13;
import javax.swing.JOptionPane;
public class GuiaArrayEjer13 {

    public static void main(String[] args) {
     String[] nombresPokemonB = {"Venusaur","Blastoise","Dragonite","Gyarados","Alakazam","Arcanine","Lapras","Golem","Gyarados","Rhydon"};
     
        int indice = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero (índice):"));

        if (indice >= 0 && indice < nombresPokemonB.length) {
            String nombrePokemon = nombresPokemonB[indice];
            JOptionPane.showMessageDialog(null, "El Pokémon en el índice " + indice + " es:\n" + nombrePokemon);
        } else {
            JOptionPane.showMessageDialog(null, "El índice está fuera del rango del array.");
        }
    }
    
}
