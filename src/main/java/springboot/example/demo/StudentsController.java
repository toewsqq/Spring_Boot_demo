package springboot.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentsController {

    private StudentsService studentsService;


    @Autowired
    public StudentsController(StudentsService studentsService) {
        this.studentsService = studentsService;
    }

    @GetMapping()
    public List<Students> getAllStudents(){
        return studentsService.getAllStudents();
    }




}
