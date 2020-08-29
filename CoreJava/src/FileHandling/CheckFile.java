/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class CheckFile {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        String cwd = Paths.get("").toAbsolutePath().toString();
        System.out.println(cwd);
        createFile();
        writeData();
        readFile();
        deleteFile();
    }

    public static void createFile() {
        try {
            // bu hem de folder ola biler
            // eyni usul ile siline biler
            File myObj = new File("users.json");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeData() {
        try {
            FileWriter myWriter = new FileWriter("users.json");
            myWriter.write("{\"users\":[{\"name\":\"jon\"}]}");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void readFile(){
        try {
            File myObj = new File("users.json");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void deleteFile(){
        File myObj = new File("users.json");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
