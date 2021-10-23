import java.util.ArrayList;
import java.util.List;

public class Chapter {

    String name;
    List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String s) {
        SubChapter subChapter = new SubChapter(s);
        subChapters.add(subChapter);
        return subChapters.indexOf(subChapter);
    }

    public SubChapter getSubChapter(int indexSubChapterOneOne) {
        return subChapters.get(indexSubChapterOneOne);
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "name='" + name + '\'' +
                '}';
    }

    public void print(){
        System.out.print("Chapter: " + name);
    }
}
