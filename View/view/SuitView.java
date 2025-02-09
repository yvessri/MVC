package view;

import Model.Suit;

public class SuitView {
    public void displaySuitInfo(Suit suit) {
        System.out.println("Code of Suit: " + suit.getId());
        System.out.println("Type of Suit: " + suit.getType());
        System.out.println("Durability: " + suit.getDurability());
    }

    public void displayError(String message) {
        System.out.println("Defect: " + message);
    }
}

