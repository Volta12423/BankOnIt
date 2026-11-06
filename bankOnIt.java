import java.util.Scanner;
public class bankOnIt{
	public static void main(String args[]){
		Scanner ui = new Scanner(System.in);
		if(user()){
			System.out.println("Login successful\nCustomer menu\n\n");
			userAction();
		}//end if statement
	}//end main
	public boolean user(String userName, int pin){
		System.out.print("User name: ");
		String nameGuess = ui.nextLine();
		System.out.print("\nPIN: ");
		int pinGuess = ui.nextInt();
		if((nameGuess.equals(Customer.userName)) && (pinGuess==Customer.pin){
			return true;
		}//end if statement
	}//end user
	public void userAction(){
		System.out.println("0) Exit\n1) Manage checking account\n2) Manage savings account\n3) change pin\n");
	}
	public Customer(){
		this.userName = "Alice";
		this.PIN = "1111";
	}// end constructor
	
	public Customer(String userName, String PIN){
		this.userName = userName;
		this.PIN = PIN;
	}
}
