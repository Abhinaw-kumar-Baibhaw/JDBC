package com.database.SpringJDBCex.repo;

import com.database.SpringJDBCex.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
public class StudentRepo {

    private final JdbcTemplate jdbc;

    @Autowired
    public StudentRepo(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    String sql = "select * from student";
    String sql1 = "insert into student(roll_no,name,marks) values(?,?,?)";


    /* Like ResultSetExtractor, we can use RowMapper interface to fetch the
     records from the database using query() method */
    RowMapper<Student> mapper = new RowMapper<Student>() {
        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student s = new Student();
            s.setRollNo(rs.getInt("roll_no"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));
            return s;
        }
    };


    public void save(Student s) {

        //we have to pass sql and also what things you want
        int rows = jdbc.update(sql1, s.getRollNo(), s.getName(), s.getMarks());
        System.out.println(rows + " affected");
    }

    public List<Student> findAll() {

        //when we get all data from database then pass mapper into query method parameter like below
        return jdbc.query(sql, mapper);
    }
}
