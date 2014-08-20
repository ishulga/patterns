package com.sh.patterns.proxy;

/**
 * Created by ievgen on 8/20/14.
 */
public interface Person {
    String getName();
    void setAge(String age);
    void setRating();

    Person getOwnerProxy(PersonBean person);
}
