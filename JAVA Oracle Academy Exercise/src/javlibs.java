import javax.swing.JOptionPane;


public class javlibs {
    public static void javlibsederhana() {
        // mintak input si user
        String name = JOptionPane.showInputDialog("Masukkan nama kamu:");
        String ageStr = JOptionPane.showInputDialog("Masukkan umur kamu:");
        int age = Integer.parseInt(ageStr); // konversi ke integer

        String color = JOptionPane.showInputDialog("Masukkan warna favorit:");
        String hobby = JOptionPane.showInputDialog("Apa hobi kamu?");
        String food = JOptionPane.showInputDialog("Masakan favorit kamu:");
        String dream = JOptionPane.showInputDialog("Apa impian terbesar kamu?");
        String adjective = JOptionPane.showInputDialog("Masukkan kata sifat (contoh: ceria, cepat, kuat):");

        // cerita yang dihasilkan
        String story = "Pada suatu hari, ada seorang bernama " + name + " yang berumur " + age + " tahun.\n" +
                       name + " sangat menyukai warna " + color + " dan punya hobi " + hobby + ".\n" +
                       "Setiap sore, " + name + " menikmati masakan favoritnya, yaitu " + food + ".\n" +
                       "Dengan semangat yang " + adjective + ", " + name + " terus mengejar impiannya menjadi " + dream + ".\n" +
                       "Cerita ini akan dikenang sepanjang masa!";

        // nampilkan hasil cerita
        JOptionPane.showMessageDialog(null, story, "Cerita Kamu", JOptionPane.INFORMATION_MESSAGE);
    }
}
