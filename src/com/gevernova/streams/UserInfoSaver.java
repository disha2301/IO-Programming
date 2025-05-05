package com.gevernova.streams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInfoSaver {
    public static void main(String[] args){
        BufferedReader reader = null;
        FileWriter writer = null;
        try {
            // create BufferedReader to read input from console
            reader = new BufferedReader(new InputStreamReader(System.in));
            // ask for user input
            System.out.println("Enter your name");
            String name = reader.readLine();

            System.out.println("Enter your age");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Prepare content to write
            String content = "Name: " + name + "\n" +
                    "Age: " + age + "\n" +
                    "Favorite Programming Language: " + language + "\n";


            // write the file using FileWriter
            writer = new FileWriter("userinfo.txt");
            writer.write(content);

            System.out.println("User information saved to 'userinfo.txt'.");

        }catch(IOException e){
            System.out.println("An error occured "+ e.getMessage());
        } finally{
            // close resources
            try{
                if(reader != null) reader.close();
                if(writer != null) writer.close();
            } catch(IOException e){
                System.out.println("Error closing resources "+e.getMessage());
            }
        }
    }
}
