import java.util.*;
import java.io.*;
public class bankOnIt implements HasMenu, Serializable{
	double balance;
	public static void main(String args[]){
		CheckingAccount ca = new CheckingAccount();
		if(user("Alice", 1111)){
			System.out.println("Login successful\nCustomer menu\n\n");
			int response = menu();
			ca.start();
		}//end if statement
	}//end main
	
	public boolean user(String userName, int pin){
		System.out.print("User name: ");
		String nameGuess = ui.nextLine();
		System.out.print("\nPIN: ");
		int pinGuess = ui.nextInt();
		if((nameGuess.equals(Customer.userName)) && (pinGuess==Customer.pin)){
			return true;
		}else{
			return false;
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
		int response = ui.nextInt();
		return response;
	}
	

	public void start(String response){
		boolean keepGoing = true;
		while(keepGoing){
			response = menu();
			if(response.equals("0")){
				keepGoing = false;
			}else if(response.equals("1")){
				System.out.println("Checking balance");
				checkBalance();
			}else if(response.equals("2")){
				System.out.println("Making a deposit...");
				makeDeposit();
			}else if(response.equals("3")){
				System.out.println("Making a withdrawl...");
				withdraw();
			}else{
				System.out.println("Please enter 0, 1, 2, 3");
			}//end if
		}//end while
	}//end start
	
	public int checkBalance(){
		System.out.println("Current balance: "+Customer.balance);
	}
	public int makeDeposit(){
		Scanner ui = new Scanner(System.in);
		double amount = ui.nextDouble();
		Customer.balance() += amount;
		System.out.println(amount+" has now been added to your current account");
	}
	public int withdraw(){
		Scanner ui = new Scanner(System.in);
		double amount = ui.nextDouble();
		Customer.balance() -= amount;
		System.out.println(amount+" has been withdrawn from your account");
	}

	public Customer(){
		this.userName = "Alice";
		this.PIN = "1111";
	}// end constructor
	
	public Customer(String userName, String PIN){
		this.userName = userName;
		this.PIN = PIN;
	}
}//end class
