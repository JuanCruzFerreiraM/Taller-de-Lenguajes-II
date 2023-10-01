package Codigo;

public class IMC {
    private float peso;
   
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    private float altura;
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calculo(){
        return (this.peso/(this.altura * this.altura));
    }
    
}