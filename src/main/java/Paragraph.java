public class Paragraph implements Element{

    String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public void print() {
        System.out.print(text);
    }

    @Override
    public void add(Element element) {
        section.add(element);
    }

    @Override
    public void remove(Element element) {
        section.remove(element);
    }

    @Override
    public Element get(int position) {
        return Section.elements.get(position);
    }


}
