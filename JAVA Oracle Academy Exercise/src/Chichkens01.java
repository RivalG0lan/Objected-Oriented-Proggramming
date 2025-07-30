 class Chickens01 {
    public static void ayam() {
        // skenario Pertama
        int eggsPerChicken = 5;
        int chickenCount = 3;

        int mondayEggs = chickenCount * eggsPerChicken;

        chickenCount += 1; // selasa pagi, nambah tuh 1 ayam
        int tuesdayEggs = chickenCount * eggsPerChicken;

        chickenCount /= 2; // rabu pagi, setengah ayam dimamam
        int wednesdayEggs = chickenCount * eggsPerChicken;

        int totalEggs = mondayEggs + tuesdayEggs + wednesdayEggs;
        System.out.println(totalEggs + " Skenario Pertama"); // output nya : 45

        // Skenario Kedua
        eggsPerChicken = 4;
        chickenCount = 8;

        mondayEggs = chickenCount * eggsPerChicken;

        chickenCount += 1; // selasa pagi, nambah lagi 1 ayam
        tuesdayEggs = chickenCount * eggsPerChicken;

        chickenCount /= 2; // rabu pagi, setengah ayam dimangsa
        wednesdayEggs = chickenCount * eggsPerChicken;

        totalEggs = mondayEggs + tuesdayEggs + wednesdayEggs;
        System.out.println(totalEggs + " Skenario Kedua"); // output: 84
    }
}
