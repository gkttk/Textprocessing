package com.github.gkttk.fifth.textprocessing.logic;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTextChangerTest {

    private static final int DEFAULT_LENGTH_OF_WORD = 4;
    private static final String DEFAULT_SUBSTRING = "StringTextChanger";
    private final TextChanger stringTextChanger = new StringTextChanger(DEFAULT_LENGTH_OF_WORD, DEFAULT_SUBSTRING);


    @Test
    public void testChangeTextShouldChangeAllWordsWithThreeLength() {
        //given
        String testString = "1234 12e 123q help hoyhoy hei ofcource that mins";
        String expectedString = "StringTextChanger 12e StringTextChanger StringTextChanger hoyhoy hei ofcource StringTextChanger StringTextChanger";
        //when
        String resultString = stringTextChanger.changeText(testString);
        //then
        Assertions.assertEquals(expectedString, resultString);
    }


}
