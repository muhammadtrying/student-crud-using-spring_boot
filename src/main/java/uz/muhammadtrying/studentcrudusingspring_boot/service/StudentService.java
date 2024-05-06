package uz.muhammadtrying.studentcrudusingspring_boot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.muhammadtrying.studentcrudusingspring_boot.entity.Student;
import uz.muhammadtrying.studentcrudusingspring_boot.repo.StudentRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepo studentRepo;

    public List<Student> get() {
        return studentRepo.findAll();
    }

    public void add(Student student) {
        studentRepo.add(student);
    }

    public void delete(Integer id) {
        studentRepo.delete(id);
    }

    public void edit(Integer id, Student student) {
        Student studentToBeEdited = studentRepo.findById(id);
        studentToBeEdited.setFirstName(student.getFirstName());
        studentToBeEdited.setLastName(student.getLastName());
    }
}
