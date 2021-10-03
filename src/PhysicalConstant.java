import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class PhysicalConstant extends javax.swing.JFrame {
	

    private JFrame PhysicalConstanFframe;
    private JTextField textFieldDisplay;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PhysicalConstant window = new PhysicalConstant();
                    window.PhysicalConstanFframe.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public PhysicalConstant() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        PhysicalConstanFframe = new JFrame();
        PhysicalConstanFframe.setTitle("Physical Constant Generator");
        PhysicalConstanFframe.setIconImage(Toolkit.getDefaultToolkit().getImage(UnitConverter.class.getResource("/physical.png")));
        PhysicalConstanFframe.setFont(new Font("Arial", Font.BOLD, 14));
        PhysicalConstanFframe.getContentPane().setBackground(new Color(0, 0, 0));
        PhysicalConstanFframe.setBounds(100, 100, 373, 458);
        PhysicalConstanFframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PhysicalConstanFframe.getContentPane().setLayout(null);
        PhysicalConstanFframe.setResizable(false);
        PhysicalConstanFframe.setVisible(true);

        textFieldDisplay = new JTextField();
        textFieldDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        textFieldDisplay.setBounds(22, 10, 253, 45);
        PhysicalConstanFframe.getContentPane().add(textFieldDisplay);
        textFieldDisplay.setColumns(10);

        JButton btnAC = new JButton("AC");
        btnAC.setBackground(new Color(0, 255, 255));
        btnAC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textFieldDisplay.setText("");
            }
        });
        btnAC.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnAC.setBounds(280, 10, 60, 45);
        PhysicalConstanFframe.getContentPane().add(btnAC);

        JButton btn1 = new JButton("mp");
        double mp = 11.672621777E-27 ;
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + mp;
                textFieldDisplay.setText(value);
            }
        });
        btn1.setBackground(new Color(135, 206, 250));
        btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn1.setBounds(20, 70, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn1);

        JButton btn1a = new JButton("mn");
        double mn = 1.674927351E-27 ;
        btn1a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + mn;
                textFieldDisplay.setText(value);
            }
        });
        btn1a.setBackground(new Color(135, 206, 250));
        btn1a.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn1a.setBounds(85, 70, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn1a);

        JButton btn1b = new JButton("me");
        double me = 9.10938291E-31 ;
        btn1b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + me;
                textFieldDisplay.setText(value);
            }
        });
        btn1b.setBackground(new Color(135, 206, 250));
        btn1b.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn1b.setBounds(150, 70, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn1b);

        JButton btn1c = new JButton("mu");
        double mu = 1.883531475E-28;
        btn1c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + mu;
                textFieldDisplay.setText(value);
            }
        });
        btn1c.setBackground(new Color(135, 206, 250));
        btn1c.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn1c.setBounds(215, 70, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn1c);

        JButton btn1d = new JButton("a0");
        double a0 = 5.291772109E-11 ;
        btn1d.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + a0;
                textFieldDisplay.setText(value);
            }
        });
        btn1d.setBackground(new Color(135, 206, 250));
        btn1d.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn1d.setBounds(280, 70, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn1d);



        JButton btn2 = new JButton("h");
        double h = 6.62606957E-34 ;
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() +h;
                textFieldDisplay.setText(value);
            }
        });
        btn2.setBackground(new Color(135, 206, 250));
        btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn2.setBounds(20, 110, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn2);

        JButton btna2 = new JButton("uN");
        double uN = 6.62606957E-34 ;
        btna2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + uN;
                textFieldDisplay.setText(value);
            }
        });
        btna2.setBackground(new Color(135, 206, 250));
        btna2.setFont(new Font("Tahoma", Font.BOLD, 15));
        btna2.setBounds(85, 110, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btna2);

        JButton btnb2 = new JButton("uB");
        double uB = 9.27400968E-24 ;
        btnb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + uB;
                textFieldDisplay.setText(value);
            }
        });
        btnb2.setBackground(new Color(135, 206, 250));
        btnb2.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnb2.setBounds(150, 110, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnb2);

        JButton btnc2 = new JButton("Dc");
        double Dc = 1.054571726E-34 ;
        btnc2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + Dc;
                textFieldDisplay.setText(value);
            }
        });
        btnc2.setBackground(new Color(135, 206, 250));
        btnc2.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnc2.setBounds(215, 110, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnc2);

        JButton btnd2 = new JButton("a");
        double a = 7.29735257E-3 ;
        btnd2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + a;
                textFieldDisplay.setText(value);
            }
        });
        btnd2.setBackground(new Color(135, 206, 250));
        btnd2.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnd2.setBounds(280, 110, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnd2);

        JButton btn3 = new JButton("re");
        double re = 2.817940327E-15 ;
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + re;
                textFieldDisplay.setText(value);
            }
        });
        btn3.setBackground(new Color(135, 206, 250));
        btn3.setFont(new Font("Tahoma", Font.BOLD, 13));
        btn3.setBounds(20, 150, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn3);

        JButton btna3 = new JButton("CW");
        double CW = 2.426310239E-12 ;
        btna3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + CW;
                textFieldDisplay.setText(value);
            }
        });
        btna3.setBackground(new Color(135, 206, 250));
        btna3.setFont(new Font("Tahoma", Font.BOLD, 15));
        btna3.setBounds(85, 150, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btna3);

        JButton btnb3 = new JButton("GRP");
        double GRP = 267522200.5 ;
        btnb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + GRP;
                textFieldDisplay.setText(value);
            }
        });
        btnb3.setBackground(new Color(135, 206, 250));
        btnb3.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnb3.setBounds(150, 150, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnb3);

        JButton btnc3 = new JButton("CWp");
        double CWp = 1.321409856E-15 ;
        btnc3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + CWp;
                textFieldDisplay.setText(value);
            }
        });
        btnc3.setBackground(new Color(135, 206, 250));
        btnc3.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnc3.setBounds(215, 150, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnc3);

        JButton btnd3 = new JButton("CWn");
        double CWn = 1.319590907 ;
        btnd3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + CWn;
                textFieldDisplay.setText(value);
            }
        });
        btnd3.setBackground(new Color(135, 206, 250));
        btnd3.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnd3.setBounds(280, 150, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnd3);


        JButton btn4 = new JButton("C");
        double C = 3E8 ;
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + C;
                textFieldDisplay.setText(value);
            }
        });
        btn4.setBackground(new Color(135, 206, 250));
        btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn4.setBounds(20, 190, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn4);

        JButton btna4 = new JButton("u");
        double u = 1.660538921E-27 ;
        btna4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + u;
                textFieldDisplay.setText(value);
            }
        });
        btna4.setBackground(new Color(135, 206, 250));
        btna4.setFont(new Font("Tahoma", Font.BOLD, 15));
        btna4.setBounds(85, 190, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btna4);

        JButton btnb4 = new JButton("up");
        double up = 1.410606743E-26 ;
        btnb4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + up;
                textFieldDisplay.setText(value);
            }
        });
        btnb4.setBackground(new Color(135, 206, 250));
        btnb4.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnb4.setBounds(150, 190, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnb4);

        JButton btnc4 = new JButton("ue");
        double ue = -9.2847643E-24 ;
        btnc4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + ue;
                textFieldDisplay.setText(value);
            }
        });
        btnc4.setBackground(new Color(135, 206, 250));
        btnc4.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnc4.setBounds(215, 190, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnc4);

        JButton btnd4 = new JButton("un");
        double un = -9.6623647E-27 ;
        btnd4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() +un;
                textFieldDisplay.setText(value);
            }
        });
        btnd4.setBackground(new Color(135, 206, 250));
        btnd4.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnd4.setBounds(280, 190, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnd4);


        JButton btn5 = new JButton("uu");
        double uu = -4.49044807E-26 ;
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + uu;
                textFieldDisplay.setText(value);
            }
        });
        btn5.setBackground(new Color(135, 206, 250));
        btn5.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn5.setBounds(20, 230, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn5);

        JButton btna5 = new JButton("F");
        double F= 96485.3365 ;
        btna5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + F;
                textFieldDisplay.setText(value);
            }
        });
        btna5.setBackground(new Color(135, 206, 250));
        btna5.setFont(new Font("Tahoma", Font.BOLD, 15));
        btna5.setBounds(85, 230, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btna5);

        JButton btnb5 = new JButton("e");
        double eC = 1.602176565E-19 ;
        btnb5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() +eC;
                textFieldDisplay.setText(value);
            }
        });
        btnb5.setBackground(new Color(135, 206, 250));
        btnb5.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnb5.setBounds(150, 230, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnb5);

        JButton btnc5 = new JButton("NA");
        double NA = 6.02214129E23 ;
        btnc5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() +NA;
                textFieldDisplay.setText(value);
            }
        });
        btnc5.setBackground(new Color(135, 206, 250));
        btnc5.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnc5.setBounds(215, 230, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnc5);

        JButton btnd5 = new JButton("k");
        double k = 1.3806488E-23 ;
        btnd5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + k;
                textFieldDisplay.setText(value);
            }
        });
        btnd5.setBackground(new Color(135, 206, 250));
        btnd5.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnd5.setBounds(280, 230, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnd5);


        JButton btn6 = new JButton("Vm");
        double Vm = 0.022710953 ;
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + Vm;
                textFieldDisplay.setText(value);
            }
        });
        btn6.setBackground(new Color(135, 206, 250));
        btn6.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn6.setBounds(20, 270, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn6);

        JButton btna6 = new JButton("R");
        double R = 8.3144621 ;
        btna6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + R;
                textFieldDisplay.setText(value);
            }
        });
        btna6.setBackground(new Color(135, 206, 250));
        btna6.setFont(new Font("Tahoma", Font.BOLD, 15));
        btna6.setBounds(85, 270, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btna6);

        JButton btnb6 = new JButton("C0");
        double C0 = 299792458 ;
        btnb6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + C0;
                textFieldDisplay.setText(value);
            }
        });
        btnb6.setBackground(new Color(135, 206, 250));
        btnb6.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnb6.setBounds(150, 270, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnb6);

        JButton btnc6 = new JButton("C1");
        double C1 = 3.74177153E-16 ;
        btnc6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + C1;
                textFieldDisplay.setText(value);
            }
        });
        btnc6.setBackground(new Color(135, 206, 250));
        btnc6.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnc6.setBounds(215, 270, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnc6);

        JButton btnd6 = new JButton("C2");
        double C2 = 1.438777E-2 ;
        btnd6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + C2;
                textFieldDisplay.setText(value);
            }
        });
        btnd6.setBackground(new Color(135, 206, 250));
        btnd6.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnd6.setBounds(280, 270, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnd6);


        JButton btn7 = new JButton("Stp");
        double Stp = 5.670373E-8 ;
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + Stp;
                textFieldDisplay.setText(value);
            }
        });
        btn7.setBackground(new Color(135, 206, 250));
        btn7.setFont(new Font("Tahoma", Font.BOLD, 13));
        btn7.setBounds(20, 310, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn7);

        JButton btna7 = new JButton("e0");
        double e0 = 8.854187817E-12 ;
        btna7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + e0;
                textFieldDisplay.setText(value);
            }
        });
        btna7.setBackground(new Color(135, 206, 250));
        btna7.setFont(new Font("Tahoma", Font.BOLD, 15));
        btna7.setBounds(85, 310, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btna7);

        JButton btnb7 = new JButton("u0");
        double u0 = 1.256637061E-12 ;
        btnb7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + u0;
                textFieldDisplay.setText(value);
            }
        });
        btnb7.setBackground(new Color(135, 206, 250));
        btnb7.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnb7.setBounds(150, 310, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnb7);

        JButton btnc7 = new JButton("QF");
        double QF = 2.067833758E-15 ;
        btnc7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + QF;
                textFieldDisplay.setText(value);
            }
        });
        btnc7.setBackground(new Color(135, 206, 250));
        btnc7.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnc7.setBounds(215, 310, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnc7);

        JButton btnd7 = new JButton("g");
        double g = 9.80665 ;
        btnd7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + g;
                textFieldDisplay.setText(value);
            }
        });
        btnd7.setBackground(new Color(135, 206, 250));
        btnd7.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnd7.setBounds(280, 310, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnd7);


        JButton btn8 = new JButton("G0");
        double G0 = 7.748091735E-5 ;
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + G0;
                textFieldDisplay.setText(value);
            }
        });
        btn8.setBackground(new Color(135, 206, 250));
        btn8.setFont(new Font("Tahoma", Font.BOLD, 13));
        btn8.setBounds(20, 350, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn8);

        JButton btna8 = new JButton("Z0");
        double Z0 = 376.7303    ;
        btna8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + Z0;
                textFieldDisplay.setText(value);
            }
        });
        btna8.setBackground(new Color(135, 206, 250));
        btna8.setFont(new Font("Tahoma", Font.BOLD, 12));
        btna8.setBounds(85, 350, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btna8);

        JButton btnb8 = new JButton("t");
        double t = 273.15 ;
        btnb8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + t;
                textFieldDisplay.setText(value);
            }
        });
        btnb8.setBackground(new Color(135, 206, 250));
        btnb8.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnb8.setBounds(150, 350, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnb8);

        JButton btnc8 = new JButton("G");
        double G = 6.67384E-11 ;
        btnc8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + G;
                textFieldDisplay.setText(value);
            }
        });
        btnc8.setBackground(new Color(135, 206, 250));
        btnc8.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnc8.setBounds(215, 350, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnc8);

        JButton btnd8 = new JButton("atm");
        double atm = 101325 ;
        btnd8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textFieldDisplay.setText(" ");
                String value = textFieldDisplay.getText() + atm;
                textFieldDisplay.setText(value);
            }
        });
        btnd8.setBackground(new Color(135, 206, 250));
        btnd8.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnd8.setBounds(280, 350, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnd8);
        
        JMenuBar menuBar = new JMenuBar();
        PhysicalConstanFframe.setJMenuBar(menuBar);
        
        JMenu mnNewMenu = new JMenu("Help");
        menuBar.add(mnNewMenu);
        
		/**
		 * Opening ReadMe file.
		 */
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Read Me");
        mntmNewMenuItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 try {
 			        Desktop desktop = null;
 			        if (Desktop.isDesktopSupported()) {
 			          desktop = Desktop.getDesktop();
 			        }

 			         desktop.open(new File("src/constants.pdf"));
 			         } catch (IOException ioe) {
 			        	 ioe.printStackTrace();
 			        	 }
        		
        	}
        });
        mnNewMenu.add(mntmNewMenuItem);



    }

}
