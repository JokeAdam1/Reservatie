package be.vives.ti;
public class Boot {

    private String naam;
    private boolean radarAanBoord;
    private double prijs;

    protected static final double TOESLAG_PERCENTAGE_RADAR = 0.05;


    protected Boot(String naam, boolean radar, double prijs) {
        this.naam = naam;
        radarAanBoord = radar;
        this.prijs = prijs;
    }

    protected String getNaam() {
        return naam;
    }

    protected void setNaam(String naam) {
        this.naam = naam;
    }

    protected boolean isRadarAanBoord() {
        return radarAanBoord;
    }


    protected double prijsPerUur() {
        return 0.0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(naam + " heeft");
        if (radarAanBoord) {
            sb.append(" een");
        } else {
            sb.append(" geen");
        }
        sb.append(" radar aan boord");
        return sb.toString();
    }
}


