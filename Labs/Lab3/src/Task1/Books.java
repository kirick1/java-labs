package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Books {
  private Book[] books;
  Books (Book[] books) {
    this.books = books;
  }
  public Book[] getBooks() {
    return this.books;
  }
  public void setBooks(Book[] books) {
    this.books = books;
  }
  @Override
  public String toString() {
    return Arrays.toString(this.books);
  }
  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (!(object instanceof Books)) return false;
    Books books = (Books) object;
    return Arrays.equals(this.getBooks(), books.getBooks());
  }
  @Override
  public int hashCode() {
    return Arrays.hashCode(this.getBooks());
  }
  public Books getBooksByAuthor(Author author) {
    if (author == null) throw new IllegalArgumentException("author is required!");
    List<Book> result = new ArrayList<>();
    for (Book book : this.getBooks()) {
      Author[] authors = book.getAuthors();
      for (Author current : authors) {
        if (current.equals(author)) {
          result.add(book);
        }
      }
    }
    return new Books(result.toArray(new Book[result.size()]));
  }
  public static void main (String[] args) {
    Author Ivan = new Author("Ivan", "Ivanov");
    Author Petro = new Author("Petro", "Poroshenko");
    //Author[] authors = new Author[] { Ivan, Petro };
    Publisher publisher = new Publisher("HOUSE");
    Book book1 = new Book(0, "book1", new Author[] { Ivan, Petro }, publisher, 2017, 100, 75.0, Binding.CARDBOARD);
    Book book2 = new Book(1, "book2", new Author[] { Petro }, publisher, 2016, 200, 100.0, Binding.PLASTIC);
    Books books = new Books(new Book[] { book1, book2 });
    Books authorBooks = books.getBooksByAuthor(Petro);
    System.out.println(authorBooks);
  }
}
