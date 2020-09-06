import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {

    public void drawGame() {
        int round = 0, p1wins = 0, p2wins = 0;
        Player player1 = new Player("John");
        Player player2 = new Player("Mike");
        Deck deck = new Deck();
        deck.randomize();

        while (deck.cardsRemaining() > 1) {
            round++;
            Card p1draw = deck.draw();
            Card p2draw = deck.draw();
            System.out.println(player1.getName() + " drew: " + p1draw);
            System.out.println(player2.getName() + " drew: " + p2draw);
            if (p1draw.compareTo(p2draw) > 0) {
                player1.setScore(player1.getScore() + 1);
                System.out.println(player1.getName() + " wins round " + round);
                p1wins++;
            }
            else {
                player2.setScore(player2.getScore() + 1);
                System.out.println(player2.getName() + " wins round " + round);
                p2wins++;
            }
            System.out.println("Current score is: " + player1.getScore() + " point(s) for " + player1.getName()
                    + " and " + player2.getScore() + " point(s) for " + player2.getName() + "\n");
        }
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " is the final winner of the game with " + p1wins + " wins and " + p2wins + " losses!");
        }
        else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " is the final winner of the game with " + p2wins + " wins and " + p1wins + " losses!");
        }
        else System.out.println("The game ended in a tie!");
    }

    /*public void drawGame() {
        int round = 0, p1wins = 0, p2wins = 0;
        Player player1 = new Player("Alice");
        Player player2 = new Player("Victor");

        Map<String, Integer> cardsAndValues = new HashMap<>();
        Deck deck = new Deck();
        List<Card> cards = deck.getStack();
        Collections.sort(cards);
        for (int i = 0; i < 52; i++) {
            cardsAndValues.put(cards.get(i).getNumber() + " of " + cards.get(i).getColor(), i + 1);
        }
        deck.randomize();

        while (deck.cardsRemaining() > 1) {
            round ++;
            Card p1draw = deck.draw();
            Card p2draw = deck.draw();
            int p1value = cardsAndValues.get(p1draw.getNumber() + " of " + p1draw.getColor());
            int p2value = cardsAndValues.get(p2draw.getNumber() + " of " + p2draw.getColor());
            int diff = Math.abs(p1value - p2value);
            System.out.println(player1.getName() + " drew: " + p1draw + " (" + p1value + " points)");
            System.out.println(player2.getName() + " drew: " + p2draw + " (" + p2value + " points)");
            if (p1draw.compareTo(p2draw) > 0) {
                player1.setScore(player1.getScore() + diff);
                System.out.println(player1.getName() + " wins round " + round + " with a difference of " + diff + " points");
                p1wins++;
            }
            else {
                player2.setScore(player2.getScore() + diff);
                System.out.println(player2.getName() + " wins round " + round + " with a difference of " + diff + " points");
                p2wins++;
            }
            System.out.println("Current score is: " + player1.getScore() + " points for " + player1.getName()
                    + " and " + player2.getScore() + " points for " + player2.getName() + "\n");
        }
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1 + " is the final winner of the game with " + p1wins + " wins and " + p2wins + " losses!");
        }
        else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2 + " is the final winner of the game with " + p2wins + " wins and " + p1wins + " losses!");
        }
        else System.out.println("The game ended in a tie!");
    }*/
}