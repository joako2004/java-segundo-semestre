import javax.swing.JOptionPane;

public class ejercicioDosCiclosJOptionPane {
    public static void main(String[] args) {
        int numero;
        int contador = 0;
        String input;

        input = JOptionPane.showInputDialog("Ingrese un número para almacenarlo, para terminar el programa, ingrese un número negativo:");
        numero = Integer.parseInt(input);

        while (numero >= 0) {
            contador += 1;

            input = JOptionPane.showInputDialog("Ingrese otro número, o un número negativo para terminar:");
            numero = Integer.parseInt(input);
        }

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "Programa terminado, se han ingresado " + contador + " números");
    }
}
