
import java.util.Scanner;

//Email Administrator Application
//scenario: task of creating email accounts for new hires.
public class Email {
	 String firstName;
	 String lastName;
	 String password;
	 String department;
	 String email;
	 int defaultPasswordLength=10;
	 String companySuffix="abc.com";

	//constructor to receive the first name and last name
	public Email(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
//		System.out.println("Email Created:"+this.firstName+" "+this.lastName);
		
		//call a method for department, return the department
		this.department=setDepartment();
//		System.out.println("Department: "+this.department);
		
		//combine element to generate email
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@" +department+"."+companySuffix;
		System.out.println("Your email is:"+email);
		//call a method that returns a random password
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Your password is: "+this.password+"\n\n");
	}
	//ask for the department
	private String setDepartment() {
		System.out.print("New Employee: "+firstName + "\nPlease enter the department from the following\n1. Technical\n2. Admin\n3. Human Resource\n4. Legal\nEnter the department code: ");
		Scanner input = new Scanner(System.in);
		int depchoice = input.nextInt();
		if(depchoice==1) {
			return "tech";
		}
		else if(depchoice==2) {
			return "admin";
		}
		else if(depchoice==3) {
			return "hr";
		}
		else if(depchoice==4) {
			return "legal";
		}
		else {
			return "";
		}
	}
	//generate a random password
	private String randomPassword(int length) {
		String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int) (Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//change the password
	public void changePassword(String password) {
		this.password=password;
	}
	
	public String getPassword() { return password; }
	
	public String showinfo() {
		return "Dear "+firstName+" your gernerated credentials are as follows\nEmail --> "+email+"\nPassword --> "+password+"\n";
	}

}