package com.github.gkttk.fifth.textprocessing.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CharArrayTextChangerTest {

    private static final int DEFAULT_LENGTH_OF_WORD = 3;
    private static final String DEFAULT_SUBSTRING = "CharArrayChanger";
    private final CharArrayTextChanger charArrayTextChanger = new CharArrayTextChanger(DEFAULT_LENGTH_OF_WORD, DEFAULT_SUBSTRING);

    @Test
    public void testChangeArrayWordsShouldChangeAllWordsWithThreeLength() {
        //given
        String testString = "one,two,three,four,five,six";
        String expectedString = "CharArrayChanger,CharArrayChanger,three,four,five,CharArrayChanger";
        //when
        String testResult = charArrayTextChanger.changeText(testString);
        //then
        Assertions.assertEquals(expectedString, testResult);
    }

    @Test
    public void testChangeArrayWordsShouldIgnoreStringWithoutLetters() {
        //given
        String testString = ",,,   ,,,   ,,,";
        String expectedString = ",,,   ,,,   ,,,";
        //when
        String testResult = charArrayTextChanger.changeText(testString);
        //then
        Assertions.assertEquals(expectedString, testResult);
    }


}
