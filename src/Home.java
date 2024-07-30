import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class Home {

	private JFrame frmWeightAndScale;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWeightAndScale = new JFrame();
		frmWeightAndScale.setResizable(false);
		frmWeightAndScale.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\STUDY\\Github_Projects\\Unite_Conversion\\src\\img\\Inkeddownload_LI.jpg"));
		frmWeightAndScale.setTitle("Weight and Scale Conversion (Home)");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		frmWeightAndScale.setSize(width, height);
		frmWeightAndScale.setLocationRelativeTo(null);
		//frmWeightAndScale.setBounds(100, 100, 450, 300);
		frmWeightAndScale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWeightAndScale.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 140, 1502, 2);
		frmWeightAndScale.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Select the conversion");
		lblNewLabel_1.setBounds(488, 167, 545, 64);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 34));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		frmWeightAndScale.getContentPane().add(lblNewLabel_1);
		
		JButton lblWeight = new JButton("Weight");
		lblWeight.setBounds(127, 265, 258, 56);
		lblWeight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 Scale.main(null);
				
			}
		});
		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblWeight.setHorizontalAlignment(SwingConstants.CENTER);
		frmWeightAndScale.getContentPane().add(lblWeight);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 706, 1502, 2);
		frmWeightAndScale.getContentPane().add(separator_1);
		
		JButton btnScale = new JButton("");
		btnScale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Weight.main(null);
			}
		});
		btnScale.setBounds(1200, 331, 258, 247);
		btnScale.setHorizontalAlignment(SwingConstants.CENTER);
		btnScale.setIcon(new ImageIcon("D:\\STUDY\\Github_Projects\\Unite_Conversion\\src\\img\\Scale.png"));
		frmWeightAndScale.getContentPane().add(btnScale);
		
		JButton btnWeight = new JButton("");
		btnWeight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scale.main(null);
			}
		});
		btnWeight.setBounds(127, 331, 258, 247);
		btnWeight.setHorizontalAlignment(SwingConstants.CENTER);
		btnWeight.setIcon(new ImageIcon("D:\\STUDY\\Github_Projects\\Unite_Conversion\\src\\img\\weight.png"));
		frmWeightAndScale.getContentPane().add(btnWeight);
		
		JButton btnBack = new JButton("<Back");
		btnBack.setBounds(127, 740, 193, 42);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmWeightAndScale.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 24));
		frmWeightAndScale.getContentPane().add(btnBack);
		
		JButton lblNewLabel_4 = new JButton("Scale");
		lblNewLabel_4.setBounds(1200, 265, 258, 56);
		lblNewLabel_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Weight.main(null);
			}
		});
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		frmWeightAndScale.getContentPane().add(lblNewLabel_4);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(1200, 740, 193, 42);
		btnExit.setForeground(Color.RED);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 24));
		frmWeightAndScale.getContentPane().add(btnExit);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		panel.setBounds(0, 0, 1534, 142);
		frmWeightAndScale.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnLogout = new JButton("");
		btnLogout.setBounds(1437, 20, 73, 65);
		btnLogout.setIcon(new ImageIcon("D:\\STUDY\\Github_Projects\\Unite_Conversion\\src\\img\\logout.png"));
		panel.add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmWeightAndScale.setVisible(false);
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JLabel lblNewLabel = new JLabel("Weight and Scale Conversion");
		lblNewLabel.setBounds(386, 0, 762, 142);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 44));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnBack_1 = new JButton("");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aboutmain.main(null);
			}
		});
		btnBack_1.setIcon(new ImageIcon("D:\\STUDY\\Github_Projects\\Unite_Conversion\\src\\img\\info.png"));
		btnBack_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnBack_1.setBounds(10, 10, 37, 28);
		panel.add(btnBack_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 235));
		panel_1.setBounds(0, 706, 1522, 121);
		frmWeightAndScale.getContentPane().add(panel_1);
		panel_1.setLayout(null);
	}
}

