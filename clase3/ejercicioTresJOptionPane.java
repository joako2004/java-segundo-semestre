package programacionjava.clase3;
import javax.swing.JOptionPane;
import java.util.concurrent.ThreadLocalRandom;

public class ejercicioTresJOptionPane {
    public static void main(String[] args) {
        int numero;
        int contadorIntentos = 0;

        int min = 0;
        int max = 100;

        // Generar un número aleatorio entre min y max
        int numeroAleatorio = ThreadLocalRandom.current().nextInt(min, max + 1);

        // Solicitar el primer número al usuario
        String input = JOptionPane.showInputDialog("Para iniciar el juego, ingresa un número entre 0 y 100:");

        // Convertir la entrada a un número entero
        numero = Integer.parseInt(input);

        // Mientras el número ingresado no sea igual al número aleatorio
        while (numero != numeroAleatorio) {
            contadorIntentos++;

            if (numero > numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "El número que estás buscando es menor que el número ingresado.");
            } else if (numero < numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "El número que estás buscando es mayor que el número ingresado.");
            }

            // Solicitar otro número al usuario
            input = JOptionPane.showInputDialog("Ingrese otro número para verificar, o el número aleatorio para terminar:");
            numero = Integer.parseInt(input);
        }

        // Mostrar el mensaje de éxito y el número de intentos
        JOptionPane.showMessageDialog(null, "¡Felicidades! Has ganado el juego.");
        JOptionPane.showMessageDialog(null, "Número de intentos: " + contadorIntentos);
    }
}
