package com.example.demo.List;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table
public class Bus {
    @Id
    @SequenceGenerator(
            name = "Bus_sequence",
            sequenceName = "Bus_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Bus_sequence"
    )
    private Long id;
    @Column(name = "lane_number")
    private String lane;

    @Column(name = "from_location")
    private String fromLocation;

    @Column(name = "arrival_time", nullable = false)
    private LocalTime localTime;

    @Column(name = "desination", nullable = false)
    private String destination;


    public Bus() {

    }

    public Bus(Long id, String lane, String fromLocation, LocalTime localTime, String destination) {
        this.id = id;
        this.lane = lane;
        this.fromLocation = fromLocation;
        this.localTime = localTime;
        this.destination = destination;
    }

    public Bus(String lane, String fromLocation, LocalTime localTime, String destination) {
        this.lane = lane;
        this.fromLocation = fromLocation;
        this.localTime = localTime;
        this.destination = destination;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", lane=" + lane +
                ", fromLocation='" + fromLocation + '\'' +
                ", localDateTime=" + localTime +
                ", destination='" + destination + '\'' +
                '}';
    }
}
