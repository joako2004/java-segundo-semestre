// peddir el dia, mes y año de una fecha e indicar si la fecha es valida suponiendo que todos los meses son de 30 dias

package ejercicios;

import java.util.Scanner;

public class scannerDos {
    
    public static void main(String[] args) {
        
        Scanner diaEntrada = new Scanner(System.in);
        System.out.println("Ingrese el dia de la fecha");
        int dia = diaEntrada.nextInt();
        
        Scanner mesEntrada = new Scanner(System.in);
        System.out.println("Ingrese el mes de la fecha");
        int mes = mesEntrada.nextInt();
        
        Scanner añoEntrada = new Scanner(System.in);
        System.out.println("Ingrese el año de la fecha");
        int año = añoEntrada.nextInt();
                
        if(dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12) {
            System.out.println("fecha: " + dia + "/" + mes + "/" + año);
            System.out.println("la fecha es valida");
        } else {
            System.out.println("fecha: " + dia + "/" + mes + "/" + año);
            System.out.println("la fecha es invalida");
        }
        
    }
    
}
