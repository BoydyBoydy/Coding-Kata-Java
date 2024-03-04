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

    public List<String> fizzBuzz() {

        List<String> fizzBuzz = new ArrayList<>();
        List<Integer> listOf100 = print100();

        for (int i = 0; i < 99; i++) {
            if ((i + 1) % 3 == 0) {
                fizzBuzz.add("Fizz");
            } else {
                fizzBuzz.add(listOf100.get(i).toString());
            }
        }

        return fizzBuzz;

    }
}
