class Latihan2_JFo_2_3_Coin {
    public double diameter;
    public double weight;
    public double value;

    // sifat sebuah konstruktor ya wajib nama harus sama dengan class
    public Latihan2_JFo_2_3_Coin(double diameter, double weight, double value) {
        this.diameter = diameter;
        this.weight = weight;
        this.value = value;
    }

    public boolean isValid() {
        return diameter > 0 && weight > 0 && value > 0;
    }

    public void identify() {
        System.out.println("Koin dengan diameter " + diameter + " mm, berat " + weight + " gram, bernilai $" + value);
    }
}
