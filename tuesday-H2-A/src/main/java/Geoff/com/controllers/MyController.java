package Geoff.com.controllers;

import Geoff.com.models.Student;
import Geoff.com.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    StudentService stuservice;

    @DeleteMapping("/removeStudent/{regno}")
    public String deleteRecord(@PathVariable("regno")int num){
        return stuservice.deleteRecord(num);
    }

    @GetMapping("/showRecord/{num}")
    public Student showRecord(@PathVariable("num")int regno){
        return stuservice.showOneRecord(regno);
    }
    @PostMapping("/student")
    public String saveRecord(@RequestBody Student stu){
        return stuservice.saveRecord(stu);
    }

    @GetMapping("/showAll")
    public List<Student> showAll(){
        List<Student> ref=stuservice.allRecords();
        return ref;
    }
}
