class Calculator2 {
    // bikin variabel nya
    double originalPrice;
    double tax = 0.05;  // pajak default nya disoal 5%
    double tip = 0.15;  // tip default 15%

    // method atau function yang bakalan di panggil
    public void findTotal() {
        double total = originalPrice * (1 + tax + tip);
        System.out.println("Total to pay: $" + total);
    }
}

public class CalculatorTest2 {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();

        // ngitung total untuk setiap orang
        calc.originalPrice = 10;
        calc.findTotal();

        calc.originalPrice = 12;
        calc.findTotal();

        calc.originalPrice = 9;
        calc.findTotal();

        calc.originalPrice = 8;
        calc.findTotal();

        calc.originalPrice = 7;
        calc.findTotal();

        calc.originalPrice = 15;
        calc.findTotal();

        calc.originalPrice = 11;
        calc.findTotal();

        calc.originalPrice = 30;
        calc.findTotal();
    }
}

