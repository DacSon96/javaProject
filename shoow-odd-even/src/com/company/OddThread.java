package com.company;

public class OddThread extends Thread {
    private Thread oddThread;
    @Override
    public void run() {
        oddThread = new Thread(this, "Odd count thread");
        System.out.println("Odd thread created " + oddThread);
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.println("odd number is: " + i);
                }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
        }
    }

    public Thread getOddThread() {
        return oddThread;
    }

}
