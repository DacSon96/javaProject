package service;

import dao.StudentDao;
import model.Student;

import java.util.List;

public class StudentService {
    StudentDao studentDao = new StudentDao();

    public List<Student> show() {
        return studentDao.show();
    }
    public boolean create(Student student) {
        return studentDao.addStudent(student);
    }


    public boolean update(int id, Student Student) {
        return studentDao.update(id, Student);
    }


    public boolean delete(int id) {
        return studentDao.delete(id);
    }

    public Student findById(int id) {
        return studentDao.findById(id);
    }
    public List<Student> findByName(String name) {
        return studentDao.findByName(name);
    }


}
