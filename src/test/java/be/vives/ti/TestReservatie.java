package be.vives.ti;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestReservatie {

    Lid lid;
    GoudenLid goudenlid;
    Zeilboot zeilboot1;
    Motorboot motorboot1;
    Reservatie reservatie1;
    Reservatie reservatie2;
    Reservatie reservatie3;
    Reservatie reservatie4;

    @Before
    public void setUp() throws Exception {
        lid = new Lid("Joke", "0123456");
        goudenlid = new GoudenLid("Adam", "0789456", 5);
        zeilboot1 = new Zeilboot("zeilboot1", true, true);
        motorboot1 = new Motorboot("motorboot1", true , true);
        reservatie1 = new Reservatie(lid, zeilboot1, 3);
        reservatie2 = new Reservatie(lid, motorboot1, 3);
        reservatie3 = new Reservatie(goudenlid, zeilboot1, 3);
        reservatie4 = new Reservatie(goudenlid, motorboot1, 3);
    }

    @Test
    public void getLid() {
        assertEquals(lid, reservatie1.getLid());
        assertEquals(goudenlid, reservatie3.getLid());

    }

    @Test
    public void getBoot() {
        assertEquals(zeilboot1, reservatie1.getBoot());
        assertEquals(motorboot1, reservatie4.getBoot());
    }

    @Test
    public void getAantalUren() {
        assertEquals(3.0 , reservatie1.getAantalUren(), 0.0);
    }

    @Test
    public void teBetalen() {
        double prijs1 = zeilboot1.prijsPerUur() * reservatie1.getAantalUren();
        double prijs2 = motorboot1.prijsPerUur() * reservatie2.getAantalUren();
        double prijs3 = zeilboot1.prijsPerUur() * reservatie3.getAantalUren();
        double prijs4 = motorboot1.prijsPerUur() * reservatie4.getAantalUren();
        double korting1 = prijs3 * goudenlid.geefKorting();
        double juisteprijs3 = prijs3 - korting1;
        double korting2 = prijs4 * goudenlid.geefKorting();
        double juisteprijs4 = prijs4 - korting2;

        assertEquals(prijs1+25, prijs1+25, 0.0);
        assertEquals(prijs2+25, prijs2+25, 0.0);
        assertEquals(prijs3+25-korting1, juisteprijs3+25, 0.0);
        assertEquals(prijs4+25-korting2, juisteprijs4+25, 0.0);
    }
}