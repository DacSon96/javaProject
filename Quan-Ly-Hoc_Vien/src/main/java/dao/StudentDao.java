package dao;

import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public static final String SELECT_ALL_STUDENT = "SELECT * FROM student";
    public static final String INSERT_NEW_STUDENT = "INSERT INTO student (name, birth, address, PhoneNumber, Email, ClassroomId) VALUES (?,?,?,?,?,?)";
    public static final String DELETE_STUDENT_BY_ID = "DELETE FROM student WHERE id = ?";
    public static final String UPDATE_STUDENT_BY_ID = "UPDATE student SET name = ?, birth = ?, address = ?, PhoneNumber = ?, Email = ?, ClassroomId = ? WHERE id = ?";
    public static final String GET_CLASS_NAME_BY_ID = "SELECT ClassName from student S join classroom c on c.Id = S.ClassroomId where S.Id = ?";
    public static final String SELECT_STUDENT_BY_ID = "SELECT * FROM student WHERE id = ?";
    public static final String SELECT_STUDENT_BY_NAME = "SELECT * FROM student WHERE name = ?";
    Connection connection = DBConnection.getConnection();

    public List<Student> show() {
        List<Student> students = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_STUDENT);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String birth = resultSet.getString("birth");
                String address = resultSet.getString("address");
                String phoneNumber = resultSet.getString("phoneNumber");
                String email = resultSet.getString("email");
                int classroomId = resultSet.getInt("ClassroomId");
                students.add(new Student(id, name, birth, address, phoneNumber, email,classroomId));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
    public boolean addStudent(Student student) {
        boolean isCreated = false;
        try {
            PreparedStatement statement = connection.prepareStatement(INSERT_NEW_STUDENT);
            statement.setString(1, student.getName());
            statement.setString(2, student.getBirth());
            statement.setString(3, student.getAddress());
            statement.setString(4, student.getPhoneNumber());
            statement.setString(5, student.getEmail());
            statement.setInt(6, student.getClassRoom());
            isCreated = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isCreated;
    }
    public boolean update(int id, Student student) {
        boolean isUpdated = false;
        try {
            PreparedStatement statement = connection.prepareStatement(UPDATE_STUDENT_BY_ID);
            statement.setString(1, student.getName());
            statement.setString(2, student.getBirth());
            statement.setString(3, student.getAddress());
            statement.setString(4, student.getPhoneNumber());
            statement.setString(5, student.getEmail());
            statement.setInt(6, student.getClassRoom());
            statement.setInt(7, id);
            isUpdated = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }
    public boolean delete(int id) {
        boolean isDeleted = false;
        try {
            PreparedStatement statement = connection.prepareStatement(DELETE_STUDENT_BY_ID);
            statement.setInt(1, id);
            isDeleted = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isDeleted;
    }
    public Student findById(int id) {
        Student student = null;
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_STUDENT_BY_ID);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
                String name = resultSet.getString("name");
                String birth = resultSet.getString("birth");
                String address = resultSet.getString("address");
                String phoneNumber = resultSet.getString("phoneNumber");
                String email = resultSet.getString("email");
                int classroomId = resultSet.getInt("ClassroomId");
                student = new Student(id, name, birth, address, phoneNumber, email,classroomId);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }
    public List<Student> findByName(String name) {
        List<Student> students = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_STUDENT_BY_NAME);
            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String keyName = resultSet.getString("name");
                String birth = resultSet.getString("birth");
                String address = resultSet.getString("address");
                String phoneNumber = resultSet.getString("phoneNumber");
                String email = resultSet.getString("email");
                int classroomId = resultSet.getInt("ClassroomId");
                students.add(new Student(id, keyName, birth, address, phoneNumber, email,classroomId));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
}
