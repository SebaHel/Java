package Zadanie;

    public class Main {
    public static void main(String[] args) {

        Lokomotywa lokomotywa = new Lokomotywa("AmericanExpres", "Szybki", 9.0, Machine.RodzajSilnika.DIESEL, 12, 6200);
        Kosiarka kosiarka = new Kosiarka("bush", "George", 1.0, Machine.RodzajSilnika.BENZYNA, false, true, 4);
        Pojazd pojazd = new Pojazd("Skoda", "Fabia", 1.8, Machine.RodzajSilnika.DIESEL, 125, 225);
        Pojazd pojazdzik = new Pojazd("Mercedes", "CLS200", 2.0, Machine.RodzajSilnika.BENZYNA, 320, 420);
        Pojazd pojazdeczek = new Pojazd("Chevrolet", "Camaro", 3.6, Machine.RodzajSilnika.BENZYNA, 340, 530);
        Jednoslad jeden = new Jednoslad("Kawaski", "Talon", 0.5, Machine.RodzajSilnika.BENZYNA, 25, 40,Jednoslad.TypJednosladu.SKUTER_ELEKTRYCZNY);
        Jednoslad dwa = new Jednoslad("Shimano", "Polo", 0, Machine.RodzajSilnika.BRAK, 3, 20, Jednoslad.TypJednosladu.ROWER);
        Samochod samochod = new Samochod("Opel", "Insignia", 1.9, Machine.RodzajSilnika.DIESEL, 205, 310, Samochod.Segment.C,null);

        Machine[] maszyna = {pojazd, pojazdzik, pojazdeczek, jeden, dwa, samochod, kosiarka, lokomotywa};
        for (Machine maszyna1 : maszyna) {
            maszyna1.wyswietl();
        }


    }
}
