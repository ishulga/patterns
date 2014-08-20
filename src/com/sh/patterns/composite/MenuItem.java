package com.sh.patterns.composite;

/**
 * Created by ievgen on 8/20/14.
 */
public class MenuItem extends MenuComponent {
    private String name;
    private String price;

    public MenuItem(String name, String price){
        this.name= name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getPrice(){
        return price;
    }

    public void print(){
        System.out.println(getName()+ ", " +getPrice());
    }
}
