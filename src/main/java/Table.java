public class Table implements Element{

    String title;

    public Table(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Title: "+title);
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
    public void accept(Visitor visitor) {

    }

    @Override
    public Element get(int position) {
        return Section.elements.get(position);
    }


}
