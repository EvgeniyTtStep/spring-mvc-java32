package org.itstep.controller;

import org.itstep.dao.hibernate.StudentDAO;
import org.itstep.dao.hibernate.StudentDAOHibernate;
import org.itstep.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {


    private final StudentDAO studentDAO;


    @Autowired
    public StudentController(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }


    @GetMapping("/student")
    public String form(Model model) {
        //model.addAttribute("student", new Student());
        return "student";
    }


    @PostMapping("/student")
    public String form(@ModelAttribute Student student) {
        studentDAO.add(student);

//        Student studentById = null;
//        if(student.getId() != null){
//            studentById = studentDAO.findById(student.getId());
//        }
//        if(studentById == null){
//            studentDAO.add(student);
//        }else {
//            studentDAO.update(student);
//        }
        return "redirect:/all-students";
    }

    @GetMapping("/all-students")
    public String allStudents(Model model) {
        model.addAttribute("students", studentDAO.findAll());

        for (Student student : studentDAO.findAll()) {
            System.out.println("Name:" + student.getName());
            System.out.println("Group: " + student.getGroup().getName());
        }
        return "all-students";
    }


    @GetMapping("/show-student/{id}")
    public String showStudent(@PathVariable(value = "id") String id, Model model) {
        System.out.println("==============================");
        Student student = new Student();
        for (Student student1 : studentDAO.findAll()) {
            if (student1.getId() == Integer.parseInt(id)) {
                student = student1;
                break;
            }
        }
        model.addAttribute("myName", student.getName());
        model.addAttribute("myEmail", student.getEmail());
        model.addAttribute("myPhone", student.getPhone());
        return "show-student";
    }


    @GetMapping("/student/delete{id}")
    public String delete(@PathVariable(value = "id") String id) {
        List<Student> all = studentDAO.findAll();
        for (Student student : all) {
            if (student.getId() == Integer.parseInt(id)) {
                studentDAO.delete(student);
            }
        }
        return "redirect:/all-students";
    }

    @GetMapping("/student/update{id}")
    public String update(@PathVariable(value = "id") String id, Model model) {
        Student student = studentDAO.findById(Integer.parseInt(id));
        model.addAttribute("student", student);
        return "student";
    }


}
