public class Planeta {
    private long diametro;
    private long disSol;
    private int cantLunas;
    private Tipos tipo; 
    
    public Planeta(){}

    public Planeta(long diametro, long disSol, int cantLunas, Tipos tipo){
        this.cantLunas = cantLunas;
        this.diametro = diametro;
        this.disSol = disSol;
        this.tipo = tipo;
    }
    
    public long getDiametro() {
        return diametro;
    }
    public void setDiametro(long diametro) {
        this.diametro = diametro;
    }
    public long getDisSol() {
        return disSol;
    }
    public void setDisSol(long disSol) {
        this.disSol = disSol;
    }
    public int getCantLunas() {
        return cantLunas;
    }
    public void setCantLunas(int cantLunas) {
        this.cantLunas = cantLunas;
    }
    public Tipos getTipo() {
        return tipo;
    }
    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }
    
    

}
