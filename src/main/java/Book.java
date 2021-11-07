import java.util.ArrayList;
import java.util.List;

public class Book extends Section{

    private String name;
    private List<Author> authors = new ArrayList<>();

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void addContent(Element element) {
        if (element instanceof Section)
            elements.add(element);
        if (element instanceof TableOfContents)
            elements.add(element);
        if (element instanceof Paragraph)
            elements.add(element);
        if (element instanceof Image)
            elements.add(element);
        if (element instanceof Table)
            elements.add(element);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    public void print() {
        System.out.print("Book: "  + name + '\n' +
                "Authors: " + '\n');
        authors.forEach(System.out::println);
        super.print();
    }

}
