package com.com.com.oops;

import org.omg.SendingContext.RunTime;

import java.io.FileNotFoundException;

class TestOverride
{
    public static void Hello() throws Exception
    {
        System.out.println("Fun 2");
    }
}
public class Overriding extends  TestOverride{
    public static void main(String[] args) throws FileNotFoundException {
        Hello();
    }

    public static void Hello() throws FileNotFoundException
    {
        System.out.println("Fun 1");
    }

}
