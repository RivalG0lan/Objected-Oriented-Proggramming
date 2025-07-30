class Calculator3 {
    double tax = 0.05;
    double tip = 0.15;

    public void findTotal(double originalPrice, String name) {
        double total = originalPrice * (1 + tax + tip);
        System.out.println(name + ": $" + total);
    }
}

public class CalculatorTest3 {
    public static void main(String[] args) {
        Calculator3 calc = new Calculator3();

        calc.findTotal(10, "Person 1");
        calc.findTotal(12, "Person 2");
        calc.findTotal(9, "Person 3");
        calc.findTotal(8, "Person 4");
        calc.findTotal(7, "Person 5");
        calc.findTotal(15, "Alex (Person 6)");
        calc.findTotal(11, "Person 7");
        calc.findTotal(30, "Person 8");
    }
}
