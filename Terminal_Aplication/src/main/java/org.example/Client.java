package org.example;

public class Client {
    protected String name;
    protected String surname;
    protected int Age;
    protected String Email;
    protected int Phone_number;

    Client(String Name, String surname, int Age, String Email, int Phone_number) {
        this.name = Name;
        this.surname = surname;
        this.Age = Age;
        this.Email = Email;
        this.Phone_number = Phone_number;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone_number(int phone_number) {
        Phone_number = phone_number;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return Email;
    }

    public int getPhone_number() {
        return Phone_number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return Age;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Age=" + Age +
                ", Email='" + Email + '\'' +
                ", Phone_number=" + Phone_number +
                '}';
    }
}
