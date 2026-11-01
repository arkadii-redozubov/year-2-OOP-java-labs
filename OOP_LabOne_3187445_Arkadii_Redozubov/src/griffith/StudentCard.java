//Arkadii Redozubov, 3187445
package griffith;

//import dependencies 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentCard {
//	declare the constant for the date format as on the original student card
	private static final DateTimeFormatter DATEFORMAT = DateTimeFormatter.ofPattern("d/M/yyyy");
	
//	declare private encapsulated attributes
	private String instituteName;
	private String studentName;
	private int studentNumber;
	private String course;
	private LocalDate dateOfBirth;
	private LocalDate creationDate;
	private LocalDate expiryDate;
	
//	constructor, initializes all all attributes except expiry date, which is calculated as 1 year from the creation date
	public StudentCard(String instituteName, String studentName, int studentNumber, String course, String dateOfBirthString, String creationDateString) {
		this.instituteName = instituteName;
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.course = course;
		
//		Parse date Strings into LocalDate instances using the defined format as a constant variable 
		this.dateOfBirth = LocalDate.parse(dateOfBirthString, DATEFORMAT);
		this.creationDate = LocalDate.parse(creationDateString, DATEFORMAT);
//		Sets expiry date automatically by adding a year to the creation date
		this.expiryDate = creationDate.plusYears(1);
		
	}
//	Getters and Setters
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
		
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
//	returns dates as formatted strings using the constant 
	public String getDateOfBirth() {
		return dateOfBirth.format(DATEFORMAT);
	}


	public String getCreationDate() {
		return creationDate.format(DATEFORMAT);
	}


	public String getExpiryDate() {
		return expiryDate.format(DATEFORMAT);
	}
	
//	displays all details about the student card
	public void display() {
		System.out.println("Student Card Information:");
		System.out.println("Institute: " + instituteName);
		System.out.println("Name: " + studentName);
		System.out.println("Student number: " + studentNumber);
		System.out.println("Course: " + course);
		System.out.println("DOB: " + getDateOfBirth());
		System.out.println("Creation date: " + getCreationDate());
		System.out.println("Expiry date: " + getExpiryDate());
	}
	

	

}
