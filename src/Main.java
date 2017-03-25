import View.Scanner;
import View.Writer;
import controller.CheckNumberController;
import controller.GenNumberController;
import model.Ugadai;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner();
        Writer writer = new Writer();
        do {
           //Random random = new Random();
            GenNumberController g = new GenNumberController();
            CheckNumberController c = new CheckNumberController();
            int min = writer.getMin();
            int max = writer.getMax();
            int attemptCount = writer.getAttemptCount();
            int target = g.generate(min, max);

            Ugadai ugadai = new Ugadai.UgadaiBuilder()
                    .setMin(min)
                    .setMax(max)
                    .setAttemptCount(attemptCount)
                    .setTarget(target).createUgadai();
                    writer.check(input, ugadai);
        } while ("y".equals(input.ask("You want to play again? y/n")));
    }
}
