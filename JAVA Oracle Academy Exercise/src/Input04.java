import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input04 {
    public static void bacaData() {
        try {
            File file = new File("C:\\Users\\ASUS\\Documents\\Pemrograman Berorientasi Objek\\Praktikum PBO\\Latihan_PDF\\src\\isiDatafori04.txt");
            Scanner scanner = new Scanner(file);
            if (!file.exists()) {
                System.out.println("File tidak ditemukan!");
                return;
            }


            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // di cek-kan apakah baris mengandung "BlueBumper"
                if (line.contains("BlueBumper")) {
                    String[] parts = line.split(" "); // baris dipecah jadi array
                    int xPosition = Integer.parseInt(parts[1]);
                    int yPosition = Integer.parseInt(parts[2]);

                    System.out.println("Koordinat BlueBumper:");
                    System.out.println("xPosition: " + xPosition);
                    System.out.println("yPosition: " + yPosition);
                    break; // siap, keluar dari loop
                }
            }

            scanner.close(); // nutup scanner
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan saat membaca file: " + e.getMessage());
        }
    }
}
