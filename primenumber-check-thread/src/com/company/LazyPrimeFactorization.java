package com.company;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int N = 2; N < 100; N++) {
            boolean check = true;
            int j = 2;
            while (j < N) {
                if (N % j == 0) {
                    check = false;
                    break;
                }
                j++;
            }
            if (check) {
                System.out.println("Số nguyên tố là: " + N);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
