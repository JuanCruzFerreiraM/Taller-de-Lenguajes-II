package unlp.info.modelo;

import java.util.Arrays;


public class Test {
    public static void main(String[] args) {
        Persona [] personas = new Persona[3];
        personas[0] = new Persona();
        personas[1] = new Persona();
        personas[2] = new Persona();
        personas[0].setApellido("Martinez");
        personas[0].setNombre("Jorge");
        personas[1].setApellido("Acevedo");
        personas[1].setNombre("Luis");
        personas[2].setApellido("Acevedo");
        personas[2].setNombre("Maximo");
        ComparadorPersona comparador = new ComparadorPersona();
        Arrays.sort(personas, comparador);
        System.out.println(Arrays.toString(personas));

    }
}
