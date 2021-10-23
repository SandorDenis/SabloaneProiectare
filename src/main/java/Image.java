public class Image implements Element{

    String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public String toString() {
        return imageName;
    }

    @Override
    public void print() {
        System.out.print(imageName);
    }
}
