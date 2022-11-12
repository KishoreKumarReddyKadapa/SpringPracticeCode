package com.skslate.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.skslate.school.Student;
@Repository
public class StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate ;
	
	public void insertStudent(Student student) {
		String sqlQuery = "INSERT INTO Student "
				+ " values(?,?,?)";
		Object[] arr = {student.getRollNo(),student.getName(),student.getAddress()};
		
		int count = jdbcTemplate.update(sqlQuery,arr);
		System.out.println("No of inserted records : "+count );
		
	}

	
	
//	public DataSource getDataSource() {
//		
//		String url = "jdbc:mysql://localhost:3306/school_db";
//		String username = "root";
//		String password = "Skslate@486";
//		DataSource ds = new DriverManagerDataSource(url, username, password);
//		
//		return ds;
//	}
	
}
