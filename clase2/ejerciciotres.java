// ejercicio2: leer un numero e indicar si es positivo o negativo, el proceso se repetira hasta que se introduza un cero

package programacionjava.clase2;

import java.util.Scanner;

public class ejerciciotres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean condicion = true;
        int numero;

        while (condicion) {
            System.out.println("ingrese un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            if (numero > 0) {
                System.out.println("el numero " + numero + " es positivo");
            } else if (numero < 0) {
                System.out.println("el numero " + numero + " es negativo");
            } else {
                System.out.println("el numero ingresado es 0, terminando el programa");
                condicion = false;
            }
        }
        
    }
}
