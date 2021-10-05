package com.company;

public class NuttyDecorator extends IceCreamDecorator{
    int price = 100;

    public int getPrice() {
        return this.price;
    }

    public NuttyDecorator(IceCream decoratedIceCream) {
        super(decoratedIceCream);
    }

    @Override
    public int makeIceCream(String size) {
        int price = super.makeIceCream(size) + this.getPrice();
        this.addNuts();
        return price;
    }

    private void addNuts(){
        System.out.println("Adding nuts");
    }
}
