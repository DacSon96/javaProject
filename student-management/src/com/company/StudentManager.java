package com.company;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<Student> studentList = new ArrayList<>();

    public List<Student> getStudents() {
        return studentList;
    }
    public StudentManager() {
    }

    public void setStudents(List<Student> students) {
        this.studentList = students;
    }

    public void showStudentList() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addNewStudent(Student newStudent) {
        studentList.add(newStudent);
    }

    public void updateById(String id,Student student) {
        int index = findById(id);
        if (index != -1) {
            studentList.set(index, student);
        } else
            System.out.println("Không tồn tại mã sinh viên này");
    }

    public void removeStudentById(String id) {
        int index = findById(id);
        if (index != -1) {
            studentList.remove(index);
        } else
            System.out.println("Không tồn tại mã sinh viên này");
    }

    public int findById(String id) {
        int index = -1;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public List<Student> getTopMarkStudent(int top) {
        List<Student> newList =sortStudentByMark();
        List<Student> topStudent = new ArrayList<>();
        for (int i = 0; i < top; i++) {
            topStudent.add(newList.get(i));
        }
        return topStudent;
    }


    public List<Student> sortStudentByMark() {
        for (int i = 0; i < studentList.size(); i++) {
            int studentMaxIndex = i;
            double maxMark = studentList.get(i).getMark();
            for (int j = i + 1; j < studentList.size(); j++) {
                if (studentList.get(j).getMark() > maxMark) {
                    maxMark = studentList.get(j).getMark();
                    studentMaxIndex = j;
                }
            }
            if (studentMaxIndex != i) {
                Student temp = studentList.get(i);
                studentList.set(i, studentList.get(studentMaxIndex));
                studentList.set(studentMaxIndex, temp);
            }
        }
        return studentList;
    }
}
