package com.gevernova.streams;
import java.io.*;

public class UppercaseToLowercaseConverter {
    public static void main(String[] args) {
        String sourceFile = "input.txt";
        String destinationFile = "output.txt";

        // Use UTF-8 encoding to avoid character issues
        try (
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(new FileInputStream(sourceFile), "UTF-8")
                );
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(new FileOutputStream(destinationFile), "UTF-8")
                )
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine(); // Preserve line breaks
            }

            System.out.println("Conversion complete. Check the output.txt file.");
        } catch (IOException e) {
            System.out.println("Error during file processing: " + e.getMessage());
        }
    }
}