package unlp.info.math;

public final class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.im = im;
        this.re = re;
    }

    public double realPart(){
        return re;
    }

    public double imaginaryPart(){
        return im;
    }

    public Complex add(Complex c){
        Complex result = new Complex(this.realPart() + c.realPart(), this.imaginaryPart() + this.imaginaryPart());
        return result;
    }

    public Complex substract(Complex c) {
        Complex result = new Complex(this.realPart() - c.realPart(), this.imaginaryPart() - c.imaginaryPart());
        return result;
    }

    //No es necesaria la implementacion para el ejercicio.
    public Complex multiply(Complex C){
        Complex result = new Complex(this.re, this.im);
        return result;
    }

    //No es necesaria la implementacion para el ejercicio.
    public Complex divide(Complex C){
        Complex result = new Complex(this.re, this.im);
        return result;
    }

    //No se me ocurre bien como hacerlo, revisar luego o preguntarle a los chicos. (13/10/2023)
    //public boolean equals(Object o) {
    //}
    
    //No es necesaria la implementacion para el ejercicio.
    public int hashCode(){
        return 1;
    }

    public String toString(){
        return (this.re+" + "+this.im+"i");
    }

    public Complex valueOf(double re, double im){
        Complex value = new Complex(re, im);
        return value;
    }
}