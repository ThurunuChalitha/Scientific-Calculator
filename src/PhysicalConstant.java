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
        PhysicalConstanFframe.setBounds(100, 100, 390, 517);
        PhysicalConstanFframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PhysicalConstanFframe.getContentPane().setLayout(null);

        textFieldDisplay = new JTextField();
        textFieldDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        textFieldDisplay.setBounds(10, 0, 356, 45);
        PhysicalConstanFframe.getContentPane().add(textFieldDisplay);
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
        PhysicalConstanFframe.getContentPane().add(btnLog);

        JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textFieldDisplay.getText() + btn7.getText();
                textFieldDisplay.setText(value);
            }
        });
    }
}
