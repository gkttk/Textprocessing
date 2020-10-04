package com.github.gkttk.fifth.textprocessing.data;

import java.util.Scanner;

/**
 * This class is responsible for getting String from console.
 */
public class ConsoleTextSupplier implements TextSupplier {

    @Override
    public String getText() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a string for processing:");
            return scanner.nextLine();
        }
    }
}
