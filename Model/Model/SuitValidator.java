package Model;

public class SuitValidator {
    public static boolean isValidSuit(Suit suit) {
        if (suit == null) return false;

        switch (suit.getType()) {
            case "Powerful Suit":
                return suit.getDurability() < 70;  // Powerful Suit needs repair if durability < 70
            case "Stealth Suit":
                return suit.getDurability() < 50;  // Stealth Suit needs repair if durability < 50
            case "Concealment Suit":
                int lastDigit = suit.getDurability() % 10;
                return lastDigit == 3 || lastDigit == 7;  // Concealment Suit needs repair if durability ends with 3 or 7
            default:
                return false;
        }
    }
}


