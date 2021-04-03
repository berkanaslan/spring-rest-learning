package com.berkanaslan.springdemo.rest;

import com.berkanaslan.springdemo.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Berkan Aslan
 * 3.04.2021
 */

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    @PostConstruct
    public void loadData() {
        students = new ArrayList<Student>();

        students.add(new Student("Berkan", "Aslan"));
        students.add(new Student("John", "Doe"));
        students.add(new Student("Marry", "Public"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        if ((studentId >= students.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student not found for " + studentId);
        }

        return students.get(studentId);
    }
}
