package com.github.gkttk.fifth.textprocessing.data;

import com.github.gkttk.fifth.textprocessing.exception.FileTextSupplierException;

/**
 * Common interface for TextSupplier.
 */
public interface TextSupplier {

    String getText() throws FileTextSupplierException;

}
