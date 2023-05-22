package Zadanie;


public class Kosiarka extends Machine {
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public Kosiarka(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika, boolean czyMelekser, boolean czyNaped, int liczbaOstrzy) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.czyMelekser = czyMelekser;
        this.czyNaped = czyNaped;
        this.liczbaOstrzy = liczbaOstrzy;
    }
    public void wyswietl() {
        System.out.printf("Kosiarka %s %s z silnikiem %s (pojemnosc %.2f litrow)%n", getMarka(), getNazwa(), getRodzajSilnika(), getPojemnoscSilnika());
        System.out.printf("    Melekser: %b%n", czyMelekser);
        System.out.printf("    Naped: %b%n", czyNaped);
        System.out.printf("    Liczba ostrzy: %d%n%n", liczbaOstrzy);
    }
    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }

    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }

    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }
}
