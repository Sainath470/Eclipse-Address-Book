package addressBook;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook
{
	
		//creating variables
	    static String first_Name;
	   static String last_Name;
	   String address;
	   String city;
	   String state;
	   long zip_Code;
	   long phone_Number;
	   String email_Id;	
	   
	   		 Scanner input= new Scanner(System.in);
	   		public void details()
	   		{
	   				
				   	 System.out.println("Enter your details:");
				     System.out.println("Enter your First Name: ");
					 AddressBook.first_Name=input.nextLine();
					 System.out.println("Enter your Last Name: ");
					 AddressBook.last_Name=input.nextLine();
					 System.out.println("Enter your Address: ");
					 this.address=input.nextLine();
					 System.out.println("City : ");
					 this.city=input.nextLine();
					 System.out.println("State : ");
					 this.state=input.nextLine();
					 System.out.println("Zip Code: ");
					 this.zip_Code =input.nextLong();
					 System.out.println("Phone Number: ");
					 this.phone_Number =input.nextLong();
					 System.out.println("Email Id : ");
					 this.email_Id=input.next();
		 	}
	 	
	   	//return string for displaying the user input
	 	public String toString()
	 	{
		 return (" first_Name: "+first_Name+"\n last_Name: "+last_Name+"\n address: "+address+"\n city: "+city+"\n state: "+state+"\n Zip Code: "+zip_Code+"\n phone_Number :"+phone_Number+"\n email_Id: "+email_Id+"\n");
	 	}
	 	
		 public static void main(String args[])
			{
				 ArrayList<AddressBook> User= new ArrayList<>();//creating Array list and User is object
				 AddressBook person1=new AddressBook();//creating person1 object
				 person1.details();//calling details method
				 System.out.println(person1.toString());
				 User.add(person1);//adding details into array list
				 	
				 Scanner input1= new Scanner(System.in);
				 System.out.println("Press 1 for Adding-Details\n 2 for exit");
				 int option=input1.nextInt();
				 switch(option)
				 {
				 case 1://adding the details
					   AddressBook person2=new AddressBook();
					   person2.details();
					   User.add(person2);
					   break;
				 
				 default:
				        break;
				 }
				 
				 //for loop for printing all the elements in the Array list(Contacts)
				 for(int i=0;i<User.size();i++)
				 {
					System.out.println(User.get(i)); 
				 }
			}
}

