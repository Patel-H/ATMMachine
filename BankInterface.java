public interface BankInterface {
	Customer findCustomer(int accNum);
	boolean updateDatabase(int accNum, int amount);
}