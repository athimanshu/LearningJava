package com.com.com.innerClass;

public class StaticTest {
    private static int i;
    public static class StaticNested
    {
        public void runS()
        {

        }
    }
    @Test
    public void test() {
        StaticTest.StaticNested obj = new StaticTest.StaticNested();
        obj.runS();
    }
}
class TestMe
{
    public static void main(String[] args) {
        StaticTest.StaticNested obj = new StaticTest.StaticNested();
    }
}