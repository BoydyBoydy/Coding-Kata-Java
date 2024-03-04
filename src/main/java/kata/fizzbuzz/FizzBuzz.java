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

        int multipleOfThree = 3;
        int multipleOfFive = 5;

        for (int i = 0; i < 99; i++) {
            if ((i + 1) % multipleOfThree == 0 && !((i + 1) % multipleOfFive == 0)) {
                fizzBuzz.add("Fizz");
            } else if ((i + 1) % multipleOfFive == 0 && !((i + 1) % multipleOfThree == 0)) {
                fizzBuzz.add("Buzz");
            } else {
                fizzBuzz.add(listOf100.get(i).toString());
            }

        }

        return fizzBuzz;

    }
}
