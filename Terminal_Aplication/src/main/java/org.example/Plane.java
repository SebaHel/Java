package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Plane {

    private String name;
    private String PlaneID;
    private int Number_of_seats;
    private Personel personel;
    private List<Client> Clients = new ArrayList<>();

    private LocalDate startDate;
    private LocalDate landingDate;

    Plane(String name, String PlaneID, Personel personel, int number_of_seats, LocalDate startDate, LocalDate landingDate) {
        this.name = name;
        this.PlaneID = PlaneID;
        this.Number_of_seats = number_of_seats;
        this.personel = personel;
        this.startDate = startDate;
        this.landingDate = landingDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setLandingDate(LocalDate landingDate) {
        this.landingDate = landingDate;
    }

    public String getName() {
        return name;
    }

    public String getPlaneID() {
        return PlaneID;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getLandingDate() {
        return landingDate;
    }

    public List<Client> getClients() {
        return Clients;
    }

    public int numberofClients() {
        return Clients.size();
    }

    public int getNumber_of_seats() {
        return Number_of_seats;
    }

    public void addClient(Client Client) {
        if (Number_of_seats > Clients.size()) {
            Clients.add(Client);
        }
    }

    public void clearClient() {
        Clients.clear();
    }


    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", PlaneID='" + PlaneID + '\'' +
                ", Number_of_seats=" + Number_of_seats +
                ", personel=" + personel +
                ", Clients=" + Clients +
                ", startDate=" + startDate +
                ", landingDate=" + landingDate +
                '}';
    }
}
