public interface CustomerInterface {
	boolean validPin(int pin);
	void cancelPin();
	//scanViaNFC(nfc NFC);
	boolean withdraw(int amount);
	void deposit(int amount);
	void cancelTransaction();
	void displayBalance();
	int getAccNum();
	int getAccBalance();
	int getAccPin();
}