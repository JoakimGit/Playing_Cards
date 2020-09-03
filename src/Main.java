public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck();

        System.out.println(deck);
        deck.randomize();
        System.out.println(deck);
        deck.cardsRemaining();
        deck.draw();
        System.out.println(deck);
        deck.cardsRemaining();
    }
}
