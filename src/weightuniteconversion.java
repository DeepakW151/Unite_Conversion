import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class weightuniteconversion {

	private JFrame frmWeightAndScale;
	private JTextField textField;
	private JPasswordField passwordField;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					weightuniteconversion window = new weightuniteconversion();
					window.frmWeightAndScale.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public weightuniteconversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWeightAndScale = new JFrame();
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		frmWeightAndScale.setSize(width/2, height/2);
		frmWeightAndScale.setLocationRelativeTo(null);
		frmWeightAndScale.setIconImage(Toolkit.getDefaultToolkit().getImage("src\\Inkeddownload_LI.jpg"));
		frmWeightAndScale.setTitle("Weight and Scale Conversion");
		frmWeightAndScale.setResizable(false);
		//frmWeightAndScale.setBounds(100, 100, 838, 539);
		frmWeightAndScale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWeightAndScale.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(268, 68, 217, 138);
		lblNewLabel_1.setIcon(new ImageIcon("src\\Inkeddownload_LI.jpg"));
		frmWeightAndScale.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 103, 734, 2);
		frmWeightAndScale.getContentPane().add(separator);
		
		textField = new JTextField();
		textField.setBounds(268, 246, 217, 20);
		frmWeightAndScale.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setBounds(268, 227, 110, 20);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmWeightAndScale.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(268, 295, 217, 20);
		passwordField.setEchoChar('*');
		frmWeightAndScale.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setBounds(268, 276, 110, 20);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmWeightAndScale.getContentPane().add(lblNewLabel_2_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 333, 734, 2);
		frmWeightAndScale.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(299, 344, 155, 41);
		btnNewButton.setForeground(new Color(0, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Username = textField.getText();
				String Password = passwordField.getText();
				
				//System.out.println(Username + Password);
				
				if(Username.equals("Deepak")) {
					if(Password.equals("1234"))
					//System.out.println("successfully login");
					Home.main(null);
					else {
						JOptionPane.showMessageDialog(null, "invalid Password Try again...");
					}
				}else {
					JOptionPane.showMessageDialog(null, "invalid Username or password...");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 16));
		frmWeightAndScale.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(77, 344, 155, 40);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField.setText(null);
				
			}
		});
		btnReset.setFont(new Font("Arial Black", Font.PLAIN, 16));
		frmWeightAndScale.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(544, 345, 155, 40);
		btnExit.setForeground(new Color(255, 0, 0));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.PLAIN, 16));
		frmWeightAndScale.getContentPane().add(btnExit);
		panel.setBounds(0, 0, 754, 105);
		panel.setBackground(new Color(135, 206, 235));
		frmWeightAndScale.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Weight and Scale");
		lblNewLabel.setBounds(117, -12, 550, 66);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton_1 = new JButton("About");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aboutmain.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.setBounds(678, 61, 66, 34);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Conversion");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 24));
		lblNewLabel_3.setBounds(266, 29, 221, 48);
		panel.add(lblNewLabel_3);
	}
}
