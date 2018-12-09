package Task3;

public class Main {
    public static void main(String[] args) {
        Polynom polynom1 = IO.input();
        System.out.print("P(x) = ");
        IO.output(polynom1);
        Polynom polynom2 = IO.input();
        System.out.print("Q(x) = ");
        IO.output(polynom2);
        polynom1 = polynom1.add(polynom2);
        System.out.print("P(x) + Q(x) = ");
        IO.output(polynom1);
        polynom1 = polynom1.multiply(polynom2);
        System.out.print("P(x) * Q(x) = ");
        IO.output(polynom1);
    }
}
