package com.example.spring_data_jpa_ex;

import com.example.spring_data_jpa_ex.model.Student;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo=context.getBean(StudentRepo.class);

	     Student s1=context.getBean(Student.class);
		Student s2=context.getBean(Student.class);
		Student s3=context.getBean(Student.class);
		Student s4=context.getBean(Student.class);

		s1.setRollNo(1);
		s1.setName("Abhinaw");
		s1.setMarks(70);

		s2.setRollNo(2);
		s2.setName("Rahul");
		s2.setMarks(75);

		s3.setRollNo(3);
		s3.setName("Arjun");
		s3.setMarks(85);

		s4.setRollNo(4);
		s4.setName("Aniket");
		s4.setMarks(85);

		repo.save(s1);
		repo.save(s2);
		repo.save(s3);
		repo.save(s4);

//		System.out.println(repo.findAll());
		System.out.println(repo.findById(1));

		System.out.println(repo.findByName("Arjun"));

		repo.delete(s2);
	}

}
