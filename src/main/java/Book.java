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
            elements.add(element);
    }

    public void print() {
        System.out.print("Book: "  + name + '\n' +
                "Authors: " + '\n');
        authors.forEach(Author::print);
        for(Element element: elements)
            element.print();
    }

}
