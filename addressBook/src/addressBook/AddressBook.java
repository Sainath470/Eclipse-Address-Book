package addressBook;
//created AddressBook class
public class AddressBook {
	public static void main(String args[])
	{
		//welcome message for the program
	System.out.println("Welcome to Address Book program");
	}
}
	
//creating Contacts class
class Contacts{
	String firstName,lastName,address,cityName,state,email;
	int zipCode,phoneNumber;
	
	//Parameterized constructor for class Contacts
	Contacts(String fN, String lN, String addr, String cN, String State, int zCode,int pN, String email)
	{
			this.firstName=fN;
			this.lastName=lN;
			this.address=addr;
			this.cityName=cN;
			this.state=State;
			this.zipCode=zCode;
			this.phoneNumber=pN;
			this.email=email;
	}
}