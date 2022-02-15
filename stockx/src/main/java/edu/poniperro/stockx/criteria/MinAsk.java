package edu.poniperro.stockx.criteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.poniperro.stockx.item.Ask;
import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

public class MinAsk implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Offer minAsk = new Ask("null", 9999);
        for (Offer offer : sneaker.offers()) {
            if (offer instanceof Ask && offer.value() <= minAsk.value()) {
                minAsk = offer;
            }
        }
        List<Offer> ask = new ArrayList<Offer>(Arrays.asList(minAsk));
        return ask;
    }

}
