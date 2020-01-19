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
    int aCount = (int) numbers.stream().filter(number -> answer.indexOf(number) == numbers.indexOf(number)).count();
    int bCount = (int) numbers.stream().filter(number -> answer.contains(number)).count() - aCount;

    return String.format("%dA%dB", aCount, bCount);
  }
}
