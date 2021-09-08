package com.company;

public class EvenThread extends Thread{
    private Thread evenThread;

    public EvenThread() {
    }

    @Override
    public void run() {
        evenThread = new Thread(this, "even count thread");
        System.out.println("even thread created " + evenThread);
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("even number is: " + i);
                }
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Thread getevenThread() {
        return evenThread;
    }
}
