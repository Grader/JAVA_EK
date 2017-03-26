package View;

import controller.CheckNumberController;
import controller.GenNumberController;
import model.GuessResult;
import model.Ugadai;

import java.io.IOException;

public class Writer {

    private int min;
    private int max;
    private int attemptCount;
    private int target;

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public int getTarget() {
        return target;
    }

    public void check(final Scanner input, final Ugadai ugadai) throws IOException {
        System.out.println("First, set the range");

        System.out.println("Please enter the lower boundary");
        min = Integer.parseInt(input.ask());


        System.out.println("Please enter the upper limit");
        max = Integer.parseInt(input.ask());

        System.out.println("Please enter the number of attempts");
        attemptCount = Integer.parseInt(input.ask());

        GenNumberController g = new GenNumberController();
        target = g.generate(min, max);

        System.out.println("The number of hidden");
        System.out.println("You have " + attemptCount + " attempts to guess who it is");
        System.out.println("Enter a number in the range from " + min + " to " + max);

        for (int i = 0; i < attemptCount; i++) {

            int inputNumber = Integer.parseInt(input.ask());
            final GuessResult result = CheckNumberController.numberEquality(inputNumber, target);

            if (result == GuessResult.GUESS_IS_BIGGER) {
              System.out.println("Your number is higher. Attempts remaining: " + (attemptCount - 1 - i));
            }
            else if (result == GuessResult.GUESS_IS_SMALLER) {
                System.out.println("Your number is less than. Attempts remaining: " + + (attemptCount - 1 - i));
            }
            else if (result == GuessResult.EQUAL) {
                System.out.println("You guessed the number!");
                break;
            }

        }


    }


}
