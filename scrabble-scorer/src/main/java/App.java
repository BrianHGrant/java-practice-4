import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console yourBox = System.console();
    Scrabble newScrabble = new Scrabble();
    boolean programRunning = true;

    while (programRunning) {
      System.out.println("This simple application returns your Scrabble Score for a specificed word. Enter a word (Enter 999 to exit): ");
      String yourWord = yourBox.readLine();
      if (yourWord.equals("999")) {
        programRunning = false;
      } else {
        int yourScore = newScrabble.wordScore(yourWord);
        System.out.println("+========================+");
        System.out.println("Your Word is: " + yourWord);
        System.out.println("The Scrabble score for your word is: " + yourScore);
        System.out.println("+========================+");
      }
    }
  }
}
