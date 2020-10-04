package com.github.gkttk.fifth.textprocessing.view;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsoleResultPrinterTest {

    private final static ByteArrayOutputStream NEW_OUT = new ByteArrayOutputStream();
    private final static PrintStream DEFAULT_OUT = System.out;
    private final ConsoleResultPrinter consoleResultPrinter = new ConsoleResultPrinter();

    @BeforeAll
    static void init() {
        System.setOut(new PrintStream(NEW_OUT));
    }

    @Test
    public void testPrintResultShouldPrintCorrectLine() {
        //given
        String expectedResult = "Changed line:\r\nHello, world!\r\n";
        String testResult = "Hello, world!";
        //when
        consoleResultPrinter.print(testResult);
        //then
        Assertions.assertEquals(expectedResult, NEW_OUT.toString());
    }


    @AfterAll
    static void destroy() {
        System.setOut(DEFAULT_OUT);
    }
}
