//package com.com.Thread.com.com.Thread.Callable;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Future;
//
//public class ParallelAdder {
//    public Integer parallelSum() {
//        ExecutorService executor = Executors.newFixedThreadPool(10);
//        List<Future<Integer>> list = new ArrayList<Future<Integer>>();
//        int count = 1;
//        int prev = 0;
//        for (int i = 0; i < list.size(); i++) {
//            if (count % 2 == 0) {
//                System.out.println("Prev :" + prev + " current: " + i);
//                Future<Integer> future = executor.submit(new CallableAdder(prev, i));
//                list.add(future);
//                count = 1;
//                continue;
//            }
//            prev = 1;
//            count++;
//        }
//        int totsum = 0;
//        for (Future<Integer> fut : list) {
//            try {
//                totsum = totsum + fut.get();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
//retr
//    }
//}
