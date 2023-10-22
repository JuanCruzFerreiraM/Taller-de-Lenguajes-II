public class SistemaSolar {
    private static SistemaSolar INSTACE = new SistemaSolar();
    private  Planeta [] planetas = {
        new Planeta(4878,698170,0, Tipos.ROCOSOS),
        new Planeta(12100,108000,0,Tipos.ROCOSOS),
        new Planeta(12756,149900,1,Tipos.ROCOSOS),
        new Planeta(6787,228000,2,Tipos.ROCOSOS),
        new Planeta(142984,750000,79,Tipos.GASEOSOS),
        new Planeta(120536,1418000,82,Tipos.GASEOSOS),
        new Planeta(51108,3000000,27,Tipos.GASEOSOS),
        new Planeta(49538,4500000,14,Tipos.GASEOSOS),
    }; 


    private  SistemaSolar() {
    }

    
    public Planeta[] getPlanetas() {
        return planetas;
    } 

    public static SistemaSolar getInstance() {
        return INSTACE;
    }
}


