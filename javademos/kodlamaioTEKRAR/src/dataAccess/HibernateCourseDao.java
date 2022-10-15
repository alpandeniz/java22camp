package dataAccess;

import entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
			System.out.println("Hibernate ile sisteme eklendi : " + course.getCourseName());
	}

}
