import View.Scanner;
import View.Writer;
import controller.CheckNumberController;
import controller.GenNumberController;
import model.Ugadai;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner();
        do {
            Writer writer = new Writer();
            GenNumberController g = new GenNumberController();
            CheckNumberController c = new CheckNumberController();
            int attemptCount = writer.getAttemptCount();
            int target = g.generate(writer.getMin(), writer.getMax());

            Ugadai ugadai = new Ugadai.UgadaiBuilder()
                    .setMin(writer.getMin())
                    .setMax(writer.getMax())
                    .setAttemptCount(attemptCount)
                    .setTarget(target).createUgadai();
                    writer.check(input, ugadai);
        } while ("y".equals(input.ask("You want to play again? y/n")));
    }
}
