import java.util.Scanner;

public class AgeValidity {
    public static void CekValidUmur() {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan usia
        System.out.print("Masukkan usia Anda: ");
        int age = scanner.nextInt();

        // Menyatakan dan menginisialisasi variabel boolean
        boolean drivingUnderAge = false;

        // Mengecek apakah usia < 18 atau = 18
        if (age <= 18) {
            drivingUnderAge = true;
        }

        // Mencetak hasil
        System.out.println("Driving under age: " + drivingUnderAge);

        // Menutup scanner
        scanner.close();
    }
}
