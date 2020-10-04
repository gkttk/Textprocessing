package com.github.gkttk.fifth.textprocessing.data;

import com.github.gkttk.fifth.textprocessing.exception.FileTextSupplierException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ConsoleTextSupplierTest {

    private static final InputStream DEFAULT_IN = System.in;
    private static final InputStream NEW_IN = new ByteArrayInputStream(("Test String for console testing.").getBytes());
    private final TextSupplier consoleTextSupplier = new ConsoleTextSupplier();


    @BeforeAll
    static void init(){
        System.setIn(NEW_IN);
    }


    @Test
    public void testGetTextShouldReturnCorrectLine() throws FileTextSupplierException {
        //given
        String expectedLine = "Test String for console testing.";
        //when
        String textFromFile = consoleTextSupplier.getText();
        //then
        Assertions.assertEquals(expectedLine, textFromFile);
    }

    @AfterAll
    static void destroy(){
        System.setIn(DEFAULT_IN);
    }


}
