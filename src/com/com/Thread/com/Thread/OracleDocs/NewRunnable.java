package com.com.Thread.com.Thread.OracleDocs;

public class NewRunnable extends Thread  implements Runnable{

    @Override
    public void run() {
        currentThread().interrupt();
        System.out.println("Thread name: "+ currentThread().getName());
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) throws InterruptedException{
        System.out.println(currentThread().getName());
        System.out.println(currentThread().getState());
        NewRunnable n=new NewRunnable();
        Thread t = new Thread(n);
        t.start();
        Thread t2 = new Thread(n);
        t2.start();
        new NewRunnable().start();
        currentThread().sleep(2000);
        t.interrupt();
        System.out.println(currentThread().getName());
        System.out.println(currentThread().getState());
    }
}
