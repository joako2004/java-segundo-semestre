// pedir 10 numeros y escribir la suma total
package ejercicios;

import java.util.Scanner;

public class scannerTres {

    public static void main(String[] args) {

        int suma = 0;
        int contador = 0;

        Scanner entrada = new Scanner(System.in);

        while (contador < 10) {
            System.out.println("Ingrese un numero: ");
            int numero = entrada.nextInt(); 
            suma += numero;
            contador++; // Incrementar contador
        }

        System.out.println("suma = " + suma);
    }
}
