class NumericFunctions<T extends Number> {

    private T num;

    public NumericFunctions(T num) {
        this.num = num;
    }

    public double reciprocal() {
        return 1.0 / num.doubleValue();
    }

    public double fractionalPart() {
        double value = num.doubleValue();
        return value - Math.floor(value);
    }

    public boolean absEqual(NumericFunctions<?> other) {
        return Math.abs(num.doubleValue()) ==
               Math.abs(other.num.doubleValue());
    }
}

public class Main {
    public static void main(String[] args) {

        NumericFunctions<Double> n1 = new NumericFunctions<>(9.76);
        NumericFunctions<Float> n2 = new NumericFunctions<>(-9.76f);

        System.out.println("Reciprocal: " + n1.reciprocal());
        System.out.println("Fractional Part: " + n1.fractionalPart());
        System.out.println("Absolute values equal? " + n1.absEqual(n2));
    }
}