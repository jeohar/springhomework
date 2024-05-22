package com.tekJohar.demo.controller;



import com.tekJohar.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {


    @GetMapping("/api/domain")
    public String getStudent(Model model){
        Student student = new Student();
        student.setName("tina");
        student.setRollNum(567);
        model.addAttribute("student",student);
        return "student-details";
    }

}