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
    public void print() {
        System.out.println("Section: " + title);
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
