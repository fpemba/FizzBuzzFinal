import fizzbuzz.FizzBuzz;

public class FizzBuzzApp {

    public static void main(String[] args) {

        FizzBuzz game = new FizzBuzz();

        for (int i = 0; i <= 100; i++) {

            System.out.println(game.interpret(i));
        }
    }


}

