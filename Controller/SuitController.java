package Controller;

import Model.Suit;
import Model.SuitDatabase;
import Model.SuitValidator;

public class SuitController {
    public static String checkSuitGUI(String suitId) {
        Suit suit = SuitDatabase.findSuitById(suitId);

        if (suit == null) {
            return "Not Found This Suit!"; // Not found suit
        }

        
        if (!SuitValidator.isValidSuit(suit)) {
            return "This suit doesn't need repair or isn't eligible for repair.";
        }

        // Correct Durability
        return "This Suit is ready to use! Durability: " + suit.getDurability();
    }

    public static String repairSuit(String suitId) {
        Suit suit = SuitDatabase.findSuitById(suitId);

        if (suit == null) {
            return "Suit not found!";
        }

        
        suit.repair();

        
        SuitDatabase.updateSuit(suit);

        return "The suit has been repaired! New durability: " + suit.getDurability();
    }
}


