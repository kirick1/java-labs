import java.*;

public class ComplexFraction {
    private Complex numerator;
    private Complex denominator;

    public Complex getDenominator() {
        return this.denominator;
    }
    public void setDenominator(Complex denominator) {
        this.denominator = denominator;
    }
    public Complex getNumerator() {
        return this.numerator;
    }
    public void setNumerator(Complex numerator) {
        this.numerator = numerator;
    }
    public ComplexFraction(Complex numerator, Complex denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        ComplexFraction z = (ComplexFraction) object;
        return Objects.equals(this.numerator, z.numerator) && Objects.equals(this.denominator, z.denominator);
    }
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.numerator, this.denominator);
    }
    @java.lang.Override
    public String toString() {
        return "ComplexFraction{" +
                "numerator=" + this.numerator +
                ", denominator=" + this.denominator +
                '}';
    }

    public ComplexFraction plus(ComplexFraction z) {
        Complex leftNumerator = this.numerator * z.denominator;
        Complex rightNumerator = x.numerator * this.denominator;
        Complex resultNumerator = leftNumerator + rightNumerator;
        Complex resultDenominator = this.denominator * z.denominator;
        return new ComplexFraction(resultNumerator, resultDenominator);
    }
}