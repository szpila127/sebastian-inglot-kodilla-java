package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

import java.io.IOException;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
        try {

            FileReaderWithoutHandling fileReaderWithoutHandling = new FileReaderWithoutHandling();
            fileReaderWithoutHandling.readFile();

        } catch (IOException e) {

            System.err.println("Błąd");

        }

        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem with reading file");
        }

    }
}
