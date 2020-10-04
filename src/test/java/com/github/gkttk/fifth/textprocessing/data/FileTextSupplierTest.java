package com.github.gkttk.fifth.textprocessing.data;

import com.github.gkttk.fifth.textprocessing.exception.FileTextSupplierException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileTextSupplierTest {

    private static final String FILE_LOCATION = "src/test/resources/testText.txt";
    private final TextSupplier fileTextSupplier = new FileTextSupplier(FILE_LOCATION);

    @Test
    public void testGetTextShouldReturnCorrectLine() throws FileTextSupplierException {
        //given
        String expectedLine = "Hello, world!\r\nI am java";
        //when
        String textFromFile = fileTextSupplier.getText();
        //then
        Assertions.assertEquals(expectedLine, textFromFile);
    }


}
