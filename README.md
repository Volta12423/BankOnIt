# BankOnIt
An application that works similar to an ATM, for part 1 we'll be working on the customer while part two will be working on the admin side of the class
'''
classDiagram
direction TB
    class CheckingAccount {
	    +void makeWithdrawal
	    - balance : double
	    +CheckingAccount()
	    +CheckingAccount(double balance)
	    +main()
	    +string menu()
	    +void start()
	    +double getBalance()
	    +string getBalanceString()
	    +void setBalance(double balance)
	    +void checkBalance()
	    +private double getDouble()
	    +void makeDeposit()
    }

    class SavingsAccount {
        -interestRate : double
        + main(*)
        + calcInterest : void
        + setInterestRate : void
        + getInterestRate : void
    }

    class User {
	    - PIN : String
	    - userName: String
	    +boolean login()
	    +boolean login(userName, PIN)
	    +void setUserName(userName)
	    +string getUserName()
	    +void setPIN(PIN)
	    +string getPIN()
	    +abstract string getReport()
    }

    class HasMenu {
	    + menu() : String
	    + start() : void
    }

    class Customer {
        - checking : checkingAccount
        - savings : SavingsAccount
        
    }
    HasMenu <|-- CheckingAccount
    HasMenu <|-- User
    CheckingAccount <|-- SavingsAccount
    User <|-- Customer
'''
