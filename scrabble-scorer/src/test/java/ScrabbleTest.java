// imports junit testing library, other deps.
import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

// class same as file name
public class ScrabbleTest {
  @Test
  public void runScrabble_returnNumber_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expectedOutput = 1;
    assertEquals(expectedOutput, testScrabble.getScore("a"));
  }
}
