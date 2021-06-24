package com.wcs.file;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> team = new ArrayList<Person>();
        
        PersonInputStream pis = new PersonInputStream("persons.txt");
        team = pis.read();
        
        PersonOutputStream pos = new PersonOutputStream("resultat.csv");
        pos.write(team);
        
    }
}
