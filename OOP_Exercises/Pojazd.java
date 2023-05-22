package Zadanie;

public class Pojazd extends Machine {

    private static int maxLiczbaPojazdow = 12;
    private static int nrPojazdu = 0;
    protected double moc;
    protected double momentObrotowy;
    public Pojazd(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika, double moc, double momentObrotowy) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;

        if (nrPojazdu < maxLiczbaPojazdow) {
            nrPojazdu = nrPojazdu + 1;
        } else {
            throw new IllegalStateException("Osiągnięto maksymalną liczbę pojazdów!");
        }
    }
    public double getMoc() {
        return moc;
    }
    public double getMomentObrotowy() {
        return momentObrotowy;
    }
    public int getNrPojazdu() {
        return nrPojazdu;
    }
    public int getMaxLiczbaPojazdow() {
        return maxLiczbaPojazdow;
    }
    public void wyswietl() {
        System.out.printf("Pojazd %d z %d: %s %s z silnikiem %s (pojemnosc %.2f litrow)%n", getNrPojazdu(), getMaxLiczbaPojazdow(), getMarka(), getNazwa(), getRodzajSilnika(), getPojemnoscSilnika());
        System.out.printf("    Moc: %.2f kW%n", getMoc());
        System.out.printf("    Moment obrotowy: %.2f Nm%n%n", getMomentObrotowy());
    }
}
