//Name:Kaleb_Befekadu
//PantherID:002-515-849
//Due Date: July 21
//==================================================================
//extend indicates that the Doctor class inherits the Human class
public class Doctor extends Human {
	//create instance variables 
	private int years;
	private String speciality;
	//create a constructor with five instance variable
	public Doctor (String speciality, int years,double hight,float weight, int age) {
		//Inherits the number from the parent class
		super(hight,weight,age);
		//assigns the instance variable to the constructor parameters 
		this.years = years;
		this.speciality = speciality;
	}
	//method that gets the year value
	public int getYears () {
		return years;
	}
	//method that gets the Specialty value
	public String getSpeciality() {
		return speciality;
	}//Method that calculates the salary by starting at 40000 
	//the number of year and adds 5000 for every year and checking 
	public int getSalary() {
		return 40000 + (years - 1) * 5000;
	}
	

}
