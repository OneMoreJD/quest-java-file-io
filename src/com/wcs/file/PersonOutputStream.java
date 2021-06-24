package com.wcs.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PersonOutputStream {

    File f;

    public PersonOutputStream(String fileName) {
        f = new File(fileName);
    }

    public void write(ArrayList<Person> team) {
        FileWriter fw;
        try {
            fw = new FileWriter(f);
            fw.write("last name; first name; age\r\n");
            for (Person person : team) {
                fw.write(person.display() + "\r\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
