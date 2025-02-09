package view;

import Model.Suit;

public class SuitRepairView {
    public void displayRepairOption(Suit suit) {
        System.out.println("This SUit needs repairs");
        System.out.println("Enter 1 for fix Or Other to exit");
    }

    public void displayRepairedSuit(Suit suit) {
        System.out.println("The Suit has been repaired! New durability!: " + suit.getDurability());
    }
}

