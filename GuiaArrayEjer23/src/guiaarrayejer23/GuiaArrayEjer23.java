package guiaarrayejer23;
import javax.swing.JOptionPane;
public class GuiaArrayEjer23 {

    public static void main(String[] args) {

         String[][] estadisticasPokemon = {
            {"Pikachu", "90", "55", "40", "35"},
            {"Charizard", "100", "84", "78", "78"},
            {"Bulbasaur", "45", "49", "49", "45"},
            {"Squirtle", "43", "48", "65", "44"},
            {"Mewtwo", "130", "110", "90", "106"},
            {"Gengar", "110", "65", "60", "60"},
            {"Dragonite", "80", "134", "95", "91"},
            {"Snorlax", "30", "110", "65", "160"},
            {"Vaporeon", "65", "60", "95", "130"},
            {"Machamp", "55", "130", "80", "90"},
            {"Eevee", "55", "55", "50", "55"},
            {"Alakazam", "120", "50", "45", "55"},
            {"Lapras", "60", "85", "80", "130"},
            {"Gyarados", "81", "125", "79", "95"},
            {"Jigglypuff", "20", "45", "20", "115"}
        };

        String nombrePokemon = JOptionPane.showInputDialog("Ingrese el nombre de un Pokémon:");
        boolean encontrado = false;
        String estadisticas = "";

        for (String[] stats : estadisticasPokemon) {
            if (nombrePokemon.equalsIgnoreCase(stats[0])) {
                encontrado = true;
                estadisticas = "Nombre del Pokémon: " + stats[0] + "\n"
                            + "Velocidad: " + stats[1] + "\n"
                            + "Ataque: " + stats[2] + "\n"
                            + "Defensa: " + stats[3] + "\n"
                            + "HP: " + stats[4];
                break;
            }
        }

        if (encontrado) {
            JOptionPane.showMessageDialog(null, estadisticas, "Estadísticas de Pokémon", -1);
        } else {
            JOptionPane.showMessageDialog(null, "Pokémon no encontrado en la base de datos.", "Error", -1);
               }
    }
    
}
