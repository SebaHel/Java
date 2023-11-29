package org.example;

import java.util.ArrayList;
import java.util.List;

public class InAir {
    private List<Plane> planes = new ArrayList<>();


    public List<Plane> getInAir() {
        return planes;
    }

    public void removePlane(Plane plane) {
        planes.remove(plane);
    }

    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    public Plane showPlane(Plane plane) {
        for (Plane i : planes) {
            if (i == plane) {
                return plane;
            }
        }
        return null;
    }

}
