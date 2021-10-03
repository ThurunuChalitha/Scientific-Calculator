
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class ScientificCal extends JFrame{

	public JFrame frmScientificCalculator;
	public JTextField textFieldDisplay;
	
	double num1 , num2 ,result = 0;
	int n = (int)num1;
	int r = (int)num2;
	int i;
    int factorial(int n) {
		int j = 1;
		for(int i =1; i <= n; i++) {
			j = j * i;
		}
		return j;
	}
    
    long gcd(long a, long b)
	{
		if (a == 0)
			return b;
		else if (b == 0)
			return a;
		if (a < b)
			return gcd(a, b % a);
		else
			return gcd(b, a % b);
	}
	String operation ;
	String  answer;
	private JTextField textFieldMemory;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCal window = new ScientificCal();
					window.frmScientificCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScientificCal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmScientificCalculator = new JFrame();
		frmScientificCalculator.setFont(new Font("Arial", Font.BOLD, 14));
		frmScientificCalculator.setTitle("Scientific Calculator");
		frmScientificCalculator.getContentPane().setBackground(new Color(0, 0, 0));
		frmScientificCalculator.setBounds(450, 170, 390, 517);
		frmScientificCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmScientificCalculator.getContentPane().setLayout(null);
        frmScientificCalculator.setResizable(false);
        frmScientificCalculator.setVisible(true);
		
		textFieldDisplay = new JTextField();
		textFieldDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldDisplay.setBounds(10, 0, 356, 45);
		frmScientificCalculator.getContentPane().add(textFieldDisplay);
		textFieldDisplay.setColumns(10);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
				ops = Math.log(ops);
				textFieldDisplay.setText(String.valueOf(ops));
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLog.setBackground(new Color(32, 178, 170));
		btnLog.setBounds(10, 268, 57, 28);
		frmScientificCalculator.getContentPane().add(btnLog);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = textFieldDisplay.getText() + btn7.getText();
				textFieldDisplay.setText(value);
			}
		});
		btn7.setBackground(new Color(135, 206, 250));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn7.setBounds(10, 307, 63, 28);
		frmScientificCalculator.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = textFieldDisplay.getText() + btn4.getText();
				textFieldDisplay.setText(value);
			}
		});
		btn4.setBackground(new Color(135, 206, 250));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn4.setBounds(10, 346, 63, 28);
		frmScientificCalculator.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = textFieldDisplay.getText() + btn1.getText();
				textFieldDisplay.setText(value);
			}
		});
		btn1.setBackground(new Color(135, 206, 250));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.setBounds(10, 386, 63, 28);
		frmScientificCalculator.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = textFieldDisplay.getText() + btn0.getText();
				textFieldDisplay.setText(value);
			}
		});
		btn0.setBackground(new Color(135, 206, 250));
		btn0.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn0.setBounds(10, 425, 63, 28);
		frmScientificCalculator.getContentPane().add(btn0);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = textFieldDisplay.getText() + btn8.getText();
				textFieldDisplay.setText(value);
			}
		});
		btn8.setBackground(new Color(135, 206, 250));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn8.setBounds(83, 307, 63, 28);
		frmScientificCalculator.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = textFieldDisplay.getText() + btn5.getText();
				textFieldDisplay.setText(value);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn5.setBackground(new Color(135, 206, 250));
		btn5.setBounds(83, 346, 63, 28);
		frmScientificCalculator.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = textFieldDisplay.getText() + btn2.getText();
				textFieldDisplay.setText(value);
			}
		});
		btn2.setBackground(new Color(135, 206, 250));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn2.setBounds(83, 386, 63, 28);
		frmScientificCalculator.getContentPane().add(btn2);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String value = textFieldDisplay.getText() + btnDecimal.getText();
					textFieldDisplay.setText(value);					
			}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Syntax Error...");
				}
				
			}
		});
		btnDecimal.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDecimal.setBackground(new Color(135, 206, 250));
		btnDecimal.setBounds(83, 424, 63, 28);
		frmScientificCalculator.getContentPane().add(btnDecimal);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
					ops = Math.sin(ops);
					textFieldDisplay.setText(String.valueOf(ops));
			    	}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null, "Syntax Error...");
					}				
			}
		});
		btnSin.setBackground(new Color(32, 178, 170));
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSin.setBounds(10, 190, 57, 28);
		frmScientificCalculator.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
					ops = Math.cos(ops);
					textFieldDisplay.setText(String.valueOf(ops));
			    	}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null, "Syntax Error...");
					}
				
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCos.setBackground(new Color(32, 178, 170));
		btnCos.setBounds(71, 190, 57, 28);
		frmScientificCalculator.getContentPane().add(btnCos);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = textFieldDisplay.getText() + btn9.getText();
				textFieldDisplay.setText(value);
			}
		});
		btn9.setBackground(new Color(135, 206, 250));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn9.setBounds(156, 307, 63, 28);
		frmScientificCalculator.getContentPane().add(btn9);
		
		JButton btnDelete = new JButton("DEL");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length = textFieldDisplay.getText().length();
				int number = textFieldDisplay.getText().length()-1;
				String store;
				if (length >0) {
					StringBuilder back = new StringBuilder(textFieldDisplay.getText());
					back.deleteCharAt(number);
					store = back.toString();
					textFieldDisplay.setText(store);
			}
			}
		});
		btnDelete.setBackground(new Color(0, 255, 255));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDelete.setBounds(302, 386, 63, 28);
		frmScientificCalculator.getContentPane().add(btnDelete);
		
		JButton btnAC = new JButton("AC");
		btnAC.setBackground(new Color(0, 255, 255));
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldDisplay.setText("");
				num1 = 0.0;
				num2 = 0.0;
				operation ="";
			}
		});
		btnAC.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAC.setBounds(303, 346, 63, 28);
		frmScientificCalculator.getContentPane().add(btnAC);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = textFieldDisplay.getText() + btn6.getText();
				textFieldDisplay.setText(value);
			}
		});
		btn6.setBackground(new Color(135, 206, 250));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn6.setBounds(156, 346, 63, 28);
		frmScientificCalculator.getContentPane().add(btn6);
		
		JButton btnMultiplication = new JButton("\u00D7");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1=Double.parseDouble(textFieldDisplay.getText());
					System.out.println(num1);
					textFieldDisplay.setText("");
					operation = "�";
					
				}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null, "Syntax Error...");
					}
			}
		});
		btnMultiplication.setBackground(new Color(135, 206, 250));
		btnMultiplication.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMultiplication.setBounds(229, 346, 63, 28);
		frmScientificCalculator.getContentPane().add(btnMultiplication);
		
		JButton btnDivision = new JButton("\u00F7");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1=Double.parseDouble(textFieldDisplay.getText());
					System.out.println(num1);
					textFieldDisplay.setText("");
					operation = "/";
				}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null, "Syntax Error...");
					}
			}
		});
		btnDivision.setBackground(new Color(135, 206, 250));
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDivision.setBounds(156, 425, 63, 28);
		frmScientificCalculator.getContentPane().add(btnDivision);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = textFieldDisplay.getText() + btn3.getText();
				textFieldDisplay.setText(value);
			}
		});
		btn3.setBackground(new Color(135, 206, 250));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn3.setBounds(156, 386, 63, 28);
		frmScientificCalculator.getContentPane().add(btn3);
		
		JButton btnAddition = new JButton("+");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1=Double.parseDouble(textFieldDisplay.getText());
					textFieldDisplay.setText("");
					operation = "+";
				}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null, "Syntax Error...");
					}
			}
		});
		btnAddition.setBackground(new Color(135, 206, 250));
		btnAddition.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAddition.setBounds(229, 386, 63, 28);
		frmScientificCalculator.getContentPane().add(btnAddition);
		
		JButton btnSubstraction = new JButton("-");
		btnSubstraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1=Double.parseDouble(textFieldDisplay.getText());
					textFieldDisplay.setText("");
					operation = "-";
				}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null, "Syntax Error...");
					}
			}
		});
		btnSubstraction.setBackground(new Color(135, 206, 250));
		btnSubstraction.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSubstraction.setBounds(229, 424, 63, 28);
		frmScientificCalculator.getContentPane().add(btnSubstraction);
		
		JButton btnExp = new JButton("Exp");
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
				ops = Math.exp(ops);
				textFieldDisplay.setText(String.valueOf(ops));
			}
		});
		btnExp.setBackground(new Color(135, 206, 250));
		btnExp.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExp.setBounds(229, 307, 63, 28);
		frmScientificCalculator.getContentPane().add(btnExp);
		
		JButton btnMemory = new JButton("M+");
		btnMemory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = textFieldDisplay.getText();
				textFieldMemory.setText(value);
			}
		});
		btnMemory.setBackground(new Color(135, 206, 250));
		btnMemory.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMemory.setBounds(302, 307, 63, 28);
		frmScientificCalculator.getContentPane().add(btnMemory);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
				
                                            num2 = Double.parseDouble(textFieldDisplay.getText());
                                           
						try {	
							//String answer;
							
							
							if (operation == "+")
							{
								
								result = num1 + num2; 
								textFieldDisplay.setText(String.valueOf(result));
							}
							
							else if (operation == "-")
							{
								
								result = num1 - num2;
								textFieldDisplay.setText(String.valueOf(result));
							}
							else if (operation == "�")
							{
								result = num1 * num2; 
								textFieldDisplay.setText(String.valueOf(result));
							}
							else if (operation == "/")
							{
								
								result = num1 / num2; 
								/*answer = String.format("%.2f", result);*/
								textFieldDisplay.setText(String.valueOf(result));
							}
							else if (operation == "X^Y")
							{
								result = Math.pow(num1, num2);
								//answer = String.format("%.2f", result);
								textFieldDisplay.setText(String.valueOf(result));
							}
							else if (operation == "nPr" && n>r)
							{
								r = Integer.parseInt(textFieldDisplay.getText());
                                                                int Ans_nPr = factorial(n) / factorial(n - r); 
								answer = String.format("%d", Ans_nPr);
								textFieldDisplay.setText(answer);
								
							}
							else if (operation == "nCr" && n>r)
							{
							      r = Integer.parseInt(textFieldDisplay.getText());
							      int Ans_nCr = factorial(n) / (factorial(r)*(factorial(n - r))); 
							      answer = String.format("%d", Ans_nCr);
							      textFieldDisplay.setText(answer);								
							}
							else if (operation == "AlgX")                             //add below the equal button
							{
								num2 = Double.parseDouble(textFieldDisplay.getText());
								double Ans_logAx = Math.log(num2) / Math.log(num1);
								answer = String.valueOf(Ans_logAx);
								textFieldDisplay.setText(answer);

							}
							else {
								JOptionPane.showMessageDialog(null, "Syntax Error");
							}
						}
							catch(Exception ex){
								JOptionPane.showMessageDialog(null, "Syntax Error");
							}
						}
				}
		);
		btnEqual.setBackground(new Color(135, 206, 250));
		btnEqual.setBounds(302, 425, 63, 28);
		frmScientificCalculator.getContentPane().add(btnEqual);
		
		JButton btnPI = new JButton("\u03C0");
		btnPI.setBackground(new Color(255, 215, 0));
		btnPI.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPI.setBounds(286, 72, 80, 28);
		frmScientificCalculator.getContentPane().add(btnPI);
		btnPI.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String value = textFieldDisplay.getText() + btnPI.getText();
				textFieldDisplay.setText(String.valueOf(3.141592653));
			}
		});                
                
		
		JRadioButton rdbtnOn = new JRadioButton("ON");
		rdbtnOn.setBackground(new Color(188, 143, 143));
		rdbtnOn.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnOn.setBounds(10, 73, 80, 27);
		frmScientificCalculator.getContentPane().add(rdbtnOn);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setBackground(new Color(188, 143, 143));
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnOff.setBounds(100, 72, 80, 28);
		frmScientificCalculator.getContentPane().add(rdbtnOff);
                
               // create button group
               
               ButtonGroup group = new ButtonGroup();
               group.add(rdbtnOn);
               group.add(rdbtnOff);
               
               
               
               

		
		JButton btnLn = new JButton("ln");
		btnLn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
				ops = Math.log10(ops);
				textFieldDisplay.setText(String.valueOf(ops));
			}
		});
		btnLn.setBackground(new Color(32, 178, 170));
		btnLn.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLn.setBounds(71, 268, 57, 28);
		frmScientificCalculator.getContentPane().add(btnLn);
                
                
		
		JButton btnOpenBracket = new JButton("(");
		btnOpenBracket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = textFieldDisplay.getText() + btnOpenBracket.getText();
				textFieldDisplay.setText(value);
			}
		});
		btnOpenBracket.setBackground(new Color(32, 178, 170));
		btnOpenBracket.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnOpenBracket.setBounds(132, 268, 52, 28);
		frmScientificCalculator.getContentPane().add(btnOpenBracket);
		
		JButton btnCloseBracket = new JButton(")");
		btnCloseBracket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = textFieldDisplay.getText() + btnCloseBracket.getText();
				textFieldDisplay.setText(value);
			}
		});
		btnCloseBracket.setBackground(new Color(32, 178, 170));
		btnCloseBracket.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCloseBracket.setBounds(188, 268, 52, 28);
		frmScientificCalculator.getContentPane().add(btnCloseBracket);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
					ops = Math.tan(ops);
					textFieldDisplay.setText(String.valueOf(ops));
					}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null, "Syntax Error...");
					}				
			}
		});
		btnTan.setBackground(new Color(32, 178, 170));
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTan.setBounds(132, 190, 62, 28);
		frmScientificCalculator.getContentPane().add(btnTan);
		
		JButton btnSquareroot = new JButton("\u221A");
		btnSquareroot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
					ops = Math.sqrt(ops);
					textFieldDisplay.setText(String.valueOf(ops));
					}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null, "Syntax Error...");
					}					
			}
		});
		btnSquareroot.setBackground(new Color(32, 178, 170));
		btnSquareroot.setBounds(199, 190, 45, 28);
		frmScientificCalculator.getContentPane().add(btnSquareroot);
		
		JButton btn_nPr = new JButton("nPr");
		btn_nPr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					n =Integer.parseInt(textFieldDisplay.getText());
					textFieldDisplay.setText("");
					operation = "nPr";
					
					}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null, "Syntax Error...");
					}
			}
		});
		btn_nPr.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_nPr.setBackground(new Color(32, 178, 170));
		btn_nPr.setBounds(248, 190, 57, 28);
		frmScientificCalculator.getContentPane().add(btn_nPr);
		
		JButton btn_nCr = new JButton("nCr");
		btn_nCr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					n =Integer.parseInt(textFieldDisplay.getText());
					textFieldDisplay.setText("");
					operation = "nCr";
					
					}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null, "Syntax Error...");
					}
			}
		});
		btn_nCr.setBackground(new Color(32, 178, 170));
		btn_nCr.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_nCr.setBounds(308, 190, 57, 28);
		frmScientificCalculator.getContentPane().add(btn_nCr);
		
		JButton btnAlpha = new JButton("e");
                btnAlpha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            textFieldDisplay.setText("2.718281828");
			}
		});
		btnAlpha.setBackground(new Color(255, 255, 0));
		btnAlpha.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAlpha.setBounds(196, 72, 80, 28);
		frmScientificCalculator.getContentPane().add(btnAlpha);

		
		JButton btnCalc = new JButton("MR");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value=textFieldMemory.getText();
				textFieldDisplay.setText(value);

			}
		});
		btnCalc.setBackground(new Color(32, 178, 170));
		btnCalc.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCalc.setBounds(215, 111, 78, 28);
		frmScientificCalculator.getContentPane().add(btnCalc);
		
		JButton btn_RadToDeg = new JButton("R-D");
		btn_RadToDeg.setBackground(new Color(32, 178, 170));
		btn_RadToDeg.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_RadToDeg.setBounds(244, 268, 57, 28);
		frmScientificCalculator.getContentPane().add(btn_RadToDeg);
		btn_RadToDeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double RadiansVal = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
					RadiansVal = Math.toDegrees(RadiansVal);
					textFieldDisplay.setText(String.valueOf(RadiansVal));
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Syntax Error...");
				}
			}
		});
		
		JButton btnMemoryClear = new JButton("MC");
		btnMemoryClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldMemory.setText("");
				}
		});
		btnMemoryClear.setBackground(new Color(32, 178, 170));
		btnMemoryClear.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnMemoryClear.setBounds(303, 268, 62, 28);
		frmScientificCalculator.getContentPane().add(btnMemoryClear);
		
		JButton btn_aSin = new JButton("aSin");
		btn_aSin.setBackground(new Color(32, 178, 170));
		btn_aSin.setBounds(10, 111, 62, 28);
		btn_aSin.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmScientificCalculator.getContentPane().add(btn_aSin);
		btn_aSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double val1 = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
					val1 = Math.asin(val1);
					textFieldDisplay.setText(String.valueOf(val1));
				}
				    catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Syntax Error...");
				}
			}
		});
		
		JButton btn_aCos = new JButton("aCos");
		btn_aCos.setBackground(new Color(32, 178, 170));
		btn_aCos.setBounds(76, 111, 65, 28);
		btn_aCos.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmScientificCalculator.getContentPane().add(btn_aCos);
		btn_aCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double val2 = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
					val2 = Math.acos(val2);
					textFieldDisplay.setText(String.valueOf(val2));
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Syntax Error...");
				}
			}
		});
		
		JButton btn_aTan = new JButton("aTan");
		btn_aTan.setBackground(new Color(32, 178, 170));
		btn_aTan.setBounds(144, 111, 67, 28);
		btn_aTan.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmScientificCalculator.getContentPane().add(btn_aTan);
		btn_aTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double val3 = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
					val3 = Math.atan(val3);
					textFieldDisplay.setText(String.valueOf(val3));
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Syntax Error...");
				}
			}
		});

		
		JButton btnStandardDecimalConversion = new JButton("S-D");
		btnStandardDecimalConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));

						// Fetch integral value of the decimal
						double intVal = Math.floor(ops);

						// Fetch fractional part of the decimal
						double fVal = ops - intVal;

						// Consider precision value to
						// convert fractional part to
						// integral equivalent
						final long pVal = 1000000000;

						long gcdVal = gcd(Math.round(fVal * pVal), pVal);

						// Calculate num and deno
						long num = Math.round(fVal * pVal) / gcdVal;
						long deno = pVal / gcdVal;

					String  opa =(long) (intVal * deno) + num + "/" + deno ;
					answer = String.format("%s", opa);
					textFieldDisplay.setText(answer);
					    }
					catch(Exception ex){
						JOptionPane.showMessageDialog(null, "Syntax Error...");
	    }
				
			}
		});
		
		
		btnStandardDecimalConversion.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnStandardDecimalConversion.setBackground(new Color(32, 178, 170));
		btnStandardDecimalConversion.setBounds(297, 111, 68, 28);
		frmScientificCalculator.getContentPane().add(btnStandardDecimalConversion);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
				ops = Math.sinh(ops);
				textFieldDisplay.setText(String.valueOf(ops));
			}
		});
		btnSinh.setBackground(new Color(32, 178, 170));
		btnSinh.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSinh.setBounds(10, 229, 80, 28);
		frmScientificCalculator.getContentPane().add(btnSinh);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
				ops = Math.cosh(ops);
				textFieldDisplay.setText(String.valueOf(ops));
			}
		});
		btnCosh.setBackground(new Color(32, 178, 170));
		btnCosh.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCosh.setBounds(100, 229, 80, 28);
		frmScientificCalculator.getContentPane().add(btnCosh);

		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
				ops = Math.tanh(ops);
				textFieldDisplay.setText(String.valueOf(ops));
			}
		});
		btnTanh.setBackground(new Color(32, 178, 170));
		btnTanh.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTanh.setBounds(192, 229, 80, 28);
		frmScientificCalculator.getContentPane().add(btnTanh);
		
		JButton btnFactorial = new JButton("n!");
		btnFactorial.setBackground(new Color(32, 178, 170));
		btnFactorial.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnFactorial.setBounds(285, 229, 81, 28);
		frmScientificCalculator.getContentPane().add(btnFactorial);
		btnFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a =(Double.parseDouble(textFieldDisplay.getText()));
				double f=1;
				while(a!=0)
				{
					f=f*a;
					a--;
				}
				textFieldDisplay.setText("");
				textFieldDisplay.setText(textFieldDisplay.getText()+f);
			}
		});
		
		JButton btnLogaX = new JButton("Log_a X");
		btnLogaX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 =Double.parseDouble(textFieldDisplay.getText());      //line 828   add after the relevent button listner
					textFieldDisplay.setText("");
					operation = "AlgX";

				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Syntax Error...");
				}
			}
		});
		btnLogaX.setBackground(new Color(32, 178, 170));
		btnLogaX.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogaX.setBounds(10, 151, 80, 28);
		frmScientificCalculator.getContentPane().add(btnLogaX);
		
		JButton btnPower2toX = new JButton("x^2");
		btnPower2toX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
					ops =(ops * ops);
					textFieldDisplay.setText(String.valueOf(ops));
					}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null, "Syntax Error...");
					}				
			}
		});
		btnPower2toX.setBackground(new Color(32, 178, 170));
		btnPower2toX.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPower2toX.setBounds(100, 151, 80, 28);
		frmScientificCalculator.getContentPane().add(btnPower2toX);
		
		JButton btnPowerNtoX = new JButton("X^Y");
		btnPowerNtoX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Double.parseDouble(textFieldDisplay.getText());
					textFieldDisplay.setText( "" );
				 	operation = "X^Y";
					
					}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null, "Syntax Error...");
					}
			}
		});
		btnPowerNtoX.setBackground(new Color(32, 178, 170));
		btnPowerNtoX.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPowerNtoX.setBounds(193, 151, 80, 28);
		frmScientificCalculator.getContentPane().add(btnPowerNtoX);
		
		JButton btnPowerMinus1toX = new JButton("1/X");
		btnPowerMinus1toX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
					ops = (1/(ops));
					textFieldDisplay.setText(String.valueOf(ops));
					}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null, "Syntax Error...");
					}					
			}
		});
		btnPowerMinus1toX.setBackground(new Color(32, 178, 170));
		btnPowerMinus1toX.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPowerMinus1toX.setBounds(285, 151, 80, 28);
		frmScientificCalculator.getContentPane().add(btnPowerMinus1toX);
		
		JLabel lblMemory = new JLabel("Memory :");
		lblMemory.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMemory.setForeground(Color.WHITE);
		lblMemory.setBounds(40, 52, 63, 14);
		frmScientificCalculator.getContentPane().add(lblMemory);
		
		textFieldMemory = new JTextField();
		textFieldMemory.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldMemory.setBounds(98, 49, 178, 20);
		frmScientificCalculator.getContentPane().add(textFieldMemory);
		textFieldMemory.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		frmScientificCalculator.setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("File");
		menuBar.add(Menu);
		
		JMenuItem MenuItemStandard = new JMenuItem("Standard Calculator");
		MenuItemStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StandardCalculator();
				new StandardCalculator().setVisible(true);
			}
		});
		Menu.add(MenuItemStandard);

		JMenuItem MenuItemUnitConverter = new JMenuItem("Unit Converter");
		MenuItemUnitConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new UnitConverter();

			}
		});
		Menu.add(MenuItemUnitConverter);

		JMenuItem MenuItemPhysicalConstant = new JMenuItem("Physical Constant");
		Menu.add(MenuItemPhysicalConstant);
		MenuItemPhysicalConstant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PhysicalConstant();
			}
		});
		
		JMenuItem MenuItemExit = new JMenuItem("Exit");
		MenuItemExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Menu.add(MenuItemExit);
                
                // cal off code 
               
               rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            btnLn.setEnabled(false);
                            btnLog.setEnabled(false);
                            btn0.setEnabled(false);
                            btn1.setEnabled(false);
                            btn2.setEnabled(false);
                            btn3.setEnabled(false);
                            btn4.setEnabled(false);
                            btn5.setEnabled(false);
                            btn6.setEnabled(false);
                            btn7.setEnabled(false);
                            btn8.setEnabled(false);
                            btn9.setEnabled(false);
                            btnDecimal.setEnabled(false);
                            btnSin.setEnabled(false);
                            btnCos.setEnabled(false);
                            btnDelete.setEnabled(false);
                            btnMultiplication.setEnabled(false);
                            btnDivision.setEnabled(false);
                            btnAddition.setEnabled(false);
                            btnSubstraction.setEnabled(false);
                            btnExp.setEnabled(false);
                            btnMemory.setEnabled(false);
                            btnEqual.setEnabled(false);
                            btnPI.setEnabled(false);
                            btnOpenBracket.setEnabled(false);
                            btnCloseBracket.setEnabled(false);
                            btnTan.setEnabled(false);
                            btnSquareroot.setEnabled(false);
                            btn_nPr.setEnabled(false);
                            btn_nCr.setEnabled(false);
                            btnAlpha.setEnabled(false);
                            btnCalc.setEnabled(false);
                            btn_RadToDeg.setEnabled(false);
                            btnMemoryClear.setEnabled(false);
                            btn_aSin.setEnabled(false);
                            btn_aCos.setEnabled(false);
                            btn_aTan.setEnabled(false);
                            btnSinh.setEnabled(false);
                            btnCosh.setEnabled(false);
                            btnTanh.setEnabled(false);
                            btnLogaX.setEnabled(false);
                            btnFactorial.setEnabled(false);
                            btnPower2toX.setEnabled(false);
                            btnPowerNtoX.setEnabled(false);
                            btnPowerMinus1toX.setEnabled(false);
                            lblMemory.setEnabled(false);
                            Menu.setEnabled(false);
                            textFieldMemory.setEnabled(false);
                            btnStandardDecimalConversion.setEnabled(false);
                            btnAC.setEnabled(false);
                            textFieldDisplay.setEnabled(false);
                            
			}
		});
               
               // cal off code
               
               rdbtnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            btnLn.setEnabled(true);
                            btnLog.setEnabled(true);
                            btn0.setEnabled(true);
                            btn1.setEnabled(true);
                            btn2.setEnabled(true);
                            btn3.setEnabled(true);
                            btn4.setEnabled(true);
                            btn5.setEnabled(true);
                            btn6.setEnabled(true);
                            btn7.setEnabled(true);
                            btn8.setEnabled(true);
                            btn9.setEnabled(true);
                            btnDecimal.setEnabled(true);
                            btnSin.setEnabled(true);
                            btnCos.setEnabled(true);
                            btnDelete.setEnabled(true);
                            btnMultiplication.setEnabled(true);
                            btnDivision.setEnabled(true);
                            btnAddition.setEnabled(true);
                            btnSubstraction.setEnabled(true);
                            btnExp.setEnabled(true);
                            btnMemory.setEnabled(true);
                            btnEqual.setEnabled(true);
                            btnPI.setEnabled(true);
                            btnOpenBracket.setEnabled(true);
                            btnCloseBracket.setEnabled(true);
                            btnTan.setEnabled(true);
                            btnSquareroot.setEnabled(true);
                            btn_nPr.setEnabled(true);
                            btn_nCr.setEnabled(true);
                            btnAlpha.setEnabled(true);
                            btnCalc.setEnabled(true);
                            btn_RadToDeg.setEnabled(true);
                            btnMemoryClear.setEnabled(true);
                            btn_aSin.setEnabled(true);
                            btn_aCos.setEnabled(true);
                            btn_aTan.setEnabled(true);
                            btnSinh.setEnabled(true);
                            btnCosh.setEnabled(true);
                            btnTanh.setEnabled(true);
                            btnLogaX.setEnabled(true);
                            btnFactorial.setEnabled(true);
                            btnPower2toX.setEnabled(true);
                            btnPowerNtoX.setEnabled(true);
                            btnPowerMinus1toX.setEnabled(true);
                            lblMemory.setEnabled(true);
                            Menu.setEnabled(true);
                            textFieldMemory.setEnabled(true);
                            btnStandardDecimalConversion.setEnabled(true);
                            btnAC.setEnabled(true);
                            textFieldDisplay.setEnabled(true);
                            
			}
		});
               
               
               
               
               
               
               
               
               
               
               
               
               
                
	}
}

