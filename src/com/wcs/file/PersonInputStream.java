package com.wcs.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PersonInputStream {

    File currentFile;
    FileInputStream fileInputStream;
    ArrayList<Person> team;
    
    public PersonInputStream(String fileName) {
        currentFile = new File(fileName);
        team = new ArrayList<Person>();
    }

    public ArrayList<Person> read() {
        try {
            fileInputStream = new FileInputStream(currentFile);

            FileReader fr = new FileReader(currentFile);
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            int lineNumber = 0;
            Person p = new Person();
            while((line = br.readLine()) != null) {
                lineNumber++;
                if (lineNumber % 3 == 0) {
                    p.setAge(Integer.parseInt(line));
                    team.add(p);
                    
                    p = new Person();
                    lineNumber = 0;
                } else if (lineNumber % 2 == 0) {
                    p.setLastName(line);
                } else {
                    p.setFirstName(line);
                }
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return team;
    }
}
