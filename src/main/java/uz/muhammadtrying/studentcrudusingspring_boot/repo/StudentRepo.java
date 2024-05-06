package uz.muhammadtrying.studentcrudusingspring_boot.repo;

import org.springframework.stereotype.Repository;
import uz.muhammadtrying.studentcrudusingspring_boot.entity.Student;

import java.util.List;

import static uz.muhammadtrying.studentcrudusingspring_boot.db.DB.students;

@Repository
public class StudentRepo {

    public List<Student> findAll() {
        return students;
    }

    public void add(Student student) {
        students.add(student);
    }

    public void delete(Integer id) {
        students.remove(students.stream().filter(student -> student.getId().equals(id)).findFirst().get());
    }

    public Student findById(Integer id) {
        return students.stream().filter(student -> student.getId().equals(id)).findFirst().get();
    }
}
