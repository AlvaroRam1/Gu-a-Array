package guiaarrayejer15;
import javax.swing.JOptionPane;
public class GuiaArrayEjer15 {
    public static void main(String[] args) {
      
        String[] nombresPokemon = {"pikachu", "charizard", "bulbasaur", "squirtle", "jigglypuff"};
        int[] poderesPokemon = {100, 150, 80, 90, 120};

        String nombreUsuario = JOptionPane.showInputDialog("Ingrese el nombre del Pokémon:");
        int cantidadPoder = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de poder:"));

        // Variable para rastrear si se encontró el Pokémon
        boolean encontrado = false;

        // Buscar el nombre del Pokémon en el array
        for (int i = 0; i < nombresPokemon.length; i++) {
            if (nombresPokemon[i].equalsIgnoreCase(nombreUsuario)) {
                poderesPokemon[i] = cantidadPoder; // Actualizar la cantidad de poder
                encontrado = true;
                break; // Si se encuentra, salir del bucle
            }
        }

        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Se ha actualizado el poder del Pokémon '" + nombreUsuario + "'.");
        } else {
            JOptionPane.showMessageDialog(null, "El Pokémon '" + nombreUsuario + "' no se encontró en la lista.");
        }
    }
}


