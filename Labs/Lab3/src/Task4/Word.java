package Task4;

import java.util.Objects;

public class Word {
  private String value;
  Word(String value) {
    assert value != null : "value is required";
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    assert value != null : "value is required";
    this.value = value;
  }
  public int getLength() {
    return this.value.length();
  }
  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (!(object instanceof Word)) return false;
    Word word = (Word) object;
    return this.getValue().equals(word.getValue());
  }
  @Override
  public int hashCode() {
    return Objects.hash(this.getValue());
  }
  @Override
  public String toString() {
    return  "Word {" +
            "\tvalue:'" + this.value + '\n' +
            "}";
  }
}
