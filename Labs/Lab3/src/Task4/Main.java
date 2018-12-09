package Task4;

import сommon.EntityList;

public class Main {
    public static void main(String[] args) {
        Word hello = new Word("hello");
        Word world = new Word("world!");
        EntityList<Word> words = new EntityList<Word>();
        words.add(hello);
        words.add(world);
        Paragraph paragraph = new Paragraph(words);
        System.out.println(paragraph);
    }
}
