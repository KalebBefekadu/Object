//Name:Kaleb_Befekadu
//PantherID:002-515-849
//Due Date: July 21
//==================================================================
//extend indicates that the Student class inherits the Human class
public class Student extends Human {
	//create instance variables 
	private String major;
	private double gpa;
	private int creditHours;
	//create a constructor with six instance variable
	public Student (String major, double gpa, int creditHours, double hight,float weight, int age) {
		//Inherits the number from the parent class
		super (hight, weight, age);
		//assigns the instance variable to the constructor parameters 
		this.major = major;
		this.gpa = gpa;
		this.creditHours = creditHours;
	}	//method that gets the major value
	public String getmajor () {
		return major;
	} 	//method that gets the GPA value
	public double getgpa () {
		return gpa;
	}	//method that gets the getcreditHours value
	public int getcreditHours () {
		return creditHours;
	}// method that checks what year the student is by comparing the credit hour 
public String getYear () {
	//initialize and assign a value for the variable
	String a = null;
	//checks if the student is freshman
	if (creditHours < 32) {
		a = "freshman";
		return a;}
	//checks if the student is sophomore
	if (32 < creditHours && creditHours < 64) {
		a ="Sophmore";
		return a;}
	//checks if the student is junior
	if (64 < creditHours && creditHours < 96) {
		a ="junior";
		return a;
	}//checks if the student is senior
	if (creditHours > 96) {
		a ="Senior";
		return a;
	}
	//returns the students year
	return a;
	
	}	
}
