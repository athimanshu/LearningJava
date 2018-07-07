package com.com.Thread.com.interview.siemens;

public class ThreadQuestions {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside R1");
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside R2");

            }
        };
        Thread t = new Thread(){
            public void run()
            {
                System.out.println("Inside Thread t");
            }
        };

        r.run();
        r2.run();
        t.run();
        t.start();

    }

}
