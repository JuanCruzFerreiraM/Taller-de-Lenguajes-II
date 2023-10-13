import java.lang.Math;

//Clase implementada con patron singleton.
public final class GeneraRandom {
    private int Maximo_Valor;
    private static GeneraRandom INSTANCE = new GeneraRandom();

    private GeneraRandom(){
    }
    
    public static GeneraRandom getINSTANCE() {
        return INSTANCE;
    }

    public double getMaximo_Valor() {
        return Maximo_Valor;
    }

    public void setMaximo_Valor(int maximo_Valor) {
        Maximo_Valor = maximo_Valor;
    }
    /**
     * El metodo devuelve un valor entero "random" entre 0 y la variable de clase Maximo_Valor.
     * @return
     * Valor entero pseudorandom entre 0 y Maximo_Valor.
     */
    public int obtenerRandom(){
        int value =  (int) (Math.random() * Maximo_Valor);                             
        return value;
        //El metodo random devuelve un valor entre 0.0 y 1.0 => obtenerRandom devuelve un valor entre 0 y Maximo_Valor.
    }
}