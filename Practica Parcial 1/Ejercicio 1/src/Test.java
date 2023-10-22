import java.util.Arrays;

public class Test {
    
    public static void main(String[] args) {
        SistemaSolar sistema = SistemaSolar.getInstance();
        Telescopio jamesWebb = new Telescopio();
        
        for (Planeta i : Arrays.asList(sistema.getPlanetas())) {
            System.out.println("Distancia al Sol: "+ jamesWebb.distancia(i));
            jamesWebb.tipo(i);
        }
    }
}
