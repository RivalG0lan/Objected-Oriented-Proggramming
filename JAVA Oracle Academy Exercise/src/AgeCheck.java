import java.util.Scanner;

public class AgeCheck {
    public static void CekKategoriUsia() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan usia Anda: ");
        int age = input.nextInt();

        // nambahin if else
        if (age >= 18) {
            System.out.println("Anda sudah dewasa.");
        } else {
            System.out.println("Anda belum dewasa.");
        }

        input.close();
    }
}
