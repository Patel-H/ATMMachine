import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class atmUI {

	JFrame frame;
	private JTextArea textField;
	ATM atm = new ATM();
	Customer customer;
	/**
	 * Create the application.
	 */
	public atmUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton insertCardButton = new JButton("Insert Card");
		insertCardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hello Sir!");
			}
		});
		
		
		insertCardButton.setBounds(644, 339, 180, 29);
		frame.getContentPane().add(insertCardButton);
		
		JButton correctionButton = new JButton("Correction");
		correctionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		correctionButton.setBounds(644, 298, 90, 29);
		frame.getContentPane().add(correctionButton);
		
		JButton enterButton = new JButton("Enter");
		enterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		enterButton.setBounds(734, 298, 90, 29);
		frame.getContentPane().add(enterButton);
		
		JButton zeroButton = new JButton("0");
		zeroButton.setBounds(644, 257, 180, 29);
		frame.getContentPane().add(zeroButton);
		
		JButton oneButton = new JButton("1");
		oneButton.setBounds(644, 134, 60, 29);
		frame.getContentPane().add(oneButton);
		
		JButton twoButton = new JButton("2");
		twoButton.setBounds(703, 134, 60, 29);
		frame.getContentPane().add(twoButton);
		
		JButton threeButton = new JButton("3");
		threeButton.setBounds(764, 134, 60, 29);
		frame.getContentPane().add(threeButton);
		
		JButton fourButton = new JButton("4");
		fourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		fourButton.setBounds(644, 175, 60, 29);
		frame.getContentPane().add(fourButton);
		
		JButton fiveButton = new JButton("5");
		fiveButton.setBounds(703, 175, 60, 29);
		frame.getContentPane().add(fiveButton);
		
		JButton sixButton = new JButton("6");
		sixButton.setBounds(764, 175, 60, 29);
		frame.getContentPane().add(sixButton);
		
		JButton sevenButton = new JButton("7");
		sevenButton.setBounds(644, 216, 60, 29);
		frame.getContentPane().add(sevenButton);
		
		JButton eightButton = new JButton("8");
		eightButton.setBounds(703, 216, 60, 29);
		frame.getContentPane().add(eightButton);
		
		JButton nineButton = new JButton("9");
		nineButton.setBounds(764, 216, 60, 29);
		frame.getContentPane().add(nineButton);
		
		JButton btnNfc = new JButton("NFC");
		btnNfc.setBounds(644, 93, 180, 29);
		frame.getContentPane().add(btnNfc);
		
		 JTextArea textArea = new JTextArea();
		textArea.setBounds(166, 89, 319, 234);
		frame.getContentPane().add(textArea);
		textArea.setColumns(10);
		
		textArea.setText("Enter the account number:");
		String input = textArea.getText();
		

		if(input == "w")
			textArea.setText("Welcome"+ customer.lastName + ", " + customer.firstName);
		
		
		
		JButton btnNewButton_1 = new JButton("button 1");
		btnNewButton_1.setBounds(37, 113, 117, 29);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("ahahaha");
			
			}
		});
		
		JButton btnNewButton_2 = new JButton("button 2");
		btnNewButton_2.setBounds(37, 154, 117, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("button 3");
		btnNewButton_3.setBounds(37, 193, 117, 29);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("button 4");
		btnNewButton_4.setBounds(37, 234, 117, 29);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("button 6");
		btnNewButton_5.setBounds(497, 154, 117, 29);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("button 5");
		btnNewButton_6.setBounds(497, 113, 117, 29);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("button 7");
		btnNewButton_7.setBounds(497, 193, 117, 29);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("button 8");
		btnNewButton_8.setBounds(497, 234, 117, 29);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Cancel Transaction");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_9.setBounds(440, 339, 200, 29);
		frame.getContentPane().add(btnNewButton_9);
		
		JLabel lblCash = new JLabel("Cash Dispenser");
		lblCash.setBounds(19, 344, 148, 16);
		frame.getContentPane().add(lblCash);
		//
		//lblCash.setText(String.valueOf(customer.getAccBalance()));
		
		JLabel lblNewLabel = new JLabel("Receipt Printer");
		lblNewLabel.setBounds(195, 344, 180, 16);
		frame.getContentPane().add(lblNewLabel);
	}
}