package Task3;

import сommon.EntityList;
import java.util.Scanner;

public class IO {
  public static Polynom input () {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите степень многочлена:");
    int valuePower = input.nextInt();
    Polynom result = new Polynom(valuePower);
    System.out.println("Введите коэфиценты многочлена:");
    int resultPower = result.getPower();
    for (int index = 0; index <= resultPower; index++) {
      int value = input.nextInt();
      result.setParams(index, value);
    }
    return result;
  }
}
