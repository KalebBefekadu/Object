//Name:Kaleb_Befekadu
//PantherID:002-515-849
//Due Date: July 21
//==================================================================
public class Mammal {
	//create instance variables 
	private int age;
	private double weight;
	//create a constructor with two instance variable
	public Mammal (float weight, int age){
		//assigns the instance variable to the constructor parameters 
		this.weight = weight;
		this.age = age;
	}	//method that gets the weight value
	public float getweight() {
		return (float) weight;
	}	//method that gets the age value
	public int getage() {
		return age;
	}
}
