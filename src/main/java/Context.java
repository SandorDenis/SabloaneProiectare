public class Context {
    private AlignStrategy strategy;

    public Context(AlignStrategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(String text){
        return strategy.render(text, this);
    }
}