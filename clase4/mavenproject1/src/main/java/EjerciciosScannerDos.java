// pedir numeros hasta que se introduzca un negativo y calcular la media

import java.util.Scanner;

public class EjerciciosScannerDos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
    
    int numero;
    int contador = 0;
    int suma = 0;
    int promedio;
    
    System.out.println("Ingrese un numero, para terminar el programa, ingrese un numero negativo: ");
    numero = entrada.nextInt();
    
    while (numero > 0) {
        
        contador += 1;
        suma += numero;
        
        System.out.println("Ingrese un numero, para terminar el programa, ingrese un numero negativo: ");
        numero = entrada.nextInt();
    }
    
    promedio = suma / contador;
    
    System.out.println("El programa ha finalizado, el promedio de los numeros ingresados es: " + promedio);
    
    }
}
