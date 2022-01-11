public class Paragraph implements Element{

    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + text);
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

    void setAlignStrategy(AlignStrategy alignStrategy){
        this.text = alignStrategy.render(text, new Context(alignStrategy));
    }

}
