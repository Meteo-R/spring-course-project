package com.mr.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            Student student = mapper.readValue(new File("jackson-databind-json-demo/src/main/resources/sample-lite.json"), Student.class);

            System.out.println("First name = " + student.getFirstName());
            System.out.println("Last name  = " + student.getLastName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
