package controller;

import model.Student;
import service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServlet", value = "/student")
public class StudentServlet extends HttpServlet {
    StudentService studentService = new StudentService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                addStudent(request,response);
                break;
            case "update":
                updateStudentForm(request,response);
                break;
            case "delete":
                removeStudent(request,response);
                break;
            default:
                showStudent(request,response);
                break;
        }
    }

    private void showStudent(HttpServletRequest request, HttpServletResponse response) {
        String searchValue = request.getParameter("search");
        List<Student> studentList;
        if (searchValue == null){
            studentList = studentService.show();
        } else {
            studentList = studentService.findByName(searchValue);
        }
        request.setAttribute("studentList",studentList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("student/student.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private int updateStudentForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        Student student = studentService.findById(id);
        request.setAttribute("student", student);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/student/update.jsp");
        dispatcher.forward(request, response);
        return id;
    }

    private void addStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String birth = request.getParameter("birth");
        String address = request.getParameter("address");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        int classRoomId = Integer.parseInt(request.getParameter("classRoomId"));
        Student newStudent = new Student(name, birth, address, phoneNumber, email, classRoomId);
        studentService.create(newStudent);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
            dispatcher.forward(request,response);
    }
    private void removeStudent(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        studentService.delete(id);
        try {
            response.sendRedirect("/student");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null) {
            action = "";
        }
        switch (action) {
            case "add" : {
                addStudent(request,response);
                break;
            }
            case "update": {
                updateStudent(request,response);
                break;
            }
            default: {
                showStudent(request,response);
                break;
            }
        }
    }

    private void updateStudent(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String birth = request.getParameter("birth");
        String address = request.getParameter("address");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        int classRoomId = Integer.parseInt(request.getParameter("classRoomId"));
        Student student = new Student(name,birth,address,phoneNumber,email,classRoomId);
        int id = Integer.parseInt(request.getParameter("id"));
        studentService.update(id, student);
        try {
            response.sendRedirect("/student");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
