package Task1;

import сommon.EntityList;

public interface BookBuilder {
  void setId(int id);
  void setTitle(String title);
  void setYear(int year);
  void setPages(int pages);
  void setPrice(double price);
  void setBinding(Binding binding);
  void setPublisher(Publisher publisher);
  void setAuthors(EntityList<Author> authors);
}
