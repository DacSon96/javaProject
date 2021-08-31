package com.company;

import java.util.ArrayList;

public class ProductManager {
    ArrayList<Product> productList = new ArrayList<>();

    public ProductManager() {
    }
    public void addProduct(Product newProduct) {
        productList.add(newProduct);
    }
    public void updateProduct(String id, Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)) {
                productList.set(i,product);
            }
        };
    }
    public void showlist() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }
    public void removeProduct(String id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)) {
                productList.remove(i);
            }
        }
    }
    public Product findNameProduct(String name) {
        int location = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)) {
                location = i;
            }
        }return productList.get(location);
    }
    public void sortByPriceHightToLow() {
        for (int i = 0; i < productList.size(); i++) {
            for (int j = i+1; j < productList.size(); j++) {
                Product productI = productList.get(i);
                Product productJ = productList.get(j);
                if (productI.getPrice()<productJ.getPrice()) {
                    Product temp = productI;
                    productList.set(i,productJ);
                    productList.set(j,temp);
                }
            }
        }
    }
    public void sortByPriceLowToHight() {
        for (int i = 0; i < productList.size(); i++) {
            for (int j = i+1; j < productList.size(); j++) {
                Product productI = productList.get(i);
                Product productJ = productList.get(j);
                if (productI.getPrice()>productJ.getPrice()) {
                    Product temp = productI;
                    productList.set(i,productJ);
                    productList.set(j,temp);
                }
            }
        }
    }

}
