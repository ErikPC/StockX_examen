package edu.poniperro.stockx.criteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;
import edu.poniperro.stockx.item.Sale;

public class LastSale implements Criteria {
    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Offer lastSale = new Sale("null", 0);
        for (Offer offer : sneaker.offers()) {
            if (offer instanceof Sale) {
                lastSale = offer;
            }
        }
        List<Offer> sale = new ArrayList<Offer>(Arrays.asList(lastSale));
        return sale;
    }

}
