package com.gevernova.streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String filePath = "sample.txt";
        Map<String, Integer> wordCount = new HashMap<>();
        int totalWords = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Normalize and split line into words using regex
                String[] words = line.toLowerCase().split("\\W+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        totalWords++;
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Sort the map entries by frequency (value) in descending order
            List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCount.entrySet());
            sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

            // Print results
            System.out.println("Total Words: " + totalWords);
            System.out.println("Top 5 most frequent words:");
            for (int i = 0; i < Math.min(5, sortedList.size()); i++) {
                Map.Entry<String, Integer> entry = sortedList.get(i);
                System.out.println((i + 1) + ". " + entry.getKey() + " - " + entry.getValue());
            }

        } catch (FileNotFoundException e) {
            System.out.println("The specified file was not found: " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
