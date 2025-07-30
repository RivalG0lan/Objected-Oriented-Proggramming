import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Input02 {
    public static void runKan() {
        // bikin logo/ikon sendiri tergantung alamat direktori logo itu
        ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Documents\\Pemrograman Berorientasi Objek\\Praktikum PBO\\Latihan_PDF\\src\\yukiko looks happy.jpg"); // Kosongkan atau isi dengan path gambar

        // ambil input dengan teks default, judul pesan, dan ikon custom
        String input = (String) JOptionPane.showInputDialog(
                null,
                "Masukkan nama Anda:",         // Pesan
                "User FOrm",           // Judul pesan
                JOptionPane.QUESTION_MESSAGE,  // Jenis ikon bawaan (atau gunakan PLAIN_MESSAGE, ERROR_MESSAGE, dll.)
                icon,                          // Ikon custom (null jika tidak pakai)
                null,                          // Pilihan yang tersedia (null = input bebas)
                "Bryannn.."                  // Nilai default yang muncul di field input
        );

        // menampilkan input yang dimasukkan
        System.out.println("Nama Anda: " + input);

        // ubahkan menjadi huruf besar (manipulasi)
        String namaUpper = input.toUpperCase();
        System.out.println("Nama dalam huruf besar: " + namaUpper);

        // ngambil input angka
        String angkaStr = JOptionPane.showInputDialog(null, "Masukkan angka favorit Anda:", "Angka", JOptionPane.INFORMATION_MESSAGE);
        int angka = Integer.parseInt(angkaStr); // diuraikan ke int
        System.out.println("Angka + 1 = " + (angka + 1));
    }
}
