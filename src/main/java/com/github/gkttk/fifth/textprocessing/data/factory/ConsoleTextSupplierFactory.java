package com.github.gkttk.fifth.textprocessing.data.factory;

import com.github.gkttk.fifth.textprocessing.data.ConsoleTextSupplier;
import com.github.gkttk.fifth.textprocessing.data.TextSupplier;


/**
 * Factory for ConsoleTextSupplier.
 */
public class ConsoleTextSupplierFactory implements TextSupplierFactory {
    @Override
    public TextSupplier createTextSupplier() {
        return new ConsoleTextSupplier();
    }
}
