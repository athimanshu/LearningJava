package com.com.Hackerearth.cast;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class TestClass {
    public static void main(String args[] ) throws Exception {
        // Sample code to perform I/O:
         // Use either of these methods for input
        int t;
        int counter=0;
        String[] output= new String[10000];

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      //  StringTokenizer st = new StringTokenizer(br.readLine());
        //t = Integer.parseInt(br.readLine());                // Reading input from STDIN
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        System.out.println("t="+t);
       while(t>0)
       {
           int  m1,m2,x1,x2,x3,x4,y1,y2,y3,y4;
           String temp;
           x1=sc.nextInt();
           y1=sc.nextInt();
           x2=sc.nextInt();
           y2=sc.nextInt();
           System.out.println(x1+x2+y1+y2);
           x3=sc.nextInt();
           y3=sc.nextInt();
           x4=sc.nextInt();
           y4=sc.nextInt();
           temp =calc(x1,y1,x2,y2,x3,y3,x4,y4);
           output[counter]=temp;
           counter++;
           t--;
       }

        for(int a=0;a<counter;a++)
        {
            System.out.println(output[a]);
        }

        // Write your code here

    }

    private static String calc(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
        float m1,m2;
        if((x1==x2 && y1==y2) &&(x3==x4 && y3==y4))
            return "INVALID1";
        else if((x1==x3 && y1==y3) && (x2==x4) && (y2 == y4 ))
            return "INVALID2";
        else if ((x1==x4 && y1==y4) && (x2==x3) && (y2 == y3))
            return "INVALID3";
        m1 = (y2-y1)/(x2-x1);
        m2= (y4-y3)/(x4-x3);
        if (m1*m2== -1)
            return "YES";
        else
            return "NO";
    }
}
