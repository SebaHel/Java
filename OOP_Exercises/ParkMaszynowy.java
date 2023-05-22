package Zadanie;
public class ParkMaszynowy {
    public static Machine[] listaMaszyn;

    public static void main(String[] args) {
        Lokomotywa lokomot1 = new Lokomotywa("Lokomotos", "szybkos", 20.0, Machine.RodzajSilnika.DIESEL, 50,  6000);
        Lokomotywa lokomot2 = new Lokomotywa("Ciuch", "szyb", 50.0, Machine.RodzajSilnika.DIESEL, 80, 80000);
        Kosiarka kosiarka1 = new Kosiarka("Bosh", "osh", 1.5, Machine.RodzajSilnika.BENZYNA, true, true, 2);
        Kosiarka kosiarka2 = new Kosiarka("Ryobi", "yobi", 2.2, Machine.RodzajSilnika.ELEKTRYCZNY, false, true, 3);
        Samochod samochod1 = new Samochod("Map", "ap", 4.0, Machine.RodzajSilnika.DIESEL, 200, 400,Samochod.Segment.B, "123443211");
        Samochod samochod2 = new Samochod("Tap", "kap", 3.6, Machine.RodzajSilnika.DIESEL, 300, 700,Samochod.Segment.A, "987654321");
        Jednoslad jednoslad1 = new Jednoslad("Rap", "lap", 0.5, Machine.RodzajSilnika.HYBRYDOWY, 10, 7, Jednoslad.TypJednosladu.HULAJNOGA);
        Jednoslad jednoslad2 = new Jednoslad("Sap", "dap", 0.8, Machine.RodzajSilnika.HYBRYDOWY, 10, 7, Jednoslad.TypJednosladu.ROWER);

        Machine[] listaMaszyn = {lokomot1, lokomot2, kosiarka1, kosiarka2, samochod1, samochod2, jednoslad1, jednoslad2};

        for (Machine maszyna : listaMaszyn) {
            maszyna.wyswietl();
        }
    }
}
