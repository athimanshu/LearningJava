package com.com.Thread.com.interview.siemens;

import java.awt.*;

class paramTest
{
    int a;
    int b;
    paramTest()
    {

    }
}
public class ObjectState {
    public static void tricky(Point arg1, Point arg2)
    {
        System.out.println(arg2.x+" "+arg2.y);
        System.out.println("arg1 in fuc :"+arg1.hashCode());
        System.out.println("arg2 in fuc :"+arg2.hashCode());
        arg1.x = 100;
        arg1.y = 100;
        Point temp = arg1;
        arg1 = arg2;
        arg2 = temp;
        System.out.println(arg2.x+" "+arg2.y);
        System.out.println(arg1.x+" "+arg1.y);
        System.out.println("arg1 in fuc :"+arg1.hashCode());
        System.out.println("arg2 in fuc :"+arg2.hashCode());
    }
    public static void main(String [] args)
    {
        Point pnt1 = new Point(0,0);
        Point pnt2 = new Point(0,0);
        System.out.println("pnt1 in main :"+pnt1.hashCode());
        System.out.println("pnt2 in main :"+pnt2.hashCode());
        System.out.println("X: " + pnt1.x + " Y: " +pnt1.y);
        System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);
        System.out.println(" ");
        tricky(pnt1,pnt2);
        System.out.println("X: " + pnt1.x + " Y:" + pnt1.y);
        System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);
        System.out.println("after call pnt1 in main :"+pnt1.hashCode());
        System.out.println(" after call pnt2 in main :"+pnt2.hashCode());
    }
}
