import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UnitConverter {

	private JFrame frame;
	private JTextField textLength;
	private JTextField textAnsLen;
	private JTextField textArea;
	private JTextField textAns_AR;
	private JTextField textMass;
	private JTextField textAns_MA;
	private JTextField textLen;
	private JTextField textAns_Tem;
	private JTextField textPow;
	private JTextField textAns_POW;
	private JTextField textEner;
	private JTextField textAns_Ene;
	private JTextField textPress;
	private JTextField textAns_Press;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnitConverter window = new UnitConverter();
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
	public UnitConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 529, 652);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmStanderedCalculator = new JMenuItem("Standered Calculator");
		mnNewMenu.add(mntmStanderedCalculator);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Scientific Calculator");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Unit Converter");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Exit");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Unit Converter");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(181, 10, 168, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Length");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(24, 78, 98, 19);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Area");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(222, 79, 48, 17);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mass");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(375, 79, 98, 17);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("Value :");
		lblNewLabel_2.setBounds(10, 124, 48, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		textLength = new JTextField();
		textLength.setBounds(68, 121, 64, 19);
		frame.getContentPane().add(textLength);
		textLength.setColumns(10);
		
		JComboBox comboInput_L = new JComboBox();
		comboInput_L.setModel(new DefaultComboBoxModel(new String[] {"in", "cm", "ft", "m", "yd", "mile", "km", "n mile"}));
		comboInput_L.setToolTipText("");
		comboInput_L.setBounds(68, 147, 64, 21);
		frame.getContentPane().add(comboInput_L);
		
		JLabel lblNewLabel_2_1 = new JLabel("Convert :");
		lblNewLabel_2_1.setBounds(10, 151, 57, 13);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("To :");
		lblNewLabel_2_1_1.setBounds(10, 178, 57, 13);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JComboBox comboOutput_Len = new JComboBox();
		comboOutput_Len.setModel(new DefaultComboBoxModel(new String[] {"in", "cm", "ft", "m", "yd", "mile", "km", "n mile"}));
		comboOutput_Len.setToolTipText("");
		comboOutput_Len.setBounds(68, 174, 64, 21);
		frame.getContentPane().add(comboOutput_Len);
		
		textAnsLen = new JTextField();
		textAnsLen.setColumns(10);
		textAnsLen.setBounds(68, 205, 64, 19);
		frame.getContentPane().add(textAnsLen);
		
		JLabel lblNewLabel_2_2 = new JLabel("Value :");
		lblNewLabel_2_2.setBounds(181, 124, 48, 13);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		textArea = new JTextField();
		textArea.setColumns(10);
		textArea.setBounds(239, 121, 64, 19);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Convert :");
		lblNewLabel_2_1_2.setBounds(181, 151, 57, 13);
		frame.getContentPane().add(lblNewLabel_2_1_2);
		
		JComboBox comboInput_AR = new JComboBox();
		comboInput_AR.setModel(new DefaultComboBoxModel(new String[] {"acre", "m\u00B2"}));
		comboInput_AR.setToolTipText("");
		comboInput_AR.setBounds(239, 147, 64, 21);
		frame.getContentPane().add(comboInput_AR);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("To :");
		lblNewLabel_2_1_1_1.setBounds(181, 178, 57, 13);
		frame.getContentPane().add(lblNewLabel_2_1_1_1);
		
		JComboBox comboOutput_AR = new JComboBox();
		comboOutput_AR.setModel(new DefaultComboBoxModel(new String[] {"acre", "m\u00B2"}));
		comboOutput_AR.setToolTipText("");
		comboOutput_AR.setBounds(239, 174, 64, 21);
		frame.getContentPane().add(comboOutput_AR);
		
		textAns_AR = new JTextField();
		textAns_AR.setColumns(10);
		textAns_AR.setBounds(239, 205, 64, 19);
		frame.getContentPane().add(textAns_AR);
		
		JLabel lblNewLabel_2_3 = new JLabel("Value :");
		lblNewLabel_2_3.setBounds(351, 124, 48, 13);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		textMass = new JTextField();
		textMass.setColumns(10);
		textMass.setBounds(409, 121, 64, 19);
		frame.getContentPane().add(textMass);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Convert :");
		lblNewLabel_2_1_3.setBounds(351, 151, 57, 13);
		frame.getContentPane().add(lblNewLabel_2_1_3);
		
		JComboBox comboInput_MA = new JComboBox();
		comboInput_MA.setModel(new DefaultComboBoxModel(new String[] {"oz", "g", "kg", "lb"}));
		comboInput_MA.setToolTipText("");
		comboInput_MA.setBounds(409, 147, 64, 21);
		frame.getContentPane().add(comboInput_MA);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("To :");
		lblNewLabel_2_1_1_2.setBounds(351, 178, 57, 13);
		frame.getContentPane().add(lblNewLabel_2_1_1_2);
		
		JComboBox comboOutput_MA = new JComboBox();
		comboOutput_MA.setModel(new DefaultComboBoxModel(new String[] {"oz", "g", "kg", "lb"}));
		comboOutput_MA.setToolTipText("");
		comboOutput_MA.setBounds(409, 174, 64, 21);
		frame.getContentPane().add(comboOutput_MA);
		
		textAns_MA = new JTextField();
		textAns_MA.setColumns(10);
		textAns_MA.setBounds(409, 205, 64, 19);
		frame.getContentPane().add(textAns_MA);
		
		JLabel lblNewLabel_1_3 = new JLabel("Temperature");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(24, 261, 98, 19);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		textLen = new JTextField();
		textLen.setColumns(10);
		textLen.setBounds(68, 304, 64, 19);
		frame.getContentPane().add(textLen);
		
		JLabel lblNewLabel_2_4 = new JLabel("Value :");
		lblNewLabel_2_4.setBounds(10, 307, 48, 13);
		frame.getContentPane().add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Convert :");
		lblNewLabel_2_1_4.setBounds(10, 334, 57, 13);
		frame.getContentPane().add(lblNewLabel_2_1_4);
		
		JComboBox comboInput_T = new JComboBox();
		comboInput_T.setModel(new DefaultComboBoxModel(new String[] {"\u00B0F", "\u00B0C", "K"}));
		comboInput_T.setToolTipText("");
		comboInput_T.setBounds(68, 330, 64, 21);
		frame.getContentPane().add(comboInput_T);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("To :");
		lblNewLabel_2_1_1_3.setBounds(10, 361, 57, 13);
		frame.getContentPane().add(lblNewLabel_2_1_1_3);
		
		JComboBox comboOutput_T = new JComboBox();
		comboOutput_T.setModel(new DefaultComboBoxModel(new String[] {"\u00B0F", "\u00B0C", "K"}));
		comboOutput_T.setToolTipText("");
		comboOutput_T.setBounds(68, 357, 64, 21);
		frame.getContentPane().add(comboOutput_T);
		
		textAns_Tem = new JTextField();
		textAns_Tem.setColumns(10);
		textAns_Tem.setBounds(68, 388, 64, 19);
		frame.getContentPane().add(textAns_Tem);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Power");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(222, 262, 48, 17);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		textPow = new JTextField();
		textPow.setColumns(10);
		textPow.setBounds(239, 304, 64, 19);
		frame.getContentPane().add(textPow);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Value :");
		lblNewLabel_2_2_1.setBounds(181, 307, 48, 13);
		frame.getContentPane().add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Convert :");
		lblNewLabel_2_1_2_1.setBounds(181, 334, 57, 13);
		frame.getContentPane().add(lblNewLabel_2_1_2_1);
		
		JComboBox comboInput_POW = new JComboBox();
		comboInput_POW.setModel(new DefaultComboBoxModel(new String[] {"kW", "hp"}));
		comboInput_POW.setToolTipText("");
		comboInput_POW.setBounds(239, 330, 64, 21);
		frame.getContentPane().add(comboInput_POW);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("To :");
		lblNewLabel_2_1_1_1_1.setBounds(181, 361, 57, 13);
		frame.getContentPane().add(lblNewLabel_2_1_1_1_1);
		
		JComboBox comboOutput_POW = new JComboBox();
		comboOutput_POW.setModel(new DefaultComboBoxModel(new String[] {"kW", "hp"}));
		comboOutput_POW.setToolTipText("");
		comboOutput_POW.setBounds(239, 357, 64, 21);
		frame.getContentPane().add(comboOutput_POW);
		
		textAns_POW = new JTextField();
		textAns_POW.setColumns(10);
		textAns_POW.setBounds(239, 388, 64, 19);
		frame.getContentPane().add(textAns_POW);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Energy");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2_1.setBounds(375, 262, 98, 17);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		textEner = new JTextField();
		textEner.setColumns(10);
		textEner.setBounds(409, 304, 64, 19);
		frame.getContentPane().add(textEner);
		
		JComboBox comboInput_EN = new JComboBox();
		comboInput_EN.setModel(new DefaultComboBoxModel(new String[] {"J", "kgf.m", "cal"}));
		comboInput_EN.setToolTipText("");
		comboInput_EN.setBounds(409, 330, 64, 21);
		frame.getContentPane().add(comboInput_EN);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("Convert :");
		lblNewLabel_2_1_3_1.setBounds(351, 334, 57, 13);
		frame.getContentPane().add(lblNewLabel_2_1_3_1);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Value :");
		lblNewLabel_2_3_1.setBounds(351, 307, 48, 13);
		frame.getContentPane().add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_1_1_2_1 = new JLabel("To :");
		lblNewLabel_2_1_1_2_1.setBounds(351, 361, 57, 13);
		frame.getContentPane().add(lblNewLabel_2_1_1_2_1);
		
		JComboBox comboOutput_EN = new JComboBox();
		comboOutput_EN.setModel(new DefaultComboBoxModel(new String[] {"J", "kgf.m", "cal"}));
		comboOutput_EN.setToolTipText("");
		comboOutput_EN.setBounds(409, 357, 64, 21);
		frame.getContentPane().add(comboOutput_EN);
		
		textAns_Ene = new JTextField();
		textAns_Ene.setColumns(10);
		textAns_Ene.setBounds(409, 388, 64, 19);
		frame.getContentPane().add(textAns_Ene);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Pressure");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_1.setBounds(222, 438, 81, 17);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		textPress = new JTextField();
		textPress.setColumns(10);
		textPress.setBounds(239, 480, 64, 19);
		frame.getContentPane().add(textPress);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Value :");
		lblNewLabel_2_2_1_1.setBounds(181, 483, 48, 13);
		frame.getContentPane().add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_2_1_2_1_1 = new JLabel("Convert :");
		lblNewLabel_2_1_2_1_1.setBounds(181, 510, 57, 13);
		frame.getContentPane().add(lblNewLabel_2_1_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("To :");
		lblNewLabel_2_1_1_1_1_1.setBounds(181, 537, 57, 13);
		frame.getContentPane().add(lblNewLabel_2_1_1_1_1_1);
		
		JComboBox comboInput_PR = new JComboBox();
		comboInput_PR.setModel(new DefaultComboBoxModel(new String[] {"atm", "Pa", "mmHg", "kgf/cm\u00B2", "lbf/in\u00B2"}));
		comboInput_PR.setToolTipText("");
		comboInput_PR.setBounds(239, 506, 64, 21);
		frame.getContentPane().add(comboInput_PR);
		
		JComboBox comboOutput_PR = new JComboBox();
		comboOutput_PR.setModel(new DefaultComboBoxModel(new String[] {"atm", "Pa", "mmHg", "kgf/cm\u00B2", "lbf/in\u00B2"}));
		comboOutput_PR.setToolTipText("");
		comboOutput_PR.setBounds(239, 533, 64, 21);
		frame.getContentPane().add(comboOutput_PR);
		
		textAns_Press = new JTextField();
		textAns_Press.setColumns(10);
		textAns_Press.setBounds(239, 564, 64, 19);
		frame.getContentPane().add(textAns_Press);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 52, 495, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 241, 505, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 429, 505, 2);
		frame.getContentPane().add(separator_2);
		
		

	}
}
