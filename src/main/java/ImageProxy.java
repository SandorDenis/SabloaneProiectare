public class ImageProxy implements Element, Picture{

    private static Image realImage;

    String url;
    Dimension dim;

    public ImageProxy(String url) {
        this.url = url;
    }

    Image loadImage(){
        if(realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public void print() {

    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int position) {
        return null;
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
