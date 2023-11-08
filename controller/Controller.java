package org.example.controller;

import org.example.model.*;
import org.example.service.DataService;
import org.example.view.StudentView;

import java.util.List;

public class Controller {

    private final DataService service = new DataService();
    private final StudentView view = new StudentView();

    public void createStudent(String firstName, String lastName,String middleName){
        service.create(firstName,lastName,middleName, Type.STUDENT);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        service.createStudentGroup(teacher, students);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList){
            Student student = (Student) user;
            view.printConsole(student);
        }
    }

}
