// pedir numeros hasta que se teclee in 0, mostrar la suma de todos los numeros introducidos

import java.util.Scanner;
public class EjerciciosScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int suma = 0;
        
        System.out.println("Ingrese un numero para almacenarlo, para terminar el programa, ingrese 0: ");
        numero = entrada.nextInt();

        while (numero > 0) {

           suma += numero;
        
          System.out.println("Ingrese otro numero, o 0 para terminar: ");
          numero = entrada.nextInt();
        }

         System.out.println("Programa terminado, la suma de los numeros ingresados es: " + suma);

    }
}
