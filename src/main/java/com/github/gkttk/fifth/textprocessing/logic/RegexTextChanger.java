package com.github.gkttk.fifth.textprocessing.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class is responsible for replace parts of given String, using Pattern and Matcher.
 * Fields wordLength and substring get value from RegexTextChangerFactory.
 * Constructor initialises Pattern with wordLength.
 */
public class RegexTextChanger implements TextChanger {

    private final String substring;
    private final Pattern pattern;

    public RegexTextChanger(int wordLength, String substring) {
        this.substring = substring;
        this.pattern = Pattern.compile("\\b[^\\s]{" + wordLength + "}\\b");
    }

    @Override
    public String changeText(String text) {
        Matcher matcher = pattern.matcher(text);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, substring);
        }
        matcher.appendTail(stringBuffer);

        return stringBuffer.toString();

    }
}
