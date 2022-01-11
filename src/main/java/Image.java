public class Image implements Element, Picture {

    String url;

    public Image(String imageName) {
        this.url = imageName;
    }

    @Override
    public void print() {
        System.out.println("Image: " + url);
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

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    @Override
    public PictureContent content() {
        return null;
    }
}
