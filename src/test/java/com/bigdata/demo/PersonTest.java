package com.bigdata.demo;

import com.bigdata.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.nio.channels.ClosedSelectorException;

public class PersonTest {


    @Test
    public void test1(){
        //读取类路径下配置文件，创建应用上下文（工厂） //创建对象会调用无参构造方法
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器获取对象，可以根据id或name（从工厂拿取货物）
        Person person=(Person) applicationContext.getBean("personName");
        System.out.println(person);

    }

    @Test
    public void test2(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("E:\\workspace\\workspace13\\spring01\\src\\main\\resources\\applicationContext-bean.xml");
    }

    @Test
    public void test3(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext-bean.xml");

        //id和name作用一样，只是id不能重复
       Person person=(Person) applicationContext.getBean("personId");
       Person personName = applicationContext.getBean("personName", Person.class);
       System.out.println(person==personName);
    }


    @Test
    public void test4(){
        //scope="singleton"
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext-bean.xml");

        //id和name作用一样，只是id不能重复
        Person person= applicationContext.getBean("personId", Person.class);
        Person personName = applicationContext.getBean("personName", Person.class);
        System.out.println(person==personName);

    }


    @Test
    public void test5(){
        //scope="singleton"  //工厂创建对象，无参构造方法
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext-bean.xml");

        System.out.println("之前");
        //id和name作用一样，只是id不能重复 ,
        Person person= applicationContext.getBean("personId", Person.class);
        Person personName = applicationContext.getBean("personName", Person.class);
        System.out.println("之后");
        //lazy-init="true"
//        之前
//                对象创建了
//        之后

        //lazy-init="false"

    }

    //通过静态工厂创建
    @Test
    public void test6(){
        AbstractApplicationContext abstractApplicationContext=new ClassPathXmlApplicationContext("applicationContext-bean.xml");

        System.out.println("之前");
        abstractApplicationContext.close();//关闭容器
        System.out.println("之后");
        //person构造方法-init-之前 -destroy-之后
    }
}
