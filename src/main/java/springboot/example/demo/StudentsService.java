package springboot.example.demo;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {

    private final StudentRepository studentRepository;

    public Students getStudentById(Long studentId){
        return studentRepository.getStudentById(studentId);
    }

    public StudentsService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Students students) {
        studentRepository.save(students);
    }

    public void deleteStudent(Long studentId) {

        Students students = getStudentById(studentId);
        Long id = students.getId();
        studentRepository.deleteById(id);
    }

    public void editStudentById(Students students, Long studentId){
        Students studentToPut = getStudentById(studentId);

        studentToPut.setName(students.getName());
        studentToPut.setStudentIdNumber(students.getStudentIdNumber());
        studentToPut.setSurname(students.getSurname());

        studentRepository.save(studentToPut);
    }

}
