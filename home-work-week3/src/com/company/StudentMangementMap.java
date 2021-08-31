package com.company;

import java.util.HashMap;
import java.util.Map;

public class StudentMangementMap {
    private Map<String, Student> studentMap = new HashMap<>();

    public Map<String, Student> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<String, Student> studentMap) {
        this.studentMap = studentMap;
    }
    public void addNewStudent(Student student) {
        this.studentMap.put(student.getStudentID(),student);
    }
    public void showAll() {
        for (Map.Entry<String, Student> studentEntry : studentMap.entrySet()) {
            System.out.println(studentEntry.getValue());
        }
    }
    public void updateStudent(Student student, String id) {
        this.studentMap.replace(id, student);
    }
    public void removeStudent(String id) {
        this.studentMap.remove(id);
    }
    public boolean findStudentById(String id) {
        return studentMap.containsKey(id);
    }

}
