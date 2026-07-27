public class Driver {
    public static void main(String[] args) {
        // Create an array of cards with at least one duplicate
        Card[] cards = new Card[]{
            new Card("Ace", "Spades"),
            new Card("King", "Hearts"),
            new Card("Queen", "Diamonds"),
            new Card("Ace", "Spades"),    // duplicate
            new Card("Jack", "Clubs")
        };
        
        // Check for duplicates
        for (int i = 0; i < cards.length; i++) {
            // Check if this card equals any earlier card
            for (int j = 0; j < i; j++) {
                if (cards[i].equals(cards[j])) {
                    System.out.println("Duplicate found: " + cards[i]);
                    break;
                }
            }
        }
    }
}
