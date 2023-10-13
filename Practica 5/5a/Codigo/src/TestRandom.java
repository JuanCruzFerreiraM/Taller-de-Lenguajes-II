public class TestRandom {
    
    public static void main(String[] args) {
        GeneraRandom instancia = GeneraRandom.getINSTANCE();
        instancia.setMaximo_Valor(100);
        int value;
        for (int i= 0; i < 100; i++){
            value = instancia.obtenerRandom();
            System.out.println("Valor "+i+" = "+value);
        }
    }
}
