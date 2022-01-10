public class TableOfContents implements Element{

    String contents;

    public TableOfContents() {
    }

    public TableOfContents(String contents) {
        this.contents = contents;
    }

    @Override
    public void print() {
        System.out.println("Table of contents: " + contents);
    }

    @Override
    public void add(Element element) {
        Section.elements.add(element);
    }

    @Override
    public void remove(Element element) {
        Section.elements.remove(element);
    }

    @Override
    public Element get(int position) {
        return Section.elements.get(position);
    }


}
