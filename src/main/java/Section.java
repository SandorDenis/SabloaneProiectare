import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    String title;
    static List<Element> elements = new ArrayList<>();

    public Section() {
    }

    public Section(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public void print() {
        for(Element element: elements) {
            if(element instanceof Section)
                System.out.println(element);
            if(element instanceof TableOfContents)
                System.out.println("Table of contents: " + element);
            if(element instanceof Paragraph)
                System.out.println("Paragraph: " + element);
            if(element instanceof Image)
                System.out.println("Image: " + element);
            if(element instanceof Table)
                System.out.println("Table: " + element);
        }
    }

    @Override
    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void remove(Element element) {
        elements.remove(element);
    }

    @Override
    public Element get(int position) {
        return elements.get(position);
    }


}
