package com.company;

public class Furniture {
    private String name;
    public int price;
    private static int vat=10;

    public Furniture(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public double getPriceTax()
    {
        return (price/100*vat)+price;
    }

}
