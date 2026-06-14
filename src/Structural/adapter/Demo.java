package Structural.adapter;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
         StudentClinet client = new StudentClinet();
         List<Student> studentList = client.getStudentsList();
         System.out.println(studentList);
    }
}
