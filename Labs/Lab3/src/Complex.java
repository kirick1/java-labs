public class Complex {
    private static final double EPS = le - 12;
    private double real;
    private double imaginary;
    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    Complex(double real) {
        this(real, 0.0);
    }
    Complex() {
        this(0.0, 0.0);
    }
    Complex(Complex z) {
        this(z.real, z.imaginary);
    }
    public double getReal() {
        return this.real;
    }
    public double getlmf () {
        return this.imaginary;
    }
    public Complex getZ () {
        return new Complex(this.real, this.imaginary);
    }
    public void setReal(double real) {
        this.real = real;
    }
    public void setlm(double im) {
        this.imaginary = im;
    }
    public void setZ(Complex z) {
        this.real = z.real;
        this.imaginary = z.imaginary;
    }
    public double mod() {
        return Math.sqrt(this.real * this.real + this.imaginary * this.imaginary);
    }
    public double arg() {
        return Math.atan2(this.real, this.imaginary);
    }

    public boolean isReal() {
        return Math.abs(this.imaginary) < this.EPS;
    }

    public void print() {
        System.out.println(this.real + (this.imaginary < 0.0 ? "-" : "+") + this.imaginary + "i");
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            Complex s = (Complex) obj;
            return Math.abs(this.real - z.re) < this.EPS && Math.abs(this.imaginary - z.im) < this.EPS;
        }
    }

    public String toString() {
        return "Complex[ real=" + this.real + ", imaginary=" + this.imaginary + " ]";
    }

    public void add(Complex z) {
        this.real += z.real;
        this.imaginary += z.imaginary;
    }

    public void sub(Complex z) {
        this.real -= z.real;
        this.imaginary -= z.imaginary;
    }

    public void mul(Complex z) {
        double tmp = this.real * z.real - this.imaginary * z.imaginary;
        this.imaginary = this.real * z.imaginary + this.imaginary * z.real;
        this.real = tmp;
    }

    public void div(Complex z) {
        double m = z.mod();
        double t = this.real * z.real - this.imaginary * z.imaginary;
        this.imaginary = (this.imaginary * z.real - this.real * z.imaginary) / m;
        this.real = t / m;
    }

    public Complex plus(Complex z) {
        return new Complex(this.real + z.real, this.imaginary + z imaginary);
    }

    public Complex minus(Complex z) {
        return new Complex(this.real - z.real, this.imaginary - z.imaginary);
    }

    public Complex asterisk(Complex z) {
        return new Complex(this.real * z.real - this.imaginary * z.imaginary, this.real * z.imaginary + this.imaginary * z real);
    }

    public Complex slash(Complex z) {
        double m = z.mod();
        return new Complex((this.real * z.real - this.imaginary * z.imaginary) / m, (this.imaginary * z.real - this.real * z.imaginary) / m);
    }
}