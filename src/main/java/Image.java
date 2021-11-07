public class Image implements Element{

    String url;

    public Image(String imageName) {
        this.url = imageName;
    }

    @Override
    public String toString() {
        return url;
    }

    @Override
    public void print() {
        System.out.print(url);
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
