package com.example.asynctask_tl;

import java.util.ArrayList;

public class StudentInfo {
    private ArrayList<Student> students = new ArrayList<Student>();;



    public StudentInfo(){
        students.add(new Student("Wagner","Bob","CS"));
        students.add(new Student("Walter","Matt","CS"));
        students.add(new Student("Conahan","Cormac","CS"));
        students.add(new Student("Suzara","Mitch","CS"));
        students.add(new Student("Lukehart","Spencer","CITA"));
    }

    public ArrayList<Student> getAllStudents(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return students;
    }
}

