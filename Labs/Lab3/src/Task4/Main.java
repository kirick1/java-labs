package Task4;

import сommon.EntityList;

public class Main {
    public static void main(String[] args) {
        Word hello = new Word("hello");
        Word world = new Word("world");
        Paragraph paragraph = new Paragraph(new EntityList<>(){{add(hello); add(world);}});
        System.out.println(paragraph);
    }
}
