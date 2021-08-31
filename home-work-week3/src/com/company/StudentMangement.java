package com.company;

public class StudentMangement {
    private Student[] studentsList = new Student[0];

    public StudentMangement(Student[] studentsList) {
        this.studentsList = studentsList;
    }

    public StudentMangement() {
    }

    public Student[] getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(Student[] studentsList) {
        this.studentsList = studentsList;
    }
    public void addNewStudentsToList(Student student) {
        Student[] newStudentsList = new Student[studentsList.length+1];
        for (int i = 0; i < studentsList.length; i++) {
            newStudentsList[i] = studentsList[i];
        }
        newStudentsList[studentsList.length] = student;
        studentsList = newStudentsList;
    }
    public void showStudentList() {
        System.out.printf("%-15s%-15s%-15s%-15s%s", "id", "Name","HomeTown","Class","Score");
        System.out.println();
        for (int i = 0; i < studentsList.length; i++) {
            System.out.printf("%-15s%-15s%-15s%-15s%s", studentsList[i].getStudentID(),studentsList[i].getName(),studentsList[i].getHomeTown(),studentsList[i].getStudentClass(),studentsList[i].getScore());
            System.out.println();
        }
    }
    public void updateStudent(Student studentUpdate) {
        int studentPosition = findStudentId(studentUpdate.getStudentID());
        if (studentPosition != -1) {
            studentsList[studentPosition] = studentUpdate;
            System.out.println("Cập nhật thành công!");
        } else
            System.out.println("Mã sinh viên không tồn tại");
    }
    public void removeStudent(String id) {
        int studentPosition = findStudentId(id);
        if (studentPosition != -1) {
            Student[] newStudentList = new Student[studentsList.length-1];
            for (int i = 0; i < newStudentList.length; i++) {
                if (i < studentPosition) {
                    newStudentList[i] = studentsList[i];
                } else {
                    newStudentList[i] = studentsList[i + 1];
                }
            }
            studentsList = newStudentList;
            System.out.println("Xóa sinh viên thành công!");
        } else
            System.out.println("Nhập sai mã sinh viên");

    }
    public int findStudentId(String id) {
        int index = -1;
        for (int i = 0; i < studentsList.length; i++) {
            if (studentsList[i].getStudentID().equals(id))
                index = i;
        }
        return index;
    }
    public Student findTopStudent() {
        double max = 0;
        Student topScoreStudent = new Student();
;        for (int i = 0; i < studentsList.length; i++) {
            double studentScore = studentsList[i].getScore();
            if (studentScore >max) {
                max = studentsList[i].getScore();
                topScoreStudent = studentsList[i];
            }
        }
        Student[] listTopStudent = new Student[studentsList.length];
        double topScore = topScoreStudent.getScore();
        for (int i = 0; i < studentsList.length; i++) {
            if (topScore == studentsList[i].getScore()) {

            }
        }
        return topScoreStudent;
    }

}
