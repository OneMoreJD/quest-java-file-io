package com.wcs.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PersonInputStream {

    File currentFile;
    FileInputStream fileInputStream;
    Person person;
    
    public PersonInputStream(String fileName) {
        currentFile = new File(fileName);
        person = new Person();
    }

    public Person read() {
        try {
            fileInputStream = new FileInputStream(currentFile);

            FileReader fr = new FileReader(currentFile);
            BufferedReader br = new BufferedReader(fr);
            
            person.setFirstName(br.readLine());
            person.setLastName(br.readLine());
            person.setAge(Integer.parseInt(br.readLine()));
            
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return person;
    }
}
