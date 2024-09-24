
package ejercicios;

import javax.swing.JOptionPane;

public class joptionpaneTres {

    public static void main(String[] args) {

        int suma = 0;
        int contador = 0;

        while (contador < 10) {
            String input = JOptionPane.showInputDialog("Ingrese un numero:");
            int numero = Integer.parseInt(input); 
            suma += numero;
            contador++;
        }

        JOptionPane.showMessageDialog(null, "Suma total = " + suma);
    }
}
