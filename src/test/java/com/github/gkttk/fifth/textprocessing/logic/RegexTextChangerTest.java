package com.github.gkttk.fifth.textprocessing.logic;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegexTextChangerTest {

    private static final int DEFAULT_LENGTH_OF_WORD = 3;
    private static final String DEFAULT_SUBSTRING = "RegexTextChanger";
    private final TextChanger regexTextChanger = new RegexTextChanger(DEFAULT_LENGTH_OF_WORD, DEFAULT_SUBSTRING);


    @Test
    public void testChangeTextShouldChangeAllWordsWithThreeLength() {
        //given
        String testString = "1 12 123 help hoy hei of that min";
        String expectedString = "1 12 RegexTextChanger help RegexTextChanger RegexTextChanger of that RegexTextChanger";
        //when
        String resultString = regexTextChanger.changeText(testString);
        //then
        Assertions.assertEquals(expectedString, resultString);
    }


}
