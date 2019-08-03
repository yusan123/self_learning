package com.yu.duoxiancheng;

/**
 * Created by Administrator on 2019/7/23.
 * <p>
 * 两个线程打印1-100,前后20个数两个线程共同打印，中间60个数，由某一线程打印
 */
public class T1 implements Runnable {

    private Object lock;

    public T1(Object lock) {
        this.lock = lock;
    }

    int i = 1;

    @Override
    public void run() {
            while (i <= 10) {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName() + "---------" + i);
                    i++;
                    if (i == 2) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (i == 8) {
                        lock.notify();
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }

    }

    public static void main(String[] args) {
        Object lock = new Object();
        T1 rb = new T1(lock);
        Thread thread1 = new Thread(rb, "thread1");
        Thread thread2 = new Thread(rb, "thread2");
        thread1.start();
        thread2.start();
    }
}
