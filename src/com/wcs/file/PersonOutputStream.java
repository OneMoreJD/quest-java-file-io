package com.wcs.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersonOutputStream {

    File f;

    public PersonOutputStream(String fileName) {
        f = new File(fileName);
    }

    public void write(Person person) {
        FileWriter fw;
        try {
            fw = new FileWriter(f);
            fw.write("last name; first name; age\r\n");
            fw.write(person.display() + "\r\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
