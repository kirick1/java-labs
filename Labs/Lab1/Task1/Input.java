import java.util.Scanner;

public class Input {
    public final String pattern = "pattern";
    public String input() {
        return new Scanner(System.in).nextLine();
    }
    public boolean compareStrings(String string) {
        return (string == pattern);
    }
}