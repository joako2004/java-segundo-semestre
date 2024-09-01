package programacionjava.clase3;
import javax.swing.JOptionPane;

public class ejercicioUnoCiclosJOptionPane {
    public static void main(String[] args) {
        int numero;

        String input = JOptionPane.showInputDialog("Ingrese un número para verificar si es par o no, para no realizar el proceso, ingrese 0:");
        
        numero = Integer.parseInt(input);

        while (numero != 0) {
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es un número par");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es un número impar");
            }

            input = JOptionPane.showInputDialog("Ingrese otro número para verificar, o 0 para terminar:");
            numero = Integer.parseInt(input);
        }

        JOptionPane.showMessageDialog(null, "Programa terminado");
    }
}
