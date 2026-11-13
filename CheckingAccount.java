//CheckingAccount.java
public class CheckingAccount implements HasMenu, Serializable{	
        int  balance = 0d;

	public CheckingAccount(){
		this.balance = 0d;
	}//end constructor
	public CheckingAccount(double balance){
		this.balance = balance;
	}//end constructor
}
