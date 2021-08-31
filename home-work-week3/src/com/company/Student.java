package com.company;

public class Student {
    private String studentID;
    private String name;
    private String homeTown;
    private String studentClass;
    private double score;

    public Student(String studentID, String name, String homeTown, String studentClass, double score) {
        this.studentID = studentID;
        this.name = name;
        this.homeTown = homeTown;
        this.studentClass = studentClass;
        this.score = score;
    }

    public Student() {
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public double getScore() {
        return score;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", homeTown='" + homeTown + '\'' +
                ", studentClass='" + studentClass + '\'' +
                ", score=" + score +
                '}';
    }
}
