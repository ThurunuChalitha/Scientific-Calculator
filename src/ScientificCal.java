import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class ScientificCal {

	private JFrame frmScientificCalculator;
	private JTextField textFieldDisplay;
	
	double num1 , num2 ,result = 0;
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
	private void initialize() {
		frmScientificCalculator = new JFrame();
		frmScientificCalculator.setFont(new Font("Arial", Font.BOLD, 14));
		frmScientificCalculator.setTitle("Scientific Calculator");
		frmScientificCalculator.getContentPane().setBackground(new Color(0, 0, 0));
		frmScientificCalculator.setBounds(100, 100, 390, 517);
		frmScientificCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmScientificCalculator.getContentPane().setLayout(null);
		
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
				double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
				ops = Math.sin(ops);
				textFieldDisplay.setText(String.valueOf(ops));
			}
		});
		btnSin.setBackground(new Color(32, 178, 170));
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSin.setBounds(10, 190, 57, 28);
		frmScientificCalculator.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
				ops = Math.cos(ops);
				textFieldDisplay.setText(String.valueOf(ops));
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
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 15));
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
					operation = "×";
					
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
					System.out.println(num1);
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
					System.out.println(num1);
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
				
						try {	
							//String answer;
							num2 = Double.parseDouble(textFieldDisplay.getText());
							System.out.println(num2);
							if (operation == "+")
							{
								
								result = num1 + num2; 
								answer = String.format("%.2f", result);
								System.out.println(answer);
								textFieldDisplay.setText(answer);
								operation = "+";
							}
							
							else if (operation == "-")
							{
								
								result = num1 - num2; 
								answer = String.format("%.2f", result);
								System.out.println(answer);
								textFieldDisplay.setText(answer);
							}
							else if (operation == "*")
							{
								
								result = num1 * num2; 
								answer = String.format("%.2f", result);
								System.out.println(answer);
								textFieldDisplay.setText(answer);
							}
							else if (operation == "/")
							{
								
								result = num1 / num2; 
								answer = String.format("%.2f", result);
								System.out.println(answer);
								textFieldDisplay.setText(answer);
							}
							else if (operation == "X^Y")
							{
								result = Math.pow(num1, num2);
								answer = String.format("%.2f", result);
								System.out.println(answer);
								textFieldDisplay.setText(answer);
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
		
		JButton btnShift = new JButton("SHIFT");
		btnShift.setBackground(new Color(255, 215, 0));
		btnShift.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnShift.setBounds(286, 72, 80, 28);
		frmScientificCalculator.getContentPane().add(btnShift);
		
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
		
		JButton btnLn = new JButton("Ln");
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
		btnOpenBracket.setBounds(132, 268, 57, 28);
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
		btnCloseBracket.setBounds(193, 268, 57, 28);
		frmScientificCalculator.getContentPane().add(btnCloseBracket);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
				ops = Math.tan(ops);
				textFieldDisplay.setText(String.valueOf(ops));
			}
		});
		btnTan.setBackground(new Color(32, 178, 170));
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTan.setBounds(132, 190, 57, 28);
		frmScientificCalculator.getContentPane().add(btnTan);
		
		JButton btnSquareroot = new JButton("\u221A");
		btnSquareroot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
				ops = Math.sqrt(ops);
				textFieldDisplay.setText(String.valueOf(ops));
			}
		});
		btnSquareroot.setBackground(new Color(32, 178, 170));
		btnSquareroot.setBounds(193, 190, 57, 28);
		frmScientificCalculator.getContentPane().add(btnSquareroot);
		
		JButton btn_nPr = new JButton("nPr");
		btn_nPr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_nPr.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_nPr.setBackground(new Color(32, 178, 170));
		btn_nPr.setBounds(254, 190, 57, 28);
		frmScientificCalculator.getContentPane().add(btn_nPr);
		
		JButton btn_nCr = new JButton("nCr");
		btn_nCr.setBackground(new Color(32, 178, 170));
		btn_nCr.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_nCr.setBounds(313, 190, 57, 28);
		frmScientificCalculator.getContentPane().add(btn_nCr);
		
		JButton btnAlpha = new JButton("ALPHA");
		btnAlpha.setBackground(new Color(255, 255, 0));
		btnAlpha.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAlpha.setBounds(196, 73, 80, 28);
		frmScientificCalculator.getContentPane().add(btnAlpha);
		
		JButton btnCalc = new JButton("CALC");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalc.setBackground(new Color(32, 178, 170));
		btnCalc.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnCalc.setBounds(254, 111, 57, 28);
		frmScientificCalculator.getContentPane().add(btnCalc);
		
		JButton btnIntegration = new JButton("\u222Bdx");
		btnIntegration.setBackground(new Color(32, 178, 170));
		btnIntegration.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnIntegration.setBounds(254, 268, 57, 28);
		frmScientificCalculator.getContentPane().add(btnIntegration);
		
		JButton btnMemoryClear = new JButton("MC");
		btnMemoryClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldMemory.setText("");
				}
		});
		btnMemoryClear.setBackground(new Color(32, 178, 170));
		btnMemoryClear.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnMemoryClear.setBounds(313, 268, 57, 28);
		frmScientificCalculator.getContentPane().add(btnMemoryClear);
		
		JButton btnLeft = new JButton("\u2190");
		btnLeft.setBackground(new Color(32, 178, 170));
		btnLeft.setBounds(10, 111, 57, 28);
		frmScientificCalculator.getContentPane().add(btnLeft);
		
		JButton btnUp = new JButton("\u2191");
		btnUp.setBackground(new Color(32, 178, 170));
		btnUp.setBounds(71, 111, 57, 28);
		frmScientificCalculator.getContentPane().add(btnUp);
		
		JButton btnRight = new JButton("\u2192");
		btnRight.setBackground(new Color(32, 178, 170));
		btnRight.setBounds(132, 111, 57, 28);
		frmScientificCalculator.getContentPane().add(btnRight);
		
		JButton btnDown = new JButton("\u2193");
		btnDown.setBackground(new Color(32, 178, 170));
		btnDown.setBounds(193, 111, 57, 28);
		frmScientificCalculator.getContentPane().add(btnDown);
		
		JButton btnStandardDecimalConversion = new JButton("S-D");
		btnStandardDecimalConversion.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnStandardDecimalConversion.setBackground(new Color(32, 178, 170));
		btnStandardDecimalConversion.setBounds(313, 111, 57, 28);
		frmScientificCalculator.getContentPane().add(btnStandardDecimalConversion);
		
		JButton btnSinInverse = new JButton("Sin^-1");
		btnSinInverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
				ops = Math.sinh(ops);
				textFieldDisplay.setText(String.valueOf(ops));
			}
		});
		btnSinInverse.setBackground(new Color(32, 178, 170));
		btnSinInverse.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSinInverse.setBounds(10, 229, 80, 28);
		frmScientificCalculator.getContentPane().add(btnSinInverse);
		
		JButton btnCosInverse = new JButton("Cos^-1");
		btnCosInverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
				ops = Math.cosh(ops);
				textFieldDisplay.setText(String.valueOf(ops));
			}
		});
		btnCosInverse.setBackground(new Color(32, 178, 170));
		btnCosInverse.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCosInverse.setBounds(100, 229, 80, 28);
		frmScientificCalculator.getContentPane().add(btnCosInverse);
		
		JButton btnTanInverse = new JButton("Tan^-1");
		btnTanInverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
				ops = Math.tanh(ops);
				textFieldDisplay.setText(String.valueOf(ops));
			}
		});
		btnTanInverse.setBackground(new Color(32, 178, 170));
		btnTanInverse.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTanInverse.setBounds(192, 229, 80, 28);
		frmScientificCalculator.getContentPane().add(btnTanInverse);
		
		JButton btnDifferenciation = new JButton("dy/dx");
		btnDifferenciation.setBackground(new Color(32, 178, 170));
		btnDifferenciation.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDifferenciation.setBounds(285, 229, 81, 28);
		frmScientificCalculator.getContentPane().add(btnDifferenciation);
		
		JButton btnLogaX = new JButton("Log_a X");
		btnLogaX.setBackground(new Color(32, 178, 170));
		btnLogaX.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogaX.setBounds(10, 151, 80, 28);
		frmScientificCalculator.getContentPane().add(btnLogaX);
		
		JButton btnPower2toX = new JButton("x^2");
		btnPower2toX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
				ops =(ops * ops);
				textFieldDisplay.setText(String.valueOf(ops));
			}
		});
		btnPower2toX.setBackground(new Color(32, 178, 170));
		btnPower2toX.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPower2toX.setBounds(100, 151, 80, 28);
		frmScientificCalculator.getContentPane().add(btnPower2toX);
		
		JButton btnPowerNtoX = new JButton("X^Y");
		btnPowerNtoX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
				//ops = Math.pow(ops * ops);
				//textFieldDisplay.setText(String.valueOf(ops));
				
				num1=Double.parseDouble(textFieldDisplay.getText());
				System.out.println(num1);
				textFieldDisplay.setText("");
				operation = "X^Y";
			}
		});
		btnPowerNtoX.setBackground(new Color(32, 178, 170));
		btnPowerNtoX.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPowerNtoX.setBounds(193, 151, 80, 28);
		frmScientificCalculator.getContentPane().add(btnPowerNtoX);
		
		JButton btnPowerMinus1toX = new JButton("1/X");
		btnPowerMinus1toX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textFieldDisplay.getText()));
				ops = 1/(ops);
				textFieldDisplay.setText(String.valueOf(ops));
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
		Menu.add(MenuItemStandard);
		
		JMenuItem MenuItemScientific = new JMenuItem("Scientific Calculator");
		MenuItemScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmScientificCalculator.setTitle("Scientific Calculator");
				frmScientificCalculator.setBounds(100, 100, 390, 517);
				textFieldDisplay.setBounds(9, 25, 356, 45);
			}
		});
		Menu.add(MenuItemScientific);
		
		JMenuItem MenuItemUnitConverter = new JMenuItem("Unit Converter");
		Menu.add(MenuItemUnitConverter);
		MenuItemUnitConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				
				
				
				
				 
			    }
			});
		
		JMenuItem MenuItemExit = new JMenuItem("Exit");
		MenuItemExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Menu.add(MenuItemExit);
	}
}
