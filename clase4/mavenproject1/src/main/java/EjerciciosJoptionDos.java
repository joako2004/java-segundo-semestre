// pedir numeros hasta que se introduzca un negativo y calcular la media

import javax.swing.JOptionPane;

public class EjerciciosJoptionDos {
    public static void main(String[] args) {
        
        int numero;
        int promedio;
        
        int suma = 0;
        int contador = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero, para terminar el programa, digite un numero negativo: "));
        
        while (numero > 0) {
            contador += 1;
            suma += numero;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero, para terminar el programa, digite un numero negativo: "));
        }
        
        promedio = suma / contador;
       
        JOptionPane.showMessageDialog(null, "el programa ha finalizado, el promedio de los numeros ingresados es: " + promedio);
    }
}
