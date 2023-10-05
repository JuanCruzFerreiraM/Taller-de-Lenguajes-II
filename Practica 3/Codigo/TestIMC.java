package Codigo;
import java.util.Scanner;



public class TestIMC {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            IMC imc = new IMC();
            System.out.println("Ingrese una altura");
            float altura = in.nextFloat();
            imc.setAltura(altura);
            System.out.println("Ingrese un peso");
            float peso = in.nextFloat();
            imc.setPeso(peso);
            float actualIMC = imc.calculo();
            if (actualIMC > 18.0 && actualIMC < 25.0) {
                System.out.println(actualIMC + "- Usted parece saludable");
            } else if (actualIMC <= 18 ){
                System.out.println("Tu IMC se encuentra por debajo del rango saludable");
            } else {
                System.out.println("Tu IMC se encuentra por arriba del promedio");
            }

        in.close();
    }
}
    