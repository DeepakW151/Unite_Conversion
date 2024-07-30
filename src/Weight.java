import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Weight {

	private JFrame frmScalemainpage;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Weight window = new Weight();
					window.frmScalemainpage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Weight() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmScalemainpage = new JFrame();
		frmScalemainpage.setResizable(false);
		frmScalemainpage.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Eclipse\\WorkSpace\\Uniteconversion\\src\\img\\Inkeddownload_LI.jpg"));
		frmScalemainpage.setTitle("Scalemainpage");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		frmScalemainpage.setSize(width, height);
		frmScalemainpage.setLocationRelativeTo(null);
		//frmWeightmainpage.setBounds(100, 100, 450, 300);
		frmScalemainpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmScalemainpage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scale Unite Conversion");
		lblNewLabel.setBounds(453, 43, 616, 104);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 44));
		frmScalemainpage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 149, 1502, 2);
		frmScalemainpage.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 694, 1502, 2);
		frmScalemainpage.getContentPane().add(separator_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1538, 147);
		panel.setBackground(new Color(135, 206, 235));
		frmScalemainpage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnBack = new JButton("<Back");
		btnBack.setBounds(127, 740, 193, 42);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmScalemainpage.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 24));
		frmScalemainpage.getContentPane().add(btnBack);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 235));
		panel_1.setBounds(0, 694, 1522, 133);
		frmScalemainpage.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNext = new JButton("Exit");
		btnNext.setForeground(Color.RED);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNext.setBounds(1246, 47, 193, 42);
		panel_1.add(btnNext);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		textField_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_1.setBounds(127, 265, 161, 25);
		frmScalemainpage.getContentPane().add(textField_1);
		
		JButton btnNewButton_2 = new JButton("Convert");
		btnNewButton_2.setForeground(Color.GREEN);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//convert Km to hecto meter
				long heightInCms = Integer.parseInt(textField_1.getText());
				double roughKm = heightInCms;
				
				long feet = (long) (roughKm*10);
				
				
				textField.setText(feet + "");
				//convert km to meter
				double roughmeter = heightInCms;
				
				long Meter = (long) (roughmeter*1000);
				
				
				textField_3.setText(Meter + "");
				//convert km to Centimeter
				double roughCm = heightInCms;
				
				long Cm = (long) (roughCm*100000);
				
				
				textField_5.setText(Cm + "");
				//convert km to foot
				double roughfoot = heightInCms;
				
				long foot = (long) (roughfoot*3281);
				
				
				textField_7.setText(foot + "");
				//convert km to Inch
				double roughInch = heightInCms;
				
				long Inch = (long) (roughInch*39370);
				
				
				textField_9.setText(Inch + "");
				
				
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(145, 310, 126, 33);
		frmScalemainpage.getContentPane().add(btnNewButton_2);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		textField.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField.setBounds(127, 393, 161, 25);
		frmScalemainpage.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Input(Km)");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(145, 230, 126, 25);
		frmScalemainpage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Output(Hectometer)");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(298, 393, 193, 25);
		frmScalemainpage.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Output(Meter)");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(298, 428, 137, 25);
		frmScalemainpage.getContentPane().add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		textField_3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(127, 428, 161, 25);
		frmScalemainpage.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Output(Centimeter)");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(298, 468, 184, 25);
		frmScalemainpage.getContentPane().add(lblNewLabel_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		textField_5.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(127, 468, 161, 25);
		frmScalemainpage.getContentPane().add(textField_5);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Output(Foot)");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_2.setBounds(298, 503, 137, 25);
		frmScalemainpage.getContentPane().add(lblNewLabel_1_1_1_2);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		textField_7.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(127, 503, 161, 25);
		frmScalemainpage.getContentPane().add(textField_7);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Output(Inch)");
		lblNewLabel_1_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_3.setBounds(298, 535, 137, 25);
		frmScalemainpage.getContentPane().add(lblNewLabel_1_1_1_3);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		textField_9.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_9.setColumns(10);
		textField_9.setBounds(127, 535, 161, 25);
		frmScalemainpage.getContentPane().add(textField_9);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char d = e.getKeyChar();
				if(!Character.isDigit(d)) {
					e.consume();
				}
				
			}
		});
		textField_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_2.setBounds(690, 265, 161, 25);
		frmScalemainpage.getContentPane().add(textField_2);
		
		JButton btnNewButton_2_1 = new JButton("Convert");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//convert M to cm
				long heightInCms = Integer.parseInt(textField_2.getText());
				double roughM = heightInCms*100;
				
				long Cm = (long) (roughM);
				
				textField_4.setText(Cm + "");
				
				
				//convert M to Foot
				double roughFoot = heightInCms;
				
				long Foot = (long) (roughFoot*3.28084);
				
				
				textField_6.setText(Foot + "");
				//convert M to Inch
				double roughInch = heightInCms;
				
				long Inch = (long) (roughInch*39.3701);
				
				
				textField_8.setText(Inch + "");
			}
		});
		btnNewButton_2_1.setForeground(Color.GREEN);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2_1.setBounds(708, 310, 126, 33);
		frmScalemainpage.getContentPane().add(btnNewButton_2_1);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		textField_4.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(690, 393, 161, 25);
		frmScalemainpage.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_1_2 = new JLabel("Input(M)");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(708, 230, 126, 25);
		frmScalemainpage.getContentPane().add(lblNewLabel_1_2);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		textField_6.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(690, 428, 161, 25);
		frmScalemainpage.getContentPane().add(textField_6);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		textField_8.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(690, 468, 161, 25);
		frmScalemainpage.getContentPane().add(textField_8);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Output(Cm)");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_2.setBounds(861, 393, 184, 25);
		frmScalemainpage.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("Output(Foot)");
		lblNewLabel_1_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_4.setBounds(861, 428, 184, 25);
		frmScalemainpage.getContentPane().add(lblNewLabel_1_1_1_4);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Output(Inch)");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_2_1.setBounds(861, 468, 184, 25);
		frmScalemainpage.getContentPane().add(lblNewLabel_1_1_2_1);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char d = e.getKeyChar();
				if(!Character.isDigit(d)) {
					e.consume();
				}
			}
		});
		textField_10.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_10.setBounds(1098, 256, 161, 25);
		frmScalemainpage.getContentPane().add(textField_10);
		
		JButton btnNewButton_2_1_1 = new JButton("Convert");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long heightInCms = Integer.parseInt(textField_10.getText());
				double roughCm = heightInCms*10;
				
				long Milimeter = (long) (roughCm);
				
				textField_11.setText(Milimeter + "");
				
				//convert cm to micrometer
				
				double roughmicrometer = heightInCms;
				
				long micrometer = (long) (roughmicrometer*10000);
				
				
				textField_12.setText(micrometer + "");
			}
		});
		btnNewButton_2_1_1.setForeground(Color.GREEN);
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2_1_1.setBounds(1116, 309, 126, 33);
		frmScalemainpage.getContentPane().add(btnNewButton_2_1_1);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		textField_11.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_11.setColumns(10);
		textField_11.setBounds(1098, 392, 161, 25);
		frmScalemainpage.getContentPane().add(textField_11);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Input(Cm)");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1.setBounds(1116, 230, 126, 25);
		frmScalemainpage.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_1_5 = new JLabel("Output(Milimeter)");
		lblNewLabel_1_1_1_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_5.setBounds(1266, 392, 184, 25);
		frmScalemainpage.getContentPane().add(lblNewLabel_1_1_1_5);
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		textField_12.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_12.setColumns(10);
		textField_12.setBounds(1098, 427, 161, 25);
		frmScalemainpage.getContentPane().add(textField_12);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Output(Micrometer)");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1.setBounds(1266, 427, 184, 25);
		frmScalemainpage.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		
		
	}
}
