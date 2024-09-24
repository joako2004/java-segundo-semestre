package ejercicios;

import javax.swing.JOptionPane;

public class JOptionPaneDos {
    
    public static void main(String[] args) {
        
      
        String diaEntrada = JOptionPane.showInputDialog("Ingrese el día de la fecha");
        int dia = Integer.parseInt(diaEntrada);
        
 
        String mesEntrada = JOptionPane.showInputDialog("Ingrese el mes de la fecha");
        int mes = Integer.parseInt(mesEntrada);
        
    
        String añoEntrada = JOptionPane.showInputDialog("Ingrese el año de la fecha");
        int año = Integer.parseInt(añoEntrada);
        
      
        if (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12) {
            JOptionPane.showMessageDialog(null, "Fecha: " + dia + "/" + mes + "/" + año + "\nLa fecha es válida");
        } else {
            JOptionPane.showMessageDialog(null, "Fecha: " + dia + "/" + mes + "/" + año + "\nLa fecha es inválida");
        }
        
    }
}
