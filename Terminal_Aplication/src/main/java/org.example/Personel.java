package org.example;

public class Personel {
    private String name;
    private int employee_number;
    private Position position;
    private int phone_number;
    private String email;

    public Personel(String name, int employee_number, Position position, int phone_number, String email) {
        this.name = name;
        this.employee_number = employee_number;
        this.position = position;
        this.phone_number = phone_number;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getEmployee_number() {
        return employee_number;
    }

    public Position getPosition() {
        return position;
    }

    public int getPhone_number() {
        return phone_number;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "name='" + name + '\'' +
                ", employee_number=" + employee_number +
                ", position=" + position +
                ", phone_number=" + phone_number +
                ", email='" + email + '\'' +
                '}';
    }
}
