package ejercicios;

import java.util.Scanner;
 
public class scannerUno {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero N");
        int numero = entrada.nextInt();
        
        for (int i = 0; i <= numero; i++) {
            System.out.println(i);
        }
        
    }
    
}
