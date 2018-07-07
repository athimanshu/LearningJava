package com.com.Thread.com.Thread.OracleDocs;
import java.time.LocalDateTime;

import static java.lang.Thread.currentThread;
public class JoinExample implements Runnable {

    @Override
    public void run() {
        try {
            Thread t1 = new Thread(new JoinExample());
            t1.start();
            Thread.sleep(10);
            System.out.println("Thread "+ currentThread().getName()+ "ëxit at "+ LocalDateTime.now());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new JoinExample());

        t1.start();

//        Thread t2 = new Thread(new JoinExample());
//
//        t2.start();
//        t2.join();

    }
}
