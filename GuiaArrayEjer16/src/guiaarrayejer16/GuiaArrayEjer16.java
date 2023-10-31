package guiaarrayejer16;
import javax.swing.JOptionPane;
public class GuiaArrayEjer16 {
// Encontrar el Pokémon con la mayor cantidad de poder
    public static void main(String[] args) {
        
        String[] nombresPokemon = {"Pikachu", "Charizard", "Bulbasaur", "Squirtle"};
        int[] poderesPokemon = {100, 150, 80, 90};
        int maxPoder = Integer.MIN_VALUE; // Inicializamos con el valor mínimo posible
        String nombrePokemonMaxPoder = "";

        for (int i = 0; i < poderesPokemon.length; i++) {
            if (poderesPokemon[i] > maxPoder) {
                maxPoder = poderesPokemon[i];
                nombrePokemonMaxPoder = nombresPokemon[i];
            }
        }

        
       JOptionPane.showMessageDialog(null,"El Pokémon con la mayor cantidad de poder es: " + nombrePokemonMaxPoder);
    }
}

