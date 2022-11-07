package controller;

import java.util.Date;

public class Passport {

    private String name;
    private String surname;
    private int number;
    private String id;

    public Passport(String name, String surname, int number, String id) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "Name: '" + name + '\'' +
                "Surname: '" + surname + '\'' +
                "Number: " + number +
                "ID: '" + id + '\'' +
                '}';
    }
}
