package com.com.com.oops;

public interface TestInterface {
    public static void fun1()
    {
        System.out.println("Inside fun1 of TestInterface");
    }
    public default void  TestInterface()
    {
        System.out.println("");
    }
}
