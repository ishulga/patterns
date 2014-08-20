package com.sh.patterns.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by ievgen on 8/20/14.
 */
public class PersonBean implements Person {
    private String name;
    private String age;

    public PersonBean(String name, String age){
        this.name = name;
        this.age = age;
    }

    public Person getOwnerProxy(PersonBean personBean){
        return (Person)Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(), new OwnerInvocationHandler(personBean));
    }

    public void setRating(){
        System.out.println("Should not be called on proxy,");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
