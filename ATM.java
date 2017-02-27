import java.awt.EventQueue;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ATM implements ATMInterface{
	static Scanner in = new Scanner(System.in);
	Customer customer;
	Bank branch = new Bank();
	static ATM atm = new ATM();
	
	public void insertATMCard() {
		int accNum = getInput("Enter Account Number: ");
		customer = branch.findCustomer(accNum);
		System.out.println("Customer firstname is : " + customer.firstName);
		System.out.println("Customer lastname is : " + customer.lastName);
		System.out.println("Customer acc # is : " + customer.getAccNum());
		System.out.println("Customer balance is : " + customer.getAccBalance());
		System.out.println("Customer pin is : " + customer.getAccPin());
		if (customer == null) {
			unreadableCard();
		}
		else {
			atm.enterPin();
		}
		//return false;
	}

	public void ejectATMCard() {
		System.out.println("Too many Failed Attemptes");
		System.out.println("Card Ejected");
		insertATMCard();
		
	}

	public boolean unreadableCard() {
		System.out.println("Customer does not exist or card is unreadable");
		return false;
	}

	public void enterPin() {
		int pin = getInput("Enter PIN: ");
		if (customer.validPin(pin)){
			System.out.println("Pin Verified");	
			withdraw();
			//deposit();
		}
		else {
			System.out.println("Incorrect PIN");
			for (int i=2; i <= 5;i++){
				pin = getInput("Attempt "+ i +". Re-enter PIN: ");
				System.out.println(pin);
				if (customer.validPin(pin)){
					System.out.println("Pin Verified!");
					withdraw();
					break;
				}
			}
			ejectATMCard();
		}
	}


	public boolean readableQRCode() {
		return false;
	}

	public boolean printReceipt(String type, int amount) {
		//Acc #, name, Withdraw/Deposit amount, Date, Bank name
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		System.out.println("");
		System.out.println("Bank of CompSci");
		System.out.println(dateFormat.format(cal.getTime()));
		System.out.println("Account Num: "+customer.getAccNum());
		System.out.println(type+": "+amount);
		return true;
		
	}

	public void withdraw(){
		int amount = getInput("Withdraw Amount: ");
		
		if (customer.withdraw(amount)){
			System.out.println("Balance is now: " + customer.getAccBalance());
			branch.updateDatabase(customer.getAccNum(), 
					customer.getAccBalance());
			if(receiptRequest() == true);
			printReceipt("Withdraw", amount);
		}
		else {
			System.out.println("Insufficient Funds. Please try another amount");
			withdraw();
		}
		deposit();
	}

	public void deposit() {
		int amount = getInput("Deposit Amount: ");
		customer.deposit(amount);
		branch.updateDatabase(customer.getAccNum(), 
				customer.getAccBalance());
		if (receiptRequest() == true){
			printReceipt("Deposit", amount);
		}
	}

	public void updateDisplay() {
		// TODO Auto-generated method stub
		
	}
	
	private static int getInput(String message){
		int input = 0;
		try {
			System.out.print(message);
			input = in.nextInt();
			System.out.println("");
		}
		catch (NoSuchElementException e){
			e.printStackTrace();
		}
		return input;
	}
	
	private boolean receiptRequest(){
		System.out.print("Would you like a receipt?(y/n) ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		//int input2 = getInput("Would you like a reciept? ");
		//String input = Integer.toString(input2);
		if (input.equals("y")){
			return true;
		}
		else return false;
	}
	
	public static void main(String []args){
		/*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					atmUI window = new atmUI();
					window.frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
		atm.insertATMCard();
	}
}