import java.util.Scanner;

public class Input03 {
    public static void methodI03() {
        Scanner scanner = new Scanner(System.in); // bikin scanner atau pemindainya

        try {
            System.out.println("Masukkan tiga bilangan bulat, dipisah dengan spasi:");

            // baca-in 3 bilangan
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int jumlah = a + b + c;

            System.out.println("Jumlah ketiga bilangan: " + jumlah);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        } finally {
            scanner.close(); // nutup scanner/pemindai
        }
    }
}
