package be.vives.ti;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MotorbootTest {

    Motorboot boot1;
    Motorboot boot2;
    Motorboot boot3;
    Motorboot boot4;
    @Before
    public void setUp() throws Exception {
        boot1 = new Motorboot("motorboot1", true, true);
        boot2 = new Motorboot("motorboot2", false, false);
        boot3 = new Motorboot("motorboot3", true, false);
        boot4 = new Motorboot("motorboot4", false, true);
    }

    @Test
    public void isFishFinderAanBoord() {
        assertEquals(true, boot1.isFishFinderAanBoord());
        assertEquals(false, boot2.isFishFinderAanBoord());
        assertEquals(false, boot3.isFishFinderAanBoord());
        assertEquals(true, boot4.isFishFinderAanBoord());
    }

    @Test
    public void prijsPerUur() {
        assertEquals(28, boot1.prijsPerUur(), 0.0);
        assertEquals(25, boot2.prijsPerUur(), 0.0);
        assertEquals(26.25, boot3.prijsPerUur(), 0.0);
        assertEquals(26.75, boot4.prijsPerUur(), 0.0);
    }

    @Test
    public void getNaam() {
        assertEquals("motorboot1", boot1.getNaam());
        assertEquals("motorboot2", boot2.getNaam());
        assertEquals("motorboot3", boot3.getNaam());
        assertEquals("motorboot4", boot4.getNaam());
    }

    @Test
    public void setNaam() {
        boot1.setNaam("mb");
        assertEquals("mb", boot1.getNaam());
        assertEquals(28, boot1.prijsPerUur(), 0.0);
        assertEquals(true, boot1.isFishFinderAanBoord());
        assertEquals(true, boot1.isRadarAanBoord());
    }

    @Test
    public void isRadarAanBoord() {
        assertEquals(true, boot1.isRadarAanBoord());
        assertEquals(false, boot2.isRadarAanBoord());
        assertEquals(true, boot3.isRadarAanBoord());
        assertEquals(false, boot4.isRadarAanBoord());
    }
}