public interface ConSistemas {
    public static final double PULGADAS = 2.54;  //2.54 cm
    public static final int PIES = 12; //12 pulgadas
    public static final int YARDAS = 3; //3 pies
    public static final double LIBRAS = 0.45376; //0.45376 kg
    public static final String FT= "ft";
    public static final String M = "m";
    public static final String LBM = "lbm";
    public static final String KG = "kg";
    
    /**
     * El metodo se encarga de convertir valores de alguna maginud fisica entre sistemas de unidades.
     * (En este caso se pasa de sistema internacional a britanico y viceversa).
     * @param value
     * Valor numerico de la magnitud fisica
     * @param unidad1
     * Unidad de la magnitud en un sistema de medida
     * @return
     * Valor transformado a un sistema de medidida diferente
     */
    public abstract double Conversor(double value, String unidad1);
    /**
     * El metodo compara magnitudes fisicas, en sistemas de medida tanto iguales como diferentes (En este caso para Sistema
     * internacional y sistema britanico).
     * @param value1
     * Valor numerico de una magnitud fisica
     * @param value2
     * Valor numerico de una magnitud fisica
     * @param unidad1
     * Unidad de medida de value1
     * @param unidad2
     * Unidad de medida de value2
     */
    public abstract void Comparador(double value1, double value2, String unidad1, String unidad2);
}