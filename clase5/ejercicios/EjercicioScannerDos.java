// pedir el dia, mes y año de una fecha e indicar si la fecha es valida, suponiendo que los meses son de 30 dias

package ejercicios;

import java.util.Scanner;

public class EjercicioScannerDos {
    public static void main(String[] args) {

        Scanner diaNumero = new Scanner(System.in);
        Scanner mesNumero = new Scanner(System.in);
        Scanner AñoNumero = new Scanner(System.in);

        System.out.println("ingrese el numero del dia de la fecha: ");
        int dia = diaNumero.nextInt();

        System.out.println("ingrese el numero del mes de la fecha: ");
        int mes = diaNumero.nextInt();

        System.out.println("ingrese el numero del año de la fecha: ");
        int año = diaNumero.nextInt();

        if (dia >= 1 && dia <= 30) {
            if (mes >= 1 && mes <= 12) {
                if (año <= 2024) {
                    System.out.println("la fecha " + dia + "/" + mes + "/" + año +" es valida");
                } else {
                    System.out.println("el año de la fecha es invalido");
                }
            } else {
                System.out.println("el mes de la fecha es invalido");
            }
        } else {
            System.out.println("el dia de la fecha es invalido");
        }
    }
}
