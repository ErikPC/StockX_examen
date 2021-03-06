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
        return Integer.compare(offer.value(), this.price);

    }

    @Override
    public String toString() {
        return "\t\t" + size() + "\t" + value() + "\n";
    }

}
