package com.jalindsay;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

// Backend Exercise for Polestar
// Uses Maven for build process
public class Main {

    // Main method as entry point
    public static void main(String[] args) {

        Main program = new Main();
        program.run(args);
    }

    public void run(String[] args) {

        // Get input and output file paths from command line parameters
        // expecting this to be input.json and output.sql
        String inputPath = args[0];
        String outputPath = args[1];

        ObjectMapper mapper = new ObjectMapper();
        // Get fileUrl from given file path
        URL fileUrl = this.getClass().getClassLoader().getResource(inputPath);
        File file = null;

        // If file cannot be found fileUrl will be null
        // If not null then assign to File object
        if (fileUrl != null) {
            file = new File(fileUrl.getFile());
        } else {
            System.err.println("File not found");
        }

        // Initialize Entry list
        Entry[] entries = new Entry[0];

        // use the JSON mapper to get the JSON into java entity format
        try {
            entries = mapper.readValue(file, Entry[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Once we have the list of Entry objects create a generic INSERT statement for each
        // Write the output to an SQL file
        try {
            FileWriter myWriter = new FileWriter(outputPath);
            for (Entry entry : entries) {
                myWriter.write("INSERT INTO entry VALUES ("
                    + entry.getName() + ","
                    + entry.getAlarmColor() + ","
                    + entry.getId() + ","
                    + entry.getDatasourcesCount() + ","
                    + entry.get_alertIcon() + ","
                    + entry.getElementCount() + ","
                    + entry.getUniqueId() + ");\n");
            }
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
