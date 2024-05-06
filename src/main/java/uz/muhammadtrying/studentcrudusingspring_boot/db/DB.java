package uz.muhammadtrying.studentcrudusingspring_boot.db;

import uz.muhammadtrying.studentcrudusingspring_boot.entity.Student;

import java.util.ArrayList;
import java.util.List;

public interface DB {
    List<Student> students = new ArrayList<>(List.of(
            new Student("Muhammad", "G'ulomov"),
            new Student("Ibrohim", "G'ulomov"),
            new Student("Bobur", "G'ulomov"),
            new Student("Muhlisa", "G'ulomova"),
            new Student("Tursunoy", "G'ulomova")
    ));
}
