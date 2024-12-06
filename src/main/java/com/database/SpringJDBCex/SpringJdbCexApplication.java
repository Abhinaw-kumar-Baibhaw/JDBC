package com.database.SpringJDBCex;

import com.database.SpringJDBCex.model.Student;
import com.database.SpringJDBCex.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbCexApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJdbCexApplication.class, args);
	    Student s=context.getBean(Student.class);
		s.setRollNo(106);
		s.setName("Aakash");
		s.setMarks(78);
		StudentService service=context.getBean(StudentService.class);
		service.addStudents(s);

		List<Student> data=service.getStudents();
	}

}
