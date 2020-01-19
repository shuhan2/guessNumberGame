package first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstAnswerGenerator {

  public List<Integer> generateAnswer() {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 1; i < 10; i++) {
      list.add(i);
    }
    Collections.shuffle(list);
    return list.subList(0, 4);
  }

}
