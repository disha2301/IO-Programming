package com.gevernova.carjson;

import org.json.JSONObject;
public class CarToJson {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car("Toyota", "Camry", 2023, 28000.99);

        // Convert to JSON
        JSONObject carJson = new JSONObject();
        carJson.put("make", car.getMake());
        carJson.put("model", car.getModel());
        carJson.put("year", car.getYear());
        carJson.put("price", car.getPrice());

        // Print JSON string
        System.out.println(carJson.toString(4)); // Pretty print with indentation
    }
}