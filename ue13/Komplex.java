public class Komplex {
    private double real;
    private double imaginary;

    public Komplex(Komplex c) {
        real = c.real;
        imaginary = c.imaginary;
    }

    public String toString() {
        return "" + real + " + " + imaginary + "i"; 
    }

    public void setReal(double val) {
        real = val;
    }
    public void setImaginary(double val) {
        imaginary = val;
    }

    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }

    public Komplex() {
        this.real = 0.;
        this.imaginary = 0.;
    }

    public Komplex(double r, double i) {
        this.setReal(r);
        this.setImaginary(i);
    }
    
    public double getBetrag() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public void konjugiertKomplex() {
        this.imaginary = -imaginary;
    }

    public Komplex getKonjugiertKomplex() {
        return new Komplex(this.real, -this.imaginary);
    }

    public void add(Komplex k) {
        this.real += k.real;
        this.imaginary += k.imaginary;
    }

    public void mult(Komplex k) {
        this.real = this.real * k.real - this.imaginary * k.imaginary;
        this.imaginary = this.real * k.imaginary + this.imaginary * k.real;
    }
}
