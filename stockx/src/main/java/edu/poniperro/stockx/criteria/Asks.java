package edu.poniperro.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.poniperro.stockx.item.Ask;
import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

public class Asks implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> asks = new ArrayList<Offer>();
        for (Offer offer : sneaker.offers()) {
            if (offer instanceof Ask) {
                asks.add(offer);
            }
        }
        return asks;
    }

}
