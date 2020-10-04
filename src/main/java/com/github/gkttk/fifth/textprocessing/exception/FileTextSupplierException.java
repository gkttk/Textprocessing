package com.github.gkttk.fifth.textprocessing.exception;

/**
 * This exception is thrown when FileTextSupplier throw IOException.
 */
public class FileTextSupplierException extends Exception {

    public FileTextSupplierException(String message, Throwable cause, String wrongFileLocation) {
        super(message, cause);
        System.out.println("Wrong file location: " + wrongFileLocation);
    }
}
