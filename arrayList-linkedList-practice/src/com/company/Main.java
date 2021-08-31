package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Product product1 = new Product("123","laptop", 1000);
        Product product2 = new Product("144","tivi", 2000);
        Product product3 = new Product("164","dieuhoa", 1400);
        Product product4 = new Product("95","maygiat", 1800);
        ProductManager productManager = new ProductManager();
        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);
        productManager.addProduct(product4);
        productManager.showlist();
        productManager.removeProduct("144");
        System.out.println("---------------");
        productManager.showlist();
        System.out.println("---------------");
        System.out.println(productManager.findNameProduct("laptop"));
        System.out.println("---------------");
        productManager.addProduct(product2);
        productManager.sortByPriceHightToLow();
        productManager.showlist();
        System.out.println("---------------");
        productManager.sortByPriceLowToHight();
        productManager.showlist();

    }
}
