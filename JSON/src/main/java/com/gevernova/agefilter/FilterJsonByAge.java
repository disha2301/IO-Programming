package com.gevernova.agefilter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.stream.Collectors;

public class FilterJsonByAge {
    public static void main(String[] args) {
        String jsonData = "[{\"name\":\"Alice\",\"age\":24},{\"name\":\"Bob\",\"age\":30},{\"name\":\"Charlie\",\"age\":28},{\"name\":\"David\",\"age\":22}]";

        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Person> people = mapper.readValue(jsonData, new TypeReference<List<Person>>() {});

            // Filter age > 25
            List<Person> filtered = people.stream()
                    .filter(p -> p.age > 25)
                    .collect(Collectors.toList());

            // Print filtered results as JSON
            String resultJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(filtered);
            System.out.println("Filtered People (age > 25):\n" + resultJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}