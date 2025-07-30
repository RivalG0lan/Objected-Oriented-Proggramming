public class ArrayEx1 {
    public static void main(String[] args) {
        // 1. array int bernama score dengan 9 elemen
        int[] score = new int[9];

        // 2. array byte bernama values dengan semua elemen = 1
        byte[] values = new byte[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = 1;
        }

        // nampilin isi array values
        System.out.print("Isi array values: ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println(); // baris baru

        // 3. ngeaktifkan dan perbaiki 2 baris yang sebelumnya dikomentari (misalnya):
        score[0] = 90;
        score[1] = 85;

        System.out.println("Nilai score[0]: " + score[0]);
        System.out.println("Nilai score[1]: " + score[1]);
    }
}
