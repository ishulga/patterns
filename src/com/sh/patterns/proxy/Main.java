package com.sh.patterns.proxy;

/**
 * Created by ievgen on 8/20/14.
 */
public class Main {
    public static void main(String[] strings){
        PersonBean person = new PersonBean("John","22");
        person.getName();
        person.setAge("33");
        person.setRating();

        Person proxy = person.getOwnerProxy(person);
        proxy.getName();
        proxy.setAge("33");
        try{
            proxy.setRating();
        }catch(Exception e){
            System.out.println("Exception thrown on setRatings");
        }
    }
}
