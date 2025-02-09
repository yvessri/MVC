package Model;

public class Suit {
    private String id;
    private String type;
    private int durability;

    public Suit(String id, String type, int durability) {
        this.id = id;
        this.type = type;
        this.durability = durability;
    }

    public String getId() { return id; }
    public String getType() { return type; }
    public int getDurability() { return durability; }
    
    public void repair() {
        this.durability = Math.min(this.durability + 25, 100);
    }

    public void setDurability(int newDurability) {
        this.durability = Math.min(newDurability, 100);
    }
}

