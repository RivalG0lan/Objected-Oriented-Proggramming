public class Countdown {
    public static void itung() {
        // bagian 1: itung dari 0 sampai 5
        System.out.println("Hitung dari 0 sampai 5:");
        for (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println(); // Baris kosong untuk pemisah

        // bagian 2: ngitung semua angka genap dari 0 sampai 20
        System.out.println("Angka genap dari 0 sampai 20:");
        for (int i = 0; i <= 20; i += 2) {
            System.out.println("i = " + i);
        }
    }
}
