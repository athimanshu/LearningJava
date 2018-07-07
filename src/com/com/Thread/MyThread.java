package com.com.Thread;
import org.apache.log4j.Logger;

import java.time.LocalDateTime;

public class MyThread implements Runnable {
    /* Get actual class name to be printed on */
    static Logger log = Logger.getLogger(MyThread.class.getName());
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        for(int i=0;i<10;i++)
        {
            Thread thread = new Thread(myThread);
            thread.start();
            System.out.println(thread.getState());
        }
        Thread thread = new Thread(new MyThread());
        thread.start();
        thread.interrupt();
        System.out.println("rr"+ thread.getState());
    }

    @Override
    public void run() {
        synchronized (this) {
            try {
             //   Thread.currentThread().sleep(2000);
                System.out.println("thread is running...");
                log.info(LocalDateTime.now() + " Hello inside Run");
                hello();
            } catch (Exception e) {
                e.printStackTrace();
                log.error(LocalDateTime.now() + e.toString());
            }
        }
    }

    public void hello() throws InterruptedException {
        for(long i =0;i<1000000000;i++)
        {

        }
        Thread.sleep(10);
        if (Thread.interrupted()) {
            log.error(LocalDateTime.now()+"INTERRUPT generated");
            System.exit(-1);
        }
        System.out.println("Hello from thread");
        log.info(LocalDateTime.now()+ " Hello from hello");

    }
}
