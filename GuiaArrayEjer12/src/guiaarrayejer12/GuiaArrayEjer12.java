package guiaarrayejer12;
import javax.swing.JOptionPane;
public class GuiaArrayEjer12 {
   
    public static void main(String[] args) {
      String[] nombresPokemonB = {"Venusaur","Blastoise","Dragonite","Gyarados","Alakazam","Arcanine","Lapras","Golem","Gyarados","Rhydon"};
      
      // Solicitar al usuario el nombre del Pokémon
        String nombrePokemon = JOptionPane.showInputDialog("Ingrese el nombre del Pokémon:");

        // Realizar la búsqueda
        int indice = -1;
        for (int i = 0; i < nombresPokemonB.length; i++) {
            if (nombresPokemonB[i].equalsIgnoreCase(nombrePokemon)) {
                indice = i;
                break; // Si se encuentra, sal del bucle
            }
        }

        // Mostrar el resultado
        if (indice != -1) {
            JOptionPane.showMessageDialog(null, "El Pokémon '" + nombrePokemon + "' se encontró en el índice " + indice + ".");
        } else {
            JOptionPane.showMessageDialog(null, "El Pokémon '" + nombrePokemon + "' no se encontró en la lista.");
        }
    }
    
}
