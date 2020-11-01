package com.bigdata.factory2;

import com.bigdata.bean.Person;

//工厂类
public class PersonFactory2 {


    public Person createPerson(){
        System.out.println("person2222");
        return new Person();
    }

}
