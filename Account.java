public class Account implements AccountInterface{
	
	int accNum, balance, pin;
	Account(int accNum, int balance, int pin){
		this.accNum = accNum;
		this.balance = balance;
		this.pin = pin;
	}

	public boolean withdraw(int amount) {
		if (checkSufficientFunds(amount)){
			balance -= amount;
			return true;
		}
		return false;
	}

	public boolean deposit(int amount) {
		this.balance += amount;
		return true;
	}

	private boolean checkSufficientFunds(int amount) {
		return (balance >= amount);
	}
}