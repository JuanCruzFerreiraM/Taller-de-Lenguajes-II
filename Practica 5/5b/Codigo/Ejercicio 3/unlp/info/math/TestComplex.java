package unlp.info.math;

import java.util.Scanner;

//Se podria implementar con enumerativos, consultar como ?
//Consultar acerca del uso de tanta cantidad de variables.
public class TestComplex {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        boolean estado = true;
        while (estado) {
            System.out.println("Suma y Resta de complejos");
            System.out.println("---Menu---");
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Salir");
            System.out.println("Ingrese una opcion (1,2,3)"); 
            int option = in.nextInt();
            switch (option) {
                case 1: {
                    System.out.println("Ingrese la parte real del complejo 1");
                    double re = in.nextDouble();
                    System.out.println("Ingrese la parte imaginaria del complejo 1");
                    double im = in.nextDouble();
                    Complex cmp1 = new Complex(re, im);
                    System.out.println("Ingrese la parte real del complejo 2");
                    re = in.nextDouble();
                    System.out.println("Ingrese la parte imaginaria del complejo 2");
                    im = in.nextDouble();
                    Complex cmp2 = cmp1.valueOf(re, im);
                    Complex result = cmp1.add(cmp2);
                    System.out.println(result);
                    break;
                }
                case 2: {
                    System.out.println("Ingrese la parte real del complejo 1");
                    double re = in.nextDouble();
                    System.out.println("Ingrese la parte imaginaria del complejo 1");
                    double im = in.nextDouble();
                    Complex cmp1 = new Complex(re, im);
                    System.out.println("Ingrese la parte real del complejo 2");
                    re = in.nextDouble();
                    System.out.println("Ingrese la parte imaginaria del complejo 2");
                    im = in.nextDouble();
                    Complex cmp2 = cmp1.valueOf(re, im);
                    Complex result = cmp1.substract(cmp2);
                    System.out.println(result);
                    break;
                }
                case 3: {
                    System.out.println("Programa Finalizado");
                    estado = false;
                    break;
                }
                default: {
                    System.out.println("Ha ocurrido un error, por favor revisar si el valor ingresado esta dentro de los valores permitidos");
                    break;
                }
            }
        }
        in.close();
    }
        
}

