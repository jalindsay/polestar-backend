package com.jalindsay;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Main program = new Main();
        program.run(args);

    }

    public void run(String[] args) {

        String inputPath = args[0];
        String outputPath = args[1];

        ObjectMapper mapper = new ObjectMapper();

        File file = new File(
            this.getClass().getClassLoader().getResource(inputPath).getFile()
        );

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
