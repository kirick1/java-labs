public class Strings {
    public void writeLineStrings() {
        System.out.println("Lines:");
        System.out.print("--- \nstring1 ");
        System.out.print("--- str\ning2 ");
        System.out.print("--- strin\ng3 ");
    }
    public void writeNoLineStrings() {
        System.out.println("\n\nNo Lines:");
        System.out.print("--- string1 ");
        System.out.print("--- string2 ");
        System.out.print("--- string3 ");
    }
    public static void main (String argv[]) {
        Strings strings = new Strings();
        strings.writeLineStrings();
        strings.writeNoLineStrings();
    }
}
