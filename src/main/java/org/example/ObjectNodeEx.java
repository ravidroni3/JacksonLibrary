package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;

public class ObjectNodeEx {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        String name ="{\"empID\":1,\"empName\":\"ravi\",\"empEmail\":\"ravi@gmail.com\",\"role\":\"developer\"}";
        try {
            ObjectNode objectNode = (ObjectNode) objectMapper.readTree(new File("target/emp.json"));
            String empName = objectNode.get("empName").asText();
            int age = objectNode.get("empID").asInt();

// can modify as well: this adds child Object as property 'other', set property 'type'
            objectNode.with("other").path(1);
            String json = objectMapper.writeValueAsString(objectNode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}