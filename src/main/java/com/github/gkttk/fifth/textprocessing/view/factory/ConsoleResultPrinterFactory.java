package com.github.gkttk.fifth.textprocessing.view.factory;

import com.github.gkttk.fifth.textprocessing.view.ConsoleResultPrinter;
import com.github.gkttk.fifth.textprocessing.view.ResultPrinter;

/**
 * Factory for ConsoleResultPrinter.
 */
public class ConsoleResultPrinterFactory implements ResultPrinterFactory {
    @Override
    public ResultPrinter createResultPrinter() {
        return new ConsoleResultPrinter();
    }
}
