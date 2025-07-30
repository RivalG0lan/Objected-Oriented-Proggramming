public class Tip01 {
    public static void TagihanPlusPajak() {
        double[] bills = {10, 12, 9, 8, 7, 15, 11, 30};
        double taxAndTip = 1.2;

        for (int i = 0; i < bills.length; i++) {
            double total = bills[i] * taxAndTip;
            System.out.println("person" + (i + 1) + ": $" + total);
        }
    }
}
