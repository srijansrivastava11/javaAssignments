public class Course {

	private int NumberOfStudents;
	private String Title;
	private Student[] EnrolledStudents = new Student[10];

	public Course(String title) {
		this.Title = title;
		this.NumberOfStudents = 0;
	}

	// Returns true if course has the maximum of 10 students, else false
	public Boolean isFull() {
		return (this.NumberOfStudents >= 10);
	}
	
	// Get student array registered in the course
	public Student[] getStudents() {
		return this.EnrolledStudents;
	}
	
	// Get number of students enrolled in course
	public Integer getNumberOfStudents() {
		return this.NumberOfStudents;
	}
	
	// Get course title
	public String getTitle() {
		return this.Title;
	}

	// Register a student
	public String registerStudent(Student student) {
		if (!this.isFull()) {
			this.EnrolledStudents[this.NumberOfStudents] = student;
			this.NumberOfStudents += 1;
			return "Registered " + student.getStudentName() + " for the course";
		}
		else {
			return "Course is full. Cannot register student to the course.";
		}
	}
}
