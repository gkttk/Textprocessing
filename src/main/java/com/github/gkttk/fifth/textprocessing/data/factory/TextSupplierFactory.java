package com.github.gkttk.fifth.textprocessing.data.factory;

import com.github.gkttk.fifth.textprocessing.data.TextSupplier;

/**
 * Common interface for TextSupplier factories.
 */
public interface TextSupplierFactory {
    TextSupplier createTextSupplier();
}
