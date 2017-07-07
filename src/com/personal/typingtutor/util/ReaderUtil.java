package com.personal.typingtutor.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.List;

/**
 * Created by Adit A Pillai on 07-07-2017.
 */
public class ReaderUtil {
    private static BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

    public static List<String> readAllLines(final String filePath) throws IOException {
        return Files.readAllLines(new File(filePath).toPath());
    }

    public static BufferedReader getConsoleReader() {
        return consoleReader;
    }
}
