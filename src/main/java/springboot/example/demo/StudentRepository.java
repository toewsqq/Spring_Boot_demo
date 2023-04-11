package springboot.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Students, Long> {

    Students getStudentById(Long studentId);
}
