package com.example.springbootudemy;

import java.util.UUID;

/**
 * @author DuyND
 * @name Demo.java
 * @date 26/07/2023
 */
public class Demo {

    public static String generateShortUUID() {
        UUID uuid = UUID.randomUUID();
        String uuidStr = uuid.toString().replace("-", ""); // Remove dashes
        return uuidStr.substring(0, 12); // Get the first 12 characters
    }

    public static void main(String[] args) {
        String shortUUID = generateShortUUID();
        System.out.println("Full UUID: " + UUID.randomUUID().toString());
        System.out.println("Short UUID: " + shortUUID);

        System.out.println("Phuocnd");
    }
}
