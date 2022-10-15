package kodlamaioTEKRAR;

import java.util.ArrayList;
import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.EmailLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

//import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new EmailLogger()};
		
		System.out.println("===============");
		System.out.println("Kategori");
		System.out.println("===============");
		Category category1 = new Category(1, "Programlama1");
		Category category2 = new Category(2, "Programlama2");
		List<Category> categoryList = new ArrayList<>();
		 CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categoryList);
		 categoryManager.add(category1);
		 categoryManager.add(category2);
		 
		 
		 System.out.println("===============");
			System.out.println("Eğitmen");
			System.out.println("===============");
			
			
			Instructor instructor = new Instructor(1, "Demiroğ", "Engin");
			InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
			instructorManager.add(instructor);
			
			System.out.println("===============");
			System.out.println("Kurslar");
			System.out.println("===============");
			
			
			Course course1 = new Course(1, "JAVA", 450);
			Course course2 = new Course(2, "AngularJS", 700);
			List<Course> courseList = new ArrayList<>();
			CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courseList);
			courseManager.add(course1);
			courseManager.add(course2);
		
	}

	

}
