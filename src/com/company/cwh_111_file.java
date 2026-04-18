package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cwh_111_file {
    static void main(String[] args) {
        // Code to create a new file
        /*
         myFile = new File("cwh111file.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
            throw new RuntimeException(e);
        }

         */

        // Code to write to a file
        /*
        try {
            FileWriter fileWriter = new FileWriter("cwh111file.txt");
            fileWriter.write("This is a first file from this java course \nOkay now bye");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         */

        //Reading a file
        /*
        File myFile = new File("cwh111file.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()) {
                String str = sc.nextLine();
                str = str.trim();
                System.out.println(str);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

         */

        // Deleting the file
        File myFile = new File("cwh111file.txt");
        if (myFile.delete()) {
            System.out.println("File deleted successfully: " + myFile.getName());
        }
        else {
            System.out.println("Some error occured while deleting the file: " + myFile.getName());
        }


    }
}
