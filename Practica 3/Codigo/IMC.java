package Codigo;

public class IMC {
    private float peso;
    private float altura;
    
    public  IMC () { //constructor vacio
    }

    public IMC (float altura, float peso) {
        this.peso = peso;
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calculo(){
        return (this.peso/(this.altura * this.altura));
    }
    
    public long calculo (long peso, long altura){  //Polimorfismo. 
        return (peso/(altura * altura));
    }
}