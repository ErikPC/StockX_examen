package edu.poniperro.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.poniperro.stockx.item.Bid;
import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

public class Bids implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> bids = new ArrayList<Offer>();
        for (Offer offer : sneaker.offers()) {
            if (offer instanceof Bid) {
                bids.add(offer);
            }
        }
        return bids;
    }

}
