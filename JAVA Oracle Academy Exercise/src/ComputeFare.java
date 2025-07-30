import java.util.Scanner;

public class ComputeFare {
    public static void ComFar() {
        Scanner input = new Scanner(System.in);
        int usia;
        int harga;

        System.out.print("Masukkan usia Anda: ");
        usia = input.nextInt();

        if (usia < 11) {
            harga = 3;
        } else if (usia > 11 && usia < 65) {
            harga = 5;
        } else {
            harga = 3;
        }

        System.out.println("Harga tiket: $" + harga);
        input.close(); // selalu ingat buat tutup Scanner
    }
}
