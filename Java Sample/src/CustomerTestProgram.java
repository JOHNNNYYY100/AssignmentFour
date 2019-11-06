/*class Customer{
	String name;
	int age;
	double Money;
	String Gender;
	 public void UserName(String name) {
		 this.name=name;
	 }
	 
	 public void UserMoney(double Money) {
		 this.Money=Money;
	 }
	 
	 public void UserAge(int age) {
		 this.age=age;
				 
	 }
	 
	 public void UserGender(String Gender) {
		 this.Gender=Gender;
	 }
	 
	public void Customersint(String name, int age, double Money, String Gender) {
		this.name=name;
		this.age=age;
		this.Money=Money;
		this.Gender=Gender;
	}
	
	public void Printing() {
		System.out.println("The name of the customer is: " + name);
		System.out.println("Your balance is: " + Money);
		System.out.println("Your age is: "+ age );
		System.out.println("Your gender is: "+ Gender);	
	}
	
	

}
public class CustomerTestProgram {

	public static void main(String[] args) {
		//Customer C1= new Customer();
		//Customer C2= new Customer();
		//Create BoB
		
		C1.UserName("Bob");
		C1.UserMoney(1200.00);
		C1.UserGender("Male");
		C1.UserAge(20);
		
		//Create Hannah
		C2.UserAge(28);
		C2.UserGender("Female");
		C2.UserMoney(2000.10);
		C2.UserName("Hannah");
		
		//Prints
		C1.Printing();
		C2.Printing();
	
		
		Customer C3 = new Customer();
		Customer C4 = new Customer();
		
	
		C2.Customersint("Johnny", 12, 12000, "Male");
		C3.Customersint("Hannah", 18, 200, "Female");
		
		C2.Printing();
		C3.Printing();
	}

}
*/