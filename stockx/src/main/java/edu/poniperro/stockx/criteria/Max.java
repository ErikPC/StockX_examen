package edu.poniperro.stockx.criteria;

import java.util.List;
import java.util.Optional;

import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

public class Max implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public Max(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> firstCriteria = criteria.checkCriteria(sneaker);
        List<Offer> secondCriteria = otherCriteria.checkCriteria(sneaker);
        firstCriteria.retainAll(secondCriteria);
        Optional<Offer> max = firstCriteria.stream().max(Offer::compareTo);
        return max.isPresent() ? List.of(max.get()) : List.of();
    }
}
