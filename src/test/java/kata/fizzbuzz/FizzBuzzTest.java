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
    }

//    Write a program that prints the numbers from 1 to 100.
//    But for multiples of three print "Fizz" instead of the number
//    and for the multiples of five print "Buzz".
//    For numbers which are multiples of both three and five print "FizzBuzz".
}
