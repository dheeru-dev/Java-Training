package 11June2025;
public class calculatorExample {
    public void demonstrate() {
        // With Integer
        calculator<Integer> intCalc = new calculator<>(5);
        double intSquare = intCalc.square();    // Returns 25.0
        boolean isIntPositive = intCalc.isPositive();  // Returns true

        // With Double
        calculator<Double> doubleCalc = new calculator<>(3.14);
        double doubleSquare = doubleCalc.square();  // Returns 9.8596
        boolean isDoublePositive = doubleCalc.isPositive();  // Returns true
    }
    public static void main(String[] args) {
        calculatorExample cal1 = new calculatorExample();
        cal1.demonstrate();
    }
}