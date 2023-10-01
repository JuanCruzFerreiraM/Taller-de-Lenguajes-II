package Codigo;


public class TestIMC {
    public static void main(String[] args) {
        if (args.length  != 2) {
            System.out.println("Error. Wrong number of parameters");            
        } else {
            IMC imc = new IMC();
            imc.setAltura(Float.parseFloat(args[0]));
            imc.setPeso(Float.parseFloat(args[1]));
            float actualIMC = imc.calculo();
            if (actualIMC > 18.0 && actualIMC < 25.0) {
                System.out.println(actualIMC + "- Usted parece saludable");
            } else if (actualIMC <= 18 ){
                System.out.println("Tu IMC se encuentra por debajo del rango saludable");
            } else {
                System.out.println("Tu IMC se encuentra por arriba del promedio");
            }
        }  
    }
}
