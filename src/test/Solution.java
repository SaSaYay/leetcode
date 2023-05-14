package test;

import java.awt.image.VolatileImage;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author sasayaya
 * @create 2022/11/13 21:16
 */
public class Solution {
    private volatile long i = 0;
    private Thread t1,t3,t2;
    private volatile int flag = 0;

    public static void main(String[] args) {
        new Solution().runThread();


    }
    public void runThread(){
        t1 = new Thread(new Thread1());
        t2 = new Thread(new Thread2());
//        t3 = new Thread(new Thread1());
        t1.start();
        t2.start();
//        t3.start();
    }
    public class Thread1 implements Runnable{
        @Override
        public void run() {
            while (i<1000){

            System.out.println(Thread.currentThread().getName() + " " + i);
            i++;
//                i+=1;
            }

        }
    }
    public class Thread2 implements Runnable{
        @Override
        public void run() {
            while (i<1000) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                i++;
//                i+=1;

            }
        }
    }
}

