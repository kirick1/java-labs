package Task3;

import сommon.EntityList;

import java.util.*;

class Polynom {

  private int power;

  private EntityList<Integer> params;

  public Polynom(int power) {
    this.power = power;
    EntityList<Integer> params = new EntityList<Integer>();
    for (int index = 0; index <= this.power; index++) params.add(0);
    this.params = params;
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
    assert this.params != null : "params is null!";
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
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || this.getClass() != object.getClass()) return false;
    Polynom polynom = (Polynom) object;
    return this.power == polynom.power && Objects.equals(this.params, polynom.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(power, params);
  }

  public Polynom add(Polynom polynom) {
    assert polynom != null : "polynom is required!";
    int resultPower = this.getPower() > polynom.getPower() ? this.getPower() : polynom.getPower();
    Polynom result = new Polynom(resultPower);
    for (int index = 0; index <= resultPower; index++ ) {
      int current = this.getParams(index);
      int value = polynom.getParams(index);
      int next = current + value;
      result.setParams(index, next);
    }
    return result;
  }

  public Polynom multiply(Polynom polynom) {
    assert polynom != null : "multiplier polynom is required!";
    int resultPower = this.getPower() > polynom.getPower() ? this.getPower() : polynom.getPower();
    Polynom result = new Polynom(resultPower);
    for (int index = 0; index <= resultPower; index++) {
      int current = this.getParams(index);
      int value = polynom.getParams(index);
      int next = current * value;
      result.setParams(index, next);
    }
    return result;
  }
}
