package Task3;

import java.util.*;

class Polynom {
  private int power;
  private int[] params;
  Polynom(int power) {
    this.power = power;
    this.params = new int[this.power + 1];
    for (int i = 0; i<= this.power; i++) {
      this.params[i] = 0;
    }
  }
  public int getPower() {
    return this.power;
  }
  public void setPower(int power) {
    this.power = power;
  }
  public int[] getParams() {
    return this.params;
  }
  public int getParams(int index) {
    assert index >= 0 && index < this.getPower() : "index must be in range from 0 to power";
    return this.params[index];
  }
  public void setParams(int[] params) {
    assert params != null : "params are required!";
    this.params = params;
  }
  public void setParams(int index, int value) {
    assert index >= 0 && index < this.getPower() : "index must be in range from 0 to power";
    this.params[index] = value;
  }
  @Override
  public String toString() {
    return  "Polynom {" +
            "\tpower: " + this.power + '\n' +
            "\tparams: " + Arrays.toString(this.params) + '\n' +
            "}";
  }
  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (!(object instanceof Polynom)) return false;
    Polynom polynom = (Polynom) object;
    return this.getPower() == polynom.getPower() && Arrays.equals(this.getParams(), polynom.getParams());
  }
  @Override
  public int hashCode() {
    int result = Objects.hash(this.getPower());
    return 31 * result + Arrays.hashCode(this.getParams());
  }
  public void add(Polynom polynom) {
    assert polynom != null : "polynom is required!";
    int resultPower = this.getPower() > polynom.getPower() ? this.getPower() : polynom.getPower();
    Polynom sum = new Polynom(resultPower);
    for(int index = 0; index < resultPower; index++ ) {
      int current = sum.getParams(index);
      int next = current + polynom.getParams(index);
      sum.setParams(index, next);
    }
  }
  public void multiply(Polynom polynom) {
    assert polynom != null : "multiplier polynom is required!";
    int resultPower = this.getPower() > polynom.getPower() ? this.getPower() : polynom.getPower();
    this.power = resultPower;
    for (int index = 0; index < resultPower; index++) {
      int current = this.getParams(index);
      int multiplier = polynom.getParams(index);
      this.params[index] = current * multiplier;
    }
  }
  public void input() {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите степень многочлена:");
    int valuePower = input.nextInt();
    this.setPower(valuePower);
    int[] valueParams = new int[valuePower + 2];
    this.setParams(valueParams);
    System.out.println("Введите коэфиценты многочлена:");
    for (int index = 0; index <= this.getPower(); index++) {
      int value = input.nextInt();
      this.setParams(index, value);
    }
  }
  public void output() {
    int power = this.getPower();
    while (this.getParams(power) == 0) power++;
    if (power == 0) System.out.println(this.getParams(0));
    else {
      StringBuilder string = new StringBuilder();
      int first = this.getParams(power);
      string.append(first);
      string.append("x^");
      string.append(power);
      power--;
      for(int index = power; index > 0; index--) {
        int current = this.getParams(index);
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
      int last = this.getParams(0);
      if (last < 0) {
        string.append(last);
      } else {
        string.append(" + ");
        string.append(last);
      }
      System.out.println(string.toString());
    }
  }
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
    System.out.print("P(x) * Q(x) = ");
    polynom2.output();
  }
}
