class Calculator4 {
    // Pajak dan tip
    double tax = 0.05;
    double tip = 0.15;

    // Metode yang menghitung dan mengembalikan total
    public double findTotal(double originalPrice) {
        return originalPrice * (1 + tax + tip);
    }
}

public class CalculatorTest4 {
    public static void main(String[] args) {
        Calculator4 calc = new Calculator4();

        // tarif awal buat orang2
        double[] prices = {10, 12, 9, 8, 7, 15, 11, 30};
        String[] names = {"Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Alex", "Person 7", "Person 8"};

        double totalTable = 0;
        double alexTotal = 0;
        double person8Total = 0;

        for (int i = 0; i < prices.length; i++) {
            double total = calc.findTotal(prices[i]);

            // simpan total si Alex dan Person 8 karena mereka ditraktir
            if (names[i].equals("Alex")) {
                alexTotal = total;
                continue; // Jangan tambahkan ke totalTable dulu
            } else if (names[i].equals("Person 8")) {
                person8Total = total;
                continue;
            }

            // Tambahkan yang lain ke totalTable
            System.out.println(names[i] + " harus membayar: $" + total);
            totalTable += total;
        }

        // bagikan total Alex dan Person 8 ke 6 orang lainnya
        double sharedTotal = (alexTotal + person8Total) / 6.0;

        // tambahin bagian traktiran ke total tiap orang
        System.out.println("\nMembagi biaya Alex dan Person 8 ($" + (alexTotal + person8Total) + ") ke 6 orang lainnya.");

        for (int i = 0; i < 6; i++) {
            double personTotal = calc.findTotal(prices[i]) + sharedTotal;
            System.out.println(names[i] + " membayar total setelah traktiran: $" + personTotal);
        }

        // itung total keseluruhan meja
        totalTable += alexTotal + person8Total;
        System.out.println("\nTotal keseluruhan meja (dengan pajak dan tip): $" + totalTable);
    }
}
