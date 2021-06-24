package com.wcs.file;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        Person person = new Person();
        PersonInputStream pis = new PersonInputStream("one_person.txt");
        PersonOutputStream pos = new PersonOutputStream("one_resultat.csv");

        person = pis.read();
        pos.write(person);
        
        ArrayList<Person> team = new ArrayList<Person>();
        TeamInputStream tis = new TeamInputStream("persons.txt");
        TeamOutputStream tos = new TeamOutputStream("resultat.csv");

        team = tis.read();
        tos.write(team);
        
    }
}
