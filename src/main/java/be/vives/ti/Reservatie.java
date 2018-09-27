package be.vives.ti;


public class Reservatie {

    private Lid lid;
    private Boot boot;
    private double aantalUren;

    public Reservatie(Lid lid, Boot boot, double aantalUren) {
        this.lid = lid;
        this.boot = boot;
        if (aantalUren > 0) {
            this.aantalUren = aantalUren;
        } else {
            System.out.println("Het aantal uren moet positief zijn.");
            this.aantalUren = 0;
        }
    }

    public Lid getLid() {
        return lid;
    }

    public Boot getBoot() {
        return boot;
    }

    public double getAantalUren() {
        return aantalUren;
    }


    public double teBetalen() {
        double prijs = boot.prijsPerUur() * aantalUren;
        double korting = lid.geefKorting();
        return (prijs - (prijs * korting));
    }

    @Override
    public String toString() {
        return lid + "\nreserveert\n" + boot + "\nvoor " + aantalUren + " uren.";
    }
}
