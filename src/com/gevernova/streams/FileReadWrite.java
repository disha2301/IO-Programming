package com.gevernova.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args){
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";
        // try-with-resource for automatic stream closing
        try(
                FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(destinationFile);
                ){
            int byteData;
            // read each byte and write to destination
            while((byteData = fis.read()) !=-1){
                fos.write(byteData);
            }
            System.out.println("file copied to "+destinationFile);

        } catch (FileNotFoundException e){
            System.out.println("Source file not found: " + sourceFile);
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
        }

    }
