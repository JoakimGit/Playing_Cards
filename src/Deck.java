import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    private final List<Card> stack = new ArrayList<>();

    public Deck() {
        String[] colors = {"Spades", "Hearts", "Diamonds", "Clubs"};
        for (String color : colors) {
            for (int i = 1; i <= 13; i++) {
                stack.add(new Card(color, i));
            }
        }
    }

    public void randomize() {
        Object[] asArray = stack.toArray();
        // Creating a object for Random class
        Random r = new Random();
        // Start from the last element and swap one by one.
        for (int i = asArray.length-1; i > 0; i--) {
            // Pick a random index from 0 to i
            int j = r.nextInt(i+1);
            // Swap arr[i] with the element at random index
            Object temp = asArray[i];
            asArray[i] = asArray[j];
            asArray[j] = temp;
        }
        stack.clear();
        for (Object card: asArray) {
            stack.add((Card) card);
        }
    }

    public Card draw() {
        Card card = (stack.get(stack.size() - 1));
        stack.remove(stack.size() - 1);
        return card;
    }

    public int cardsRemaining() {
        return stack.size();
    }

    public List<Card> getStack() {
        return stack;
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
