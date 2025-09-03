package com.basics.exceptions;
import java.io.File;
import java.io.IOException;
public class CreateFile {
    // Absolute Path -> root directory -> D:\Idea Projects\Sapthagiri-ECE-VII-A\Java
    // Relative Path -> current directory -> ./Java/ece.txt (dot means current folder)

    public static void main(String[] args) throws IOException {
        File file = new File("./Java/ece.txt");
        if(file.createNewFile()){
            System.out.println("File: " + file.getName() + " created.");
        }else {
            System.out.println("Failed to create the file.");
        }
    }
}
