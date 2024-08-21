// ejercicio1: leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo

package programacionjava.clase2;
import java.util.Scanner;

public class ejerciciouno {
    public static void main(String[] args) {
        boolean condicion = true;
        while (condicion) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ingrese un numero para calcular el cuadrado del mismo, para terminar el programa, ingrese un numero negativo: ");
            int numero = scanner.nextInt();
            if (numero > 0) {
                System.out.println("el cuadrado del numero " + numero + " es: " + numero*numero);
            } else if (numero == 0) {
                System.out.println("el cuadrado de 0 es 0 ");
            } else if (numero < 0){
                System.out.println("programa terminado");
                condicion = false;
            }
        }
    }
}