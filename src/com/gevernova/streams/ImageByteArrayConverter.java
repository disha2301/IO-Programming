package com.gevernova.streams;

import java.io.*;

public class ImageByteArrayConverter {
    public static void main(String[] args) {
        String inputImagePath = "original.jpg";
        String outputImagePath = "copy.jpg";

        try {
            // Step 1: Read image file into byte array
            FileInputStream fis = new FileInputStream(inputImagePath);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();
            fis.close();
            baos.close();

            // Step 2: Write byte array back to a new image file
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(outputImagePath);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            System.out.println("Image successfully converted to byte array and written to " + outputImagePath);

            // Step 3: Verify byte content
            if (compareFiles(inputImagePath, outputImagePath)) {
                System.out.println("Files are identical.");
            } else {
                System.out.println("Files differ.");
            }

        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }

    // Utility method to compare file contents byte by byte
    private static boolean compareFiles(String file1, String file2) throws IOException {
        try (
                FileInputStream fis1 = new FileInputStream(file1);
                FileInputStream fis2 = new FileInputStream(file2)
        ) {
            int b1, b2;
            do {
                b1 = fis1.read();
                b2 = fis2.read();
                if (b1 != b2) return false;
            } while (b1 != -1 && b2 != -1);
            return true;
        }
    }
}
