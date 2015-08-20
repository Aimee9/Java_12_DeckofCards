import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class DeckTest {
  @Test
  public void deck_instatiatesCorrectly_true() {
    Deck testDeck = new Deck();
    assertEquals(true, testDeck instanceof Deck);
  }

}
