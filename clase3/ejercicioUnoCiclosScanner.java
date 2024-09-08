// ejercicio 3: leer numeros hasta que se introduzca un cero
// para cada numero indicar si es un numero par o un numero impar

// con clase scanner:

import java.util.Scanner;

public class ejercicioUnoCiclosScanner {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero para verificar si es par o no, para no realizar el proceso, ingrese 0: ");
        numero = entrada.nextInt();

        while (numero != 0) {

            if (numero % 2 == 0) {
                System.out.println("El numero " + numero + " es un numero par");
            } else {
                System.out.println("El numero " + numero + " es un numero impar");
            }

            System.out.println("Ingrese otro numero para verificar, o 0 para terminar: ");
            numero = entrada.nextInt();
        }

        System.out.println("Programa terminado");
    }
}
