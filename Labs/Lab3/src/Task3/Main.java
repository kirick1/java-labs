package Task3;

public class Main {
    public static void main(String[] args) {
        Polynom polynom1 = new Polynom(1);
        polynom1.input();
        System.out.print("P(x) = ");
        polynom1.output();
        Polynom polynom2 = new Polynom(2);
        polynom2.input();
        System.out.print("Q(x) = ");
        polynom2.output();
        polynom1.add(polynom2);
        System.out.print("P(x) + Q(x) = ");
        polynom2.output();
        polynom1.multiply(polynom2);
    }
}
