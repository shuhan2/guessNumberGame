package first;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FirstAnswerGeneratorTest {

  private FirstAnswerGenerator firstAnswerGenerator;

  @Test
  void should_return_4_different_number_answer_when_generate_answer() {
    firstAnswerGenerator = new FirstAnswerGenerator();
    List<Integer> answer = firstAnswerGenerator.generateAnswer();

    assertEquals(4, answer.size());
    answer.sort(Integer::compareTo);
    assertFalse(isContainsSameValue(answer));
    assertTrue(answer.get(0) > -1);
    assertTrue(answer.get(3) < 10);
  }

  private boolean isContainsSameValue(List<Integer> answer) {
    boolean isContainsSameValue = false;
    for (int index = 0; index < 3; ) {
      if (answer.get(index).equals(answer.get(++index))) {
        isContainsSameValue = true;
      }
    }
    return isContainsSameValue;
  }
}