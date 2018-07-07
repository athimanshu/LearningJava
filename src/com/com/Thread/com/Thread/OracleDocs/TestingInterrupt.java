package com.com.Thread.com.Thread.OracleDocs;

import static java.lang.Thread.currentThread;

public class TestingInterrupt implements Runnable {

    @Override
    public void run()
    {

            while (true) {
                currentThread().interrupt();
            }



    }

    public static void main(String[] args) throws InterruptedException {

//        currentThread().interrupt();
//        Thread.interrupted();
        try {
            new Thread(new TestingInterrupt()).start();

        }
        catch(Exception e)
        {

            System.out.println("Exception");
            return;
        }

    }
}
