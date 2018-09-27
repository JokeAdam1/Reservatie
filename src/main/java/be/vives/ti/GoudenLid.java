package be.vives.ti;

public class GoudenLid extends Lid {
    private int aantalAandelen;

    public GoudenLid(String naam, String tel, int aandelen) {
        super(naam, tel);
        setAantalAandelen(aandelen);

    }

    public int getAantalAandelen() {
        return aantalAandelen;
    }

    public void setAantalAandelen(int aantalAandelen) {
        if (aantalAandelen > 0) {
            this.aantalAandelen = aantalAandelen;
        } else {
            this.aantalAandelen = 0;
        }
    }
    @Override
    public double geefKorting() {
        return 0.05;
    }

    @Override
    public String toString() {
        return super.toString() + "\naantal aandelen: " + aantalAandelen;
    }
}
