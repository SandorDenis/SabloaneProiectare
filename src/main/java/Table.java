public class Table implements Element{

    String title;

    public Table(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public void print() {
        System.out.print(title);
    }
}
