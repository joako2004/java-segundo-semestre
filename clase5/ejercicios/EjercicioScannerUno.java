// pedir un numero N y mostrar los numeros desde 1 hasta N

package ejercicios;

import java.util.Scanner;

public class EjercicioScannerUno {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("ingrese un numero: ");
        int n = numero.nextInt();

        System.out.println("los numeros desde 0 a " + n + " son:");

        for (int i = 1; i <=n; i++) {
            System.out.println(i);
        }
    }
}
