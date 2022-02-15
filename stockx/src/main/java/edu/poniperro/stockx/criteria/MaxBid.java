package edu.poniperro.stockx.criteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.poniperro.stockx.item.Bid;
import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

public class MaxBid implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Offer maxBid = new Bid("null", 0);
        for (Offer offer : sneaker.offers()) {
            if (offer instanceof Bid && offer.value() >= maxBid.value()) {
                maxBid = offer;
            }
        }
        List<Offer> bid = new ArrayList<Offer>(Arrays.asList(maxBid));
        return bid;
    }

}
