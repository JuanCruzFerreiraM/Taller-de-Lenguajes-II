public class Longitud implements ConSistemas{

    @Override
    public double Conversor(double value, String unidad){
        double valueR = 0;
        switch (unidad) {
            case FT:
                valueR = value/(PIES * PULGADAS * 100);
                break;
            case M: 
                valueR = value * (PIES * PULGADAS * 100);
                break;
            default:
                System.out.println("Error. Valor de unidad invalido");
                valueR = -1;
                break;
        }
        return valueR;
    }

    @Override
    public void Comparador(double value1, double value2, String unidad1, String unidad2){ //Se puede optimizar.
        
        if (unidad1.equals(unidad2)) {
            if (value1 > value2) {
                System.out.println(value1 +" "+unidad1+" es mayor que "+value2+" "+unidad2);
            } else if (value2 > value1) {
                System.out.println(value2 +" "+unidad2+" es mayor que "+value1+" "+unidad1);
            } else {
                System.out.println(value1 +" "+unidad1+" es igual que "+value2+" "+unidad2);
            }
        } else {
            double value1C = Conversor(value1, unidad1);
             if (value1C > value2) {
                System.out.println(value1 +" "+unidad1+" es mayor que "+value2+" "+unidad2);
            } else if (value2 > value1C) {
                System.out.println(value2 +" "+unidad2+" es mayor que "+value1+" "+unidad1);
            } else {
                System.out.println(value1 +" "+unidad1+" es igual que "+value2+" "+unidad2);
            }
        }
    }

}
