import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhysicalConstant {


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
        PhysicalConstanFframe.setFont(new Font("Arial", Font.BOLD, 14));
        PhysicalConstanFframe.setTitle("Scientific Calculator");
        PhysicalConstanFframe.getContentPane().setBackground(new Color(0, 0, 0));
        PhysicalConstanFframe.setBounds(100, 100, 380, 430);
        PhysicalConstanFframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PhysicalConstanFframe.getContentPane().setLayout(null);

        textFieldDisplay = new JTextField();
        textFieldDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        textFieldDisplay.setBounds(10, 10, 346, 45);
        PhysicalConstanFframe.getContentPane().add(textFieldDisplay);
        textFieldDisplay.setColumns(10);

        JButton btn1 = new JButton("g");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btn1.getText();
                textFieldDisplay.setText(value);
            }
        });
        btn1.setBackground(new Color(135, 206, 250));
        btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn1.setBounds(20, 70, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn1);

        JButton btn1a = new JButton("mp");
        btn1a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btn1a.getText();
                textFieldDisplay.setText(value);
            }
        });
        btn1a.setBackground(new Color(135, 206, 250));
        btn1a.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn1a.setBounds(85, 70, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn1a);

        JButton btn1b = new JButton("mn");
        btn1b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btn1b.getText();
                textFieldDisplay.setText(value);
            }
        });
        btn1b.setBackground(new Color(135, 206, 250));
        btn1b.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn1b.setBounds(150, 70, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn1b);

        JButton btn1c = new JButton("me");
        btn1c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btn1c.getText();
                textFieldDisplay.setText(value);
            }
        });
        btn1c.setBackground(new Color(135, 206, 250));
        btn1c.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn1c.setBounds(215, 70, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn1c);

        JButton btn1d = new JButton("um");
        btn1d.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btn1d.getText();
                textFieldDisplay.setText(value);
            }
        });
        btn1d.setBackground(new Color(135, 206, 250));
        btn1d.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn1d.setBounds(280, 70, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn1d);



        JButton btn2 = new JButton("a0");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btn2.getText();
                textFieldDisplay.setText(value);
            }
        });
        btn2.setBackground(new Color(135, 206, 250));
        btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn2.setBounds(20, 110, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn2);

        JButton btna2 = new JButton("h");
        btna2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btna2.getText();
                textFieldDisplay.setText(value);
            }
        });
        btna2.setBackground(new Color(135, 206, 250));
        btna2.setFont(new Font("Tahoma", Font.BOLD, 15));
        btna2.setBounds(85, 110, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btna2);

        JButton btnb2 = new JButton("uN");
        btnb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btnb2.getText();
                textFieldDisplay.setText(value);
            }
        });
        btnb2.setBackground(new Color(135, 206, 250));
        btnb2.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnb2.setBounds(150, 110, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnb2);

        JButton btnc2 = new JButton("uB");
        btnc2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btnc2.getText();
                textFieldDisplay.setText(value);
            }
        });
        btnc2.setBackground(new Color(135, 206, 250));
        btnc2.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnc2.setBounds(215, 110, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnc2);

        JButton btnd2 = new JButton("re");
        btnd2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btnd2.getText();
                textFieldDisplay.setText(value);
            }
        });
        btnd2.setBackground(new Color(135, 206, 250));
        btnd2.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnd2.setBounds(280, 110, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnd2);

        JButton btn3 = new JButton("atm");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btn2.getText();
                textFieldDisplay.setText(value);
            }
        });
        btn3.setBackground(new Color(135, 206, 250));
        btn3.setFont(new Font("Tahoma", Font.BOLD, 13));
        btn3.setBounds(20, 150, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn3);

        JButton btna3 = new JButton("bar");
        btna3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btna3.getText();
                textFieldDisplay.setText(value);
            }
        });
        btna3.setBackground(new Color(135, 206, 250));
        btna3.setFont(new Font("Tahoma", Font.BOLD, 15));
        btna3.setBounds(85, 150, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btna3);

        JButton btnb3 = new JButton("G");
        btnb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btnb3.getText();
                textFieldDisplay.setText(value);
            }
        });
        btnb3.setBackground(new Color(135, 206, 250));
        btnb3.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnb3.setBounds(150, 150, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnb3);

        JButton btnc3 = new JButton("t");
        btnc3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btnc3.getText();
                textFieldDisplay.setText(value);
            }
        });
        btnc3.setBackground(new Color(135, 206, 250));
        btnc3.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnc3.setBounds(215, 150, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnc3);

        JButton btnd3 = new JButton("u0");
        btnd3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btnd3.getText();
                textFieldDisplay.setText(value);
            }
        });
        btnd3.setBackground(new Color(135, 206, 250));
        btnd3.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnd3.setBounds(280, 150, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnd3);


        JButton btn4 = new JButton("e0");
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btn4.getText();
                textFieldDisplay.setText(value);
            }
        });
        btn4.setBackground(new Color(135, 206, 250));
        btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn4.setBounds(20, 190, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn4);

        JButton btna4 = new JButton("z0");
        btna4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btna4.getText();
                textFieldDisplay.setText(value);
            }
        });
        btna4.setBackground(new Color(135, 206, 250));
        btna4.setFont(new Font("Tahoma", Font.BOLD, 15));
        btna4.setBounds(85, 190, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btna4);

        JButton btnb4 = new JButton("F");
        btnb4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btnb4.getText();
                textFieldDisplay.setText(value);
            }
        });
        btnb4.setBackground(new Color(135, 206, 250));
        btnb4.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnb4.setBounds(150, 190, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnb4);

        JButton btnc4 = new JButton("up");
        btnc4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btnc4.getText();
                textFieldDisplay.setText(value);
            }
        });
        btnc4.setBackground(new Color(135, 206, 250));
        btnc4.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnc4.setBounds(215, 190, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnc4);

        JButton btnd4 = new JButton("ue");
        btnd4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btnd4.getText();
                textFieldDisplay.setText(value);
            }
        });
        btnd4.setBackground(new Color(135, 206, 250));
        btnd4.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnd4.setBounds(280, 190, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnd4);


        JButton btn5 = new JButton("un");
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btn5.getText();
                textFieldDisplay.setText(value);
            }
        });
        btn5.setBackground(new Color(135, 206, 250));
        btn5.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn5.setBounds(20, 230, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn5);

        JButton btna5 = new JButton("uu");
        btna5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btna5.getText();
                textFieldDisplay.setText(value);
            }
        });
        btna5.setBackground(new Color(135, 206, 250));
        btna5.setFont(new Font("Tahoma", Font.BOLD, 15));
        btna5.setBounds(85, 230, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btna5);

        JButton btnb5 = new JButton("e");
        btnb5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btnb5.getText();
                textFieldDisplay.setText(value);
            }
        });
        btnb5.setBackground(new Color(135, 206, 250));
        btnb5.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnb5.setBounds(150, 230, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnb5);

        JButton btnc5 = new JButton("ste");
        btnc5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btnc5.getText();
                textFieldDisplay.setText(value);
            }
        });
        btnc5.setBackground(new Color(135, 206, 250));
        btnc5.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnc5.setBounds(215, 230, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnc5);

        JButton btnd5 = new JButton("c");
        btnd5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btnd5.getText();
                textFieldDisplay.setText(value);
            }
        });
        btnd5.setBackground(new Color(135, 206, 250));
        btnd5.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnd5.setBounds(280, 230, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnd5);


        JButton btn6 = new JButton("k");
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btn6.getText();
                textFieldDisplay.setText(value);
            }
        });
        btn6.setBackground(new Color(135, 206, 250));
        btn6.setFont(new Font("Tahoma", Font.BOLD, 15));
        btn6.setBounds(20, 270, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn6);

        JButton btna6 = new JButton("c1");
        btna6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btna6.getText();
                textFieldDisplay.setText(value);
            }
        });
        btna6.setBackground(new Color(135, 206, 250));
        btna6.setFont(new Font("Tahoma", Font.BOLD, 15));
        btna6.setBounds(85, 270, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btna6);

        JButton btnb6 = new JButton("c2");
        btnb6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btnb6.getText();
                textFieldDisplay.setText(value);
            }
        });
        btnb6.setBackground(new Color(135, 206, 250));
        btnb6.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnb6.setBounds(150, 270, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnb6);

        JButton btnc6 = new JButton("G0");
        btnc6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btnc6.getText();
                textFieldDisplay.setText(value);
            }
        });
        btnc6.setBackground(new Color(135, 206, 250));
        btnc6.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnc6.setBounds(215, 270, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnc6);

        JButton btnd6 = new JButton("eV");
        btnd6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btnd6.getText();
                textFieldDisplay.setText(value);
            }
        });
        btnd6.setBackground(new Color(135, 206, 250));
        btnd6.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnd6.setBounds(280, 270, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnd6);


        JButton btn7 = new JButton("Kcd");
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btn7.getText();
                textFieldDisplay.setText(value);
            }
        });
        btn7.setBackground(new Color(135, 206, 250));
        btn7.setFont(new Font("Tahoma", Font.BOLD, 13));
        btn7.setBounds(20, 310, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btn7);

        JButton btna7 = new JButton("b");
        btna7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btna7.getText();
                textFieldDisplay.setText(value);
            }
        });
        btna7.setBackground(new Color(135, 206, 250));
        btna7.setFont(new Font("Tahoma", Font.BOLD, 15));
        btna7.setBounds(85, 310, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btna7);

        JButton btnb7 = new JButton("R");
        btnb7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btnb7.getText();
                textFieldDisplay.setText(value);
            }
        });
        btnb7.setBackground(new Color(135, 206, 250));
        btnb7.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnb7.setBounds(150, 310, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnb7);

        JButton btnc7 = new JButton("a^-1");
        btnc7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btnc7.getText();
                textFieldDisplay.setText(value);
            }
        });
        btnc7.setBackground(new Color(135, 206, 250));
        btnc7.setFont(new Font("Tahoma", Font.BOLD, 9));
        btnc7.setBounds(215, 310, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnc7);

        JButton btnd7 = new JButton("a");
        btnd7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btnd7.getText();
                textFieldDisplay.setText(value);
            }
        });
        btnd7.setBackground(new Color(135, 206, 250));
        btnd7.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnd7.setBounds(280, 310, 60, 28);
        PhysicalConstanFframe.getContentPane().add(btnd7);




    }
}
