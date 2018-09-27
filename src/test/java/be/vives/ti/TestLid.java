package be.vives.ti;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestLid {

    Lid lid;

    @Before
    public void setUp() {
        lid = new Lid("Joke", "012345678");

    }

    @Test
    public void getTel() {
        assertEquals("012345678", lid.getTel());
    }

    @Test
    public void setTel() {
        lid.setTel("9999");
        assertEquals("9999", lid.getTel());
    }

    @Test
    public void getNaam() {
        assertEquals("Joke", lid.getNaam());
    }

    @Test
    public void geefKorting(){
        assertEquals(0.0, lid.geefKorting(), 0.0);
    }

}