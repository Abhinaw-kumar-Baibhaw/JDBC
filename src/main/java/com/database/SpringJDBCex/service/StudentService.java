package com.database.SpringJDBCex.service;
import com.database.SpringJDBCex.model.Student;
import com.database.SpringJDBCex.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class StudentService {
    private StudentRepo repo;
    public void addStudents(Student s) {
     repo.save(s);
    }

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}