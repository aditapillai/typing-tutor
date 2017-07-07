package com.personal.typingtutor.runners;

import com.personal.typingtutor.util.Randomizer;
import com.personal.typingtutor.util.ReaderUtil;

import java.io.IOException;
import java.util.List;

/**
 * Created by Adit A Pillai on 07-07-2017.
 */
public class SentenceDrillRunner {
    private static List<String> strings;

    public static void run(final String filePath) throws IOException {
        initializeStrings(filePath);
        startSentenceDrill();
    }

    private static void initializeStrings(final String filePath) throws IOException {
        strings = ReaderUtil.readAllLines(filePath);
    }

    private static void startSentenceDrill() throws IOException {
        GenericRunner.runDrill(strings);
    }
}
