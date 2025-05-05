package com.gevernova.streams;
import java.io.*;

public class EfficientFileCopy {

    private static final int BUFFER_SIZE = 4096; // 4 KB

    public static void main(String[] args) {
        String sourcePath = "largefile.txt";           // Replace with your actual file
        String unbufferedDestPath = "unbuffered_copy.txt";
        String bufferedDestPath = "buffered_copy.txt";

        // Copy using unbuffered streams
        long unbufferedTime = copyUsingUnbufferedStreams(sourcePath, unbufferedDestPath);
        System.out.println("Unbuffered copy time: " + unbufferedTime + " ns (" + (unbufferedTime / 1_000_000.0) + " ms)");

        // Copy using buffered streams
        long bufferedTime = copyUsingBufferedStreams(sourcePath, bufferedDestPath);
        System.out.println("Buffered copy time: " + bufferedTime + " ns (" + (bufferedTime / 1_000_000.0) + " ms)");
    }

    // Method to copy file using FileInputStream and FileOutputStream
    private static long copyUsingUnbufferedStreams(String source, String destination) {
        long startTime = System.nanoTime();

        try (
                FileInputStream fis = new FileInputStream(source);
                FileOutputStream fos = new FileOutputStream(destination)
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error (unbuffered): " + e.getMessage());
        }

        return System.nanoTime() - startTime;
    }

    // Method to copy file using BufferedInputStream and BufferedOutputStream
    private static long copyUsingBufferedStreams(String source, String destination) {
        long startTime = System.nanoTime();

        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error (buffered): " + e.getMessage());
        }

        return System.nanoTime() - startTime;
    }
}
