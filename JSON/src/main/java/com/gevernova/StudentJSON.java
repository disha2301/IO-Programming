package com.gevernova;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJSON {
    public static void main(String[] args){
        JSONObject student = new JSONObject();
        student.put("name", "Disha");
        student.put("age",22);

        JSONArray subjects = new JSONArray();
        subjects.put("Maths");
        subjects.put("English");
        student.put("subjects",subjects);

        // print the JSON object with indentations
        System.out.println(student.toString(4));
    }
}
