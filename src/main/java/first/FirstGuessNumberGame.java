package first;

import java.util.HashSet;
import java.util.List;

public class FirstGuessNumberGame {

  private List<Integer> answer;

  public FirstGuessNumberGame(FirstAnswerGenerator firstAnswerGenerator) {
    this.answer = firstAnswerGenerator.generateAnswer();
  }

  public String guessNumber(List<Integer> numbers) {
    if (numbers.size() != 4 || new HashSet<>(numbers).size() < numbers.size()) {
      return "Wrong input, input again";
    }

    if (numbers.equals(answer)) {
      return "4A0B";
    }
    int aCount = 0;
    int bCount = 0;
    for (int index = 0; index < 4; index++) {
      if (numbers.get(index).equals(answer.get(index))) {
        aCount++;
      }
      else if (answer.contains(numbers.get(index))) {
        bCount ++;
      }
    }

    return aCount + "A" + bCount + "B";
  }
}
