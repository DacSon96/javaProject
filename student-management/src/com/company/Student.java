package com.company;

public class Student {
    private String id;
    private String name;
    private String address;
    private String clazz;
    private Double mark;

    public Student(String id, String name, String address, String clazz, Double mark) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.clazz = clazz;
        this.mark = mark;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getClazz() {
        return clazz;
    }

    public Double getMark() {
        return mark;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", clazz='" + clazz + '\'' +
                ", mark=" + mark +
                '}';
    }
}
