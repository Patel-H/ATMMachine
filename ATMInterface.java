public interface ATMInterface {
	boolean unreadableCard();
	void enterPin();
	boolean readableQRCode();
	boolean printReceipt(String type, int amount);
	void withdraw();
	void updateDisplay();
	void insertATMCard();
	void ejectATMCard();
	void deposit();
}