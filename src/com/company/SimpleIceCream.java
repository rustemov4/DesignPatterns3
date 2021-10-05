package com.company;

public class SimpleIceCream implements IceCream{
    int medium = 350;
    int large = 400;
    int small = 300;
    int price;
    @Override
    public int makeIceCream(String size) {
        System.out.println("Making Simple IceCream of size " + size);
        if(size.equalsIgnoreCase("medium")){
            this.price = medium;
        }
        else if(size.equalsIgnoreCase("large")){
            this.price = large;
        }
        else if(size.equalsIgnoreCase("small")){
            this.price = small;
        }
        return this.price;
    }

}
