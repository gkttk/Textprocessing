package com.github.gkttk.fifth.textprocessing.data;

import com.github.gkttk.fifth.textprocessing.exception.FileTextSupplierException;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * This class is responsible for getting String from file.
 * Field fileLocation gets value from FileTextSupplierFactory.
 */
public class FileTextSupplier implements TextSupplier {

    private final String fileLocation;

    public FileTextSupplier(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    @Override
    public String getText() throws FileTextSupplierException {
        StringBuilder stringBuilder = new StringBuilder();
        String lineSeparator = System.lineSeparator();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation))) {
            while (reader.ready()) {
                String line = reader.readLine();
                stringBuilder.append(line);
                if (reader.ready()) {
                    stringBuilder.append(lineSeparator);
                }
            }
        } catch (Exception e) {
            throw new FileTextSupplierException("Problem with reading a file", e, this.fileLocation);
        }
        return stringBuilder.toString();
    }


}
