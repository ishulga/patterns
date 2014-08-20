package com.sh.patterns.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ievgen on 8/20/14.
 */
public class Menu extends MenuComponent {
    private String name;
    private String price;
    private List<MenuComponent> components = new ArrayList<MenuComponent>();

    public Menu(String name, String price){
        this.name= name;
        this.price = price;
    }
    public void add(MenuComponent component){
        components.add(component);
    }

    public void remove(MenuComponent component){
        components.remove(component);
    }

    public MenuComponent getChild(int component){
        return components.get(component);
    }

    public String getName(){
        return name;
    }

    public String getPrice(){
        return price;
    }

    public void print(){
        System.out.println(getName()+ ", " +getPrice());
        Iterator<MenuComponent> it = components.iterator();
        while(it.hasNext()){
            MenuComponent comp = it.next();
            comp.print();
        }
    }
}
