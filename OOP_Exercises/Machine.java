package Zadanie;

abstract class Machine {
    protected String marka;
    protected String nazwa;
    protected double pojemnoscSilnika;
    protected RodzajSilnika rodzajSilnika;

    enum RodzajSilnika {
        BENZYNA, DIESEL, ELEKTRYCZNY, HYBRYDOWY, BRAK
    }
    public Machine(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
    }
    public void wyswietl() {
        System.out.printf("Pojazd: %s %s z silnikiem %s (pojemnosc %.2f litrow)%n", getMarka(), getNazwa(), getRodzajSilnika(), getPojemnoscSilnika());
    }
    public String getMarka() {
        return marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public RodzajSilnika getRodzajSilnika() {
        return rodzajSilnika;
    }

}
