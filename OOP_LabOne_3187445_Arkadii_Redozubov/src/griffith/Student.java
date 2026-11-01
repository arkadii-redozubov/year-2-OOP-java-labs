//Arkadii Redozubov, 3187445
package griffith;

public class Student {
//	declare encapsulated private attributes
	private String name;
	private int id;
	private String email;
//	instance of StudentCard class
	private StudentCard studentCard;
	
//	constructor, initializes Student attributes and the StudentCard class (Composition)
	public Student(String name, int id, String instituteName,String course, String dateOfBirthString, String creationDateString) {
		this.name = name;
		this.id = id;
//		sets email based on the name, in the "@student.griffith.ie" format
		this.email = name.toLowerCase().replace(" ", "") + "@student.griffith.ie";
		this.studentCard = new StudentCard(instituteName, name,id, course, dateOfBirthString, creationDateString );
	}

//	Getters and Setters
	public String getName() {
		return name;
	}
//	updating student name automatically updates email and the StudentCard object
	public void setName(String name) {
		this.name = name;
		this.studentCard.setStudentName(name);
		this.email = name.toLowerCase().replace(" ", "") + "@student.griffith.ie";
	}

	public int getId() {
		return id;
	}
	
//  updating student id automatically updates the StudentCard object 
	public void setId(int id) {
		this.id = id;
		this.studentCard.setStudentNumber(id);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public StudentCard getStudentCard() {
		return studentCard;
	}

	public void setStudentCard(StudentCard studentCard) {
		this.studentCard = studentCard;
	}
	
//	Display student information, followed by StudentCard information
	public void display() {
		System.out.println("Student information");
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
		System.out.println("Email: " + email + "\n");
		studentCard.display();
	}

}
