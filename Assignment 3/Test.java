import java.util.*;
 
public class Test {
	public static void main(String[] args) {
		Student[] students = new Student[12];
		for(int i = 0; i < 12; i++)
		{
			Student s = new Student(i+1, "A" + (i+1));
			students[i] = s;
			System.out.println("Created Student ID: " + s.getId() + " Name: " + s.getStudentName());
		}
		
		Course c1 = new Course("Introduction to Java Programming");
		
		for(int i = 0; i < 12; i++) {
			System.out.println(c1.registerStudent(students[i]));			
		}
		
		Student[] registeredStudents = c1.getStudents();
		
		System.out.println("Number of Students registered for course: " + c1.getNumberOfStudents());
		System.out.println("Students registered for course: " + c1.getTitle());
		int numStudents = c1.getNumberOfStudents();
		for(int i = 0; i < numStudents; i++) {
			System.out.println("Id: " + registeredStudents[i].getId() + " Name: " + registeredStudents[i].getStudentName());
		}
	}
 }
