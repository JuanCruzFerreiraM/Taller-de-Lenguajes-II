public class Telescopio {
    
    public long distancia(Planeta planeta) {
        return planeta.getDisSol();
    }

    public void tipo(Planeta planeta) {
        switch (planeta.getTipo()) {
            case ROCOSOS:
                System.out.println("El planeta es rocoso");
                break;
            
            case GASEOSOS:
                System.out.println("El planeta es gaseoso");
                break;

            default:
                System.out.println("Tipo desconocido"); //No deberia susceder nunca.
                break;
        }
    }
}
