package org.example.module_6_file_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            FileReader filePath = new FileReader("src/main/java/org/example/file_handling/myFile.txt");
            BufferedReader obj = new BufferedReader(filePath);

            String line;

            while((line=obj.readLine()) != null) {
                System.out.println(line);
            }
        } catch(FileNotFoundException e) {
            System.out.println("file not found");
        } catch(Exception e) {
            System.out.println("something get wrong: "+e.getMessage());
        }

    }
}
