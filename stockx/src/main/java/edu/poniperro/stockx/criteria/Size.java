package edu.poniperro.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

public class Size implements Criteria {

    private String size;

    public Size(String size) {
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> itemsSize = new ArrayList<Offer>();
        for (Offer offer : sneaker.offers()) {
            if (offer.size() == this.size) {
                itemsSize.add(offer);
            }
        }
        return itemsSize;
    }

}
