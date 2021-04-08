//Name:Kaleb_Befekadu
//PantherID:002-515-849
//Due Date: July 21
//==================================================================
public class clients {
	//main method where all the code gets executed 
	public static void main(String[] args) {
		// create a new object and passes a parameter for the constructor we have created
		Student Alex = new Student("CSC", 3.4, 54, 170, 150, 18);
		Doctor jack = new Doctor("Dermatology", 4, 173, 179,40);
		//prints out the statement by calling the geter method
		System.out.println("Alex's major is " +Alex.getmajor() + " his GPA is " + Alex.getgpa()+ " His year is "+ Alex.getYear() + " and his age is " + Alex.getage());
		System.out.println("Jack's speciality is " + jack.getSpeciality()+ " his hight is " + jack.gethight() + " his weight is " + jack.getweight() + " and his salary is " + jack.getSalary());
		
	}

}
