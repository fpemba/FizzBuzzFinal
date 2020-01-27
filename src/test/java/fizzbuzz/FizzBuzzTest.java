package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void shouldInstantiate(){
        FizzBuzz underTest = new FizzBuzz();

        FizzBuzz undertest;

    }
    @Test
    public void oneShouldSayOne(){
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.interpret(1);
        //assertion
        assertEquals("1", result);
    }

    @Test
    public void twoShouldSayTwo(){
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.interpret(2);
        //assertion
        assertEquals("2", result);
    }

    @Test
    public void threeShouldSayFizz(){
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.interpret(3);
        //assertion
        assertEquals("Fizz", result);
    }

    @Test
    public void fourShouldSayFour(){
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.interpret(4);
        //assertion
        assertEquals("4", result);
    }

    @Test
    public void fiveShouldSayBuzz(){
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.interpret(5);
        //assertion
        assertEquals("Buzz", result);
    }

    @Test
    public void sixShouldSayFizz(){
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.interpret(6);
        //assertion

        assertEquals("Fizz", result);
    }
    @Test
    public void nineShouldSayFizz(){
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.interpret(9);
        //assertion
        assertEquals("Fizz", result);
    }
    @Test
    public void tenShouldSayBuzz(){
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.interpret(10);
        //assertion
        assertEquals("Buzz", result);
    }

    @Test
    public void fifteenShouldSayFizzBuzz(){
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.interpret(15);
        //assertion
        assertEquals("FizzBuzz", result);
    }

}
