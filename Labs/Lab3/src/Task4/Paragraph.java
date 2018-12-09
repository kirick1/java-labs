package Task4;

import сommon.EntityList;

import java.util.Arrays;
import java.util.Objects;

public class Paragraph {

  private EntityList<Word> words;

  public Paragraph(EntityList<Word> words) {
    assert words != null : "words are required";
    this.words = words;
  }

  public EntityList<Word> getWords() {
    return this.words;
  }

  public void setWords(EntityList<Word> words) {
    assert words != null : "words are required";
    this.words = words;
  }

  public int getLength() {
    int result = 0;
    for (Word word : this.getWords().getElements()) result += word.getLength();
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Paragraph paragraph = (Paragraph) o;
    return Objects.equals(words, paragraph.words);
  }

  @Override
  public int hashCode() {
    return Objects.hash(words);
  }

  @Override
  public String toString() {
    return  "Paragraph {" +
            "\twords: " + this.words.toString() + '\n' +
            "}";
  }


}
