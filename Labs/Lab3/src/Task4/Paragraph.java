package Task4;

import java.util.Arrays;

public class Paragraph {
  private Word[] words;
  Paragraph(Word[] words) {
    assert words != null : "words are required";
    this.words = words;
  }
  public Word[] getWords() {
    return this.words;
  }
  public void setWords(Word[] words) {
    this.words = words;
  }
  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (!(object instanceof Paragraph)) return false;
    Paragraph paragraph = (Paragraph) object;
    return Arrays.equals(this.getWords(), paragraph.getWords());
  }
  @Override
  public int hashCode() {
    return Arrays.hashCode(this.getWords());
  }
  @Override
  public String toString() {
    return "Paragraph {" +
        "\twords: " + Arrays.toString(this.words) +
        '}';
  }
  public static void main(String[] args) {
    Word hello = new Word("hello");
    Word world = new Word("world");
    Paragraph paragraph = new Paragraph(new Word[] { hello, world });
    System.out.println(paragraph);
  }
}
