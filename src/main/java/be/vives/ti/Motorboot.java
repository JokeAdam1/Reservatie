package be.vives.ti;

import javax.rmi.PortableRemoteObject;

public class Motorboot extends Boot {

    private boolean fishFinderAanBoord;
    private static final double TOESLAG_PERCENTAGE_FISHFINDER = 0.07;
    private static final double PRIJS_MOTORBOOT = 25.0;

    public Motorboot(String naam, boolean radar, boolean fishfinder) {
        super(naam, radar, PRIJS_MOTORBOOT);
        fishFinderAanBoord = fishfinder;
    }

    public boolean isFishFinderAanBoord() {
        return fishFinderAanBoord;
    }

    @Override
    public double prijsPerUur() {
        double toeslag1 = 0.0;
        double toeslag2 = 0.0;
        if (isRadarAanBoord()) {
            toeslag1 = PRIJS_MOTORBOOT * TOESLAG_PERCENTAGE_RADAR;
        }

        if (isFishFinderAanBoord()) {
            toeslag2 = PRIJS_MOTORBOOT * TOESLAG_PERCENTAGE_FISHFINDER;
        }

        return PRIJS_MOTORBOOT + toeslag1 + toeslag2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Motorboot:\n");
        sb.append(super.toString());
        sb.append("\n en heeft");
        if (fishFinderAanBoord) {
            sb.append(" een");
        } else {
            sb.append(" geen");
        }
        sb.append(" fishfinder aan boord");
        return sb.toString();
    }
}
