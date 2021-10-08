package model;

public class Student {
    private int id;
    private String name;
    private String birth;
    private String address;
    private String phoneNumber;
    private String email;
    private int classRoomId;

    public Student(int id, String name, String birth, String address, String phoneNumber, String email, int classRoomId) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.classRoomId = classRoomId;
    }

    public Student(String name, String birth, String address, String phoneNumber, String email, int classRoomId) {
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.classRoomId = classRoomId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getClassRoom() {
        return classRoomId;
    }

    public void setClassRoom(int classRoom) {
        this.classRoomId = classRoom;
    }
}
