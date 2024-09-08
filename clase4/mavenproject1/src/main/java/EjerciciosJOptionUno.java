// pedir numeros hasta que se teclee in 0, mostrar la suma de todos los numeros introducidos

import javax.swing.JOptionPane;

public class EjerciciosJOptionUno {
    public static void main(String[] args) {
        int numero, suma = 0;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            suma += numero;
        } while (numero != 0);
        JOptionPane.showMessageDialog(null, "la suma de todos los numeros ingresados es: " + suma);
    }
}
