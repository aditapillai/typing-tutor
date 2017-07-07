package com.personal.typingtutor.runners;

import com.personal.typingtutor.util.Randomizer;
import com.personal.typingtutor.util.ReaderUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

/**
 * Created by Adit A Pillai on 07-07-2017.
 */
class GenericRunner {
    private static BufferedReader reader = ReaderUtil.getConsoleReader();

    private static String getRandomString(List<String> strings) {
        int randomIndex = Randomizer.getRandomValue(strings.size());
        return strings.get(randomIndex);
    }

    public static void runDrill(List<String> strings) throws IOException {
        System.out.println("Enter the number of tests");
        int totalTests = Integer.parseInt(reader.readLine());
        runDrill(strings,totalTests);
    }

    private static void runDrill(List<String> strings, int totalTests) throws IOException {
        int start = 0;
        while (start++ < totalTests) {
            String randomString = getRandomString(strings);
            System.out.println(randomString);
            String inputString = reader.readLine();
            System.out.println(checkIfEqual(randomString, inputString));
        }
    }

    private static boolean checkIfEqual(String randomString,String inputString) {
        boolean result=false;
        if (randomString != null) {
            result = randomString.equals(inputString);
        }
        return result;
    }
}
