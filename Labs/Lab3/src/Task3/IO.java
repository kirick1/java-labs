package Task3;

import сommon.EntityList;
import java.util.Scanner;

public class IO {
  public static Polynom input () {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите степень многочлена:");
    int valuePower = input.nextInt();
    Polynom result = new Polynom(valuePower);
    EntityList<Integer> valueParams = new EntityList<>() {};
    result.setParams(valueParams);
    System.out.println("Введите коэфиценты многочлена:");
    int resultPower = result.getPower();
    for (int index = 0; index <= resultPower; index++) {
      int value = input.nextInt();
      result.setParams(index, value);
    }
    return result;
  }
  public static void output (Polynom polynom) {
    assert polynom != null : "polynom is required!";
    int power = polynom.getPower();
    while (power < polynom.getPower() && polynom.getParams(power) == 0) power++;
    if (power == 0) System.out.println(polynom.getParams(0));
    else {
      StringBuilder string = new StringBuilder();
      int first = polynom.getParams(power);
      string.append(first);
      string.append("x^");
      string.append(power);
      power--;
      for(int index = power; index > 0; index--) {
        int current = polynom.getParams(index);
        if (current < 0) {
          string.append(current);
        }
        if (current > 0) {
          string.append(" + ");
          string.append(current);
        }
        if (current != 0) {
          string.append("x^");
          string.append(index);
        }
      }
      int last = polynom.getParams(0);
      if (last < 0) {
        string.append(last);
      } else {
        string.append(" + ");
        string.append(last);
      }
      System.out.println(string.toString());
    }
  }
}
