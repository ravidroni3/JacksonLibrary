package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JavaToJson {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        Employee emp = new Employee(2, "ajay", "ajay@gmail.com", "developer");
        try {

            objectMapper.writeValue(new File("target/emp2.json"), emp);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
