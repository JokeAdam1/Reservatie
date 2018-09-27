package be.vives.ti;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZeilbootTest {

    Zeilboot boot1;
    Zeilboot boot2;
    Zeilboot boot3;
    Zeilboot boot4;

    @Before
    public void setUp() throws Exception {
        boot1 = new Zeilboot("zeilboot1", true, true);
        boot2 = new Zeilboot("zeilboot2", false, false);
        boot3 = new Zeilboot("zeilboot3", true, false);
        boot4 = new Zeilboot("zeilboot4", false, true);
    }

    @Test
    public void isGPSAanBoord() {
        assertEquals(true, boot1.isGPSAanBoord());
        assertEquals(false, boot2.isGPSAanBoord());
        assertEquals(false, boot3.isGPSAanBoord());
        assertEquals(true, boot4.isGPSAanBoord());
    }

    @Test
    public void prijsPerUur() {
        assertEquals(54, boot1.prijsPerUur(), 0.0);
        assertEquals(50, boot2.prijsPerUur(), 0.0);
        assertEquals(52.50, boot3.prijsPerUur(), 0.0);
        assertEquals(51.50, boot4.prijsPerUur(), 0.0);
    }

    @Test
    public void getNaam() {
        assertEquals("zeilboot1", boot1.getNaam());
        assertEquals("zeilboot2", boot2.getNaam());
        assertEquals("zeilboot3", boot3.getNaam());
        assertEquals("zeilboot4", boot4.getNaam());
    }

    @Test
    public void setNaam() {
        boot1.setNaam("zb");
        assertEquals("zb", boot1.getNaam());
        assertEquals(54, boot1.prijsPerUur(), 0.0);
        assertEquals(true, boot1.isGPSAanBoord());
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