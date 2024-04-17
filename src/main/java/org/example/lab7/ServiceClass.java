package org.example.lab7;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class ServiceClass {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    public static void serializeHouse(House house, String file) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(house);
        }
    }

    public static House deserializeHouse(String file ) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            return (House) inputStream.readObject();
        }
    }
    public static String serializeHouseToJson(House house) throws IOException {
        return objectMapper.writeValueAsString(house);
    }

    public static House deserializeJsonToHouse(String json) throws IOException {
        return objectMapper.readValue(json, House.class);
    }
}
