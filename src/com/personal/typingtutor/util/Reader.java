package com.personal.typingtutor.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

/**
 * Created by Adit A Pillai on 07-07-2017.
 */
public class Reader {
    public static List<String> readAllLines(final String filePath) throws IOException {
        return Files.readAllLines(new File(filePath).toPath());
    }
}
