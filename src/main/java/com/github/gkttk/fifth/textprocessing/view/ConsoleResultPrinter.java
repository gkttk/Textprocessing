package com.github.gkttk.fifth.textprocessing.view;

/**
 * This class is responsible for console output.
 */
public class ConsoleResultPrinter implements ResultPrinter {
    @Override
    public void print(String result) {
        System.out.println("Changed line:");
        System.out.println(result);
    }
}
