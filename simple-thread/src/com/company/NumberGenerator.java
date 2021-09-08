package com.company;

public class NumberGenerator extends Thread implements Runnable{
    private Thread myThread;
    public String name;
    public NumberGenerator(String name) {
        this.name = name;
        myThread = new Thread(this, name);
        System.out.println("Tên của thread là: "+name);
        System.out.println("Chạy vòng lặp "+myThread);
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Số tự nhiên thứ " + (i + 1) + " của "+name+" là: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Vòng lặp bị gián đoạn");;
        }
        System.out.println("hashCode của generator là: "+hashCode());
        System.out.println("Hoàn thành");
    }

        public Thread getMyThread() {
        return myThread;
    }
    public int hashCode() {
        return myThread.hashCode();
    }

}
