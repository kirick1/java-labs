package Task1;

import java.util.Objects;

public class Author {

  private String firstName;

  private String lastName;

  public Author (String firstName, String lastName) {
    assert firstName != null : "firstName is required!";
    assert lastName != null : "lastName is required!";
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName () {
    return this.firstName;
  }

  public void setFirstName (String firstName) {
    assert firstName != null : "firstName is required!";
    this.firstName = firstName;
  }

  public String getLastName () {
    return this.lastName;
  }

  public void setLastName (String lastName) {
    assert lastName != null : "lastName is required!";
    this.lastName = lastName;
  }

  @Override
  public String toString () {
    return "{\n" +
            "\t\tfirstName: '" + this.firstName + '\n' +
            "\t\tlastName: '" + this.lastName + '\n' +
            "\t}";
  }

  @Override
  public boolean equals (Object object) {
    if (this == object) return true;
    if (!(object instanceof Author)) return false;
    Author author = (Author) object;
    return this.getFirstName().equals(author.getFirstName()) && this.getLastName().equals(author.getLastName());
  }

  @Override
  public int hashCode () {
    return Objects.hash(this.getFirstName(), this.getLastName());
  }

}

