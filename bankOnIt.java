//bankOnIt.java
import java.util.*;
import java.io.*;
public class bankOnIt implements HasMenu{
	Admin admin = new Admin();
	CustomerList customer = new CustomerList();	
	public static void main(String[] args){
		new Bank();
	}//end main
	
	public Bank(){
		//this.loadSampleCustomers();
		//this.loadCustomers();
		this.saveCustomers();
		this.start();
		this.saveCustomers();
	}//end constructor
	
	public String menu(){
		Scanner ui = new Scanner(System.in);
		System.out.println();
		System.out.println("Bank Menu");
		System.out.println("0) Exit System");
		System.out.println("1) Login as admin");
		System.out.println("2) Login as customer");
		System.out.println("");
		System.out.println("Action: ");
		String response = ui.nextLine();
		
		return response;
	}//end menu
	
	public void start(){
		boolean keepGoing = true;
		while(keepGoing){
			String response = menu();
			if(response.equals("0")){
				keepGoing = false;
			}else if(response.equals("1")){
				System.out.println("Admin login");
				if(this.admin.login()){
					startAdmin();
				}//end if
			}else if(response.equals("2")){
				System.out.println("Customer login");
				this.loginAsCustomer();
			}else{
				System.out.println("Please enter 0, 1, or 2");
			}//end if
		}//end while
	}//end start
	
	public void startAdmin(){
		boolean keepGoing = true;
		while(keepGoing){
			String response = admin.menu();
			if(response.equals("0")){
				keepGoing = false;
			}else if(response.equals("1")){
				System.out.println("Full Customer report");
				this.reportAllCustomers();	
			}else if(response.equals("2"){
				System.out.println("Add a user");
				this.addUser();
			}else if (response.equals("3")){
				System.out.println("Apply interest to savings");
				this.applyInterest();
			}//end if
		}//end while
	}//end startAdmin
	
	public void loadSampleCustomers(){
		customers.add(new Customer("Alice","1111");
		customers.add(new Customer("Bob","2222");
		customers.add(new Customer("Cindy","3333");
		customers.add(new Customer("Shawn","4444");
	}//end loadSampleCustomers
	
	public void reportAllCustomers(){
			for(Customer customer: customers){
				System.out.println(customer.getReport());
			}//end for loop
	}//end reportAllCustomers
	
	public void addUser(){
		Scanner ui = new Scanner(System.in);
		System.out,print("User name: ");
		String userName = ui.nextLine();
		System.out.print("PIN: ");
		String PIN = ui.nextLine();
		customers.add(new Customer(userName, PIN));
	}//end addUser
	
	public void applyInterest(){
		for(Customer customer: customers){
			customer.savings.calcInterest();
		}//end for
	}//end applyInterest
	
	public void loginAsCustomer(){
		Scanner ui = new Scanner(System.in);
		System.out,print("User name: ");
		String userNameIn = ui.nextLine();
		System.out.print("PIN: ");
		String PINin = ui.nextLine();

		Customer.currentCustomer = null;
		for(Customer customer: customers){
			if customer.login(userNameIn, PINin){
				currentCustomer = customer;
			}//end if
		}//end for
		if(currentCustomer == null){
			System.out.println("Customer not found");
		}else{
			currentCustomer.start();
		}//end if
	}//end loginAsCustomer
	
	public void saveCustomers(){
		try{
			fileOutputStream fo = new FileOutputStream("Customers.dat");
			ObjectOutputStream obOut = new ObjectOutputStream(fo);
			object.writeObject(customers);
			obOut.close();
			fo.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}//end try
	}//end saveCustomers

	public void loadCustomers(){
		try{
			FileInputStream fi = new FileInputStrean("Customers.dat");
			ObjectInputStream obIn = new ObjectInputStream(fi);
			customers = (CustomerList)obIn.readObject();
			obIn.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}//end try
	}//end loadCustomers

	/*
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
*/
}//end class
class CustomerList extends ArrayList<Customer>{};
