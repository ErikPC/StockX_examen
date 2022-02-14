package edu.poniperro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;
import edu.poniperro.stockx.item.Sale;
import edu.poniperro.stockx.item.Sneaker;

public class SneakerTest {

    Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

    @Test
    public void getStyleTest() {
        assertEquals("555088-105", sneaker.getStyle());
    }

    @Test
    public void getNameTest() {
        assertEquals("Jordan 1 Retro High Dark Mocha", sneaker.getName());
    }

    @Test
    public void getSaleTest() {
        assertEquals(0, sneaker.getSale());
    }

    @Test
    public void offersTest() {
        sneaker.add(new Sale("6", 200));
        sneaker.add(new Sale("13", 500));
    }

}
