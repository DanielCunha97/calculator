import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class CalculatorUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_Result;

	private double TEMP;
    private double SolveTEMP;
	String display = "";
	Boolean addBool = false;
    Boolean subBool = false;
    Boolean divBool = false;
    Boolean mulBool = false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorUI window = new CalculatorUI();
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
	public CalculatorUI() {
		initialize();
	}

	/*Logic code*/
	public void result() {
		System.out.println("TEMP: " + TEMP);
        if (addBool == true) {
        	String secondNumber[] = textField.getText().split("\\+");
			SolveTEMP = Double.parseDouble(secondNumber[1]);
        	System.out.println("SolveTEMP: " + SolveTEMP);
        	
            SolveTEMP = SolveTEMP + TEMP;
        }
        else if (subBool == true) {
        	System.out.println("TextView: " + textField.getText());;
        	String secondNumber[] = textField.getText().split("\\-");
			SolveTEMP = Double.parseDouble(secondNumber[1]);
        	System.out.println("SolveTEMP: " + SolveTEMP);
        	
            SolveTEMP = TEMP - SolveTEMP ;
            
        }
        else if ( mulBool == true) {
        	System.out.println("TextView: " + textField.getText());;
        	String secondNumber[] = textField.getText().split("\\*");
			SolveTEMP = Double.parseDouble(secondNumber[1]);
        	System.out.println("SolveTEMP: " + SolveTEMP);
        	
            SolveTEMP = SolveTEMP * TEMP;
        	
        }
        else if ( divBool == true) {
        	System.out.println("TextView: " + textField.getText());;
        	String secondNumber[] = textField.getText().split("/");
			SolveTEMP = Double.parseDouble(secondNumber[1]);
        	System.out.println("SolveTEMP: " + SolveTEMP);
        	
            SolveTEMP = SolveTEMP % TEMP;
            System.out.println("RESULT: " + SolveTEMP);
        }
        
        textField_Result.setText(Double.toString(SolveTEMP));

        addBool = false;
        subBool = false;
        mulBool = false;
        divBool = false;
        textField.setText("");
	}
	
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 370, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(24, 11, 208, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				result();
					
				/*
				if(!(textField.getText().toString().equals(""))) {
					if(!(textField.getText().toString().startsWith("*")) && !(textField.getText().toString().startsWith("+")) && !(textField.getText().toString().startsWith("-")
							&& !(textField.getText().toString().startsWith("/"))) ) { //se não comecar por nenhum operador
						Scanner reader = new Scanner(textField.getText().toString()).useDelimiter("");
						String result = Double.toString(result(1,2,"*"));
					}
					else {
						System.out.println("Comece por um numero!");
					}
				}
				else {
					System.out.println("Impossível efetuar o calculo!");
				}*/
				
			}
		});
		btnNewButton.setBounds(253, 15, 89, 30);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + "1");
			}
		});
		btnNewButton_1.setBounds(77, 79, 45, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + "2");
			}
		});
		button2.setBounds(132, 79, 45, 23);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + "3");
			}
		});
		button3.setBounds(187, 79, 45, 23);
		frame.getContentPane().add(button3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + "4");
			}
		});
		button_4.setBounds(24, 127, 45, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + "5");
			}
		});
		button_5.setBounds(77, 127, 45, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + "6");
			}
		});
		button_6.setBounds(132, 127, 45, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + "7");
			}
		});
		button_7.setBounds(187, 127, 45, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + "8");
			}
		});
		button_8.setBounds(24, 167, 45, 23);
		frame.getContentPane().add(button_8);
		
		textField_Result = new JTextField();
		textField_Result.setBounds(24, 212, 302, 38);
		frame.getContentPane().add(textField_Result);
		textField_Result.setColumns(10);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + "0");
			}
		});
		button_0.setBounds(24, 79, 45, 23);
		frame.getContentPane().add(button_0);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + "9");
			}
		});
		button_9.setBounds(77, 167, 45, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_comma = new JButton(",");
		button_comma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + ",");
			}
		});
		button_comma.setBounds(132, 167, 45, 23);
		frame.getContentPane().add(button_comma);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
	            addBool = false;
	            subBool = false;
	            mulBool = false;
	            divBool = false;

	            TEMP = 0;
	            SolveTEMP = 0;
			}
		});
		btnClear.setBounds(187, 167, 45, 23);
		frame.getContentPane().add(btnClear);
		
		JButton button_sum = new JButton("+");
		button_sum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            //jtfResult.setText("");
				display = textField.getText();
				if(!display.contains("+")) {
					TEMP = Double.parseDouble(textField.getText());
					textField.setText(display + "+");
					addBool = true;
				}
	            
				
				/*if(!textField.getText().equals("") && !textField.getText().equals("*")) { //se a textbox de entrada ter valores
					//textField.setText(button_mult.getText().toString());
					getTextButton(button_mult.getText().toString());
				}*/
			}
		});
		button_sum.setBounds(253, 79, 89, 23);
		frame.getContentPane().add(button_sum);
		
		JButton button_sub = new JButton("-");
		button_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            //jtfResult.setText("");
				display = textField.getText();
				if(!display.contains("-")) {
					TEMP = Double.parseDouble(textField.getText());
					textField.setText(display + "-");
					subBool = true;
				}
			}
		});
		button_sub.setBounds(253, 113, 89, 23);
		frame.getContentPane().add(button_sub);
		
		JButton button_mult = new JButton("*");
		button_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            //jtfResult.setText("");
				display = textField.getText();
				if(!display.contains("*")) {
					TEMP = Double.parseDouble(textField.getText());
					textField.setText(display + "*");
					mulBool = true;
				}
	            
			}
		});
		button_mult.setBounds(253, 147, 89, 23);
		frame.getContentPane().add(button_mult);
		
		JButton button_div = new JButton("/");
		button_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            //jtfResult.setText("");
				display = textField.getText();
				if(!display.contains("/")) {
					TEMP = Double.parseDouble(textField.getText());
					textField.setText(display + "/");
					divBool = true;
				}
			}
		});
		button_div.setBounds(253, 178, 89, 23);
		frame.getContentPane().add(button_div);
	}
	
	/*public void getTextButton(String text) {
		textField.setText(text);
	}*/
}
