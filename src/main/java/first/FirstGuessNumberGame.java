package first;

import java.util.List;

public class FirstGuessNumberGame {

  private List<Integer> answer;

  public FirstGuessNumberGame(FirstAnswerGenerator firstAnswerGenerator) {
    this.answer = firstAnswerGenerator.generateAnswer();
  }

  public String guessNumber(List<Integer> numbers) {
    if (numbers.equals(answer)) {
      return "4A0B";
    }
    return null;
  }
}
