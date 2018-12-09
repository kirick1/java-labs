package Task3;

import сommon.EntityList;

import java.util.*;

class Polynom {

  private int power;

  private EntityList<Integer> params;

  public Polynom(int power) {
    this.power = power;
    EntityList<Integer> params = new EntityList<Integer>();
    for (int i = 0; i <= this.power; i++) {
      params.add(0);
    }
  }

  public int getPower() {
    return this.power;
  }

  public void setPower(int power) {
    this.power = power;
  }

  public EntityList<Integer> getParams() {
    return this.params;
  }

  public Integer getParams(int index) {
    assert index >= 0 && index < this.getPower() : "index must be in range from 0 to power";
    return this.params.get(index);
  }

  public void setParams(EntityList<Integer> params) {
    assert params != null : "params are required!";
    this.params = params;
  }

  public void setParams(int index, int value) {
    assert index >= 0 && index < this.getPower() : "index must be in range from 0 to power";
    this.params.addByIndex(index, value);
  }

  @Override
  public String toString() {
    return  "Polynom {" +
            "\tpower: " + this.power + '\n' +
            "\tparams: " + this.params.toString() + '\n' +
            "}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Polynom polynom = (Polynom) o;
    return power == polynom.power &&
            Objects.equals(params, polynom.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(power, params);
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
      this.params.addByIndex(index, current * multiplier);
    }
  }

  public void input() {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите степень многочлена:");
    int valuePower = input.nextInt();
    this.setPower(valuePower);
    EntityList<Integer> valueParams = new EntityList<>(){{add(valuePower + 2);}};
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

}
