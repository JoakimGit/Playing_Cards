import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @BeforeEach
    void setUp() {
        Deck deck = new Deck();
    }

    @Test
    void draw() {
        Deck deck = new Deck();
        assertEquals("King of Clubs", deck.draw());
    }

    @Test
    void cardsRemaining() {
    }
}