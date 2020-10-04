package com.github.gkttk.fifth.textprocessing.logic.factory;

import com.github.gkttk.fifth.textprocessing.logic.CharArrayTextChanger;
import com.github.gkttk.fifth.textprocessing.logic.TextChanger;

/**
 * Factory for CharArrayTextChanger. This factory has a default values to create a CharArrayChanger.
 */
public class CharArrayTextChangerFactory implements TextChangerFactory {

    private static final int DEFAULT_LENGTH_OF_WORD = 3;
    private static final String DEFAULT_SUBSTRING = "CharArrayChanger";

    @Override
    public TextChanger createTextChanger() {
        return new CharArrayTextChanger(DEFAULT_LENGTH_OF_WORD, DEFAULT_SUBSTRING);
    }
}
