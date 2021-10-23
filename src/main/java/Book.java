import java.util.ArrayList;
import java.util.List;

public class Book {

    private String name;
    private List<Author> authors = new ArrayList<>();
    private TableOfContents tableOfContents;
    private List<Chapter> chapters = new ArrayList<>();

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public int createChapter(String s) {
        Chapter chapter = new Chapter(s);
        chapters.add(chapter);
        return chapters.indexOf(chapter);
    }

    public Chapter getChapter(int indexChapterOne) {
        return this.chapters.get(indexChapterOne);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    public void print() {
        System.out.print("Book: "  + name);
    }
}
