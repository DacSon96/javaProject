package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentMangementMap studentList = new StudentMangementMap();
        int choise;
        do {
            MENU();
            System.out.println("Nhập lựa chọn của bạn");
            choise = scanner.nextInt();
            scanner.nextLine();


        } while (choise != 0);

    }

    private static Student inputStudentInfo() {
        System.out.println("Nhập mã sinh viên");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập quê quán sinh viên: ");
        String homeTown = scanner.nextLine();
        System.out.println("Nhập lớp học sinh viên: ");
        String studentClass = scanner.nextLine();
        System.out.println("Nhập điểm số: ");
        Double score = scanner.nextDouble();
        return new Student(id, name, homeTown, studentClass, score);
    }

    private static void MENU() {
        System.out.println("MENU");
        System.out.println("1. Xem danh sách sinh viên");
        System.out.println("2. Thêm thông tin sinh viên");
        System.out.println("3. Cập nhật thông tin một sinh viên");
        System.out.println("4. Xóa thông tin một sinh viên");
        System.out.println("5. Tìm kiếm sinh viên");
        System.out.println("0. Thoát chương trình");
    }
    private static void chooseMenu(int choise, StudentMangementMap studentMangementMap) {
        switch (choise) {
            case 1: {
                showAllStudent(studentMangementMap);
        }
            case 2: {
            }
            case 3: {
            case 4: {
            case 5: {
            case 0: {
        }
    }}}}}}
    private static void showAllStudent(StudentMangementMap studentMangementMap) {
        System.out.println("Danh sách sinh viên đang có: ");
        studentMangementMap.showAll();
            }
}
