public class Card {

    private int number;
    private String picture;
    private String color;

    public Card(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public Card(String color, String picture) {
        this.color = color;
        this.picture = picture;
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
        else if (number > 1) {
            return number + " of " + color;
        }
        return picture + " of " + color;
    }

    /*@Override
    public boolean equals(Object obj) {
        if (picture + " of " + color == obj) {
            return true;
        }
        return false;
    }*/
}
