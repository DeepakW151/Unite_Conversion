import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Aboutmain {

	private JFrame frmAboutMainPage;
	private final JLabel lblNewLabel = new JLabel("Weight and Scale conversion");
	private final JLabel lblNewLabel_1 = new JLabel("Weight and Scale conversion is most used unite converter\r\n.");
	private final JLabel lblNewLabel_2 = new JLabel("The Calculator Site was built to provide you with helpful ");
	private final JLabel lblNewLabel_1_1 = new JLabel("calculation and converter tools for every day use. Whether you're looking");
	private final JLabel lblNewLabel_1_1_1 = new JLabel(" to work out the compound interest on your \r\n");
	private final JLabel lblNewLabel_1_1_2 = new JLabel("saving, convert between two metric or imperial measurement \r\n");
	private final JLabel lblNewLabel_1_1_2_1 = new JLabel("units or calculate your BMI, The Calculator Site has \r\n\r\n");
	private final JLabel lblNewLabel_1_1_2_1_1 = new JLabel("tools to help");
	private final JLabel lblFeedback = new JLabel("Feedback");
	private final JLabel lblNewLabel_1_2 = new JLabel("We always love to hear feedback about our website. Whether you would like to make a suggestion of an extra unit");
	private final JLabel lblNewLabel_1_2_1 = new JLabel("or category of conversion that you would like to see, or whether you have any ideas on how to make the site better ");
	private final JLabel lblNewLabel_1_2_1_1 = new JLabel("for you, please get in contact with us make the site better for you, please get in contact with us");
	private final JButton btnNewButton = new JButton("Back");
	private final JLabel lblNewLabel_3_1_2_2 = new JLabel("deepakwadgane15@gmail.com");
	private final JLabel lblNewLabel_3_1_2_3 = new JLabel("Contact No. -");
	private final JLabel lblNewLabel_3_1_2_3_1 = new JLabel("Email -");
	private final JLabel lblNewLabel_3_1_2_3_2 = new JLabel("Contact No. -");
	private final JLabel lblNewLabel_3_1_2_3_1_1 = new JLabel("Email - ");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aboutmain window = new Aboutmain();
					window.frmAboutMainPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Aboutmain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAboutMainPage = new JFrame();
		frmAboutMainPage.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Eclipse\\WorkSpace\\Uniteconversion\\src\\img\\Inkeddownload_LI.jpg"));
		frmAboutMainPage.setTitle("About main page ");
		frmAboutMainPage.setBounds(100, 100, 704, 476);
		frmAboutMainPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAboutMainPage.getContentPane().setLayout(null);
		lblNewLabel.setBounds(241, 0, 205, 29);
		lblNewLabel.setForeground(new Color(135, 206, 235));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmAboutMainPage.getContentPane().add(lblNewLabel);
		lblNewLabel_1.setBounds(10, 45, 338, 22);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		frmAboutMainPage.getContentPane().add(lblNewLabel_1);
		lblNewLabel_2.setBounds(347, 45, 331, 22);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		frmAboutMainPage.getContentPane().add(lblNewLabel_2);
		lblNewLabel_1_1.setBounds(10, 65, 421, 22);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		frmAboutMainPage.getContentPane().add(lblNewLabel_1_1);
		lblNewLabel_1_1_1.setBounds(429, 65, 259, 22);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		frmAboutMainPage.getContentPane().add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_2.setBounds(10, 87, 357, 22);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		frmAboutMainPage.getContentPane().add(lblNewLabel_1_1_2);
		lblNewLabel_1_1_2_1.setBounds(367, 87, 321, 22);
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		frmAboutMainPage.getContentPane().add(lblNewLabel_1_1_2_1);
		lblNewLabel_1_1_2_1_1.setBounds(10, 109, 77, 22);
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		frmAboutMainPage.getContentPane().add(lblNewLabel_1_1_2_1_1);
		lblFeedback.setBounds(242, 156, 205, 29);
		lblFeedback.setForeground(new Color(135, 206, 235));
		lblFeedback.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeedback.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		frmAboutMainPage.getContentPane().add(lblFeedback);
		lblNewLabel_1_2.setBounds(10, 205, 668, 22);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		frmAboutMainPage.getContentPane().add(lblNewLabel_1_2);
		lblNewLabel_1_2_1.setBounds(10, 223, 668, 22);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		frmAboutMainPage.getContentPane().add(lblNewLabel_1_2_1);
		lblNewLabel_1_2_1_1.setBounds(10, 242, 668, 22);
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		frmAboutMainPage.getContentPane().add(lblNewLabel_1_2_1_1);
		btnNewButton.setBounds(10, 6, 62, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAboutMainPage.setVisible(false);
			}
		});
		
		frmAboutMainPage.getContentPane().add(btnNewButton);
		
		JLabel lblContactUs = new JLabel("Contact Us");
		lblContactUs.setBounds(241, 281, 205, 29);
		lblContactUs.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactUs.setForeground(new Color(135, 206, 235));
		lblContactUs.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmAboutMainPage.getContentPane().add(lblContactUs);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Contact us at -");
		lblNewLabel_1_2_1_1_1.setBounds(10, 320, 86, 22);
		lblNewLabel_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frmAboutMainPage.getContentPane().add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("weightandscaleconversion@gmail.com");
		lblNewLabel_3.setBounds(97, 320, 259, 22);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmAboutMainPage.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("D.G.Wadgane");
		lblNewLabel_3_1.setBounds(10, 368, 250, 22);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmAboutMainPage.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("S.B.Shitole");
		lblNewLabel_3_1_1.setBounds(347, 368, 250, 22);
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmAboutMainPage.getContentPane().add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("+91 9370366744");
		lblNewLabel_3_1_2.setBounds(86, 388, 110, 22);
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmAboutMainPage.getContentPane().add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("+91 8645963333");
		lblNewLabel_3_1_2_1.setBounds(429, 388, 110, 22);
		lblNewLabel_3_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmAboutMainPage.getContentPane().add(lblNewLabel_3_1_2_1);
		lblNewLabel_3_1_2_2.setBounds(55, 407, 205, 22);
		lblNewLabel_3_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		frmAboutMainPage.getContentPane().add(lblNewLabel_3_1_2_2);
		lblNewLabel_3_1_2_3.setBounds(10, 388, 86, 22);
		lblNewLabel_3_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		frmAboutMainPage.getContentPane().add(lblNewLabel_3_1_2_3);
		lblNewLabel_3_1_2_3_1.setBounds(10, 407, 46, 22);
		lblNewLabel_3_1_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		frmAboutMainPage.getContentPane().add(lblNewLabel_3_1_2_3_1);
		lblNewLabel_3_1_2_3_2.setBounds(345, 388, 86, 22);
		lblNewLabel_3_1_2_3_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		frmAboutMainPage.getContentPane().add(lblNewLabel_3_1_2_3_2);
		lblNewLabel_3_1_2_3_1_1.setBounds(345, 407, 46, 22);
		lblNewLabel_3_1_2_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		frmAboutMainPage.getContentPane().add(lblNewLabel_3_1_2_3_1_1);
		
		JLabel lblNewLabel_3_1_2_2_1 = new JLabel("sshitole3333@gmail.com");
		lblNewLabel_3_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1_2_2_1.setBounds(392, 407, 205, 22);
		frmAboutMainPage.getContentPane().add(lblNewLabel_3_1_2_2_1);
	}
}
