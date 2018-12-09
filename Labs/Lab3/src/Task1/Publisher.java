package Task1;

import java.util.Objects;

public class Publisher {
  private String title;
  Publisher(String title) {
    assert title != null : "title is required!";
    this.title = title;
  }
  public String getTitle () {
    return this.title;
  }
  public void setTitle (String title) {
    assert title != null : "title is required!";
    this.title = title;
  }
  @Override
  public String toString () {
    return "{\n" +
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
}
