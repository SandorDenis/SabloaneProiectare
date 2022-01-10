public class AlignCenter implements AlignStrategy{

    public AlignCenter() {
    }

    @Override
        public String render(String string, Context context) {
        return String.format("%25s", string);
    }
}
