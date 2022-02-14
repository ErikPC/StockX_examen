package edu.poniperro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.poniperro.stockx.item.Sale;

public class SaleTest {
    Sale nike = new Sale("6", 200);
    Sale adidas = new Sale("13", 500);
    Sale joma = new Sale("9", 200);

    @Test
    public void valueTest() {
        assertEquals(200, nike.value());
        assertEquals(500, adidas.value());
        assertEquals(200, joma.value());
    }

    @Test
    public void sizeTest() {
        assertEquals("6", nike.size());
        assertEquals("13", adidas.size());
        assertEquals("9", joma.size());
    }

    @Test
    public void compareToTest() {
        assertEquals(1, nike.compareTo(adidas));
        assertEquals(0, nike.compareTo(joma));
        assertEquals(-1, adidas.compareTo(nike));
    }
}
