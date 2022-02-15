package edu.poniperro.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;
import edu.poniperro.stockx.item.Sale;

public class Sales implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> sales = new ArrayList<Offer>();
        for (Offer offer : sneaker.offers()) {
            if (offer instanceof Sale) {
                sales.add(offer);
            }
        }
        return sales;
    }

}
