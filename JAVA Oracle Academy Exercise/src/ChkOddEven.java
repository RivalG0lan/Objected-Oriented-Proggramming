import java.util.Scanner;

public class ChkOddEven {
    public static void CekGanjilGenapModulus() {
        // bikin objek Scanner untuk input dari si user
        Scanner scanner = new Scanner(System.in);

        // mintak user masukin angka antara 1 dan 10
        System.out.print("Masukkan nomor: ");
        int number = scanner.nextInt();

        // ngecek apakah angka ganjil atau genap menggunakan if
        if (number % 2 == 0) {
            System.out.println("Angka tersebut bilangan genap " + number);
        } else {
            System.out.println("Angka tersebut bilangan ganjil " + number);
        }

        // nutup scanner
        scanner.close();
    }
}
