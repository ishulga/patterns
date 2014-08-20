package com.sh.patterns.singleton;

/**
 * Created by ievgen on 7/10/14.
 */
public class SingleObject {
    //Can be initialization in a field(not lazy)
    public volatile static SingleObject singleObject=null;

    public static SingleObject getInstance(){
        if(singleObject==null){
            synchronized (SingleObject.class){
                if(singleObject==null){
                    singleObject = new SingleObject();
                }
            }
        }
        return singleObject;
    }
}
