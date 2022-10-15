package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
	public CourseDao courseDao;
	public Logger[] loggers;
	private final List<Course> courses;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.courses= courses;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		if (course.getCoursePrice() < 0) {
			throw new Exception("Kurs fiyatı 0 dan küçük olamaz.");
		}
		for (Course courses : courses) {
			if (courses.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Kurs ismi aynı olamaz.");
			}

		}
		
		courseDao.add(course);
		courses.add(course);
		for(Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
		
		
	}
	
	
		
	}

