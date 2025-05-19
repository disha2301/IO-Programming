package com.gevernova.objtojson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class ListToJsonArray {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Disha", 22));
        students.add(new Student("Ahad",25));
        students.add(new Student("Sakshi", 33));
        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(students);
            System.out.println("JSON Array:\n" + jsonArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
