package uz.muhammadtrying.studentcrudusingspring_boot.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.muhammadtrying.studentcrudusingspring_boot.entity.Student;
import uz.muhammadtrying.studentcrudusingspring_boot.service.StudentService;

import java.util.List;

@RestController()
@CrossOrigin
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping()
    public List<Student> getStudents() {
        return studentService.get();
    }

    @PostMapping()
    public void addStudent(@RequestBody Student student) {
        studentService.add(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentService.delete(id);
    }

    @PutMapping("/{id}")
    public void updateStudent(@PathVariable Integer id, @RequestBody Student student) {
        studentService.edit(id, student);
    }
}
