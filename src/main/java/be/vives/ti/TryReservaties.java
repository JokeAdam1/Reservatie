package be.vives.ti;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class TryReservaties {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Boot> boten = new ArrayList<>();
        ArrayList<Lid> leden = new ArrayList<>();
        ArrayList<Reservatie> reservaties = new ArrayList<>();

        Zeilboot z = new Zeilboot("zb1", false, false);
        boten.add(z);
        boten.add(new Zeilboot("zb2", false, true));
        boten.add(new Zeilboot("zb3", true, false));
        boten.add(new Zeilboot("zb4", true, true));
        boten.add(new Motorboot("mb1", true, true));
        boten.add(new Motorboot("mb2", false, true));
        boten.add(new Motorboot("mb3", true, false));
        boten.add(new Motorboot("mb4", false, false));

        leden.add(new Lid("gewoon0", "056/000000"));
        leden.add(new Lid("gewoon1", "056/111111"));
        leden.add(new GoudenLid("gouden1", "056/222222", 10));
        leden.add(new GoudenLid("gouden2", "056/333333", 5));
        leden.add(new GoudenLid("gouden3", "056/444444", 3));

        reservaties.add(new Reservatie(leden.get(0), boten.get(0), 1));
        reservaties.add(new Reservatie(leden.get(1), boten.get(2), 20));
        reservaties.add(new Reservatie(leden.get(2), boten.get(4), 5));
        reservaties.add(new Reservatie(leden.get(3), boten.get(6), 1.5));
        reservaties.add(new Reservatie(leden.get(4), boten.get(3), 15));

        

        for (Reservatie r : reservaties) {
            System.out.println("----------------------------------");
            System.out.println(r);
            System.out.println("Prijs= " + r.teBetalen());
        }
    }
}
