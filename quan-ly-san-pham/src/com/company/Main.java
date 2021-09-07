package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // write your code here
        ProductManager products = new ProductManager();
        int choise;
        do {
            Menu();
            System.out.println("Chọn chức năng: ");
            choise = scanner.nextInt();
            scanner.nextLine();
            switch (choise) {
                case 1: {
                    System.out.println("--Xem danh sách--");
                    products.showAll();
                    break;
                }
                case 2: {
                    addProduct(products);
                    break;
                }
                case 3: {
                    updateProduct(products);
                    break;
                }
                case 4: {
                    removeProduct(products);
                    break;
                }
                case 5: {
                    sortProduct(products);
                    break;
                }
                case 6: {
                    findMaxProduct(products);
                    break;
                }
                case 7: {
                    getProductFromFile();

                }
                case 8: {
                    writeToFile(products);
                }
            }
        } while (choise != 0);
    }

    private static ProductManager getProductFromFile() throws IOException {
        ProductManager products = new ProductManager();
        try {
            System.out.println("--Đọc từ file--");
            System.out.println("Nhập đường dẫn file");
            String part = scanner.nextLine();
            FileInputStream fis = new FileInputStream(part);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (ProductManager) ois.readObject();
            fis.close();
            ois.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Sai đường dẫn");
            ;
        }
        return products;
    }

    private static void writeToFile(ProductManager products) {
        System.out.println("--Ghi ra file--");
//        System.out.println("Nhập đường dẫn file");
//        String part = scanner.nextLine();
        writeFile(products, "product.txt");
    }

    private static void writeFile(ProductManager products, String part) {
        try {
            FileOutputStream fos = new FileOutputStream(part);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.err.println("Sai đường dẫn");
        }
    }

    private static void findMaxProduct(ProductManager products) {
        System.out.println("--Tìm sản phẩm có giá trị đắt nhất--");
        System.out.println("Sản phẩm đắt nhất là:");
        System.out.println(products.findMaxPriceProduct());
        ;
    }

    private static void sortProduct(ProductManager products) {
        products.sortByPrice();
        System.out.println("Sắp xếp thành công!");
    }


    private static void removeProduct(ProductManager products) {
        System.out.println("--Xóa sản phẩm--");
        System.out.println("Nhập mã sản phẩm muốn xóa:");
        String removeId = scanner.nextLine();
        int index = products.findById(removeId);
        if (index != -1) {
            products.removeProduct(removeId);
        } else {
            System.out.println("Không tồn tại mã sản phẩm này!");
        }
    }

    private static void updateProduct(ProductManager products) {
        System.out.println("--Cập nhật sản phẩm--");
        System.out.println("Nhập mã sản phẩm cần cập nhật");
        String updateId = scanner.nextLine();
        int index = products.findById(updateId);
        if (index == -1) {
            System.out.println("Không tồn tại mã sản phẩm này");
        } else {
            Product updateProduct = inputProduct();
            products.updateProduct(index, updateProduct);
        }
    }

    private static void addProduct(ProductManager products) {
        System.out.println("--Thêm sản phẩm mới--");
        Product newProduct = inputProduct();
        products.addProduct(newProduct);
        System.out.println("Thêm sản phẩm thành công");
    }

    private static Product inputProduct() {
        System.out.println("Nhập mã sản phẩm: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();
        System.out.println("Nhập số lượng sản phẩm: ");
        double quantity = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập mô tả sản phẩm: ");
        String description = scanner.nextLine();
        Product newProduct = new Product(id, name, price, quantity, description);
        return newProduct;
    }

    private static void Menu() {
        System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM ----");
        System.out.println("Chọn chức năng theo số để tiếp tục");
        System.out.println("1.Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Sắp xếp");
        System.out.println("6. Tìm sản phẩm có giá trị đắt nhất");
        System.out.println("7. Đọc từ file");
        System.out.println("8. Ghi từ file");
        System.out.println("9. Thoát");
    }
}
