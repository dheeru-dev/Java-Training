public class calculator<N extends Number> {
    private N value;

    public calculator(N startValue) {
        this.value = startValue;
    }

    public double square() {
        return value.doubleValue() * value.doubleValue();
    }

    public boolean isPositive() {
        return value.doubleValue() > 0;
    }

    public N getValue() {
        return value;
    }
}