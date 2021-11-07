public class TableOfContents implements Element{

    String contents;

    public TableOfContents() {
    }

    public TableOfContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Table of contents: " + contents;
    }

    @Override
    public void print() {
        System.out.println("Table of contents: " + contents);
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
