package com.com.com.oops;

class A{
    public int x=10;
    public void m1(String s){
        System.out.println("A m1()");
    }
}
class B extends A{
    public int x=20;
    public void m1(String a){
        System.out.println("B m1()");
    }
}
 class OverloadingExample {

    public static void main(String[] args) {
        A b = new B();
        System.out.println(b.x);
        b.m1("S");
    }
}