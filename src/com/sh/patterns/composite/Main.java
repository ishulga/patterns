package com.sh.patterns.composite;

/**
 * Created by ievgen on 8/20/14.
 */
public class Main {

    public static  void main(String[] str){
        MenuComponent item1 = new MenuItem("Cheese", "11");
        MenuComponent item2 = new MenuItem("Beef", "100");
        MenuComponent item3 = new MenuItem("Chicken", "100");

        MenuComponent all = new Menu("Special", "200");
        all.add(item1);
        all.add(item2);
        all.add(item3);

        Waitress w = new Waitress(all);
        w.print();
    }
}
