package operaciones;

public class Aritmetica {
    int a;
    int b;
    
    public void numarNumeros() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        int resultado = a + b;
        return resultado;
    }

    public int sumarConArgumentos (int arg1, int arg2) {
        this.a = arg1;
        this.b = arg2;

        int resultado = a + b;

        // return resultado;

        return this.sumarConRetorno(); // ejecutar un metodo desde otro metodo
    }
}
