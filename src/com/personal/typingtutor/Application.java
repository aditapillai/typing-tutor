package com.personal.typingtutor;

import com.personal.typingtutor.runners.SentenceDrillRunner;

import java.io.IOException;

/**
 * Created by Adit A Pillai on 07-07-2017.
 */
public class Application {
    public static void main(String[] args) throws IOException {
        SentenceDrillRunner.run("resources/sentences.txt");
    }
}
