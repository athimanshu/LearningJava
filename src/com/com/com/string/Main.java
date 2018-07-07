package com.com.com.string;

public class Main {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println( s1=s2);
        System.out.println(s1.equals(s2));
        s2.intern();
        String s3="abc";
        String s4="abc";
        System.out.println(s3==s4);

        String str= new String();
        System.out.println(str.hashCode());
        str="Hello";
        System.out.println(str.hashCode());
        str="Hi";
        System.out.println(str.hashCode());
        str="Hiu";
        System.out.println(str.hashCode());
        String str2 = new String("Hi");
       // str2="Hi";
        //str2.intern();
        System.out.println(str2.hashCode());
    }

}
