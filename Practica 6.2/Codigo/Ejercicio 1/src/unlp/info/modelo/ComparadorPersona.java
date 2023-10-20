package unlp.info.modelo;

import java.util.Comparator;

public class ComparadorPersona implements Comparator<Persona>{
    public int compare(Persona persona1, Persona persona2){
        int valueA = persona1.getApellido().compareTo(persona2.getApellido());
        if (valueA == 0) {
            return persona1.getNombre().compareTo(persona2.getNombre());
        }
        return valueA;
    }
} /*Basicamente ordena primero por apellido mediante el metodo compareTo, si los apellidos son iguales entonces 
    y solo entonces compara por nombre.*/