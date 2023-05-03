package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;


public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        //Convert Java Object to JSON Object
        Employee emp = new Employee(1, "ravi", "ravi@gmail.com", "developer");


        try {
            objectMapper.writeValue(new File("target/emp.json"), emp);


        } catch (Exception e) {
            logger.log(Level.INFO, "JSON Object serialized");

        }
        //Deserialization JSON to Java Object

        try {
            ObjectMapper objectMapper1 = new ObjectMapper();
            String empJson = "{\"empID\":1,\"empName\":\"ravi\",\"empEmail\":\"ravi@gmail.com\",\"role\":\"developer\"}";
            Employee emp1 = objectMapper.readValue(empJson, Employee.class);
            System.out.println(emp1);
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
