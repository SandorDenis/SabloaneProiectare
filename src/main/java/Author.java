import java.util.ArrayList;
import java.util.List;

public class Author {

    String name;
    String surname;
    List<Book> bookList = new ArrayList<>();

    public Author() {
    }

    public Author(String name) {
        this.name = name;
    }

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Author: " + name;
    }

    public void print(){
        System.out.print("Author: " + name);
    }
}
