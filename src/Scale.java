import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Scale {

	private JFrame frmWeightmain;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scale window = new Scale();
					window.frmWeightmain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Scale() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWeightmain = new JFrame();
		frmWeightmain.setTitle("Weightmain");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		frmWeightmain.setSize(width, height);
		frmWeightmain.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Eclipse\\WorkSpace\\Uniteconversion\\src\\img\\Inkeddownload_LI.jpg"));
		//frmScaleamain.setBounds(100, 100, 450, 300);
		frmWeightmain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWeightmain.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Weight Unite Conversion");
		lblNewLabel.setBounds(453, 43, 616, 104);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 44));
		frmWeightmain.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1538, 147);
		panel.setBackground(new Color(135, 206, 235));
		frmWeightmain.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnBack = new JButton("<Back");
		btnBack.setBounds(127, 740, 193, 42);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmWeightmain.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 24));
		frmWeightmain.getContentPane().add(btnBack);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 235));
		panel_1.setBounds(0, 694, 1538, 133);
		frmWeightmain.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNext = new JButton("Exit");
		btnNext.setForeground(Color.RED);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNext.setBounds(1246, 40, 193, 42);
		panel_1.add(btnNext);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char d = e.getKeyChar();
				if(!Character.isDigit(d)) {
					e.consume();
				}
			}
		});
		textField.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField.setBounds(96, 205, 161, 25);
		frmWeightmain.getContentPane().add(textField);
		
		JButton btnNewButton_2_1 = new JButton("Convert");
		btnNewButton_2_1.setForeground(Color.GREEN);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long heightInCms = Integer.parseInt(textField.getText());
				double roughTon = heightInCms*1000;
				
				long Kg = (long) (roughTon);
				
				textField_1.setText(Kg + "");
				
				//convert Tonne to UsTon
				double roughUsTon = heightInCms;
				
				long UsTon = (long) (roughUsTon*1.102);
				
				
				textField_3.setText(UsTon + "");
				
				
				//convert Tonne to Stone
				double roughStone = heightInCms;
				
				long Stone = (long) (roughStone*1000);
				
				
				textField_7.setText(Stone + "");
				
				
				//convert Tonne to Pound
				double roughPound = heightInCms;
				
				long Pound = (long) (roughPound*2204);
				
				
				textField_5.setText(Pound + "");
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2_1.setBounds(114, 258, 126, 33);
		frmWeightmain.getContentPane().add(btnNewButton_2_1);
		
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
		textField_1.setColumns(10);
		textField_1.setBounds(96, 341, 161, 25);
		frmWeightmain.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Input(Ton)");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(114, 179, 126, 25);
		frmWeightmain.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Output(Kg)");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(267, 341, 184, 25);
		frmWeightmain.getContentPane().add(lblNewLabel_1_1_1);
		
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
		textField_3.setBounds(96, 376, 161, 25);
		frmWeightmain.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Output(US.Ton)");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(267, 376, 184, 25);
		frmWeightmain.getContentPane().add(lblNewLabel_1_1_1_1);
		
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
		textField_5.setBounds(96, 446, 161, 25);
		frmWeightmain.getContentPane().add(textField_5);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Output(Pound)");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_2.setBounds(267, 446, 184, 25);
		frmWeightmain.getContentPane().add(lblNewLabel_1_1_1_2);
		
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
		textField_7.setBounds(96, 411, 161, 25);
		frmWeightmain.getContentPane().add(textField_7);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Output(Stone)");
		lblNewLabel_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_3.setBounds(267, 411, 184, 25);
		frmWeightmain.getContentPane().add(lblNewLabel_1_1_1_3);
		
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
		textField_2.setBounds(472, 205, 161, 25);
		frmWeightmain.getContentPane().add(textField_2);
		
		JButton btnNewButton_2_1_1 = new JButton("Convert");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//convert kg to gram
				
				long heightInCms = Integer.parseInt(textField_2.getText());
				double roughM = heightInCms*1000;
				
				long Cm = (long) (roughM);
				
				textField_4.setText(Cm + "");
				
				
				//convert kg to Pound
				double roughPound = heightInCms*2.2;
				
				long Pound = (long) (roughPound);
				
				textField_6.setText(Pound + "");
				//convert kg to Ounce
				double roughOunce = heightInCms*35.2;
				
				long Ounce = (long) (roughOunce);
				
				textField_8.setText(Ounce + "");
				
			}
		});
		btnNewButton_2_1_1.setForeground(Color.GREEN);
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2_1_1.setBounds(490, 258, 126, 33);
		frmWeightmain.getContentPane().add(btnNewButton_2_1_1);
		
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
		textField_4.setBounds(472, 341, 161, 25);
		frmWeightmain.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Input(Kg)");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1.setBounds(490, 179, 126, 25);
		frmWeightmain.getContentPane().add(lblNewLabel_1_2_1);
		
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
		textField_6.setBounds(472, 376, 161, 25);
		frmWeightmain.getContentPane().add(textField_6);
		
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
		textField_8.setBounds(472, 411, 161, 25);
		frmWeightmain.getContentPane().add(textField_8);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("Output(Gram)");
		lblNewLabel_1_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_4.setBounds(643, 341, 184, 25);
		frmWeightmain.getContentPane().add(lblNewLabel_1_1_1_4);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Output(Pound)");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1.setBounds(643, 376, 184, 25);
		frmWeightmain.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Output(Ounce)");
		lblNewLabel_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_2_1.setBounds(643, 411, 184, 25);
		frmWeightmain.getContentPane().add(lblNewLabel_1_1_1_2_1);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char d = e.getKeyChar();
				if(!Character.isDigit(d)) {
					e.consume();
				}
			}
		});
		textField_9.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_9.setBounds(855, 205, 161, 25);
		frmWeightmain.getContentPane().add(textField_9);
		
		JButton btnNewButton_2_1_2 = new JButton("Convert");
		btnNewButton_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				long heightInCms = Integer.parseInt(textField_9.getText());
				//convert uston to ton
				double roughTon = heightInCms/1.102;
				
				long ton = (long) (roughTon);
				
				textField_10.setText(ton + "");
				
				
				//convert uston to Stone
				double roughStone = heightInCms;
				
				long Stone = (long) (roughStone*143);
				
				
				textField_11.setText(Stone + "");
				
				
				//convert uston to Pounds
				double roughPounds = heightInCms;
				
				long Pounds = (long) (roughPounds*2000);
				
				
				textField_13.setText(Pounds + "");
				
				
				//convert uston to Ounces
				double roughOunces = heightInCms;
				
				long Ounces = (long) (roughOunces*32000);
				
				
				textField_12.setText(Ounces + "");
			}
		});
		btnNewButton_2_1_2.setForeground(Color.GREEN);
		btnNewButton_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2_1_2.setBounds(873, 258, 126, 33);
		frmWeightmain.getContentPane().add(btnNewButton_2_1_2);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		textField_10.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_10.setColumns(10);
		textField_10.setBounds(855, 341, 161, 25);
		frmWeightmain.getContentPane().add(textField_10);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Input(Us.Ton)");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_2.setBounds(873, 179, 126, 25);
		frmWeightmain.getContentPane().add(lblNewLabel_1_2_2);
		
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
		textField_11.setBounds(855, 376, 161, 25);
		frmWeightmain.getContentPane().add(textField_11);
		
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
		textField_12.setBounds(855, 446, 161, 25);
		frmWeightmain.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		textField_13.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_13.setColumns(10);
		textField_13.setBounds(855, 411, 161, 25);
		frmWeightmain.getContentPane().add(textField_13);
		
		JLabel lblNewLabel_1_1_1_5 = new JLabel("Output(Ounce)");
		lblNewLabel_1_1_1_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_5.setBounds(1026, 446, 161, 25);
		frmWeightmain.getContentPane().add(lblNewLabel_1_1_1_5);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Output(Ton)");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_2.setBounds(1026, 341, 141, 25);
		frmWeightmain.getContentPane().add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3_1 = new JLabel("Output(Stone)");
		lblNewLabel_1_1_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_3_1.setBounds(1026, 376, 161, 25);
		frmWeightmain.getContentPane().add(lblNewLabel_1_1_1_3_1);
		
		JLabel lblNewLabel_1_1_1_2_2 = new JLabel("Output(Pound)");
		lblNewLabel_1_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_2_2.setBounds(1026, 411, 153, 25);
		frmWeightmain.getContentPane().add(lblNewLabel_1_1_1_2_2);
		
		textField_14 = new JTextField();
		textField_14.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char d = e.getKeyChar();
				if(!Character.isDigit(d)) {
					e.consume();
				}
			}
		});
		textField_14.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_14.setBounds(1213, 205, 161, 25);
		frmWeightmain.getContentPane().add(textField_14);
		
		JButton btnNewButton_2_1_2_1 = new JButton("Convert");
		btnNewButton_2_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int heightInCms = Integer.parseInt(textField_14.getText());
				//convert Stone to Kg
				double roughKg = heightInCms*6.35;
				
				int Kg = (int) (roughKg);
				
				textField_15.setText(Kg + "");
				
				
				//convert Stone to g
				double roughg = heightInCms;
				
				int g = (int) (roughg*6350);
				
				
				textField_16.setText(g + "");
				
				
				//convert Stone to Pound
				double roughPound = heightInCms;
				
				int Pound = (int) (roughPound*14);
				
				
				textField_18.setText(Pound + "");
				
				
				//convert uston to Ounces
				double roughOunces = heightInCms;
				
				int Ounces = (int) (roughOunces*224);
				
				
				textField_17.setText(Ounces + "");
			}
		});
		btnNewButton_2_1_2_1.setForeground(Color.GREEN);
		btnNewButton_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2_1_2_1.setBounds(1231, 258, 126, 33);
		frmWeightmain.getContentPane().add(btnNewButton_2_1_2_1);
		
		textField_15 = new JTextField();
		textField_15.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		textField_15.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_15.setColumns(10);
		textField_15.setBounds(1213, 341, 161, 25);
		frmWeightmain.getContentPane().add(textField_15);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Input(Stone)");
		lblNewLabel_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_2_1.setBounds(1231, 179, 126, 25);
		frmWeightmain.getContentPane().add(lblNewLabel_1_2_2_1);
		
		textField_16 = new JTextField();
		textField_16.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		textField_16.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_16.setColumns(10);
		textField_16.setBounds(1213, 376, 161, 25);
		frmWeightmain.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		textField_17.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_17.setColumns(10);
		textField_17.setBounds(1213, 446, 161, 25);
		frmWeightmain.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		textField_18.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textField_18.setColumns(10);
		textField_18.setBounds(1213, 411, 161, 25);
		frmWeightmain.getContentPane().add(textField_18);
		
		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("Output(Kg)");
		lblNewLabel_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_2_1.setBounds(1384, 341, 184, 25);
		frmWeightmain.getContentPane().add(lblNewLabel_1_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_2_2 = new JLabel("Output(Gram)");
		lblNewLabel_1_1_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_2_2.setBounds(1384, 376, 184, 25);
		frmWeightmain.getContentPane().add(lblNewLabel_1_1_1_1_2_2);
		
		JLabel lblNewLabel_1_1_1_1_2_3 = new JLabel("Output(Pound)");
		lblNewLabel_1_1_1_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_2_3.setBounds(1384, 411, 184, 25);
		frmWeightmain.getContentPane().add(lblNewLabel_1_1_1_1_2_3);
		
		JLabel lblNewLabel_1_1_1_1_2_4 = new JLabel("Output(Ounces)");
		lblNewLabel_1_1_1_1_2_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_2_4.setBounds(1384, 446, 184, 25);
		frmWeightmain.getContentPane().add(lblNewLabel_1_1_1_1_2_4);
		
		
		
		
	}
}
