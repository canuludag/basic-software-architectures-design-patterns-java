public class Manager implements Strategy {

    private Strategy mStrategy;

    public void setStrategy(Strategy strategy) {
        mStrategy = strategy;
    }

    @Override
    public void operation(int num1, int num2) {
        mStrategy.operation(num1, num2);
    }
}
