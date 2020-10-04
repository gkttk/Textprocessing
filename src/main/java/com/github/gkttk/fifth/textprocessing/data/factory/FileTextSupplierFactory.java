package com.github.gkttk.fifth.textprocessing.data.factory;

import com.github.gkttk.fifth.textprocessing.data.FileTextSupplier;
import com.github.gkttk.fifth.textprocessing.data.TextSupplier;

/**
 * Factory for FileTextSupplier. This factory has a default file location.
 */
public class FileTextSupplierFactory implements TextSupplierFactory {

    private static final String DEFAULT_FILE_LOCATION = "text.txt";

    @Override
    public TextSupplier createTextSupplier() {
        return new FileTextSupplier(DEFAULT_FILE_LOCATION);
    }
}
