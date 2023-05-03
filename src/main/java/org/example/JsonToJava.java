package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;




public class JsonToJava extends Employee {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = "{\"empID\":2,\"empName\":\"ajay\",\"empEmail\":\"ajay@gmail.com\",\"role\":\"developer\"}";
        try {
            Employee emp3 = objectMapper.readValue(jsonString, JsonToJava.class);
            jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp3);
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

