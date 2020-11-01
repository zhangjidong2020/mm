package com.bigdata.bean;

//人
public class Person {

    private String name;//姓名
    private Integer age;//年龄

    private Car car;

    //构造方法
    public Person() {
        System.out.println("对象创建了");
    }

    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
        System.out.println("构造方法1");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
