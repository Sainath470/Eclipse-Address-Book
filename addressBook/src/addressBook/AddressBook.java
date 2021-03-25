package addressBook;
import java.util.Scanner;
//created AddressBook class
public class AddressBook {
		//method for taking input from the user	
	static String userInput(String x)
	{
			Scanner input=new Scanner(System.in);
			System.out.println(x);
			String User1=input.nextLine();
			return User1;
	}
	
	static long userInput2(String y)
	{
			Scanner input2=new Scanner(System.in);
			System.out.println(y);
			long User2=input2.nextLong();
			return User2;
	}
	
	//main method to take details from the user
	public static void main(String args[])
	{
		System.out.println("Welcome to Address Book Program");		
		String fN=userInput("First Name: ");
		String lN=userInput("Last Name: ");
		String addr=userInput("Address: ");
		String cN=userInput("City Name: ");
		String State=userInput("State Name: ");
		long zCode=userInput2("Zip Code: ");
		String eid=userInput("Email Id: ");
		long pN=userInput2(" Phone Number: ");
		
		//creating object 
		Contacts c=new Contacts(fN,lN,addr,cN,State,zCode,pN,eid);
		System.out.println("Name: "+c.firstName+" "+c.lastName);
		System.out.println("Address is: "+c.address+ " "+c.cityName+ " "+c.state+ " "+c.zipCode );
		System.out.println("Phone number: "+c.phoneNumber);
		System.out.println("Email id is: "+c.email);
		
	}
	
}
	
//creating Contacts class
class Contacts{
		String firstName,lastName,address,cityName,state,email;
		long zipCode,phoneNumber;
	
	//Parameterized constructor for class Contacts
	Contacts(String fN, String lN, String addr, String cN, String State, long zCode,long pN, String eid)
	{
			this.firstName=fN;
			this.lastName=lN;
			this.address=addr;
			this.cityName=cN;
			this.state=State;
			this.zipCode=zCode;
			this.phoneNumber=pN;
			this.email=eid;
	}
}