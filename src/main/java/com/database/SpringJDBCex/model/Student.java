package com.database.SpringJDBCex.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

    private int roll_no;
    private String name;
    private int marks;

    public int getRollNo() {
        return roll_no;
    }

    public void setRollNo(int rollNo) {
        this.roll_no = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + roll_no +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
