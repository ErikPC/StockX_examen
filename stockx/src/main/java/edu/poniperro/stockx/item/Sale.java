package edu.poniperro.stockx.item;

public class Sale implements Offer {

    private String size;
    private Integer price;

    public Sale(String size, Integer price) {
        this.size = size;
        this.price = price;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.price;
    }

    @Override
    public int compareTo(Offer offer) {
        if (this.price < offer.value()) {
            return 1;
        } else if (this.price == offer.value()) {
            return 0;
        } else {
            return -1;
        }

    }

    @Override
    public String toString() {
        return this.size + "\\\\\\\\\\" + this.price;
    }

}
