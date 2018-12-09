package Task1;

import сommon.EntityList;

public class ConcreteBookBuilder implements BookBuilder {
    private int id;

    private String title;

    private EntityList<Author> authors;

    private Publisher publisher;

    private int year;

    private int pages;

    private double price;

    private Binding binging;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBinding(Binding binding) {
        this.binging = binding;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setAuthors(EntityList<Author> authors) {
        this.authors = authors;
    }

    public Book getBook() {
        return new Book(id, title, authors, publisher, year, pages, price, binging);
    }

}
