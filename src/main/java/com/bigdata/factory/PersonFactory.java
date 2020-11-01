package com.bigdata.factory;

import com.bigdata.bean.Person;

//person工厂类
public class PersonFactory {

    //静态方法
    public static Person createPeron(){
        System.out.println("静态方法1");
        return new Person();


    }
}
