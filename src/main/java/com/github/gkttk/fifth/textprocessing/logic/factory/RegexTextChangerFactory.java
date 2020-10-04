package com.github.gkttk.fifth.textprocessing.logic.factory;

import com.github.gkttk.fifth.textprocessing.logic.RegexTextChanger;
import com.github.gkttk.fifth.textprocessing.logic.TextChanger;

/**
 * Factory for RegexTextChanger. This factory has a default values to create a RegexTextChanger.
 */
public class RegexTextChangerFactory implements TextChangerFactory {

    private static final int DEFAULT_LENGTH_OF_WORD = 3;
    private static final String DEFAULT_SUBSTRING = "RegexChanger";


    @Override
    public TextChanger createTextChanger() {
        return new RegexTextChanger(DEFAULT_LENGTH_OF_WORD, DEFAULT_SUBSTRING);
    }
}
