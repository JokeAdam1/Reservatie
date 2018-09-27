package be.vives.ti;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestGoudenLid {

    GoudenLid lid;

    @Before
    public void setUp()  {
        lid = new GoudenLid("Joke", "012345678",5);
    }

    @Test
    public void getAantalAandelen() {
        assertEquals(5, lid.getAantalAandelen());
    }

    @Test
    public void setAantalAandelen() {
        lid.setAantalAandelen(3);
        assertEquals(3 , lid.getAantalAandelen());
        assertEquals("Joke", lid.getNaam());
        assertEquals("012345678", lid.getTel());
    }

    @Test
    public void setAantalNegatieveAandelen() {
        lid.setAantalAandelen(-3);
        assertEquals(0, lid.getAantalAandelen());
        assertEquals("Joke", lid.getNaam());
        assertEquals("012345678", lid.getTel());
    }

    @Test
    public void geefKorting() {
        assertEquals(0.05 , lid.geefKorting(), 0.0);

    }

    @Test
    public void getTel() {
        assertEquals("012345678", lid.getTel());
    }

    @Test
    public void setTel() {
        lid.setTel("9999");
        assertEquals("9999", lid.getTel());
        assertEquals(5, lid.getAantalAandelen());
        assertEquals("Joke", lid.getNaam());
    }

    @Test
    public void getNaam() {
        assertEquals("Joke", lid.getNaam());
    }

}