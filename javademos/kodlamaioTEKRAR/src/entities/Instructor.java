package entities;

public class Instructor {
		int instructorId;
		String instructorName;
		String instructorSurname;

		public Instructor( int instructorId, String instructorSurname, String instructorName) {
			this.instructorId = instructorId;
			this.instructorName = instructorName;
			this.instructorSurname = instructorSurname;
		}

		public int getInstructorId() {
			return instructorId;
		}

		public void setInstructorId(int instructorId) {
			this.instructorId = instructorId;
		}

		public String getInstructorName() {
			return instructorName;
		}

		public void setInstructorName(String instructorName) {
			this.instructorName = instructorName;
		}

		public String getInstructorSurname() {
			return instructorSurname;
		}

		public void setInstructorSurname(String instructorSurname) {
			this.instructorSurname = instructorSurname;
		}
		
		
		
		
}
