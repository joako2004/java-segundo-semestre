package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona(); // llamar al constructor
        persona1.nombre = "joaquin";
        persona1.apellido = "peralta";
        persona1.ObtenerInformacion();   
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persona1);
        persona2.ObtenerInformacion();
        persona2.nombre = "claudio";
        persona2.apellido = "alvarez";
        persona2.ObtenerInformacion();
    } 
}
