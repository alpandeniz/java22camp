package dataAccess;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile sisteme eklendi : " + instructor.getInstructorName() + " " + instructor.getInstructorSurname());
	}

}
