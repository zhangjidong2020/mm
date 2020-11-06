package com.bigdata.demo;

import com.bigdata.bean.Person;

public class Demo {

    public static void main(String[] args) {
        //通过new创建一个人对象，会调用无参构造方法
        Person person = new Person();
        person.setName("tom");
        person.setAge(11);
        //        //打印
        System.out.println(person);
        System.out.println("mm");
        System.out.println("22");
        System.out.println("ccc");

    }
}
