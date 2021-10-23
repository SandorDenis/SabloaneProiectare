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
}
