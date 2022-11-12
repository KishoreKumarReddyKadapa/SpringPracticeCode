package com.skslate.school;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skslate.dao.StudentDao;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Context Loaded...");
		Student student  = context.getBean("student",Student.class);		
		student.setRollNo(100);
		student.setName("Sandy");
		student.setAddress("Paris");
		
		StudentDao dao = context.getBean("studentDao",StudentDao.class);
		dao.insertStudent(student);

	}

}
