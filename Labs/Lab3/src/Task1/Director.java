package Task1;

import сommon.EntityList;

import java.util.ArrayList;

public class Director {
    public void constructGarryPotter(BookBuilder builder) {
        builder.setAuthors(new EntityList<Author>(new ArrayList<>(){{
            add(new Author("Joanne", "Rowling"));
        }}));
        builder.setId(231231);
        builder.setBinding(Binding.FABRIC);
        builder.setPages(456);
        builder.setPrice(123);
        builder.setPublisher(new Publisher("publisher"));
        builder.setTitle("Garry Potter");
        builder.setYear(2012);
    }

    public void constructWarAndPeace(BookBuilder builder) {
        builder.setAuthors(new EntityList<Author>(new ArrayList<>(){{
            add(new Author("Leo", "Tolstoy"));
        }}));
        builder.setId(567567);
        builder.setBinding(Binding.CARDBOARD);
        builder.setPages(1045);
        builder.setPrice(423);
        builder.setPublisher(new Publisher("new publisher"));
        builder.setTitle("War and peace");
        builder.setYear(1834);
    }

}
