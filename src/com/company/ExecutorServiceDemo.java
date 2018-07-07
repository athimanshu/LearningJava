    package com.company;

    import java.util.concurrent.ExecutorService;
    import java.util.concurrent.Executors;

    public class ExecutorServiceDemo{

        public static void main(String[] args) {
            ExecutorService executor = Executors.newFixedThreadPool(5);
            ExecutorService executor2 = Executors.newFixedThreadPool(5);
            for (int i= 0;i<10;i++)
            {
                Runnable worker = new WorkerThread("" +i);
                //executor.execute(worker);
                //executor.execute(worker);
                //executor2.execute(worker);

            }
            executor.shutdown();
            executor2.shutdown();
            while (!executor.isTerminated()
                    && !executor.isTerminated()) {
            }
            System.out.println("Finished all threads");
        }

    }
