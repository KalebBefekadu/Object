//Name:Kaleb_Befekadu
//PantherID:002-515-849
//Due Date: July 21
//==================================================================
//extend indicates that the Human class inherits the Mammal class
public class Human extends Mammal {
	//create instance variables 
	private double hight;

	//create a constructor with three instance variable
	public Human (double hight,float weight, int age) {
		//Inherits the number from the parent class
		super(weight, age);
		//assigns the instance variable to the constructor parameters 
		this.hight = hight;
	}
	//method that gets the height value
	public double gethight() {
		return hight;
	}
	
	
}
