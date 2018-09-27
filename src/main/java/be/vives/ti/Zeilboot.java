package be.vives.ti;
public class Zeilboot extends Boot {
    private boolean gpsAanBoord;
    private static final double TOESLAG_PERCENTAGE_GPS = 0.03;
    private static final double PRIJS_ZEILBOOT = 50.0;

    public Zeilboot(String naam, boolean radar, boolean gps) {
        super(naam, radar, PRIJS_ZEILBOOT);
        gpsAanBoord = gps;
    }

    public boolean isGPSAanBoord() {
        return gpsAanBoord;
    }


    public double prijsPerUur() {
        double toeslag1 = 0.0;
        double toeslag2 = 0.0;
        if (isRadarAanBoord()) {
            toeslag1 = PRIJS_ZEILBOOT * TOESLAG_PERCENTAGE_RADAR;
        }

        if (gpsAanBoord) {
            toeslag2 = PRIJS_ZEILBOOT * TOESLAG_PERCENTAGE_GPS;
        }

        return PRIJS_ZEILBOOT + toeslag1 + toeslag2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Zeilboot:\n");
        sb.append(super.toString());
        sb.append("\n en heeft");
        if (gpsAanBoord) {
            sb.append(" een");
        } else {
            sb.append(" geen");
        }
        sb.append(" gps aan boord");
        return sb.toString();
    }

}
