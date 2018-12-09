package Task1;

import сommon.EntityList;

import java.util.Arrays;

import static java.util.Objects.hash;

public class Book {

  private int id;

  private String title;

  private EntityList<Author> authors;

  private Publisher publisher;

  private int year;

  private int pages;

  private double price;

  private Binding binging;

  public Book (int id, String title, EntityList<Author> authors, Publisher publisher, int year, int pages, double price, Binding binging) {
    this.id = id;
    this.title = title;
    this.authors = authors;
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
    this.title = title;
  }

  public EntityList<Author> getAuthors() {
    return this.authors;
  }

  public void setAuthors(EntityList<Author> authors) {
    assert authors != null : "authors is required!";
    this.authors = authors;
  }

  public Publisher getPublisher () {
    return this.publisher;
  }

  public void setPublisher (Publisher publisher) {
    assert publisher != null : "publisher is required!";
    this.publisher = publisher;
  }

  public int getYear () {
    return this.year;
  }

  public void setYear (int year) {
    assert year <= 2018 : "year cannot be from future!";
    this.year = year;
  }

  public int getPages () {
    return this.pages;
  }

  public void setPages (int pages) {
    assert pages >= 0 : "pages must be positive!";
    this.pages = pages;
  }

  public double getPrice () {
    return this.price;
  }

  public void setPrice (double price) {
    assert price >= 0.0 : "price must be positive!";
    this.price = price;
  }

  public Binding getBinging () {
    return this.binging;
  }

  public void setBinging (Binding binging) {
    assert binging != null : "binding is required!";
    this.binging = binging;
  }

  @Override
  public String toString() {
    return  "{\n" +
            "\tid: " + this.id + '\n' +
            "\ttitle: '" + this.title + '\n' +
            "\tauthors: " + this.authors.getElements().toString() + '\n' +
            "\tpublisher: " + this.publisher.toString() + '\n' +
            "\tyear: " + this.year + '\n' +
            "\tpages: " + this.pages + '\n' +
            "\tprice: " + this.price + '\n' +
            "\tbinging: " + this.binging + '\n' +
            "}\n";
  }

  @Override
  public boolean equals (Object object) {
    if (this == object) return true;
    if (!(object instanceof Book)) return false;
    Book book = (Book) object;
    return this.getId() == book.getId() &&
        this.getYear() == book.getYear() &&
        this.getPages() == book.getPages() &&
        Double.compare(this.getPrice(), book.getPrice()) == 0 &&
        this.getTitle().equals(book.getTitle()) &&
        this.getPublisher().equals(book.getPublisher()) &&
        this.getBinging() == book.getBinging();
  }

  @Override
  public int hashCode () {
    return hash(this.getId(), this.getTitle(), this.getAuthors(), this.getPublisher(), this.getYear(), this.getPages(), this.getPrice(), this.getBinging());
  }
}
