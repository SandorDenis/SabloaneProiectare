public class AlignRight implements AlignStrategy {

    public AlignRight() {
    }

    @Override
    public String render(String string, Context context) {
        return String.format("%50s", string);
    }
}
