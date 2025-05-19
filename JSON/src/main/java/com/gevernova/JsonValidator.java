package com.gevernova;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValidator {
    public static void main(String[] args){
        String jsonString = "{ \"name\": \"Disha\", \"age\": 2, \"subjects\": [\"Math\", \"Science\"] }";
        ObjectMapper mapper = new ObjectMapper();
        try{
            JsonNode jsonNode = mapper.readTree(jsonString);
            System.out.println("Valid JSON structure:\n" + jsonNode.toPrettyString());
        }catch (JsonProcessingException e){
            System.out.println("Invalid JSON structure "+e.getMessage());
        }
    }
}
