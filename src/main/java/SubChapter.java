import java.util.ArrayList;
import java.util.List;

public class SubChapter {

    String name;
    public List<Element> elements = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String s) {
        Element paragraph = new Paragraph(s);
        elements.add(paragraph);
    }

    public void createNewImage(String s) {
        Element image = new Image(s);
        elements.add(image);
    }

    public void createNewTable(String s) {
        Element table = new Table(s);
        elements.add(table);
    }

    public void print() {
        System.out.println("Subchapter: " + name);
        for (Element el : elements) {
            if (el instanceof Paragraph)
                System.out.println("Paragraph: " + el);
            if (el instanceof Image)
                System.out.println("Image with name: " + el);
            if (el instanceof Table)
                System.out.println("Table with Title: " + el);
        }
    }
}
