package kata.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void shouldPrint100() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> listOf100 = fb.print100();
        assertEquals(100, listOf100.size());
        assertEquals(1, listOf100.get(0));
        assertEquals(100, listOf100.get(99));
    }

    @Test
    public void shouldPrintFizzForMultipleOfThree() {
        FizzBuzz fb = new FizzBuzz();
        List<String> fizzBuzz = fb.fizzBuzz();
        int multiplesOfThree = 3;
        int multiplesOfFive = 5;

        int counter = 1;

        while (counter < 100) {
            if (counter % multiplesOfThree == 0 && !(counter % multiplesOfFive == 0)) {
                assertEquals("Fizz", fizzBuzz.get(counter - 1));
            }
            counter++;
        }

    }

    @Test
    public void shouldPrintBuzzForMultipleOfFive() {
        FizzBuzz fb = new FizzBuzz();
        List<String> fizzBuzz = fb.fizzBuzz();
        int multiplesOfThree = 3;
        int multiplesOfFive = 5;

        int counter = 1;

        while (counter < 100) {
            if (counter % multiplesOfFive == 0 && !(counter % multiplesOfThree == 0)) {
                assertEquals("Buzz", fizzBuzz.get(counter - 1));
            }
            counter++;
        }

    }

//    and for the multiples of five print "Buzz".
//    For numbers which are multiples of both three and five print "FizzBuzz".
}
