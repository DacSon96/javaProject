package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        int choice;
        StudentManager studentlíst = new StudentManager();
        do {
            Menu();
            System.out.println("Nhập lựa chọn");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    studentlíst.showStudentList();
                    break;
                }
                case 2: {
                    Student newStudent = inputStudentInfo();
                    studentlíst.addNewStudent(newStudent);
                    break;
                }
                case 3: {

                    updateStudents(studentlíst);
                    break;
                }
                case 4: {
                    System.out.println("Nhập mã sinh viếc muốn xóa");
                    String id = scanner.nextLine();
                    studentlíst.removeStudentById(id);
                    break;
                }
                case 5: {
                    System.out.println("Nhập số sinh viên điểm cao nhất muốn tìm");
                    int top = scanner.nextInt();
                    List<Student> topStudent =studentlíst.getTopMarkStudent(top);
                    for (Student student: topStudent) {
                        System.out.println(student);
                    }
                    break;
                }
            }
        } while (choice!=0);
    }

    private static void updateStudents(StudentManager studentlíst) {
        System.out.println("Cập nhật sinh viên");
        System.out.println("Nhập mã sinh viên cần cập nhật");
        String id = scanner.nextLine();
        Student updateStudent = inputStudentInfo();
        studentlíst.updateById(id,updateStudent);
    }

    private static Student inputStudentInfo() {
        System.out.println("Nhập mã sinh viên");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sinh viên");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ sinh viên");
        String address = scanner.nextLine();
        System.out.println("Nhập lớp sinh viên");
        String clazz = scanner.nextLine();
        System.out.println("Nhập điểm sinh viên");
        double mark = scanner.nextDouble();
        return new Student(id,name,address,clazz,mark);
    }

    private static void Menu() {
        System.out.println("MENU");
        System.out.println("1. Xem danh sách sinh viên");
        System.out.println("2. Thêm sinh viên");
        System.out.println("3. Cập nhật thông tin sinh viên");
        System.out.println("4. Xóa sinh viên");
        System.out.println("5. Tìm tóp sinh viên cao điểm nhất.");
        System.out.println("0.Thoát");
    }
}
