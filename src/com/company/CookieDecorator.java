package com.company;

public class CookieDecorator extends IceCreamDecorator{

    int price = 150;
    public int getPrice() {
        return this.price;
    }
    public CookieDecorator(IceCream decoratedIceCream) {
        super(decoratedIceCream);
    }

    @Override
    public int makeIceCream(String size) {
        int price = super.makeIceCream(size) + this.getPrice();
        this.addCookies();
        return price;
    }

    private void addCookies(){
        System.out.println("Adding cookies");
    }
}
