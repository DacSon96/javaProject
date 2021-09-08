package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LazyPrimeFactorization lazy = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimized = new OptimizedPrimeFactorization();
        Thread thread1 = new Thread(lazy);
        Thread thread2 = new Thread(optimized);
        thread1.start();
        thread2.start();
    }
}
