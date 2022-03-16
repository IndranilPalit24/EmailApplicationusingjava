import java.util.*;
public class Email {
			//Scanner class to take input, declared global.	
			Scanner sc = new Scanner(System.in);
	        
			//Attributes for Email Application
	        private String firstName;
	        private String LastName;
	        public String email;
	        private String department;
	        private int Capacity = 1000;
	        private String alternateEmail;
	        private String companySuffix = "tcs.com";

	        public Email(String firstName, String LastName)
	        {
	            //Enter your Name for the Email application
	            this.firstName = firstName;
	            this.LastName = LastName;
	            System.out.println("Email Created: \nYour First Name is: " + this.firstName + "\nYour last Name is: " + this.LastName);

	            //Set Department for the Email Application
	            this.department = Setting_Department();
	            System.out.println("Your Department is: " +this.department);


	            email = firstName.toLowerCase() + "." + LastName.toLowerCase() + "@" + this.department.toLowerCase() + "." + this.companySuffix;
	            System.out.println("Your Email is: " + email);

	        }
	        //User input for setting the Department
	        private String Setting_Department()
	        {
	            System.out.println("Choose your own Department: \n1 For Sales \n2 For Development \n3 For Accounting");
	            int department_code = sc.nextInt();
	            if (department_code == 1)
	            {
	                return "Sales";
	            }
	            else if (department_code == 2)
	            {
	                return "Development";
	            }
	            else if (department_code == 3)
	            {
	                return "Accounting";
	            }
	            else
	            {
	                return "Please select a valid department code";
	            }

	        }

	        //Setting Mailbox Capacity
	        public void setcapacity(int capacity)
	        {
	            this.Capacity = capacity;
	        }

	        //Setting Alternate Email Address
	        public void setalternateEmail(String alternameEmail)
	        {
	            this.alternateEmail = alternameEmail;
	        }

	        //Getters for the above methods
	        public int getCapacity()
	        {
	            return Capacity;
	        }

	        public String getalternateEmail()
	        {
	            return alternateEmail;
	        }


	        //Show info 
	        public String Show_Info()
	        {
	            return "Name: " + firstName + " " + LastName + "\nEmail: " + email + "\nMailbox Capacity: " +Capacity;   
	        }
		}