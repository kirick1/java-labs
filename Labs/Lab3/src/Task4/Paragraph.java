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
    return words;
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
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;
    Paragraph paragraph = (Paragraph) object;
    return Objects.equals(this.words, paragraph.words);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.words);
  }

  @Override
  public String toString() {
    return this.getWords().toString();
  }
}
