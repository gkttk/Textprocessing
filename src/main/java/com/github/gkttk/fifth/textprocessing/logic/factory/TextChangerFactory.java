package com.github.gkttk.fifth.textprocessing.logic.factory;

import com.github.gkttk.fifth.textprocessing.logic.TextChanger;

/**
 * Common interface for TextChanger factories.
 */
public interface TextChangerFactory {
    TextChanger createTextChanger();
}
