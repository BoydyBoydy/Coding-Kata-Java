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

        for (int i = 0; i < 100; i++) {
            if (multipleOfThree(i) && multipleOfFive(i)) {
                fizzBuzz.add("FizzBuzz");
            } else if (multipleOfThree(i) && !multipleOfFive(i)) {
                fizzBuzz.add("Fizz");
            } else if (!multipleOfThree(i) && multipleOfFive(i)) {
                fizzBuzz.add("Buzz");
            } else {
                fizzBuzz.add(listOf100.get(i).toString());
            }

        }

        return fizzBuzz;

    }

    private static boolean multipleOfFive(int currentIndex) {
        return (currentIndex + 1) % 5 == 0;
    }

    private static boolean multipleOfThree(int currentIndex) {
        return (currentIndex + 1) % 3 == 0;
    }
}
