package controller;

import java.util.Random;

public class GenNumberController {

    private Random random;

 //   public GenNumberController(Random random) {
 //       this.random = random;
 //   }

    public GenNumberController() {

    }


    public int generate (final int min, final int max) {

        int multiplier = max - min;

        int randomValue = (int) (Math.random() * ++multiplier) + min;
        return randomValue;
    }

}
