package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        IceCream iceCream = new SimpleIceCream();
        System.out.println("Do you want to add some Nutt: Press 1 " +
                "Do you want to add some cookies: Press 2"
        +"Do you want to add both: Press 3");
        int res = in.nextInt();
        switch (res){
            case(1):
                iceCream = new NuttyDecorator(new SimpleIceCream());
                break;
            case (2):
                iceCream = new CookieDecorator(new SimpleIceCream());
                break;
            case(3):
                iceCream = new CookieDecorator(new NuttyDecorator(new SimpleIceCream()));
                break;
            case (4):
                break;
        }
        System.out.println("The total price is " + iceCream.makeIceCream("Small"));
    }
}
