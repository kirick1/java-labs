package Task3;

public class Main {
    public static void main(String[] args) {
        Polynom polynom1 = IO.input();
        System.out.println("P(x) = " + polynom1);
        Polynom polynom2 = IO.input();
        System.out.println("Q(x) = " + polynom2);
        Polynom sum = polynom1.add(polynom2);
        System.out.println("P(x) + Q(x) = " + sum);
        Polynom mult = polynom1.multiply(polynom2);
        System.out.println("P(x) * Q(x) = " + mult);
    }
}
