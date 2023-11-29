package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AppTest
{
    private Hangar hangar;
    private InAir inAir;
    private Terminal terminal;
    private LocalDate startDate = LocalDate.of(2023,5,12);
    private LocalDate landingDate = LocalDate.of(2023,7,13);
    @BeforeEach
    void Init(){
        hangar = new Hangar();
        inAir = new InAir();
        terminal = new Terminal(hangar,inAir);

    }

    @Test
    void checkIsNotFull(){

        //given
        Plane plane = new Plane("Boeing","1",null,200, startDate,landingDate);
        terminal.hangar.addPlane(plane);
        //when
        boolean result = terminal.isFull(terminal,plane);
        //then
        assertFalse(result);
    }

    @Test
    void checkIfIsFull() {
        //given
        Plane plane = new Plane("Boeing","1",null,0, startDate,landingDate);
        terminal.hangar.addPlane(plane);
        //when
        boolean result = terminal.isFull(terminal,plane);
        //then
        assertTrue(result);
    }
    @Test
    void PlaneIsExistingInHangar(){
        //given
        Plane plane = new Plane("Boeing","1",null,200, startDate,landingDate);
        terminal.hangar.addPlane(plane);
        //when
        boolean result = terminal.isExisting(plane,terminal);
        //then
        assertTrue(result);

    }
    @Test
    void PlaneIsExistingInAir(){
        //given
        Plane plane = new Plane("Boeing","1",null,200, startDate,landingDate);
        terminal.InAir.addPlane(plane);
        //when
        boolean result = terminal.isExisting(plane,terminal);
        //then
        assertTrue(result);

    }
    @Test
    void PlaneIsNotExisting(){
        //given
        Plane plane = new Plane("Boeing","1",null,200, startDate,landingDate);
        //when
        boolean result = terminal.isExisting(plane,terminal);
        //then
        assertFalse(result);

    }
    @Test
    void PlaneIsNotAvaible(){
        //given
        Plane plane = new Plane("Boeing","1",null,200, startDate,landingDate);
        terminal.hangar.addPlane(plane);
        //when
        boolean result = terminal.isNotAvaible(terminal,plane);
        //then
        assertFalse(result);
    }
    @Test
    void PlaneIsAvaible(){
        //given
        LocalDate startDate = LocalDate.of(2025,5,12);
        Plane plane = new Plane("Boeing","1",null,200, startDate,landingDate);
        terminal.hangar.addPlane(plane);
        //when
        boolean result = terminal.isNotAvaible(terminal,plane);
        //then
        assertTrue(result);
    }

    @Test
    void PlaneIsLandedAndReturnedNewStartingDate(){
        //given
        LocalDate startDate = LocalDate.of(2025,5,12);
        Plane plane = new Plane("Boeing","1",null,200, startDate,landingDate);
        terminal.InAir.addPlane(plane);
        //when
        LocalDate result = terminal.updateIfPlaneLanded(terminal,LocalDate.of(2024,3,17),LocalDate.of(2024,7,12),plane);
        //then
        assertEquals(result,LocalDate.of(2024,3,17));
    }
    @Test
    void PlaneIsNotLandedAndReturnedOldLandingDate(){
        //given
        LocalDate startDate = LocalDate.of(2025,5,12);
        Plane plane = new Plane("Boeing","1",null,200, startDate,LocalDate.of(2024,7,12));
        terminal.InAir.addPlane(plane);
        //when
        LocalDate result = terminal.updateIfPlaneLanded(terminal,LocalDate.of(2024,3,17),LocalDate.of(2024,7,12),plane);
        //then
        assertEquals(result,LocalDate.of(2024,7,12));
    }



}
