import java.util.Scanner;

public class StringEquality {
    public static void CekEkspresiNama() {
        // bikin objek Scanner
        Scanner scanner = new Scanner(System.in);

        // mintak si user masukin nama
        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();

        // ngecek nama pakek .equals (bukan ==)
        if (name.equals("Moe")) {
            System.out.println("You are the king of rock and roll");
        } else {
            System.out.println("You are not the king");
        }

        // tutup scanner
        scanner.close();
    }
}
