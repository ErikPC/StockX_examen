package edu.poniperro.stockx.item;

import java.util.ArrayList;

public class Sneaker implements Item {

    private String style;
    private String name;
    private int sale = 0;
    private int ask;
    private int bid;
    private ArrayList<Offer> offer = new ArrayList<Offer>();

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public String getStyle() {
        return this.style;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getSale() {
        return this.sale;
    }

    @Override
    public void setSale(int sale) {
        this.sale = sale;
    }

    @Override
    public int getBid() {
        return this.bid;
    }

    @Override
    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public int getAsk() {
        return this.ask;
    }

    @Override
    public void setAsk(int ask) {
        this.ask = ask;
    }

    public void add(Offer offer) {
        this.offer.add(offer);
    }

    public ArrayList<Offer> offers() {
        return this.offer;
    }

    public String toString() {
        return getName()
                + "\n" + "\t\t" + getStyle();
    }
}
