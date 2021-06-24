package com.wcs.file;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String aFirstName) {
        firstName = aFirstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String aLastName) {
        lastName = aLastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int aAge) {
        age = aAge;
    }
    
    public String display() {
        return lastName + ";" + firstName + ";" + age ;
    }
    
}
