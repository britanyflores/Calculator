/**
 * 
 */

/**
 * @author britanyflores
 *
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;

public class CalculatorWindow {

	private JFrame frame;
	private JTextField textField;
	
	double num1;
	double num2;
	double result;
	String op;
	private JButton buttondel;
	//String answer;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorWindow window = new CalculatorWindow();
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
	public CalculatorWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 303, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		textField.setBounds(6, 6, 291, 118);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		buttondel = new JButton("del");
		buttondel.setIgnoreRepaint(true);
		buttondel.setForeground(new Color(0, 0, 0));
		buttondel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		buttondel.setBounds(6, 144, 68, 52);
		frame.getContentPane().add(buttondel);
		
		JButton buttonC = new JButton("C");
		buttonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		buttonC.setBounds(77, 144, 68, 52);
		frame.getContentPane().add(buttonC);
		
		JButton buttonSign = new JButton("+/-");
		buttonSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(textField.getText());
				if (number > 0) {
					number = number * (-1);
				}
				else {
					number = number * (-1);
				}
				String newNum = String.valueOf(number);
				textField.setText(newNum);
			
			}
		});
		buttonSign.setBounds(146, 144, 68, 52);
		frame.getContentPane().add(buttonSign);
		
		JButton buttonDiv = new JButton("÷");
		buttonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "/";
			}
		});
		buttonDiv.setBounds(217, 144, 68, 52);
		frame.getContentPane().add(buttonDiv);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button7.getText();
				textField.setText(number);
			}
		});
		button7.setBounds(6, 200, 68, 52);
		frame.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button8.getText();
				textField.setText(number);
			}
		});
		button8.setBounds(77, 200, 68, 52);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button9.getText();
				textField.setText(number);
			}
		});
		button9.setBounds(146, 200, 68, 52);
		frame.getContentPane().add(button9);
		
		JButton buttonMul = new JButton("x");
		buttonMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "*";
			}
		});
		buttonMul.setBounds(217, 200, 68, 52);
		frame.getContentPane().add(buttonMul);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button4.getText();
				textField.setText(number);
			}
		});
		button4.setBounds(6, 256, 68, 52);
		frame.getContentPane().add(button4);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button1.getText();
				textField.setText(number);
			}
		});
		button1.setBounds(6, 312, 68, 52);
		frame.getContentPane().add(button1);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button5.getText();
				textField.setText(number);
			}
		});
		button5.setBounds(77, 256, 68, 52);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button6.getText();
				textField.setText(number);
			}
		});
		button6.setBounds(146, 256, 68, 52);
		frame.getContentPane().add(button6);
		
		JButton buttonSub = new JButton("-");
		buttonSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "-";
			}
		});
		buttonSub.setBounds(217, 256, 68, 52);
		frame.getContentPane().add(buttonSub);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button2.getText();
				textField.setText(number);
			}
		});
		button2.setBounds(77, 312, 68, 52);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button3.getText();
				textField.setText(number);
			}
		});
		button3.setBounds(146, 312, 68, 52);
		frame.getContentPane().add(button3);
		
		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "+";
			}
		});
		buttonPlus.setBounds(217, 312, 68, 52);
		frame.getContentPane().add(buttonPlus);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button0.getText();
				textField.setText(number);
			}
		});
		button0.setBounds(6, 368, 139, 52);
		frame.getContentPane().add(button0);
		
		JButton buttonDot = new JButton(".");
		buttonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String decimal = textField.getText()+buttonDot.getText();
				textField.setText(decimal);
			}
		});
		buttonDot.setBounds(146, 368, 68, 52);
		frame.getContentPane().add(buttonDot);
		
		JButton buttonEqual = new JButton("=");
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				num2 = Double.parseDouble(textField.getText());
				if(op == "+") {
					result = num1 + num2;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(op == "-") {
					result = num1 - num2;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(op == "*") {
					result = num1 * num2;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(op == "/") {
					result = num1/num2;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
			}
		});
		buttonEqual.setBounds(217, 368, 68, 52);
		frame.getContentPane().add(buttonEqual);
	}
}
