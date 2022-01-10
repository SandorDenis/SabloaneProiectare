import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    private String title;
    static List<Element> elements = new ArrayList<>();

    public Section() {
    }

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        for(Element element: elements) {
            if (element instanceof Section)
                System.out.println("Section: " + title);
            if (element instanceof Paragraph)
                element.print();
        }
    }

    @Override
    public void add(Element element){
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
