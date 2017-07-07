package com.personal.typingtutor;

import com.personal.typingtutor.util.Randomizer;
import com.personal.typingtutor.util.Reader;

import java.io.IOException;
import java.util.List;

/**
 * Created by Adit A Pillai on 07-07-2017.
 */
public class Runner {
    static List<String> strings;
    static void run(final String filePath) throws IOException {
        initializeStrings(filePath);
        System.out.println(getRandomString());
    }

    private static String getRandomString(){
        int randomIndex = Randomizer.getRandomValue(strings.size());
        return strings.get(randomIndex);
    }

    private static void initializeStrings(final String filePath) throws IOException {
        strings = Reader.readAllLines(filePath);
    }
}
