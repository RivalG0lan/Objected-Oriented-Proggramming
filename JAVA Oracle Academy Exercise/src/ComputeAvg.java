import java.util.Scanner;

public class ComputeAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. bikinin array untuk nyimpan 5 skor
        int[] scores = new int[5];

        // 2. masukin 5 skor dari si usernya
        System.out.println("Masukkan 5 skor (maksimum 100 poin per skor):");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Skor ke-" + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        // 3. ngitung total skor
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }

        // 4. itung rata-rata
        double average = (double) total / scores.length;

        // 5. nampilkan hasil
        System.out.println("Rata-rata skor: " + average);

        scanner.close();
    }
}
