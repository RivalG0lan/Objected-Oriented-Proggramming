class CheckingAccount {
    // variabel
    public String name;
    public double balance;

    // konstruktor default
    public CheckingAccount() {
        name = "";
        balance = 0.0;
    }

    // konstruktor dengan parameter
    public CheckingAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // metode withdraw
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Peringatan: Jumlah penarikan tidak boleh negatif.");
        } else if (amount > balance) {
            System.out.println("Peringatan: Saldo tidak cukup untuk penarikan.");
        } else {
            balance -= amount;
            System.out.println("Penarikan berhasil. Saldo baru: Rp" + balance);
        }
    }
}

class SavingsBond {
    private int termInMonths;      // lama termin (1–60)
    private double interestRate;   // suku bunga per bulan (%)
    private double principal;      // jumlah uang awal

    // Konstruktor
    public SavingsBond(int termInMonths, double principal) {
        if (termInMonths < 1 || termInMonths > 60) {
            throw new IllegalArgumentException("Term harus antara 1 hingga 60 bulan.");
        }
        this.termInMonths = termInMonths;
        this.principal = principal;
        this.interestRate = determineInterestRate(termInMonths);
    }

    // nentuin bunga berdasarkan term
    private double determineInterestRate(int term) {
        if (term < 12) {
            return 0.5;
        } else if (term < 24) {
            return 1.0;
        } else if (term < 36) {
            return 1.5;
        } else if (term < 48) {
            return 2.0;
        } else {
            return 2.5;
        }
    }

    // ngitung total nilai setelah jatuh tempo
    public void displayFinalValue() {
        System.out.println("===== Info Obligasi =====");
        System.out.println("Term: " + termInMonths + " bulan");
        System.out.println("Bunga per bulan: " + interestRate + "%");
        System.out.println("Investasi awal: Rp" + principal);

        // itung akumulasi bunga
        double total = principal;
        for (int i = 0; i < termInMonths; i++) {
            total += total * (interestRate / 100);
        }

        System.out.printf("Nilai akhir setelah %d bulan: Rp%.2f\n", termInMonths, total);
    }
}


public class AccountTest {
    public static void main(String[] args) {
        // bikinin objek
        CheckingAccount myAccount = new CheckingAccount();

        // set data
        myAccount.name = "Rivaldo";
        myAccount.balance = 1500000.0;

        // tampilkan info awal
        System.out.println("Nama Akun: " + myAccount.name);
        System.out.println("Saldo Awal: Rp" + myAccount.balance);

        // uji metode withdraw
        System.out.println("\n--- Uji Penarikan ---");

        myAccount.withdraw(500000);      // penarikan valid
        myAccount.withdraw(2000000);     // saldo tidak cukup
        myAccount.withdraw(-100000);     // jumlah negatif
        
        // ngujikan saving bodnya
        System.out.println("\n--- Uji Obligasi Tabungan ---");

        SavingsBond bond1 = new SavingsBond(18, 1000000);  // Term 18 bulan, Rp1.000.000
        bond1.displayFinalValue();

        SavingsBond bond2 = new SavingsBond(45, 2000000);  // Term 45 bulan, Rp2.000.000
        bond2.displayFinalValue();

    }
}

