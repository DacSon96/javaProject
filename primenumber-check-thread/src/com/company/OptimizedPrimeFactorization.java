package com.company;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        for (int N = 2; N < 100; N++) {
            boolean check = true;
            int squareRoot = (int) Math.sqrt(N);
            for (int i = 2; i <= squareRoot; i++) {
                if (N % i == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.println("Số nguyên tố tối ưu là: "+N);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    }
