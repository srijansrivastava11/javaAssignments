
public class Student {
	private int Id;  
	private String StudentName;
	
	// Constructor
	public Student(int id, String studentName){
		this.Id = id;
		this.StudentName = studentName;
	}
	
	// Get Student ID
	public Integer getId() {
		return this.Id;
	}
	
	// Set Student ID
	public void setId(Integer id) {
		this.Id = id;
		return;
	}

	// Get Student Name
	public String getStudentName() {
		return this.StudentName;
	}
	
	// Set Student Name
	public void setStudentName(String studentName) {
		this.StudentName = studentName;
		return;
	}
}
