package Zadanie;

public class Jednoslad extends Pojazd {
    public enum TypJednosladu {
        ROWER, HULAJNOGA, SKUTER_ELEKTRYCZNY, MOTOCYKL
    }

    private TypJednosladu typJednosladu;

    public Jednoslad(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika, double moc, double momentObrotowy, TypJednosladu typJednosladu) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.typJednosladu = typJednosladu;
    }

    public void wyswietl() {
        System.out.printf("Jednoslad %d z %d:%n", getNrPojazdu(), getMaxLiczbaPojazdow());
        System.out.printf("    Marka: %s%n", getMarka());
        System.out.printf("    Nazwa: %s%n", getNazwa());
        System.out.printf("    Moc: %.2f kW%n", getMoc());
        System.out.printf("    Moment obrotowy: %.2f Nm%n%n", getMomentObrotowy());
        if (typJednosladu != null) {
            System.out.printf("    Typ jednosladu: %s%n%n", typJednosladu);
        }
    }
}
