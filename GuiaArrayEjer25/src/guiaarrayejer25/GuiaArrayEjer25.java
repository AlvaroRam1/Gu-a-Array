package guiaarrayejer25;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class GuiaArrayEjer25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String contraseña = JOptionPane.showInputDialog("Tiene al menos 8 caracteres de longitud.\n"
                + "Contiene al menos 1 letra mayúscula.\n"
                + "Contiene al menos 1 letra minúscula.\n"
                + "Contiene al menos 1 dígito.\n"
                + "Contiene al menos 1 símbolo.\n" + "Ingrese una contraseña:");

        if (verificarContraseña(contraseña)) {
            JOptionPane.showMessageDialog(null, "La contraseña cumple con los requisitos.", "Verificación de Contraseña", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña no cumple con los requisitos.", "Verificación de Contraseña", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static boolean verificarContraseña(String contraseña) {
        if (contraseña.length() < 8) {
            return false;
        }

        boolean contieneMayuscula = false;
        boolean contieneMinuscula = false;
        boolean contieneDigito = false;
        boolean contieneSimbolo = false;

        for (char caracter : contraseña.toCharArray()) {
            if (Character.isUpperCase(caracter)) {
                contieneMayuscula = true;
            } else if (Character.isLowerCase(caracter)) {
                contieneMinuscula = true;
            } else if (Character.isDigit(caracter)) {
                contieneDigito = true;
            } else {
                contieneSimbolo = true;
            }
        }

        return contieneMayuscula && contieneMinuscula && contieneDigito && contieneSimbolo;
    }
    
}
