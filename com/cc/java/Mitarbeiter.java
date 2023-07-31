package com.cc.java;

public class Mitarbeiter {
    
    private String firstName;
    private String familyName;
    private String role;
    private int yearOfEntry;
    
    
    public Mitarbeiter(String firstName, String familyName, String role, int yearOfEntry) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.role = role;
        this.yearOfEntry = yearOfEntry;
    }

    public String getInfo(String value) {
        switch (value) {
            case "firstName":
                return this.firstName;
            case value:
                return
            case value:
                return
            case value:
                return
            default:
                break;
        }
    }

    
}