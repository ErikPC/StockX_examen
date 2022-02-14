package edu.poniperro.stockx.item;

public class Bid implements Offer {
    private String size;
    private Integer bid;

    public Bid(String size, int bid) {
        this.size = size;
        this.bid = bid;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.bid;
    }

    @Override
    public int compareTo(Offer offer) {
        return this.bid.compareTo(offer.value());
    }

    @Override
    public String toString() {
        return "\t\t" + size() + "\t" + value() + "\n";
    }
}
