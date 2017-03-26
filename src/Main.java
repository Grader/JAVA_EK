import View.Scanner;
import View.Writer;
import model.Ugadai;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner();
        do {
            Writer writer = new Writer();

            Ugadai ugadai = new Ugadai.UgadaiBuilder()
                    .setMin(writer.getMin())
                    .setMax(writer.getMax())
                    .createUgadai();
                    writer.check(input, ugadai);
        } while ("y".equals(input.ask("You want to play again? y/n")));
    }
}
