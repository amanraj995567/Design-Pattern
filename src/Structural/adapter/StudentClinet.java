package Structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class StudentClinet {
    public List<Student> getStudentsList(){
        List<Student>students = new ArrayList<>();

        CollegeStudent collegeStudent = new CollegeStudent("Aman", "Singh", "aman@gmail.com");
        SchoolStudent schoolStudent = new SchoolStudent("Rohit", "Singh", "rohit@gmil.com");
        students.add(collegeStudent);
        students.add(new SchoolStudentAdapter(schoolStudent));

        return students;
    }
}
