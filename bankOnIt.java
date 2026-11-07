import java.util.*;
import java.io.*;
public class bankOnIt implements HasMenu, Serializable{
	double balance;
	public static void main(String args[]){
		CheckingAccount ca = new CheckingAccount();
		ca.start();
		Scanner ui = new Scanner(System.in);
		if(user()){
			System.out.println("Login successful\nCustomer menu\n\n");
			menu();
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
	
	public CheckingAccount(){
		this.balance = 0d;
	}//end constructor
	public CheckingAccount(double balance){
		this.balance = balance;
	}//end constructor
	
	public void menu(){
		Scanner ui = new Scanner(System.in);
		System.out.println("0) quit");
		System.out.println("1) check balance");
		System.out.println("2) make a deposit");
		System.out.println("3) make a withdraw\n");
		System.out.print("Action (0-3): ");
		String response = ui.nextLine();
		return response;
	}
	
	public void start(){
		boolean keepGoing = true;
		String response;
		while(keepGoing){
			response = menu();
			if(response.equals("0")){
				keepGoing = false;
			}else if(response.equals("1")){
				System.out.println("Checking balance");
			}else if(response.equals("2")){
				System.out.println("Making a deposit...");
			}else if(response.equals("3")){
				System.out.println("Making a withdrawl...");
			}else{
				System.out.println("Please enter 0, 1, 2, 3");
			}//end if
		}//end while
	}//end start

	public Customer(){
		this.userName = "Alice";
		this.PIN = "1111";
	}// end constructor
	
	public Customer(String userName, String PIN){
		this.userName = userName;
		this.PIN = PIN;
	}
}//end class
