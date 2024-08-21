// ejercicio1: leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo 

package programacionjava.clase2;

import java.util.Scanner;

public class ejerciciodos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, cuadrado;
        System.out.println("digite un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero >= 0) {
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("el numero " + numero + " elevado al cuadrado es " + cuadrado);
            System.out.println("digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("el programa ha finalizado ya que ha ingresado un numero negativo");
    }
}
