package Task1;

import static java.util.Objects.*;

class Book {
  private int id;
  private String title;
  private Author author;
  private Publisher publisher;
  private int year;
  private int pages;
  private double price;
  private Binding binging;
  Book (int id, String title, Author author, Publisher publisher, int year, int pages, double price, Binding binging) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.year = year;
    this.pages = pages;
    this.price = price;
    this.binging = binging;
  }
  public int getId () {
    return this.id;
  }
  public void setId (int id) {
    if (id < 0) throw new IllegalArgumentException ("id must be positive!");
    this.id = id;
  }
  public String getTitle () {
    return this.title;
  }
  public void setTitle (String title) {
    if (title == null) throw new NullPointerException("title is required!");
  }
  public Author getAuthor () {
    return this.author;
  }
  public void setAuthor (Author author) {
    if (author == null) throw new NullPointerException("author is required!");
    this.author = author;
  }
  public Publisher getPublisher () {
    return this.publisher;
  }
  public void setPublisher (Publisher publisher) {
    if (publisher == null) throw new NullPointerException("publisher is required!");
    this.publisher = publisher;
  }
  public int getYear () {
    return this.year;
  }
  public void setYear (int year) {
    if (year > 2018) throw new IllegalArgumentException ("year cannot be from future!");
    this.year = year;
  }
  public int getPages () {
    return this.pages;
  }
  public void setPages (int pages) {
    if (pages < 0) throw new IllegalArgumentException ("pages must be positive!");
    this.pages = pages;
  }
  public double getPrice () {
    return this.price;
  }
  public void setPrice (double price) {
    if (price < 0.0) throw new IllegalArgumentException ("price must be positive!");
    this.price = price;
  }
  public Binding getBinging () {
    return this.binging;
  }
  public void setBinging (Binding binging) {
    this.binging = binging;
  }
  @Override
  public String toString() {
    return "Book {\n" +
            "\tid: " + this.id + '\n' +
            "\ttitle: '" + this.title + '\n' +
            "\tauthor: " + this.author.toString() + '\n' +
            "\tpublisher: " + this.publisher.toString() + '\n' +
            "\tyear: " + this.year + '\n' +
            "\tpages: " + this.pages + '\n' +
            "\tprice: " + this.price + '\n' +
            "\tbinging: " + this.binging + '\n' +
            '}';
  }
  @Override
  public boolean equals (Object object) {
    if (this == object) return true;
    if (!(object instanceof Book)) return false;
    Book book = (Book) object;
    return this.getId() == book.getId() &&
            this.getYear() == book.getYear() &&
            this.getPages() == book.getPages() &&
            Double.compare(book.getPrice(), this.getPrice()) == 0 &&
            this.getTitle().equals(book.getTitle()) &&
            this.getAuthor().equals(book.getAuthor()) &&
            this.getPublisher().equals(book.getPublisher()) &&
            this.getBinging() == book.getBinging();
  }
  @Override
  public int hashCode () {
    return hash(this.getId(), this.getTitle(), this.getAuthor(), this.getPublisher(), this.getYear(), this.getPages(), this.getPrice(), this.getBinging());
  }
  public static void main (String[] args) {
    Author author = new Author("Ivan", "Ivanov");
    Publisher publisher = new Publisher("HOUSE");
    Book book = new Book(0, "book1", author, publisher, 2017, 100, 75.0, Binding.CARDBOARD);
    System.out.println(book);
  }
}
