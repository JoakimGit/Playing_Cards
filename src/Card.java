import java.util.HashMap;
import java.util.Map;

public class Card implements Comparable<Card> {

    private int number;
    private String picture;
    private String color;

    public Card(String color, int number) {
        this.color = color;
        this.number = number;
        if (number == 11) {
            this.picture = "Jack";
        }
        if (number == 12) {
            this.picture = "Queen";
        }
        if (number == 13) {
            this.picture = "King";
        }
    }

    public Card() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        if (number == 1) {
            return "Ace of " + color;
        }
        else if (number < 11) {
            return number + " of " + color;
        }
        return picture + " of " + color;
    }

    @Override
    public int compareTo(Card other) {
        if (number != other.getNumber()) {
            return number - other.getNumber();
        }
        Map<String, Integer> hierarchy = new HashMap<>();
        hierarchy.put("Spades", 4);
        hierarchy.put("Hearts", 3);
        hierarchy.put("Diamonds", 2);
        hierarchy.put("Clubs", 1);
        return hierarchy.get(color) - hierarchy.get(other.getColor());
    }
}
