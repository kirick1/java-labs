package Task1;

public class Main {
    public static void main(String argv[]) {
        Director director = new Director();
        ConcreteBookBuilder bookBuilder = new ConcreteBookBuilder();
        director.constructGarryPotter(bookBuilder);
        Book book1 = bookBuilder.getBook();
        director.constructWarAndPeace(bookBuilder);
        Book book2 = bookBuilder.getBook();
        System.out.println("All books:");
        Books books = new Books(new Book[] { book1, book2});
        System.out.println(books);
    }
}
