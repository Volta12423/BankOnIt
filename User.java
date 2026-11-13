//User.java

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

