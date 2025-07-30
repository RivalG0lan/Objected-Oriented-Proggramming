public class ScopeTest {
    public static void cetakMatriks() {

        // baris 1: 64 32 16 8 4 2 1
        int x = 64;
        while (x >= 1) {
            System.out.print(x + "   ");
            x /= 2;
        }
        System.out.println(); // baris baru

        // baros 2: 0 1 2 3 4 5
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + "   ");
        }
        System.out.println();

        // baris 3: 5 4 3 2 1 0
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + "   ");
        }
        System.out.println();

        // baris 4: 2 4 8 16 32 64
        int y = 2;
        while (y <= 64) {
            System.out.print(y + "   ");
            y *= 2;
        }
    }
}
