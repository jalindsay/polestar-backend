package com.jalindsay;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

        Main program = new Main();
        program.run(args);

    }

    public void run(String[] args) {

        String inputPath = args[0];
        String outputPath = args[1];

        ObjectMapper mapper = new ObjectMapper();

        URL fileUrl = this.getClass().getClassLoader().getResource(inputPath);
        File file = null;

        if (fileUrl != null) {
            file = new File(fileUrl.getFile());
        } else {
            System.err.println("File not found");
        }

        Entry[] entries = new Entry[3];
        try {
            entries = mapper.readValue(file, Entry[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }

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
