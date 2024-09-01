// ejercicio5: realizar un juego para adivinar un numero, para ello generar un numero aleatorio entre 0 y 100 y luego ir pidiendo numeros indicando si es mayor o menor, el porcesos termina cuando el usuario acerta y mostrarmos el numero de intentos 

package programacionjava.clase3;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ejercicioTresCiclosScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        int contadorIntentos = 0;

        int min = 0;
        int max = 100;

        int numeroAleatorio = ThreadLocalRandom.current().nextInt(min, max + 1);

        System.out.println("para iniciar el juego, primero ingresa un numero: ");
        numero = entrada.nextInt();

        while (numero != numeroAleatorio) {
            
            if (numero > numeroAleatorio) {
                System.out.println("el numero que estas buscando es menor que el numero ingresado");
                contadorIntentos += 1;
            } else if (numero < numeroAleatorio) {
                System.out.println("el numero que estas buscando es mayor que el numero ingresado");
                contadorIntentos += 1;
            }

            System.out.println("Ingrese otro numero para verificar, o 0 para terminar: ");
            numero = entrada.nextInt();

        }

        System.out.println("felicidades, has ganado el juego");
        System.out.println("numero de intentos: " + contadorIntentos);

    }
}
