package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Books {

  private Book[] books;

  public Books (Book[] books) {
    assert books != null : "books are required!";
    this.books = books;
  }

  public Book[] getBooks() {
    return this.books;
  }

  public void setBooks(Book[] books) {
    assert books != null : "books are required!";
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

  public Books getBooksByAuthor(Task1.Author author) {
    assert author != null : "author is required!";
    List<Book> result = new ArrayList<>();
    for (Book book : this.getBooks()) {
      for (Author current : book.getAuthors().getElements()) {
        if (current.equals(author)) result.add(book);
      }
    }
    return new Books(result.toArray(new Book[result.size()]));
  }

  public Books getBooksByPublisher(Publisher publisher) {
    assert publisher != null : "publisher is required!";
    List<Book> result = new ArrayList<>();
    for (Book book : this.getBooks()) {
      if (book.getPublisher().equals(publisher)) result.add(book);
    }
    return new Books(result.toArray(new Book[result.size()]));
  }

  public Books getBooksOlderThen(int year) {
    assert year <= 2018 : "year cannot be from future!";
    List<Book> result = new ArrayList<>();
    for (Book book : this.getBooks()) {
      if (book.getYear() > year) result.add(book);
    }
    return new Books(result.toArray(new Book[result.size()]));
  }

  }
