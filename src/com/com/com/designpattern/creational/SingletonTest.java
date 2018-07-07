package com.com.com.designpattern.creational;

public class SingletonTest {
    private String msg;
    private SingletonTest()
    {

    }
    private static class SingletonHolder
    {
        public static final SingletonTest instance= new SingletonTest();
    }

    public static SingletonTest getInstance()
    {
       return SingletonHolder.instance;
    }
}
class SingletonTestConsume
{
    public static void main(String[] args) {
        SingletonTest obj=SingletonTest.getInstance();
        SingletonTest obj2=SingletonTest.getInstance();
        SingletonTest obj3=SingletonTest.getInstance();
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());

    }
}