package edu.poniperro.stockx.criteria;

import java.util.List;

import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> firstCriteria = criteria.checkCriteria(sneaker);
        List<Offer> secondCriteria = otherCriteria.checkCriteria(sneaker);
        firstCriteria.retainAll(secondCriteria);
        return firstCriteria;
    }

}
