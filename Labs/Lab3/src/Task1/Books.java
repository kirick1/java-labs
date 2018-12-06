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
    if (null == books) throw new IllegalArgumentException("books are required!");
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
      for (Author current : book.getAuthors()) {
        if (current.equals(author)) result.add(book);
      }
    }
    return new Books(result.toArray(new Book[result.size()]));
  }
  public Books getBooksByPublisher(Publisher publisher) {
    if (publisher == null) throw new IllegalArgumentException("publisher is required!");
    List<Book> result = new ArrayList<>();
    for (Book book : this.getBooks()) {
      if (book.getPublisher().equals(publisher)) result.add(book);
    }
    return new Books(result.toArray(new Book[result.size()]));
  }
  public Books getBooksOlderThen(int year) {
    if (year > 2018) throw new IllegalArgumentException("year cannot be from future!");
    List<Book> result = new ArrayList<>();
    for (Book book : this.getBooks()) {
      if (book.getYear() > year) result.add(book);
    }
    return new Books(result.toArray(new Book[result.size()]));
  }
  public static void main (String[] args) {
    Author Ivan = new Author("Ivan", "Ivanov");
    Author Petro = new Author("Petro", "Poroshenko");
    Publisher publisher1 = new Publisher("FIRST");
    Publisher publisher2 = new Publisher("SECOND");
    Book book1 = new Book(0, "book1", new Author[] { Ivan, Petro }, publisher1, 2017, 100, 75.0, Binding.CARDBOARD);
    Book book2 = new Book(1, "book2", new Author[] { Petro }, publisher2, 2016, 200, 100.0, Binding.PLASTIC);
    Book book3 = new Book(2, "book3", new Author[] { Ivan }, publisher1, 2018, 150, 99.9, Binding.FABRIC);
    System.out.println("All books:");
    Books books = new Books(new Book[] { book1, book2, book3 });
    System.out.println(books);
    System.out.println("Books for author: " + Petro.getFirstName() + " " + Petro.getLastName() + ":");
    Books authorBooks = books.getBooksByAuthor(Petro);
    System.out.println(authorBooks);
    System.out.println("Books published by: " + publisher1.getTitle() + ":");
    Books publisherBooks = books.getBooksByPublisher(publisher1);
    System.out.println(publisherBooks);
    System.out.println("Books after " + 2017 + ":");
    Books booksOlder = books.getBooksOlderThen(2017);
    System.out.println(booksOlder);
  }
}
