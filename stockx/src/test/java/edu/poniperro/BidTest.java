package edu.poniperro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.poniperro.stockx.item.Bid;

public class BidTest {
    Bid pujaJuan = new Bid("6", 500);
    Bid pujaSamuele = new Bid("6", 550);
    Bid pujaJosep = new Bid("6", 550);

    @Test
    public void sizeTest() {
        assertEquals("6", pujaJosep.size());
        assertEquals("6", pujaJuan.size());
        assertEquals("6", pujaSamuele.size());
    }

    @Test
    public void valueTest() {
        assertEquals(500, pujaJuan.value());
        assertEquals(550, pujaSamuele.value());
    }

    @Test
    public void compareToTest() {
        assertEquals(1, pujaSamuele.compareTo(pujaJuan));
        assertEquals(0, pujaSamuele.compareTo(pujaJosep));
        assertEquals(-1, pujaJuan.compareTo(pujaSamuele));
    }
}
