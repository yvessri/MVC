package Model;

import java.util.*;

public class SuitDatabase {
    private static List<Suit> suits = new ArrayList<>();

    static {
        //OVER VALUE FROM REQUIREMENT
        suits.add(new Suit("100001", "Powerful Suit", 80));
        suits.add(new Suit("100002", "Powerful Suit", 95));
        suits.add(new Suit("100003", "Powerful Suit", 75));
        suits.add(new Suit("100004", "Powerful Suit", 70));
        suits.add(new Suit("100005", "Powerful Suit", 85));
        suits.add(new Suit("100006", "Powerful Suit", 90));
        suits.add(new Suit("100007", "Powerful Suit", 78));
        suits.add(new Suit("100008", "Powerful Suit", 92));
        suits.add(new Suit("100009", "Powerful Suit", 88));
        suits.add(new Suit("100010", "Powerful Suit", 79));

        suits.add(new Suit("100011", "Stealth Suit", 50));
        suits.add(new Suit("100012", "Stealth Suit", 55));
        suits.add(new Suit("100013", "Stealth Suit", 65));
        suits.add(new Suit("100014", "Stealth Suit", 70));
        suits.add(new Suit("100015", "Stealth Suit", 60));
        suits.add(new Suit("100016", "Stealth Suit", 58));
        suits.add(new Suit("100017", "Stealth Suit", 53));
        suits.add(new Suit("100018", "Stealth Suit", 75));
        suits.add(new Suit("100019", "Stealth Suit", 62));
        suits.add(new Suit("100020", "Stealth Suit", 80));

        suits.add(new Suit("100021", "Concealment Suit", 40));
        suits.add(new Suit("100022", "Concealment Suit", 45));
        suits.add(new Suit("100023", "Concealment Suit", 60));
        suits.add(new Suit("100024", "Concealment Suit", 55));
        suits.add(new Suit("100025", "Concealment Suit", 48));
        suits.add(new Suit("100026", "Concealment Suit", 72));
        suits.add(new Suit("100027", "Concealment Suit", 50));
        suits.add(new Suit("100028", "Concealment Suit", 41));
        suits.add(new Suit("100029", "Concealment Suit", 46));
        suits.add(new Suit("100030", "Concealment Suit", 52));

        suits.add(new Suit("100031", "Powerful Suit", 91));
        suits.add(new Suit("100032", "Powerful Suit", 86));
        suits.add(new Suit("100033", "Powerful Suit", 73));
        suits.add(new Suit("100034", "Powerful Suit", 88));
        suits.add(new Suit("100035", "Powerful Suit", 77));
        suits.add(new Suit("100036", "Powerful Suit", 94));

        suits.add(new Suit("100037", "Stealth Suit", 52));
        suits.add(new Suit("100038", "Stealth Suit", 69));
        suits.add(new Suit("100039", "Stealth Suit", 54));
        suits.add(new Suit("100040", "Stealth Suit", 71));

        suits.add(new Suit("100041", "Concealment Suit", 43));
        suits.add(new Suit("100042", "Concealment Suit", 49));
        suits.add(new Suit("100043", "Concealment Suit", 39));
        suits.add(new Suit("100044", "Concealment Suit", 47));
        suits.add(new Suit("100045", "Concealment Suit", 51));
        suits.add(new Suit("100046", "Concealment Suit", 53));
        suits.add(new Suit("100047", "Concealment Suit", 58));
        suits.add(new Suit("100048", "Concealment Suit", 61));
        suits.add(new Suit("100049", "Concealment Suit", 44));
        suits.add(new Suit("100050", "Concealment Suit", 59));

        //LESS VALUE FROM REQUIREMENT
        // Powerful Suit
        suits.add(new Suit("100051", "Powerful Suit", 60));
        suits.add(new Suit("100052", "Powerful Suit", 65));
        suits.add(new Suit("100053", "Powerful Suit", 50));
        suits.add(new Suit("100054", "Powerful Suit", 68));
        suits.add(new Suit("100055", "Powerful Suit", 62));
        suits.add(new Suit("100056", "Powerful Suit", 55));
        suits.add(new Suit("100057", "Powerful Suit", 67));
        suits.add(new Suit("100058", "Powerful Suit", 69));
        suits.add(new Suit("100059", "Powerful Suit", 64));
        suits.add(new Suit("100060", "Powerful Suit", 66));

        //Stealth Suit 
        suits.add(new Suit("100061", "Stealth Suit", 48));
        suits.add(new Suit("100062", "Stealth Suit", 44));
        suits.add(new Suit("100063", "Stealth Suit", 30));
        suits.add(new Suit("100064", "Stealth Suit", 35));
        suits.add(new Suit("100065", "Stealth Suit", 42));
        suits.add(new Suit("100066", "Stealth Suit", 47));
        suits.add(new Suit("100067", "Stealth Suit", 49));
        suits.add(new Suit("100068", "Stealth Suit", 45));
        suits.add(new Suit("100069", "Stealth Suit", 39));
        suits.add(new Suit("100070", "Stealth Suit", 38));

        //Concealment Suit
        suits.add(new Suit("100071", "Concealment Suit", 53));
        suits.add(new Suit("100073", "Concealment Suit", 60));
        suits.add(new Suit("100077", "Concealment Suit", 50));
        suits.add(new Suit("100083", "Concealment Suit", 55));
        suits.add(new Suit("100087", "Concealment Suit", 49));
        suits.add(new Suit("100093", "Concealment Suit", 58));
        suits.add(new Suit("100097", "Concealment Suit", 47));
        suits.add(new Suit("100103", "Concealment Suit", 42));
        suits.add(new Suit("100107", "Concealment Suit", 45));
        suits.add(new Suit("100113", "Concealment Suit", 40));
    }

    public static void updateSuit(Suit updatedSuit) {
        for (int i = 0; i < suits.size(); i++) {
            if (suits.get(i).getId().equals(updatedSuit.getId())) {
                suits.set(i, updatedSuit);  // อัปเดตชุดในฐานข้อมูล
                break;
            }
        }
    }
    public static Suit findSuitById(String id) {
        for (Suit suit : suits) {
            if (suit.getId().equals(id)) return suit;
        }
        return null;
    }
}


