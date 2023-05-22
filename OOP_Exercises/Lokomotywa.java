package Zadanie;

public class Lokomotywa extends Machine {
    private int spalanieSilnika;
    private int mocSilnika;

    public Lokomotywa(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika, int spalanieSilnika, int mocSilnika) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.spalanieSilnika = spalanieSilnika;
        this.mocSilnika = mocSilnika;
    }

    public void wyswietl() {
        System.out.println("Lokomotywa " + getMarka() + " " + getNazwa() + " z silnikami " + getRodzajSilnika() + " (pojemnosc " + getPojemnoscSilnika() + " litrow)");
        System.out.println("    Spalanie silnika: " + spalanieSilnika + " Litra");
        System.out.println("    Moc silnika: " + mocSilnika + " KM" + '\n');
    }
}
