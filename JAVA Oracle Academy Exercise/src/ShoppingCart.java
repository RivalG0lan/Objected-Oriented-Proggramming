public class ShoppingCart {
    public static void ShopCart() {
        // data item-nya
        String itemName = "Buku Tulis";
        double itemPrice = 15000.0;
        int quantity = 2;
        boolean outOfStock = false; // nyatakan dan mulai variabel boolean

        // nentuin apakah barang ada atau gak
        if (outOfStock) {
            System.out.println("Maaf, " + itemName + " sedang tidak tersedia.");
        } else {
            // nentuin format kata (jamak atau gk jamak)
            String message;
            if (quantity > 1) {
                message = "Anda membeli " + quantity + " " + itemName + ".";
            } else {
                message = "Anda membeli 1 " + itemName + ".";
            }

            // nampilin pesan dan total biaya
            double totalPrice = quantity * itemPrice;
            System.out.println(message);
            System.out.println("Total biaya: Rp" + totalPrice);
        }
    }
}
