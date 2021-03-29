package addressBook;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook
{
	
		//creating variables
		   String first_Name;
	 	   String last_Name;
	 	  String address;
		   String city;
		   String state;
		   long zip_Code;
	 	  long phone_Number;
	 	  String email_Id;	

	   
	   		 Scanner input= new Scanner(System.in);
	   		public void details()
      			  {
				   	 System.out.println("Enter your details:\n");
	  	        		     System.out.println("Enter your First Name:");	
	      			  	 this.first_Name=input.nextLine();
	        		       	       System.out.println("Enter your Last Name: ");	 
      				         this.last_Nam=input.nextLine();
					 System.out.println("Enter your Address: ");
					 this.address=input.nextLine();
					 System.out.println("Enter your City : ");
					 this.city=input.nextLine();
					 System.out.println("Enter your State : ");
					 this.state=input.nextLine();
					 System.out.println("Enter your Zip Code: ");
					 this.zip_Code =input.nextLong();
					 System.out.println("Enter your Phone Number: ");
					 this.phone_Number =input.nextLong();
					 System.out.println("Enter your Email Id : ");
					 this.email_Id=input.next();
		 	}
	 	
	   	//return string for displaying the user input
	 	public String toString()
	 	{
		 return (" First Name: "+first_Name+"\n Last Name: "+last_Nam+"\n Address: "+address+"\n City: "+city+"\n State: "+state+"\n Zip Code: "+zip_Code+"\n Phone Number :"+phone_Number+"\n Email_Id: "+email_Id+"\n");
	 	}

	 	public String getName()
	 	{
	 		return first_Name;
	 	}
	 	
	  	public void editDetails()
   		{	 		
            System.out.println("Which details you want to edit");
            System.out.println("Press 1 for Name\n 2 Address\n 3 City\n 4 State\n 5 Zip Code\n 6 Phone Number\n 7 Email Id\n 8 Exit ");
            Scanner edit_obj=new Scanner(System.in);
            int edit=edit_obj.nextInt();
            switch(edit) 
	 	      	{
                case 1: 
                      System.out.println("Press 1 to edit your Firstname\n press 2 to LastName\n press 0 for exit");
                      Scanner input1=new Scanner(System.in);
                      int option1=input1.nextInt();
                      switch(option1)
			 			          {				 					
                          case 1:
                              Scanner input2=new Scanner(System.in);
                              System.out.println("Enter the first Name");
                              String edit_firstName=input2.nextLine();
                              this.first_Name=edit_firstName;
                              break;
                          
                          case 2:
                              Scanner input3=new Scanner(System.in);
                              System.out.println("Enter the Last Name");
                              String edit_lastName=input3.nextLine();
                              this.last_Nam=edit_lastName;
                              break;

                          default:
                              break;
				 	
          			 			}
			    			break;
			 			
                case 2: 
                  Scanner input4=new Scanner(System.in);
                  System.out.println("Enter the Address");
                  String edit_Address=input4.nextLine();
                  this.address=edit_Address;
                  break;
	 					
                case 3: 
                  Scanner input5=new Scanner(System.in);
                  System.out.println("Enter the City");
                  String edit_City=input5.nextLine();
                  this.city=edit_City;
                  break;

                case 4: 
                  Scanner input6=new Scanner(System.in);
                  System.out.println("Enter the State");
                  String edit_State=input6.nextLine();
                  this.state=edit_State;
                  break;

                case 5: 
                  Scanner input7=new Scanner(System.in);
                  System.out.println("Enter the Zip Code");
                  long edit_ZipCode=input7.nextLong();
                  this.zip_Code=edit_ZipCode;
                  break;

                case 6: 
                  Scanner input8=new Scanner(System.in);
                  System.out.println("Enter the Phone number");
                  long edit_phoneNumber=input8.nextLong();
                  this.phone_Number=edit_phoneNumber;
                  break;
	 					
                case 7: 
                  Scanner input9=new Scanner(System.in);
                  System.out.println("Enter the Email");
                  String edit_Email=input9.nextLine();
                  this.email_Id=edit_Email;
                  break;

                default:
                  break;
	 			    }
	 		}
  
  
              public static void main(String args[])
              {
                  Scanner sc=new Scanner(System.in);
                  System.out.println("Welcome to your address Book");
                  ArrayList<AddressBook> User= new ArrayList<>();//creating Array list and User is object

                  AddressBook person=new AddressBook();
                  AddressBook person1=new AddressBook();

                  person.details();//calling details method
                  person.toString();//calling toString method using obj
                  User.add(person);//adding to the ArrayList

                  Scanner input1= new Scanner(System.in);

                  System.out.println("Please choose your choice");				 
                  System.out.println("Press 1 for adding another details\n2 for exit");

                  int option=input1.nextInt();
				 
                   switch(option)
                   {
                     case 1:

                       person1.details();
                       person1.toString();
                         User.add(person1);
                       break;

                       default:
                         break;
                   }
				 
                   System.out.println("Press 1 for editing the details \n 2 for exit");
                   Scanner press1=new Scanner(System.in);
                   int options=press1.nextInt();
                   switch(options)
                   {
                      case 1:
                            System.out.println("Enter the first name\n or else type exit ");
                            Scanner press=new Scanner(System.in);
                            String opt=press.nextLine();	
                              if(person.getName().equals(opt))
                              {								 		
                                  person.editDetails();
                                  person.toString();
                                  User.set(0, person);
                              }
                              else if(person1.getName().equals(opt))
                              {

                                person1.editDetails();
                                person1.toString();
                                User.set(1, person1);
                              }
                              else {
                                    break;
                                   }
                              default:
                                    break;
			        		 }
					 
                   System.out.println("Press 1 for deleting a contact\n Press 2 for exit");
                   Scanner delete=new Scanner(System.in);
                   int deletion=delete.nextInt();
                   switch(deletion)
                   {
                       case 1: 
                          System.out.println("Enter the first name of the contact for deletion\n or press exit for exit");
                          Scanner del=new Scanner(System.in);
                          String dele=del.nextLine();

                              if(person.getName().equals(dele))
                              {
                                User.remove(person);
                              }
                              else if(person1.getName().equals(dele))
                              {
                                User.remove(person1);
                              }
                              else
                              {
                                break;
                              }

                       default:
                          break;
                   }			
				//for printing the list of contacts in Array List
		    		System.out.println("Your Contacts in the Address Book:\n");
            for(int i=0;i<User.size();i++)
            {					
              System.out.println(User.get(i));
            }
		}			
}

