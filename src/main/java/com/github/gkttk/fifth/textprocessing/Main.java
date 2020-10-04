package com.github.gkttk.fifth.textprocessing;

import com.github.gkttk.fifth.textprocessing.data.TextSupplier;
import com.github.gkttk.fifth.textprocessing.data.factory.ConsoleTextSupplierFactory;
import com.github.gkttk.fifth.textprocessing.data.factory.TextSupplierFactory;
import com.github.gkttk.fifth.textprocessing.exception.FileTextSupplierException;
import com.github.gkttk.fifth.textprocessing.logic.TextChanger;
import com.github.gkttk.fifth.textprocessing.logic.factory.CharArrayTextChangerFactory;
import com.github.gkttk.fifth.textprocessing.logic.factory.TextChangerFactory;
import com.github.gkttk.fifth.textprocessing.view.ResultPrinter;
import com.github.gkttk.fifth.textprocessing.view.factory.ConsoleResultPrinterFactory;
import com.github.gkttk.fifth.textprocessing.view.factory.ResultPrinterFactory;

public class Main {
    public static void main(String[] args) throws FileTextSupplierException {

        //creating data supplier and getting a string for changing
        TextSupplierFactory textSupplierFactory = new ConsoleTextSupplierFactory(); //file or console
        TextSupplier textSupplier = textSupplierFactory.createTextSupplier();
        String text = textSupplier.getText();

        //creating a changer for string and change the string
        TextChangerFactory textChangerFactory = new CharArrayTextChangerFactory();//regex, string or charArray
        TextChanger textChanger = textChangerFactory.createTextChanger();
        String changedText = textChanger.changeText(text);

        //result output
        ResultPrinterFactory resultPrinterFactory = new ConsoleResultPrinterFactory();
        ResultPrinter resultPrinter = resultPrinterFactory.createResultPrinter();
        resultPrinter.print(changedText);


    }
}
