package com.github.gkttk.fifth.textprocessing.logic.factory;

import com.github.gkttk.fifth.textprocessing.logic.StringTextChanger;
import com.github.gkttk.fifth.textprocessing.logic.TextChanger;

/**
 * Factory for StringTextChanger. This factory has a default values to create a StringTextChanger.
 */
public class StringTextChangerFactory implements TextChangerFactory {

    private static final int DEFAULT_LENGTH_OF_WORD = 3;
    private static final String DEFAULT_SUBSTRING = "StringChanger";

    @Override
    public TextChanger createTextChanger() {
        return new StringTextChanger(DEFAULT_LENGTH_OF_WORD, DEFAULT_SUBSTRING);
    }
}
