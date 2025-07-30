class Chickens02 {
    public static void ayam2() {
        // data telur yang dikumpulkan dari berita tadi
        int mondayEggs = 100;
        int tuesdayEggs = 121;
        int wednesdayEggs = 117;

        // itung rata-rata harian
        double dailyAverage = (mondayEggs + tuesdayEggs + wednesdayEggs) / 3.0;

        // itung estimasi jumlah telur selama 30 hari
        double monthlyAverage = dailyAverage * 30;

        // iitung total keuntungan dengan $0.18 per telur
        double monthlyProfit = monthlyAverage * 0.18;

        // cetak hasil
        System.out.println("Daily Average: " + dailyAverage);
        System.out.println("Monthly Average: " + monthlyAverage);
        System.out.println("Profit: $" + monthlyProfit);
    }
}
