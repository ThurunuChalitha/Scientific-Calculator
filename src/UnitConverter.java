import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class UnitConverter extends javax.swing.JFrame {
	
	double val_Area,val_Length,val_Mass,val_Temp,val_Power,val_Ener,val_Press=0.0000;
	double ans_Area,ans_Length,ans_Mass,ans_Temp,ans_Power,ans_Ener,ans_Press=0.0000;
	
	/**
	 * Length constants
	 */
	double cmTft=30.48,cmTin=0.3937,kmTcm=100000,cmTm=0.01,mileTcm=160934,n_mileTcm=185200,cmTyd=0.0109,ftTin=12.00,kmTft=3280.84
			,ftTm=0.3048,mileTft=5280,n_mileTft=6076.12,ftTyd=0.3333,kmTin=39370.1,mTin=39.3701,mileTin=63360.034
			,n_mileTin=72913.4252,ydTin=36.00,kmTm=1000,mileTkm=1.609,n_mileTkm=1.852,kmTyd=1093.61,mileTm=1609.34
			,n_mileTmile=1.15078,mileTyd=1760,n_mileTm=	1852,mTyd=1.09361,n_mileTyd	=2025.37;
	
	/**
	 * Area constants
	 */
	double acTm2=4046.86,hecTm2=10000,hecTac=2.47;
	
	
	/**
	 * Mass constants
	 */
	
	double kgToz=35.274,lbToz=16,ozTg=28.3495,kgTg=1000,lbTg=453.592,ozTkg=0.0283495,gTkg=0.001,lbTkg=0.453592,gTlb=0.00220462,kgTlb=2.20462;

	/**
	 * Temperature constants
	 */
	double cel,kel, farh;
	
	/**
	 * Power constants
	 */
	double kWThp=1.34102,hpTkW=0.7457;
	
	/**
	 * Energy constants
	 */
	double kgf_mTJ=9.80665,calTJ=4.184,JTkgf_m=0.10197,calTkgf_m=0.426832812,JTcal=0.000239006,kgf_mTcal=2.34;
	
	/**
	 * Pressure constants
	 */
	
	double atmTPa=101325,atmTmmHg=760,atmTkgf_cm2=1.03323,atmTlbf_in2=14.6959,mmHgTPa=133.322,kgf_cm2TPa=98066.5,
			lbf_in2TPa=6894.76,kgf_cm2TmmHg=735.559,lbf_in2TmmHg=51.7149,
			kgf_cm2Tlbf_in2=14.2233,lbf_in2Tkgf_cm2=0.070307;
	
	private JButton btnArea;
	private JButton btnLength;
	private JButton btnMass;
	private JButton btnTemp;
	private JButton btnPow;
	private JButton btnEnerg;
	private JButton btnPress;


	private JFrame frame;
	private JTextField textLength;
	private JTextField textAnsLen;
	private JTextField textArea;
	private JTextField textAns_AR;
	private JTextField textMass;
	private JTextField textAns_MA;
	private JTextField textTemp;
	private JTextField textAns_Tem;
	private JTextField textPow;
	private JTextField textAns_POW;
	private JTextField textEnergy;
	private JTextField textAns_Ener;
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
		frame.setTitle("Unit Converter");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(UnitConverter.class.getResource("/convert.png")));
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setForeground(Color.WHITE);
		frame.setBounds(100, 100, 529, 652);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 255));
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmStanderedCalculator = new JMenuItem("Standard Calculator");
		mntmStanderedCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StandardCalculator stdcal=new StandardCalculator();
				stdcal.setVisible(true);
			}
		});
		mnNewMenu.add(mntmStanderedCalculator);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Scientific Calculator");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ScientificCal();
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Physical Constant Generator");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PhysicalConstant();

			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Exit");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		
		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);
		
		
		/**
		 * Opening ReadMe file.
		 */
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Read Me");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    try {
			        Desktop desktop = null;
			        if (Desktop.isDesktopSupported()) {
			          desktop = Desktop.getDesktop();
			        }

			         desktop.open(new File("src/Unit Converter.pdf"));
			         } catch (IOException ioe) {
			        	 ioe.printStackTrace();
			        	 }
			}
			
			
			
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
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
		
		JComboBox comboInput_Len = new JComboBox();
		comboInput_Len.setModel(new DefaultComboBoxModel(new String[] {"in", "cm", "ft", "m", "yd", "mile", "km", "n mile"}));
		comboInput_Len.setToolTipText("");
		comboInput_Len.setBounds(68, 147, 64, 21);
		frame.getContentPane().add(comboInput_Len);
		
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
		comboInput_AR.setModel(new DefaultComboBoxModel(new String[] {"acre", "m\u00B2", "hectare"}));
		comboInput_AR.setToolTipText("");
		comboInput_AR.setBounds(239, 147, 64, 21);
		frame.getContentPane().add(comboInput_AR);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("To :");
		lblNewLabel_2_1_1_1.setBounds(181, 178, 57, 13);
		frame.getContentPane().add(lblNewLabel_2_1_1_1);
		
		JComboBox comboOutput_AR = new JComboBox();
		comboOutput_AR.setModel(new DefaultComboBoxModel(new String[] {"acre", "m\u00B2", "hectare"}));
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
		
		textTemp = new JTextField();
		textTemp.setColumns(10);
		textTemp.setBounds(68, 304, 64, 19);
		frame.getContentPane().add(textTemp);
		
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
		
		textEnergy = new JTextField();
		textEnergy.setColumns(10);
		textEnergy.setBounds(409, 304, 64, 19);
		frame.getContentPane().add(textEnergy);
		
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
		
		textAns_Ener = new JTextField();
		textAns_Ener.setColumns(10);
		textAns_Ener.setBounds(409, 388, 64, 19);
		frame.getContentPane().add(textAns_Ener);
		
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
		
		/** Length Conversion --------------------------------------> */
		JButton btnLength = new JButton(">");
		btnLength.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboInput_Len.getSelectedItem().toString()=="in" && comboOutput_Len.getSelectedItem().toString()=="in") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="cm" && comboOutput_Len.getSelectedItem().toString()=="cm") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="ft" && comboOutput_Len.getSelectedItem().toString()=="ft") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="m" && comboOutput_Len.getSelectedItem().toString()=="m") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="yd" && comboOutput_Len.getSelectedItem().toString()=="yd") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="mile" && comboOutput_Len.getSelectedItem().toString()=="mile") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="km" && comboOutput_Len.getSelectedItem().toString()=="km") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="n mile" && comboOutput_Len.getSelectedItem().toString()=="n mile") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				
				
				if(comboInput_Len.getSelectedItem().toString()=="in" && comboOutput_Len.getSelectedItem().toString()=="cm") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/cmTin;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="cm" && comboOutput_Len.getSelectedItem().toString()=="in") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*cmTin;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				
				if(comboInput_Len.getSelectedItem().toString()=="in" && comboOutput_Len.getSelectedItem().toString()=="ft") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/ftTin;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				
				if(comboInput_Len.getSelectedItem().toString()=="ft" && comboOutput_Len.getSelectedItem().toString()=="in") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*ftTin;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="in" && comboOutput_Len.getSelectedItem().toString()=="m") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/mTin;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="m" && comboOutput_Len.getSelectedItem().toString()=="in") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*mTin;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="yd" && comboOutput_Len.getSelectedItem().toString()=="in") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*ydTin;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="in" && comboOutput_Len.getSelectedItem().toString()=="yd") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/ydTin;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="in" && comboOutput_Len.getSelectedItem().toString()=="mile") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/mileTin;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="mile" && comboOutput_Len.getSelectedItem().toString()=="in") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*mileTin;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="km" && comboOutput_Len.getSelectedItem().toString()=="in") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*kmTin;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="in" && comboOutput_Len.getSelectedItem().toString()=="km") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/kmTin;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="in" && comboOutput_Len.getSelectedItem().toString()=="n mile") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/n_mileTin;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="n mile" && comboOutput_Len.getSelectedItem().toString()=="in") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*n_mileTin;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="ft" && comboOutput_Len.getSelectedItem().toString()=="cm") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/cmTft;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="cm" && comboOutput_Len.getSelectedItem().toString()=="ft") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*cmTft;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="cm" && comboOutput_Len.getSelectedItem().toString()=="m") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*cmTm;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="m" && comboOutput_Len.getSelectedItem().toString()=="cm") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/cmTm;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="cm" && comboOutput_Len.getSelectedItem().toString()=="yd") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*cmTyd;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="yd" && comboOutput_Len.getSelectedItem().toString()=="cm") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/cmTyd;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="cm" && comboOutput_Len.getSelectedItem().toString()=="mile") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/mileTcm;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="mile" && comboOutput_Len.getSelectedItem().toString()=="cm") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*mileTcm;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="cm" && comboOutput_Len.getSelectedItem().toString()=="km") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/kmTcm;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="km" && comboOutput_Len.getSelectedItem().toString()=="cm") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*kmTcm;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="n mile" && comboOutput_Len.getSelectedItem().toString()=="cm") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*n_mileTcm;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="cm" && comboOutput_Len.getSelectedItem().toString()=="n mile") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/n_mileTcm;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="ft" && comboOutput_Len.getSelectedItem().toString()=="m") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*ftTm;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="m" && comboOutput_Len.getSelectedItem().toString()=="ft") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/ftTm;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="ft" && comboOutput_Len.getSelectedItem().toString()=="yd") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*ftTyd;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="yd" && comboOutput_Len.getSelectedItem().toString()=="ft") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/ftTyd;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="ft" && comboOutput_Len.getSelectedItem().toString()=="mile") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/mileTft;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="mile" && comboOutput_Len.getSelectedItem().toString()=="ft") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*mileTft;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="km" && comboOutput_Len.getSelectedItem().toString()=="ft") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*kmTft;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="ft" && comboOutput_Len.getSelectedItem().toString()=="km") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/kmTft;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="ft" && comboOutput_Len.getSelectedItem().toString()=="n mile") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/n_mileTft;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="n mile" && comboOutput_Len.getSelectedItem().toString()=="ft") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*n_mileTft;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="m" && comboOutput_Len.getSelectedItem().toString()=="yd") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*mTyd;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="yd" && comboOutput_Len.getSelectedItem().toString()=="m") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/mTyd;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="m" && comboOutput_Len.getSelectedItem().toString()=="mile") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/mileTm;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="mile" && comboOutput_Len.getSelectedItem().toString()=="m") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*mileTm;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="m" && comboOutput_Len.getSelectedItem().toString()=="km") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/kmTm;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="km" && comboOutput_Len.getSelectedItem().toString()=="m") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*kmTm;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="m" && comboOutput_Len.getSelectedItem().toString()=="n mile") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/n_mileTm;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="n mile" && comboOutput_Len.getSelectedItem().toString()=="m") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*n_mileTm;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="yd" && comboOutput_Len.getSelectedItem().toString()=="mile") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/mileTyd;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="mile" && comboOutput_Len.getSelectedItem().toString()=="yd") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*mileTyd;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="km" && comboOutput_Len.getSelectedItem().toString()=="yd") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*kmTyd;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="yd" && comboOutput_Len.getSelectedItem().toString()=="km") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/kmTyd;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="yd" && comboOutput_Len.getSelectedItem().toString()=="n mile") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/n_mileTyd;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="n mile" && comboOutput_Len.getSelectedItem().toString()=="yd") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*n_mileTyd;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="mile" && comboOutput_Len.getSelectedItem().toString()=="km") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*mileTkm;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="km" && comboOutput_Len.getSelectedItem().toString()=="mile") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/mileTkm;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="mile" && comboOutput_Len.getSelectedItem().toString()=="n mile") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/n_mileTmile;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="n mile" && comboOutput_Len.getSelectedItem().toString()=="mile") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*n_mileTmile;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="n mile" && comboOutput_Len.getSelectedItem().toString()=="km") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length*n_mileTkm;
					textAnsLen.setText(String.valueOf(ans_Length));
				}
				if(comboInput_Len.getSelectedItem().toString()=="km" && comboOutput_Len.getSelectedItem().toString()=="n mile") {
					double val_Length =ExpNumLength();
					ans_Length=val_Length/n_mileTkm;
					textAnsLen.setText(String.valueOf(ans_Length));
				}	
				
			}
		});
		btnLength.setBackground(Color.LIGHT_GRAY);
		btnLength.setForeground(Color.BLACK);
		btnLength.setBounds(10, 204, 48, 21);
		frame.getContentPane().add(btnLength);
		
		/** Area Conversion --------------------------------------> */
		JButton btnArea = new JButton(">");
		btnArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboInput_AR.getSelectedItem().toString()=="acre" && comboOutput_AR.getSelectedItem().toString()=="m²") {
					double val_Area =ExpNumArea();
					ans_Area=val_Area*acTm2;
					textAns_AR.setText(String.valueOf(ans_Area));
				}
				
				if(comboInput_AR.getSelectedItem().toString()=="m²" && comboOutput_AR.getSelectedItem().toString()=="acre") {
					double val_Area =ExpNumArea();
					ans_Area=val_Area/acTm2;
					textAns_AR.setText(String.valueOf(ans_Area));
				}
				
				if(comboInput_AR.getSelectedItem().toString()=="m²" && comboOutput_AR.getSelectedItem().toString()=="hectare") {
					double val_Area =ExpNumArea();
					ans_Area=val_Area/hecTm2;
					textAns_AR.setText(String.valueOf(ans_Area));
				}
				
				if(comboInput_AR.getSelectedItem().toString()=="hectare" && comboOutput_AR.getSelectedItem().toString()=="m²") {
					double val_Area =ExpNumArea();
					ans_Area=val_Area*hecTm2;
					textAns_AR.setText(String.valueOf(ans_Area));
				}
				
				if(comboInput_AR.getSelectedItem().toString()=="hectare" && comboOutput_AR.getSelectedItem().toString()=="acre") {
					double val_Area =ExpNumArea();
					ans_Area=val_Area*hecTac;
					textAns_AR.setText(String.valueOf(ans_Area));
				}
				
				if(comboInput_AR.getSelectedItem().toString()=="acre" && comboOutput_AR.getSelectedItem().toString()=="hectare") {
					double val_Area =ExpNumArea();
					ans_Area=val_Area/hecTac;
					textAns_AR.setText(String.valueOf(ans_Area));
				}
				if(comboInput_AR.getSelectedItem().toString()=="acre" && comboOutput_AR.getSelectedItem().toString()=="acre") {
					double val_Area =ExpNumArea();
					ans_Area=val_Area;
					textAns_AR.setText(String.valueOf(ans_Area));
				}
				if(comboInput_AR.getSelectedItem().toString()=="hectare" && comboOutput_AR.getSelectedItem().toString()=="hectare") {
					double val_Area =ExpNumArea();
					ans_Area=val_Area;
					textAns_AR.setText(String.valueOf(ans_Area));
				}
				if(comboInput_AR.getSelectedItem().toString()=="m²" && comboOutput_AR.getSelectedItem().toString()=="m²") {
					double val_Area =ExpNumArea();
					ans_Area=val_Area;
					textAns_AR.setText(String.valueOf(ans_Area));
				}
			}
		});
		btnArea.setForeground(Color.BLACK);
		btnArea.setBackground(Color.LIGHT_GRAY);
		btnArea.setBounds(181, 204, 48, 21);
		frame.getContentPane().add(btnArea);
		
		/** Mass Conversion --------------------------------------> */
		
		JButton btnMass = new JButton(">");
		btnMass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboInput_MA.getSelectedItem().toString()=="oz" && comboOutput_MA.getSelectedItem().toString()=="oz") {
					double val_Mass =ExpNumMass();
					ans_Mass=val_Mass;
					textAns_MA.setText(String.valueOf(ans_Mass));
				}
				if(comboInput_MA.getSelectedItem().toString()=="g" && comboOutput_MA.getSelectedItem().toString()=="g") {
					double val_Mass =ExpNumMass();
					ans_Mass=val_Mass;
					textAns_MA.setText(String.valueOf(ans_Mass));
				}
				if(comboInput_MA.getSelectedItem().toString()=="kg" && comboOutput_MA.getSelectedItem().toString()=="kg") {
					double val_Mass =ExpNumMass();
					ans_Mass=val_Mass;
					textAns_MA.setText(String.valueOf(ans_Mass));
				}
				if(comboInput_MA.getSelectedItem().toString()=="lb" && comboOutput_MA.getSelectedItem().toString()=="lb") {
					double val_Mass =ExpNumMass();
					ans_Mass=val_Mass;
					textAns_MA.setText(String.valueOf(ans_Mass));
				}
				if(comboInput_MA.getSelectedItem().toString()=="oz" && comboOutput_MA.getSelectedItem().toString()=="g") {
					double val_Mass =ExpNumMass();
					ans_Mass=val_Mass*ozTg;
					textAns_MA.setText(String.valueOf(ans_Mass));
				}
				if(comboInput_MA.getSelectedItem().toString()=="g" && comboOutput_MA.getSelectedItem().toString()=="oz") {
					double val_Mass =ExpNumMass();
					ans_Mass=val_Mass/ozTg;
					textAns_MA.setText(String.valueOf(ans_Mass));
				}
				if(comboInput_MA.getSelectedItem().toString()=="kg" && comboOutput_MA.getSelectedItem().toString()=="oz") {
					double val_Mass =ExpNumMass();
					ans_Mass=val_Mass*kgToz;
					textAns_MA.setText(String.valueOf(ans_Mass));
				}
				if(comboInput_MA.getSelectedItem().toString()=="oz" && comboOutput_MA.getSelectedItem().toString()=="kg") {
					double val_Mass =ExpNumMass();
					ans_Mass=val_Mass/kgToz;
					textAns_MA.setText(String.valueOf(ans_Mass));
				}
				if(comboInput_MA.getSelectedItem().toString()=="oz" && comboOutput_MA.getSelectedItem().toString()=="lb") {
					double val_Mass =ExpNumMass();
					ans_Mass=val_Mass/lbToz;
					textAns_MA.setText(String.valueOf(ans_Mass));
				}
				if(comboInput_MA.getSelectedItem().toString()=="lb" && comboOutput_MA.getSelectedItem().toString()=="oz") {
					double val_Mass =ExpNumMass();
					ans_Mass=val_Mass*lbToz;
					textAns_MA.setText(String.valueOf(ans_Mass));
				}
				if(comboInput_MA.getSelectedItem().toString()=="g" && comboOutput_MA.getSelectedItem().toString()=="kg") {
					double val_Mass =ExpNumMass();
					ans_Mass=val_Mass/kgTg;
					textAns_MA.setText(String.valueOf(ans_Mass));
				}
				if(comboInput_MA.getSelectedItem().toString()=="kg" && comboOutput_MA.getSelectedItem().toString()=="g") {
					double val_Mass =ExpNumMass();
					ans_Mass=val_Mass*kgTg;
					textAns_MA.setText(String.valueOf(ans_Mass));
				}
				if(comboInput_MA.getSelectedItem().toString()=="g" && comboOutput_MA.getSelectedItem().toString()=="lb") {
					double val_Mass =ExpNumMass();
					ans_Mass=val_Mass/lbTg;
					textAns_MA.setText(String.valueOf(ans_Mass));
				}
				if(comboInput_MA.getSelectedItem().toString()=="lb" && comboOutput_MA.getSelectedItem().toString()=="g") {
					double val_Mass =ExpNumMass();
					ans_Mass=val_Mass*lbTg;
					textAns_MA.setText(String.valueOf(ans_Mass));
				}
				if(comboInput_MA.getSelectedItem().toString()=="kg" && comboOutput_MA.getSelectedItem().toString()=="lb") {
					double val_Mass =ExpNumMass();
					ans_Mass=val_Mass*kgTlb;
					textAns_MA.setText(String.valueOf(ans_Mass));
				}
				if(comboInput_MA.getSelectedItem().toString()=="lb" && comboOutput_MA.getSelectedItem().toString()=="kg") {
					double val_Mass =ExpNumMass();
					ans_Mass=val_Mass/kgTlb;
					textAns_MA.setText(String.valueOf(ans_Mass));
				}	
				
			}
		});
		btnMass.setForeground(Color.BLACK);
		btnMass.setBackground(Color.LIGHT_GRAY);
		btnMass.setBounds(351, 204, 48, 21);
		frame.getContentPane().add(btnMass);
		
		
		/** Temperature Conversion --------------------------------------> */
		JButton btnTemp = new JButton(">");
		btnTemp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboInput_T.getSelectedItem().toString()=="°F" && comboOutput_T.getSelectedItem().toString()=="°F") {
					double val_Temp =ExpNumTemp();
					ans_Temp=val_Temp;
					textAns_Tem.setText(String.valueOf(ans_Temp));
				}
				if(comboInput_T.getSelectedItem().toString()=="°C" && comboOutput_T.getSelectedItem().toString()=="°C") {
					double val_Temp =ExpNumTemp();
					ans_Temp=val_Temp;
					textAns_Tem.setText(String.valueOf(ans_Temp));
				}
				if(comboInput_T.getSelectedItem().toString()=="K" && comboOutput_T.getSelectedItem().toString()=="K") {
					double val_Temp =ExpNumTemp();
					ans_Temp=val_Temp;
					textAns_Tem.setText(String.valueOf(ans_Temp));
				}
				if(comboInput_T.getSelectedItem().toString()=="°C" && comboOutput_T.getSelectedItem().toString()=="°F") {
					double val_Temp =ExpNumTemp();
					ans_Temp=(val_Temp*9/5)+32;
					textAns_Tem.setText(String.valueOf(ans_Temp));
				}
				if(comboInput_T.getSelectedItem().toString()=="°F" && comboOutput_T.getSelectedItem().toString()=="°C") {
					double val_Temp =ExpNumTemp();
					ans_Temp=(val_Temp-32)*9/5;
					textAns_Tem.setText(String.valueOf(ans_Temp));
				}
				if(comboInput_T.getSelectedItem().toString()=="°F" && comboOutput_T.getSelectedItem().toString()=="K") {
					double val_Temp =ExpNumTemp();
					ans_Temp=(val_Temp-32) *5/9 + 273.15;
					textAns_Tem.setText(String.valueOf(ans_Temp));
				}
				if(comboInput_T.getSelectedItem().toString()=="K" && comboOutput_T.getSelectedItem().toString()=="°F") {
					double val_Temp =ExpNumTemp();
					ans_Temp=(val_Temp-273.15)*9/5+32;
					textAns_Tem.setText(String.valueOf(ans_Temp));
				}
				if(comboInput_T.getSelectedItem().toString()=="K" && comboOutput_T.getSelectedItem().toString()=="°C") {
					double val_Temp =ExpNumTemp();
					ans_Temp= val_Temp-273.15;
					textAns_Tem.setText(String.valueOf(ans_Temp));
				}
				if(comboInput_T.getSelectedItem().toString()=="°C" && comboOutput_T.getSelectedItem().toString()=="K") {
					double val_Temp =ExpNumTemp();
					ans_Temp=val_Temp+273.15;
					textAns_Tem.setText(String.valueOf(ans_Temp));
				}
	
				
			}
		});
		btnTemp.setForeground(Color.BLACK);
		btnTemp.setBackground(Color.LIGHT_GRAY);
		btnTemp.setBounds(10, 387, 48, 21);
		frame.getContentPane().add(btnTemp);
		
		
		/** Power Conversion --------------------------------------> */
		JButton btnPow = new JButton(">");
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboInput_POW.getSelectedItem().toString()=="kW" && comboOutput_POW.getSelectedItem().toString()=="kW") {
					double val_POW =ExpNumPOW();
					ans_Power=val_POW;
					textAns_POW.setText(String.valueOf(ans_Power));
				}
				if(comboInput_POW.getSelectedItem().toString()=="hp" && comboOutput_POW.getSelectedItem().toString()=="hp") {
					double val_POW =ExpNumPOW();
					ans_Power=val_POW;
					textAns_POW.setText(String.valueOf(ans_Power));
				}
				if(comboInput_POW.getSelectedItem().toString()=="hp" && comboOutput_POW.getSelectedItem().toString()=="kW") {
					double val_POW =ExpNumPOW();
					ans_Power=val_POW/kWThp;
					textAns_POW.setText(String.valueOf(ans_Power));
				}
				if(comboInput_POW.getSelectedItem().toString()=="kW" && comboOutput_POW.getSelectedItem().toString()=="hp") {
					double val_POW =ExpNumPOW();
					ans_Power=val_POW*kWThp;
					textAns_POW.setText(String.valueOf(ans_Power));
				}
					
				
			}
		});
		btnPow.setForeground(Color.BLACK);
		btnPow.setBackground(Color.LIGHT_GRAY);
		btnPow.setBounds(181, 387, 48, 21);
		frame.getContentPane().add(btnPow);
		
		/** Energy Conversion --------------------------------------> */
		JButton btnEnergy = new JButton(">");
		btnEnergy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboInput_EN.getSelectedItem().toString()=="J" && comboOutput_EN.getSelectedItem().toString()=="J") {
					double val_EN =ExpNumEnergy();
					ans_Ener=val_EN;
					textAns_Ener.setText(String.valueOf(ans_Ener));
				}
				
				if(comboInput_EN.getSelectedItem().toString()=="kgf.m" && comboOutput_EN.getSelectedItem().toString()=="kgf.m") {
					double val_EN =ExpNumEnergy();
					ans_Ener=val_EN;
					textAns_Ener.setText(String.valueOf(ans_Ener));
					}
				if(comboInput_EN.getSelectedItem().toString()=="cal" && comboOutput_EN.getSelectedItem().toString()=="cal") {
					double val_EN =ExpNumEnergy();
					ans_Ener=val_EN;
					textAns_Ener.setText(String.valueOf(ans_Ener));
				}
				if(comboInput_EN.getSelectedItem().toString()=="J" && comboOutput_EN.getSelectedItem().toString()=="kgf.m") {
					double val_EN =ExpNumEnergy();
					ans_Ener=val_EN/kgf_mTJ;
					textAns_Ener.setText(String.valueOf(ans_Ener));
				}
				if(comboInput_EN.getSelectedItem().toString()=="kgf.m" && comboOutput_EN.getSelectedItem().toString()=="J") {
					double val_EN =ExpNumEnergy();
					ans_Ener=val_EN*kgf_mTJ;
					textAns_Ener.setText(String.valueOf(ans_Ener));
				}
				if(comboInput_EN.getSelectedItem().toString()=="cal" && comboOutput_EN.getSelectedItem().toString()=="J") {
					double val_EN =ExpNumEnergy();
					ans_Ener=val_EN*calTJ;
					textAns_Ener.setText(String.valueOf(ans_Ener));
				}
				if(comboInput_EN.getSelectedItem().toString()=="J" && comboOutput_EN.getSelectedItem().toString()=="cal") {
					double val_EN =ExpNumEnergy();
					ans_Ener=val_EN/calTJ;
					textAns_Ener.setText(String.valueOf(ans_Ener));
				}
				if(comboInput_EN.getSelectedItem().toString()=="kgf.m" && comboOutput_EN.getSelectedItem().toString()=="cal") {
					double val_EN =ExpNumEnergy();
					ans_Ener=val_EN*kgf_mTcal;
					textAns_Ener.setText(String.valueOf(ans_Ener));
				}
				if(comboInput_EN.getSelectedItem().toString()=="cal" && comboOutput_EN.getSelectedItem().toString()=="kgf.m") {
					double val_EN =ExpNumEnergy();
					ans_Ener=val_EN/kgf_mTcal;
					textAns_Ener.setText(String.valueOf(ans_Ener));
				}
						
			}
		});
		btnEnergy.setForeground(Color.BLACK);
		btnEnergy.setBackground(Color.LIGHT_GRAY);
		btnEnergy.setBounds(351, 387, 48, 21);
		frame.getContentPane().add(btnEnergy);
		
		/** Pressure Conversion --------------------------------------> */
		JButton btnPress = new JButton(">");
		btnPress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboInput_PR.getSelectedItem().toString()=="atm" && comboOutput_PR.getSelectedItem().toString()=="atm") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="Pa" && comboOutput_PR.getSelectedItem().toString()=="Pa") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="mmHg" && comboOutput_PR.getSelectedItem().toString()=="mmHg") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="kgf/cm²" && comboOutput_PR.getSelectedItem().toString()=="kgf/cm²") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="lbf/in²" && comboOutput_PR.getSelectedItem().toString()=="lbf/in²") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="atm" && comboOutput_PR.getSelectedItem().toString()=="Pa") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR*atmTPa;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="Pa" && comboOutput_PR.getSelectedItem().toString()=="atm") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR/atmTPa;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="mmHg" && comboOutput_PR.getSelectedItem().toString()=="atm") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR/atmTmmHg;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="atm" && comboOutput_PR.getSelectedItem().toString()=="mmHg") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR*atmTmmHg;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="atm" && comboOutput_PR.getSelectedItem().toString()=="kgf/cm²") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR*atmTkgf_cm2;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="kgf/cm²" && comboOutput_PR.getSelectedItem().toString()=="atm") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR/atmTkgf_cm2;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="lbf/in²" && comboOutput_PR.getSelectedItem().toString()=="atm") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR/atmTlbf_in2;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="atm" && comboOutput_PR.getSelectedItem().toString()=="lbf/in²") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR*atmTlbf_in2;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="Pa" && comboOutput_PR.getSelectedItem().toString()=="mmHg") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR/mmHgTPa;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="mmHg" && comboOutput_PR.getSelectedItem().toString()=="Pa") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR*mmHgTPa;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="Pa" && comboOutput_PR.getSelectedItem().toString()=="kgf/cm²") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR/kgf_cm2TPa;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="kgf/cm²" && comboOutput_PR.getSelectedItem().toString()=="Pa") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR*kgf_cm2TPa;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="lbf/in²" && comboOutput_PR.getSelectedItem().toString()=="Pa") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR*lbf_in2TPa;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="Pa" && comboOutput_PR.getSelectedItem().toString()=="lbf/in²") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR/lbf_in2TPa;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="kgf/cm²" && comboOutput_PR.getSelectedItem().toString()=="mmHg") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR*kgf_cm2TmmHg;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="mmHg" && comboOutput_PR.getSelectedItem().toString()=="kgf/cm²") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR/kgf_cm2TmmHg;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="mmHg" && comboOutput_PR.getSelectedItem().toString()=="lbf/in²") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR/lbf_in2TmmHg;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="lbf/in²" && comboOutput_PR.getSelectedItem().toString()=="mmHg") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR*lbf_in2TmmHg;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="lbf/in²" && comboOutput_PR.getSelectedItem().toString()=="kgf/cm²") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR*lbf_in2Tkgf_cm2;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				if(comboInput_PR.getSelectedItem().toString()=="kgf/cm²" && comboOutput_PR.getSelectedItem().toString()=="lbf/in²") {
					double val_PR =ExpNumPressure();
					ans_Press=val_PR/lbf_in2Tkgf_cm2;
					textAns_Press.setText(String.valueOf(ans_Press));
				}
				
				
			}
		});
		btnPress.setForeground(Color.BLACK);
		btnPress.setBackground(Color.LIGHT_GRAY);
		btnPress.setBounds(181, 563, 48, 21);
		frame.getContentPane().add(btnPress);
			

	}
	
	/** Area Conversion Exception Handling>>>>>>>>>>>>>>>>>>>>>> */
	public double  ExpNumArea() {
		
		try {
			ans_Area=Double.parseDouble(textArea.getText());
			
		}catch(NumberFormatException e1){
			JOptionPane.showMessageDialog(null,"Enter valid input!");	
		}
		return ans_Area;
	}
	
	/** Length Conversion Exception Handling>>>>>>>>>>>>>>>>>>>>>> */
	public double  ExpNumLength() {
		
		try {
			ans_Length=Double.parseDouble(textLength.getText());
			
		}catch(NumberFormatException e1){
			JOptionPane.showMessageDialog(null,"Enter valid input!");	
		}
		return ans_Length;
	}
	
	/** Mass Conversion Exception Handling>>>>>>>>>>>>>>>>>>>>>> */
	public double  ExpNumMass() {
		
		try {
			ans_Mass=Double.parseDouble(textMass.getText());
			
		}catch(NumberFormatException e1){
			JOptionPane.showMessageDialog(null,"Enter valid input!");	
		}
		return ans_Mass;
	}
	/** Temperature Conversion Exception Handling>>>>>>>>>>>>>>>>>>>>>> */
	public double  ExpNumTemp() {
		
		try {
			ans_Temp=Double.parseDouble(textTemp.getText());
			
		}catch(NumberFormatException e1){
			JOptionPane.showMessageDialog(null,"Enter valid input!");	
		}
		return ans_Temp;
	}
	/** Power Conversion Exception Handling>>>>>>>>>>>>>>>>>>>>>> */
	public double  ExpNumPOW() {
		
		try {
			ans_Power=Double.parseDouble(textPow.getText());
			
		}catch(NumberFormatException e1){
			JOptionPane.showMessageDialog(null,"Enter valid input!");	
		}
		return ans_Power;
	}
	
	/** Energy Conversion Exception Handling>>>>>>>>>>>>>>>>>>>>>> */
	public double  ExpNumEnergy() {
		
		try {
			ans_Ener=Double.parseDouble(textEnergy.getText());
			
		}catch(NumberFormatException e1){
			JOptionPane.showMessageDialog(null,"Enter valid input!");	
		}
		return ans_Ener;
	}
	
	/** Pressure Conversion Exception Handling>>>>>>>>>>>>>>>>>>>>>> */
	public double  ExpNumPressure() {
		
		try {
			ans_Press=Double.parseDouble(textPress.getText());
			
		}catch(NumberFormatException e1){
			JOptionPane.showMessageDialog(null,"Enter valid input!");	
		}
		return ans_Press;
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
