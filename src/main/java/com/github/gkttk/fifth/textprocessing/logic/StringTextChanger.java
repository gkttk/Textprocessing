package com.github.gkttk.fifth.textprocessing.logic;

/**
 * This class is responsible for replace parts of given String, using String methods.
 * Fields wordLength and substring get value from StringTextChangerFactory.
 * Constructor initialises regex String with wordLength.
 */
public class StringTextChanger implements TextChanger {

    private final String subString;
    private final String regex;

    public StringTextChanger(int wordLength, String subString) {
        this.subString = subString;
        this.regex = "\\b[^\\s]{" + wordLength + "}\\b";
    }

    @Override
    public String changeText(String text) {
        return text.replaceAll(regex, subString);
    }
}
