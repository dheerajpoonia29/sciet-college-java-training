package org.example.module_6_file_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("src/main/java/org/example/file_handling/myFile2.txt", true);

            BufferedWriter obj = new BufferedWriter(fileWriter);
            obj.write("asdfa dasfsdfasfdas\n");
            obj.write("welcome to java programming\n");
            obj.write("we are writing in file using java\n");
            obj.close();
        } catch(IOException e) {
            System.out.println("some input output exception thrown: "+e.getMessage());
        }

    }
}
