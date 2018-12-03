package Task1;

import java.util.Objects;

public class Publisher {
  private String title;
  Publisher(String title) {
    this.title = title;
  }
  public String getTitle () {
    return this.title;
  }
  public void setTitle (String title) {
    if (title == null) throw new IllegalArgumentException ("title is required!");
    this.title = title;
  }
  @Override
  public String toString () {
    return "Publisher {\n" +
            "\t\ttitle: '" + this.title + '\n' +
            "\t}";
  }
  @Override
  public boolean equals (Object object) {
    if (this == object) return true;
    if (!(object instanceof Publisher)) return false;
    Publisher publisher = (Publisher) object;
    return this.getTitle().equals(publisher.getTitle());
  }
  @Override
  public int hashCode () {
    return Objects.hash(this.getTitle());
  }
  public Book[] getBooks(Book[] books) {
    if (books == null) throw new IllegalArgumentException("books array is required!");
    int booksNumber = books.length;
    Book[] result = new Book[booksNumber];
    for (int index = 0, counter = 0; index < booksNumber && counter < booksNumber; index++) {
      Book book = books[index];
      if (book.getPublisher().equals(this)) {
        result[counter] = book;
        counter++;
      }
    }
    return result;
  }
}
