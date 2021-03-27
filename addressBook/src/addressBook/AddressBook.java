package addressBook;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AddressBook{
	   String first_Name;
	   String last_Name;
	   String address;
	   String city;
	   String state;
	   long zip_Code;
	   long phone_Number;
	   String email_Id;	

	   ArrayList<AddressBook> User= new ArrayList<>();
	   				public void details()
	   				{
	   				 Scanner input= new Scanner(System.in);
				   	 System.out.println("Enter your details:");
				     System.out.println("Enter your First Name: ");
					 this.first_Name=input.nextLine();
					 System.out.println("Enter your Last Name: ");
					 this.last_Name=input.nextLine();
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
	 	
	 	public String toString()
	 	{
		 return (" first_Name: "+first_Name+"\n last_Name: "+last_Name+"\n address: "+address+"\n city: "+city+"\n state: "+state+"\n Zip Code: "+zip_Code+"\n phone_Number :"+phone_Number+"\n email_Id: "+email_Id+"\n");
	 	}
	
		 public static void main(String args[])
			{
				 ArrayList<AddressBook> User= new ArrayList<>();
				 AddressBook person1=new AddressBook();
				 person1.details();
				 System.out.println(person1.toString());
				 User.add(person1);
				 				 
				 System.out.println("Do you want to add other person details Press 1 for Yes or Press 2 for exit");
				 Scanner input1= new Scanner(System.in);
				
				 int option=input1.nextInt();
				 switch(option)
				 {
				 case 1:
					AddressBook person2=new AddressBook();
					person2.details();
					//System.out.println(person2.toString());
					User.add(person2);
					break;
				 
				 default:
					 break;
				 }
				 for(int i=0;i<User.size();i++)
				 {
					System.out.println(User.get(i)); 
				 }
			}

		

		
			
		}

