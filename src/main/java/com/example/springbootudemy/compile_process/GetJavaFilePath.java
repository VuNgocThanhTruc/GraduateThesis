package com.example.springbootudemy.compile_process;

/**
 * @author DuyND
 * @name GetJavaFilePath.java
 * @date 01/10/2023
 */
public class GetJavaFilePath {

    public static void main(String[] args) {
        // Name of the Java source file
        String javaFileName = "DemoFile.java";

        // Get the current working directory
        String currentDirectory = System.getProperty("user.dir");

        // Combine the current directory with the Java file name
        String javaFilePath = currentDirectory + "/" + javaFileName;

        // Print the Java file path
        System.out.println("Path of the Java file is: " + javaFilePath);
    }
}
