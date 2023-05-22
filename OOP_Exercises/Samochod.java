package Zadanie;

public class Samochod extends Pojazd {
    private Segment segment;
    private String VIN;

    public Samochod(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika, double moc, double momentObrotowy, Segment segment, String VIN) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.segment = segment;
        this.VIN = VIN;
    }

    public void wyswietl() {
        System.out.println("Samochod " + getNrPojazdu() + " z " + getMaxLiczbaPojazdow() + ":");
        System.out.println("    Marka: " + getMarka());
        System.out.println("    Nazwa: " + getNazwa());
        System.out.println("    Pojemność silnika: " + getPojemnoscSilnika());
        System.out.println("    Rodzaj silnika: " + getRodzajSilnika());
        System.out.println("    Segment: " + segment);
        System.out.println("    VIN: " + VIN + '\n');
    }

    public enum Segment {A, B, C, D, E, F, SUV, VAN, INNY}
}
