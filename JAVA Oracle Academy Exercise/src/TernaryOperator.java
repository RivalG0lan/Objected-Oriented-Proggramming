public class TernaryOperator {
    public static void TerOP() {
        int rating = 5;
        double price = 12.0;

        String message = (price >= 12.0 && rating == 5)
                         ? "I'm interested in watching the movie."
                         : "I am not interested in watching the movie.";

        System.out.println(message);
    }
}
