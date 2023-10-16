public interface ConSistemas {
    public static final double PULGADAS = 2.54;  //2.54 cm
    public static final int PIES = 12; //12 pulgadas
    public static final int YARDAS = 3; //3 pies
    public static final double LIBRAS = 0.45376; //0.45376 kg
    public static final String FT= "ft";
    public static final String M = "m";
    public static final String LBM = "lbm";
    public static final String KG = "kg";
    
    public abstract double Conversor(double value, String unidad1);
    public abstract void Comparador(double value1, double value2, String unidad1, String unidad2);
}