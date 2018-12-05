package Task1;

import java.util.Objects;

public class Author {
  private String firstName;
  private String lastName;
  Author (String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  public String getFirstName () {
    return this.firstName;
  }
  public void setFirstName (String firstName) {
    if (firstName == null) throw new IllegalArgumentException ("firstName is required!");
    this.firstName = firstName;
  }
  public String getLastName () {
    return this.lastName;
  }
  public void setLastName (String lastName) {
    if (lastName == null) throw new IllegalArgumentException ("lastName is required!");
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
  public Book[] getBooks(Book[] books) {
    if (books == null) throw new IllegalArgumentException("books array is required!");
    int booksNumber = books.length;
    Book[] result = new Book[booksNumber];
    for (int index = 0, counter = 0; index < booksNumber && counter < booksNumber; index++) {
      Book book = books[index];
      if (book.getAuthors().equals(this)) {
        result[counter] = book;
        counter++;
      }
    }
    return result;
  }
}
