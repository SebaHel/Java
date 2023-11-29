package org.example;

import java.time.LocalDate;


public class Terminal {
    public final Hangar hangar;
    public final InAir InAir;


    public Terminal(Hangar hangar, InAir InAir) {
        this.hangar = hangar;
        this.InAir = InAir;
    }

    public static boolean isFull( Terminal terminal, Plane plane) {
        if (terminal.hangar.showPlane(plane).getNumber_of_seats() > terminal.hangar.showPlane(plane).numberofClients()) {
            return false;
        } else {
            return true;
        }
    }
    static boolean isNotAvaible( Terminal terminal, Plane plane) {
        if (LocalDate.now().isBefore(terminal.hangar.showPlane(plane).getStartDate()) && isExisting(plane, terminal)) {
            terminal.InAir.addPlane(plane);
            terminal.hangar.removePlane(plane);
            return true;
        }
        return false;
    }

    static boolean isExisting(Plane plane,  Terminal terminal){
        Plane plane1 = terminal.hangar.showPlane(plane);
        Plane plane2 = terminal.InAir.showPlane(plane);
        if (plane1 == plane || plane2 == plane){
            return true;
        }else {
            return false;
        }
    };

    static LocalDate updateIfPlaneLanded( Terminal terminal, LocalDate newstartdate, LocalDate newlandingDate, Plane plane){
            if (LocalDate.now().isAfter(terminal.InAir.showPlane(plane).getLandingDate())) {
                plane.clearClient();
                plane.setStartDate(newstartdate);
                plane.setLandingDate(newlandingDate);
                terminal.hangar.addPlane(plane);
                terminal.InAir.removePlane(plane);
                return terminal.hangar.showPlane(plane).getStartDate();
            }
            else {
                return plane.getLandingDate();
            }

    }



}
