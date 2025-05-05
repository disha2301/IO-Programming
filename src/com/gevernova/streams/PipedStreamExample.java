package com.gevernova.streams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamExample {
    public static void main(String[] args) {
        // Create piped streams
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis;

        try {
            pis = new PipedInputStream(pos); // Connect input to output
        } catch (IOException e) {
            System.out.println("Error connecting piped streams: " + e.getMessage());
            return;
        }

        // Writer Thread: writes data into the piped output stream
        Thread writerThread = new Thread(() -> {
            try {
                String message = "Hello from Writer Thread!";
                pos.write(message.getBytes());
                pos.close();
            } catch (IOException e) {
                System.out.println("Writer error: " + e.getMessage());
            }
        });

        // Reader Thread: reads data from the piped input stream
        Thread readerThread = new Thread(() -> {
            try {
                int data;
                System.out.print("Reader received: ");
                while ((data = pis.read()) != -1) {
                    System.out.print((char) data);
                }
                System.out.println();
                pis.close();
            } catch (IOException e) {
                System.out.println("Reader error: " + e.getMessage());
            }
        });

        // Start threads
        writerThread.start();
        readerThread.start();

        // Wait for both threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}