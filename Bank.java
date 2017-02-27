import java.io.*;

public class Bank implements BankInterface{
	
	Customer customer;
	String filename = "customerDatabase.txt";

	public Customer findCustomer(int accNum) {
		String line = null;
		try {
			BufferedReader in = new BufferedReader(new FileReader(filename));
			while ((line = in.readLine()) != null) {
				String[] info = line.split(",");
				if (accNum == Integer.parseInt(info[2])){
					Customer customer = new Customer(
							info[0],
							info[1], 					
							Integer.parseInt(info[2]), 
							Integer.parseInt(info[3]),
							Integer.parseInt(info[4]));
					in.close();
					return customer;
				}
			}
			in.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("Unable to open file '" + filename + "'");
		}
		catch(IOException ex) {
			System.out.println("Error reading file '" + filename + "'");
		}
		return null;
	}

	public boolean updateDatabase(int accNum, int amount) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filename));
		
			String line = null;
			while ((line = br.readLine()) != null){
				String[] info = line.split(",");
				if (accNum == Integer.parseInt(info[2])){
					System.out.println("Old Balance: " + info[3]);
					System.out.println("New Balance: " + Integer.toString(amount));
					line.replace(info[3], Integer.toString(amount));
					System.out.println(line);
					//info[3] += customer.getAccBalance();
					return true;
				}
			}
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally{
			
			try {
				if (br!=null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}