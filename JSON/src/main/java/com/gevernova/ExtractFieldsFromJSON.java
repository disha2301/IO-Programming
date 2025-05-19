package com.gevernova;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExtractFieldsFromJSON {
    public static void main(String[] args){
        String filePath = "user.json";
        try{
            // read JSON file into a string
            String content = new String(Files.readAllBytes(Paths.get(filePath)));

            // parse the JSON string

            JSONObject json = new JSONObject(content);

            // extract specific fields
            String name = json.getString("name");
            String email = json.getString("email");

            // display the fields
            System.out.println("Name: " +name);
            System.out.println("Email: "+email);

        }catch(IOException e){
            System.out.println("Error in reading the file "+e.getMessage());
        } catch(Exception e){
            System.out.println("Error in parsing JSON "+e.getMessage());
        }
    }
}
