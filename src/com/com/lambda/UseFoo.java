package com.com.lambda;

import java.util.function.Function;

public class UseFoo {
    public static void main(String[] args) {
        UseFoo useFoo = new UseFoo();
        Foo foo = parameter -> parameter + " from lambda";
        String resut = useFoo.add("Hello",foo);

        Function <String, String> fun=param -> param + " from lambda";
        String result = useFoo.newAdd("Message", fun);
    }
    public String add(String string, Foo foo){
        return foo.method(string);
    }

    public String newAdd(String string, Function<String, String> fun)
    {
        return fun.apply(string);
    }
}
