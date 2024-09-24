
// para almacenar metodos/objetos/atributos se utiliza la memoria heap

package operaciones;

public class Aritmetica {
    
    // atributos
    int a; 
    int b;
    
    // constructor: metodo especial
    public Aritmetica() {
        System.out.println("Se esta ejecutando el primer constructor");
    }
    
    // sobrecarga de constructores
    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecutando el segundo constructor");
    }
    
    // metodos
    public void sumarNumeros() {
        
        int resultado;
        
        resultado = a + b;
        
        System.out.println("resultado = " + resultado);
        
    }
    
    public int sumarConRetorno() {
       
        int resultado = a + b;
        return resultado;
        
    }

    public int sumarConArgumentos(int arg1, int arg2) {

        a = arg1;
        b = arg2;

        // return a + b;
        return this.sumarConRetorno();
    }
    
}