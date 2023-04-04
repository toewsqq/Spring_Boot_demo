package springboot.example.demo;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {

    private final StudentRepository studentRepository;

    public StudentsService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Students students) {
        studentRepository.save(students);
    }

}
