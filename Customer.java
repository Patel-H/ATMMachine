public class Customer implements CustomerInterface {
	
	String firstName, lastName;
	Account account;
	Customer(String fname, String lname, int accNum, int accBalance, int pin){
		this.firstName = fname;
		this.lastName = lname;
		this.account = new Account(accNum, accBalance, pin);
	}

	public boolean validPin(int enteredPin) {
		return (enteredPin == getAccPin());
	}

	public void cancelPin() {
		// TODO Auto-generated method stub
		
	}

	public boolean withdraw(int amount) {
		return account.withdraw(amount);
	}

	public void cancelTransaction() {
		// TODO Auto-generated method stub
		
	}

	public void displayBalance() {
		// TODO Auto-generated method stub
		
	}

	public void deposit(int amount) {
		account.deposit(amount);
		
	}

	public int getAccNum() {
		return this.account.accNum;
	}

	public int getAccBalance() {
		return this.account.balance;
	}

	public int getAccPin() {
		return this.account.pin;
	}

}