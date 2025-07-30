public class ArrayEx2 {
    public static void main(String[] args) {
        // Inisialisasi array string dengan nama browser
        String[] browsers = {"Chrome", "Firefox", "Edge", "Safari", "Opera"};

        // Tampilkan semua browser menggunakan loop for-each
        System.out.println("Daftar browser yang tersedia:");
        for (String browser : browsers) {
            System.out.println("- " + browser);
        }
    }
}
