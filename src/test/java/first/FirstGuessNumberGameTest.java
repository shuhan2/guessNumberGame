package first;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FirstGuessNumberGameTest {

  @Mock
  private FirstAnswerGenerator firstAnswerGenerator;

  @InjectMocks
  private FirstGuessNumberGame game;

  @Test
  void should_return_4A0B_when_guess_number_given_answer_is_1_2_3_4_and_input_is_1_2_3_4() {
    when(firstAnswerGenerator.generateAnswer()).thenReturn(Arrays.asList(1, 2, 3, 4));
    game = new FirstGuessNumberGame(firstAnswerGenerator);

    String output = game.guessNumber(Arrays.asList(1, 2, 3, 4));

    assertEquals("4A0B", output);
  }
}