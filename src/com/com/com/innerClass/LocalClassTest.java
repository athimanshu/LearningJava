package com.com.com.innerClass;

public class LocalClassTest {
    void run()
    {
        System.out.println("Inside Deep Run");
        class LocalClass
        {
            void run()
            {
                System.out.println("Inside Deepest Run");
            }
        }
        LocalClass lcObj = new LocalClass();
    }
}
class TestMeLocal
{
    public static void main(String[] args) {
        LocalClassTest obj = new LocalClassTest();
        obj.run();
    }
}