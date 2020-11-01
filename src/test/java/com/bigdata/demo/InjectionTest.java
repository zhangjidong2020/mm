package com.bigdata.demo;

import com.bigdata.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectionTest {

    @Test
    public void test1(){

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext-injection.xml");
        Person p1=applicationContext.getBean("c2",Person.class);
        System.out.println(p1);
    }
}
