// pedir el dia, mes y año de una fecha e indicar si la fecha es valida, suponiendo que los meses son de 30 dias

package ejercicios;
import javax.swing.JOptionPane;

public class EjercicioJOptionPaneDos {
    public static void main(String[] args) {

        int diaNumero = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero del dia de la fecha "));
        int mesNumero = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero del mes de la fecha "));
        int añoNumero = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero del año de la fecha "));


        if (diaNumero >= 1 && diaNumero <= 30) {
            if (mesNumero >= 1 && mesNumero <= 12) {
                if (añoNumero <= 2024) {
                    JOptionPane.showMessageDialog(null, "la fecha " + diaNumero + "/" + mesNumero + "/" + añoNumero +" es valida");
                } else {
                    JOptionPane.showMessageDialog(null, "el año de la fecha es invalido");
                }
            } else {
                JOptionPane.showMessageDialog(null, "el mes de la fecha es invalido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "el dia de la fecha es invalido");
        }
    }
}

