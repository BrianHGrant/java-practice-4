// imports junit testing library, other deps.
import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

// class same as file name
public class ScrabbleTest {
  @Test
  public void getScore_returnNumber_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expectedOutput = 1;
    assertEquals(expectedOutput, testScrabble.getScore("a"));
  }

  @Test public void getScore_return5forK_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expectedOutput = 5;
    assertEquals(expectedOutput, testScrabble.getScore("k"));
  }

  @Test public void getScore_return10forQ_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expectedOutput = 10;
    assertEquals(expectedOutput, testScrabble.getScore("q"));
  }

  @Test public void getScore_return8forJ_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expectedOutput = 8;
    assertEquals(expectedOutput, testScrabble.getScore("j"));
  }

  @Test public void getScore_return4forF_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expectedOutput = 4;
    assertEquals(expectedOutput, testScrabble.getScore("f"));
  }
  @Test public void getScore_return3forB_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expectedOutput = 3;
    assertEquals(expectedOutput, testScrabble.getScore("b"));
  }
  @Test public void getScore_return2forD_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expectedOutput = 2;
    assertEquals(expectedOutput, testScrabble.getScore("d"));
  }
  @Test public void getScore_return2forDCaseInsensitive_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expectedOutput = 2;
    assertEquals(expectedOutput, testScrabble.getScore("D"));
  }
  @Test public void wordScore_returnScoreMultiLetters_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expectedOutput = 22;
    assertEquals(expectedOutput, testScrabble.wordScore("QuIz"));
  }
  @Test public void wordScore_return0ForNonLetter_Integer() {
    Scrabble testScrabble = new Scrabble();
    Integer expectedOutput = 0;
    assertEquals(expectedOutput, testScrabble.wordScore("3"));
  }
}
