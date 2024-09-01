// ejercicio 4: pedir numeros hasta que se teclee uno negativo y mostrar cuantos numeros se han introducido

package programacionjava.clase3;
import java.util.Scanner;

public class ejercicioDosCiclosScanner {
    public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    int numero;
    int contador = 0;
    
    System.out.println("Ingrese un numero para almacenarlo, para terminar el programa, ingrese un numero negativo: ");
    numero = entrada.nextInt();

    while (numero > 0) {

        contador += 1;

        System.out.println("Ingrese otro numero, o un numero negativo para terminar: ");
        numero = entrada.nextInt();
    }

    System.out.println("Programa terminado, se han ingresado " + contador + " numeros");

    }
}
