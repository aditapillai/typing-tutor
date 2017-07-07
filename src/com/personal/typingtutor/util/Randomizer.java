package com.personal.typingtutor.util;

import java.util.Random;

/**
 * Created by Adit A Pillai on 07-07-2017.
 */
public class Randomizer {
    private static Random random = new Random(System.nanoTime());

    public static int getRandomValue(int maxValue){
        return random.nextInt(maxValue);
    }
}
