package com.company;

import com.sun.xml.internal.ws.addressing.WsaTubeHelper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here

        List<Product> products = new ArrayList<>();
        int choice;
        do {
            Menu();
            System.out.println("Nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    addNewProduct(products);
                    break;
                }
                case 2: {
                    showProductList(products);
                    break;
                }
                case 3: {
                    findProductById(products);
                    break;
                }
                case 4: {
                    writeProductsToFile(products);
                    break;
                }
                case 5: {
                    products = getProductFromFile();
                    break;
                }
                case 0:
                    System.exit(0);
            }

        } while (choice != 0);

    }

    private static void writeProductsToFile(List<Product> products) {
        System.out.println("Nhập thông tin sản phẩm vào file");
        System.out.println("Nhập đường dẫn file muốn lưu");
        String part = scanner.nextLine();
        writeToFile(part, products);
    }

    private static List<Product> getProductFromFile() {
        List<Product> products;
        System.out.println("Lấy thông tin sản phẩm từ file");
        System.out.println("Nhập đường dẫn file muốn lấy thông tin");
        String part = scanner.nextLine();
        products = readToFile(part);
        System.out.println("Dữ liệu file vừa lấy là: ");
        showProductList(products);
        return products;
    }

    private static void showProductList(List<Product> products) {
        System.out.println("Hiển thi thông tin sản phẩm:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    private static void findProductById(List<Product> products) {
        System.out.println("Tìm kiếm thông tin sản phẩm");
        System.out.println("Nhập id sản phẩm cần tìm kiếm");
        int id = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("Thông tin sản phẩm càn tìm là: ");
            System.out.println(products.get(index));
        } else
            System.out.println("Id không tồn tại");
    }

    private static void addNewProduct(List<Product> products) {
        System.out.println("Thêm thông tin sản phẩm");
        System.out.println("Nhập mã sản phẩm");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sản xuất");
        String date = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        double price = scanner.nextDouble();
        products.add(new Product(id, name, date, price));
    }

    private static void Menu() {
        System.out.println("MENU");
        System.out.println("1.Thêm thông tin sản phẩm");
        System.out.println("2.Hiển thị thông tin sản phẩm");
        System.out.println("3.Tìm kiếm thông tin sản phẩm");
        System.out.println("4.Nhập thông tin sản phẩm vào file");
        System.out.println("5.Lấy thông tin sản phẩm từ file");
        System.out.println("0.Thoát");
    }

    private static void writeToFile(String part, List<Product> product) {
        try {
            FileOutputStream fos = new FileOutputStream(part);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(product);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static List<Product> readToFile(String part) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(part);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
}
