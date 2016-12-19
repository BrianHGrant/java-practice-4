import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Scrabble {
  public String[] mTenPoint = {"q","z"};
  public String[] mEightPoint = {"j","x"};
  public String[] mFourPoint = {"f","h","v","w","y"};
  public String[] mThreePoint = {"b","c","m","p"};
  public String[] mTwoPoint = {"d","g"};

  public Integer wordScore(String yourWord) {
    Integer totalScore = 0;
    for (int i = 0;i < yourWord.length(); i++){
      totalScore += getScore(Character.toString(yourWord.charAt(i)));
    }
    return totalScore;
  }

  public Integer getScore(String yourLetter) {
    String searchLetter = yourLetter.toLowerCase();
    if (!Character.isLetter(searchLetter.charAt(0))) {
      return 0;
    } else if (searchLetter.equals("k")) {
      return 5;
    } else if (Arrays.asList(mTenPoint).contains(searchLetter)) {
      return 10;
    } else if (Arrays.asList(mEightPoint).contains(searchLetter)) {
      return 8;
    } else if (Arrays.asList(mFourPoint).contains(searchLetter)) {
      return 4;
    } else if (Arrays.asList(mThreePoint).contains(searchLetter)) {
      return 3;
    } else if (Arrays.asList(mTwoPoint).contains(searchLetter)) {
      return 2;
    } else {
      return 1;
    }
  }
}
