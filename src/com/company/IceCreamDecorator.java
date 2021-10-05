package com.company;

public class IceCreamDecorator implements IceCream{
    private IceCream decoratedIceCream;

    public IceCreamDecorator(IceCream decoratedIceCream){
        this.decoratedIceCream = decoratedIceCream;
    }

    @Override
    public int makeIceCream(String size) {
        return decoratedIceCream.makeIceCream(size);

    }


}
