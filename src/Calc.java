import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc {

	private JFrame frame;
	private JTextField textField;
	
	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 216, 337);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 200, 48);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 =  new JButton("1");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumer = textField.getText() + btnNewButton_1.getText();
				textField.setText(EnterNumer);
			}
		});
		btnNewButton_1.setBounds(0, 100, 50, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumer = textField.getText() + btnNewButton_2.getText();
				textField.setText(EnterNumer);
			}
		});
		btnNewButton_2.setBounds(50, 100, 50, 50);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumer = textField.getText() + btnNewButton_3.getText();
				textField.setText(EnterNumer);
			}
		});
		btnNewButton_3.setBounds(100, 100, 50, 50);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumer = textField.getText() + btnNewButton_4.getText();
				textField.setText(EnterNumer);
			}
		});
		btnNewButton_4.setBounds(0, 150, 50, 50);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumer = textField.getText() + btnNewButton_5.getText();
				textField.setText(EnterNumer);
			}
		});
		btnNewButton_5.setBounds(50, 150, 50, 50);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumer = textField.getText() + btnNewButton_6.getText();
				textField.setText(EnterNumer);
			}
		});
		btnNewButton_6.setBounds(100, 150, 50, 50);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumer = textField.getText() + btnNewButton_7.getText();
				textField.setText(EnterNumer);
			}
		});
		btnNewButton_7.setBounds(0, 200, 50, 50);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumer = textField.getText() + btnNewButton_8.getText();
				textField.setText(EnterNumer);
			}
		});
		btnNewButton_8.setBounds(50, 200, 50, 50);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumer = textField.getText() + btnNewButton_9.getText();
				textField.setText(EnterNumer);
			}
		});
		btnNewButton_9.setBounds(100, 200, 50, 50);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_0 = new JButton("0");
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumer = textField.getText() + btnNewButton_0.getText();
				textField.setText(EnterNumer);
			}
		});
		btnNewButton_0.setBounds(0, 250, 50, 50);
		frame.getContentPane().add(btnNewButton_0);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum =Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setBounds(150, 200, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum =Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnMinus.setBounds(150, 150, 50, 50);
		frame.getContentPane().add(btnMinus);
		
		JButton btnDevisor = new JButton("/");
		btnDevisor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDevisor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstNum =Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDevisor.setBounds(150, 100, 50, 50);
		frame.getContentPane().add(btnDevisor);
		
		JButton btnEquel = new JButton("=");
		btnEquel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				
				secondNum = Double.parseDouble(textField.getText());
				if (operations == "+")
				{
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} 
				else if (operations == "-")
				{
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				
				} 
				else if (operations == "*")
				{
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "/")
				{
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "%")
				{
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
					
			}
		});
		btnEquel.setBounds(150, 250, 50, 50);
		frame.getContentPane().add(btnEquel);
		
		JButton btnBackSpace = new JButton("\uF0e7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String BackSpace = null	;
				
				if(textField.getText().length() > 0){
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1 );
					BackSpace = strB.toString();
					textField.setText(BackSpace);
				}
			}
		});
		btnBackSpace.setBounds(0, 50, 50, 50);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnClear = new JButton("C");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnClear.setBounds(50, 50, 50, 50);
		frame.getContentPane().add(btnClear);
		
		JButton btnNewButton_11 = new JButton("%");
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum =Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnNewButton_11.setBounds(100, 50, 50, 50);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnMultify = new JButton("*");
		btnMultify.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMultify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum =Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMultify.setBounds(150, 50, 50, 50);
		frame.getContentPane().add(btnMultify);
		
		JButton btnDot = new JButton(".");
		btnDot.setBounds(50, 250, 50, 50);
		frame.getContentPane().add(btnDot);
		
		JButton btnMP = new JButton("\u00b1");
		btnMP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnMP.setBounds(100, 250, 50, 50);
		frame.getContentPane().add(btnMP);
	}
}
