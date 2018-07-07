package com.com.Thread;

public class ThreadInterrupt
{
    public static void main(String[] args) throws InterruptedException {
        Thread task = new Thread(taskThatFinishesEarlyOnInterruption());
        task.start();
        Thread.sleep(3000);
        task.interrupt();
        task.join(2000);
    }

    private static Runnable taskThatFinishesEarlyOnInterruption() {
        return () ->
        {
            for (int i = 0; i < 10; i++) {
                System.out.print(i);      // requirement 1
                try {
                    Thread.sleep(1_000);  // requirement 2
                } catch (InterruptedException e) {
                    break;                // requirement 7
                }
            }
        };
    }
}
