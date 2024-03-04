package kata.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<Integer> print100() {

        List<Integer> listOf100 = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            listOf100.add(i);
        }
        return listOf100;

    }
}
