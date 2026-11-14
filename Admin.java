//Admin.java
import java.util.*;
import.io.*;
public class Admin extends User implements HasMenu, Serializable{
	public static void main(String[] args){
		Admin a = new Admin();
		a.login();
	}//end main
	public Admin(){
		this.userName = "admin";
		this.PIN = "0000";
	}//end constructor
	public String menu(){
		Scanner input = new Scanner(System.in);

		System.out.println("	Admin Menu ");
		System.out.println();
		System.out.println("Exit this menu");
		System.out.println("Full Customer report");
		System.out.println("Add user");
		System.out.println("Apply interest to savings account");
		System.out.println();
		System.out.println("Action: ");

		String response = input.nextLine();
		return response;
	}//end menu
	public void start(){
		//will be implemented in Bank
	}//end start
	public String getReport(){
		String report = "Admin userName: " + this.UserName();
		report += ", Admin PIN: " + this.getPIN();;
		return report;
	}//end getReport
}//end Admin class
