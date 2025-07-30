import javax.swing.JOptionPane;

public class Input01 {
    public static void jalankan() {
        // ngambilkan input sebagai string 
        String input = JOptionPane.showInputDialog("Masukkan angka:");

        // cetak hasil input ke konsol terminal output di bawah
        System.out.println("Input String: " + input);

        // menguraikan input menjadi int, lalu tambah 1 dan cetak
        int angka = Integer.parseInt(input);
        System.out.println("Input sebagai int + 1: " + (angka + 1));

        // bikin parsing dan deklarasi dalam SATU baris + tampilkan dalam kotak dialog
        JOptionPane.showMessageDialog(null, "Angka + 1: " + (Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka lain:")) + 1));
    }
}
