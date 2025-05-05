package com.gevernova.streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ErrorLogFilter {
    public static void main(String[] args) {
        String filePath = "large_log_file.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineCount = 0;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                if (line.toLowerCase().contains("error")) {
                    System.out.println("Line " + lineCount + " : " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("The specified file was not found: " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
