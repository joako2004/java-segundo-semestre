// pedir un numero N y mostrar los numeros desde 1 hasta N

package ejercicios;

import javax.swing.JOptionPane;

public class EjercicioJOptionPaneUno {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));

        JOptionPane.showMessageDialog(null, "los numeros desde 1 a " + numero + " son:");

        for (int i = 1; i <= numero; i++) {
            JOptionPane.showMessageDialog(null, i);
        }

    }
}
