package com.example.demo.controller;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.Student;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
//import javax.xml.ws.Service;

@CrossOrigin("*")
@RestController
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;
    private Gson gson = new Gson();
    @GetMapping("/student")
    public String getStudentList(){

        List<Student> studentList=studentMapper.selectList(null);
        studentMapper.deleteById(150806199);
        return gson.toJson(studentList);
    }
    @PostMapping("/addstudent")
    public void AddStudent(@RequestBody Student student) {
        studentMapper.insert(student);
    }
    @DeleteMapping("/delstudent")
    public void DeleteStudent(@RequestBody Student student) {
        studentMapper.deleteById(student);
    }
    @PutMapping("/updatestudent")
    public void UpdateStudent(@RequestBody Student student) {
        studentMapper.updateById(student);
    }

}
