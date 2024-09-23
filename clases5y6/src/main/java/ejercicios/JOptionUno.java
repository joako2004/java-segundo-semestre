// pedir un numero N y mostrar los numeros desde 1 hasta N

package ejercicios;

import javax.swing.JOptionPane;

public class JOptionUno {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Ingrese un número N");

        int numero = Integer.parseInt(input);

        for (int i = 1; i <= numero; i++) {
            JOptionPane.showMessageDialog(null, i);
        }
    }
}

