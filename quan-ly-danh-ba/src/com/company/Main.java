package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        PhoneBookManagement phoneBook = new PhoneBookManagement();
        int choice;
        do {
            MENU();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    phoneBook.showAll();
                    break;
                }
                case 2: {
                    addContract(phoneBook);
                    break;
                }
                case 3: {
                    updateContract(phoneBook);
                    break;
                }
                case 4: {
                    removeContract(phoneBook);
                    break;
                }
                case 5: {
                    findByNamePhone(phoneBook, choice);
                    break;
                }
                case 6: {
                    if (getPhoneBookFromFile().equals(null)){
                        System.err.println("File không có dữ liệu");;
                    } else {
                        phoneBook = getPhoneBookFromFile();
                    }
                    break;
                }
                case 7: {
                    writePhoneBookToFile(phoneBook);
                    break;
                }
            }
        } while (choice != 8);

    }

    private static void findByNamePhone(PhoneBookManagement phoneBook, int choice) {
        System.out.println("Tìm kiếm thông tin liên hệ");
        int choiceSearch;
        do {
            System.out.println("Nhập cách tìm kiếm");
            System.out.println("1.Tìm qua số điện thoại");
            System.out.println("2.Tìm qua tên");
            System.out.println("0.Quay lại");
            System.out.println("Nhập lựa chọn: ");
            choiceSearch=scanner.nextInt();
            scanner.nextLine();
            if (choice ==1) {
                System.out.println("Nhập số điện thoại cần tìm kiếm");
                String phoneNumber = scanner.nextLine();
                phoneBook.findContractByPhoneNumber(phoneNumber);
            } else if (choice ==2) {
                System.out.println("Nhập tên cần tìm kiếm");
                String name = scanner.nextLine();
                phoneBook.findByName(name);
            }
        }while (choiceSearch!=0);
    }

    private static void removeContract(PhoneBookManagement phoneBook) {
        System.out.println("Xóa liên hệ");
        System.out.println("Nhập số điện thoại cần xóa");
        String phoneNumber = scanner.nextLine();
        phoneBook.removeContract(phoneNumber);
    }

    private static void updateContract(PhoneBookManagement phoneBook) {
        int index;
        String phoneNumber;
        System.out.println("Cập nhật liên hệ");
        do {
            System.out.println("Nhập số điện thoai bạn muốn cập nhật(Nhập 0 để thoát)");
            phoneNumber = scanner.nextLine();
            index = phoneBook.findByPhonenumber(phoneNumber);
            if (index != -1) {
                System.out.println("Nhập liên hệ sau khi sửa đổi");
                Contract contract = inputContract();
                phoneBook.updateContract(contract, index);
            } else {
                System.err.println("Không tìm được danh bạ với số điện thoại trên");
            }
        } while ((index == -1) && (!phoneNumber.equals("0")));
    }

    private static void addContract(PhoneBookManagement phoneBook) {
        System.out.println("Thêm liên hệ mới");
        Contract newContract = inputContract();
        phoneBook.addNewContract(newContract);
    }

    private static Contract inputContract() {
        String phoneNumber = "";
        Pattern patternPhone = Pattern.compile("^(84|0[3|5|7|8|9])+([0-9]{8})\\b");
        phoneNumber = inputPhoneNumberEmail(patternPhone, "số điện thoại");
        String group = inputCheck("nhóm");
        String name = inputCheck("tên");
        String sex = inputCheck("giới tính");
        String address = inputCheck("địa chỉ");
        String email = "";
        Pattern patternEmail = Pattern.compile("^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$");
        email = inputPhoneNumberEmail(patternEmail, "email");
        Contract newContract = new Contract(phoneNumber, group, name, sex, address, email);
        return newContract;
    }

    private static void MENU() {
        System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ--");
        System.out.println("1.Xem danh sách");
        System.out.println("2.Thêm mới");
        System.out.println("3.Cập nhật");
        System.out.println("4.Xóa");
        System.out.println("5.Tìm kiếm");
        System.out.println("6.Đọc từ file");
        System.out.println("7.Ghi vào file");
        System.out.println("8.Thoát");
        System.out.println("Chọn chức năng theo số (để tiếp tục):");
    }

    private static String inputPhoneNumberEmail(Pattern pattern, String phoneOrEmail) {
        String phoneNumber;
        boolean isMatcher;
        do {
            System.out.println("Nhập " + phoneOrEmail);
            phoneNumber = scanner.nextLine();
            Matcher matcher = pattern.matcher(phoneNumber);
            isMatcher = matcher.find();
            if (!isMatcher) {
                System.err.println("Nhập sai " + phoneOrEmail);
            }
        } while (!isMatcher);
        return phoneNumber;
    }

    private static String inputCheck(String input) {
        String properties = "";
        do {
            System.out.println("Nhập " + input + " liên hệ");
            properties = scanner.nextLine();
            if (properties.equals("")) {
                System.err.println("Trường này bắt buộc phải nhập!");
            }
        } while (properties.equals(""));
        return properties;
    }

    private static PhoneBookManagement getPhoneBookFromFile() {
        PhoneBookManagement phoneBook;
        String choice;
        System.out.println("--Đọc từ file--");
        System.err.println("Lấy dự liệu sẽ làm mất dữ liệu danh bạ vừa nhập");
        System.out.println("Nhập yes/no để tiếp tục/quay lại:");
        choice = scanner.nextLine();
        if (choice.equals("yes")) {
            System.out.println("Nhập đường dẫn file");
            String part = scanner.nextLine();
            phoneBook = readFromFile(part);
            return phoneBook;
        }else
            System.out.println("Quay lại ........");
        return null;
    }

    private static PhoneBookManagement readFromFile(String part) {
        PhoneBookManagement products = new PhoneBookManagement();
        try {
            FileInputStream fis = new FileInputStream(part);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (PhoneBookManagement) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            System.err.println("Lỗi đường dẫn");
        }
        return products;
    }

    private static void writePhoneBookToFile(PhoneBookManagement products) {
        System.out.println("--Ghi ra file--");
        System.err.println("Ghi ra file có thể sẽ thay đổi dữ liệu trong file đã lưu");
        String choice;
        System.out.println("Nhập yes/no để tiếp tục/quay lại:");
        choice = scanner.nextLine();
        if (choice.equals("yes")) {
            String part = "data/contacts.csv";
            writeToFile(products, part);
        } else
            System.out.println("Quay lại......");
    }

    private static void writeToFile(PhoneBookManagement products, String part) {
        try {
            FileOutputStream fos = new FileOutputStream(part);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
            System.out.println("Ghi ra file thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
