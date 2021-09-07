package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    List<Product> productList = new ArrayList<>();

    public ProductManager() {
    }

    public void addProduct(Product product) {
        productList.add(product);
    }
    public void showAll() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void updateProduct(int index, Product product) {
            productList.set(index, product);
            System.out.println("Cập nhật sản phẩm thành công");
    }

    public void removeProduct(String id) {
        int index = findById(id);
        if (index != -1) {
            productList.remove(index);
            System.out.println("Xóa sản phẩm thành công");
        } else {
            System.out.println("Mã sản phẩm không tồn tại");
        }
    }

    public void sortByPrice() {
        for (int i = 0; i < productList.size(); i++) {
            double maxPrice = productList.get(i).getPrice();
            int maxIndex = i;
            for (int j = i + 1; j < productList.size(); j++) {
                if (maxPrice < productList.get(j).getPrice()) {
                    maxPrice = productList.get(j).getPrice();
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                Product temp = productList.get(i);
                productList.set(i, productList.get(maxIndex));
                productList.set(maxIndex, temp);
            }
        }
    }

    public Product findMaxPriceProduct() {
        int maxIndex = 0;
        double maxPrice = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getPrice() > maxPrice) {
                maxPrice = productList.get(i).getPrice();
                maxIndex = i;
            }
        }
        return productList.get(maxIndex);
    }

    public int findById(String id) {
        int index = -1;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
