import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JScrollBar;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	int xx,xy;
	private JPasswordField pass;
	private JPasswordField confirmpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 354);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(205, 88, 207, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(407, 106, -198, 15);
		contentPane.add(separator);
		
		JLabel lblUserName = new JLabel("User name");
		lblUserName.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblUserName.setForeground(Color.BLUE);
		lblUserName.setBounds(205, 55, 207, 22);
		contentPane.add(lblUserName);
		
		JLabel lblPassward = new JLabel("passward");
		lblPassward.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblPassward.setForeground(Color.BLUE);
		lblPassward.setBounds(205, 119, 207, 22);
		contentPane.add(lblPassward);
		
		JLabel label = new JLabel("");
		label.setBounds(241, 36, 46, 14);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 5, 2);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx =e.getX();
				xy =e.getY();	
			}
		});
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x = arg0.getXOnScreen();

		        int y = arg0.getYOnScreen();

		       Home.this.setLocation(x - xx, y - xy);  
			}
		});
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(-11, -26, 665, 381);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(309, 7, 10, 10);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(324, 7, 10, 10);
		panel.add(panel_2);
		
		Button button = new Button("Signup");
		button.setBounds(239, 285, 169, 22);
		panel.add(button);
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(204, 0, 51));
		
		JLabel lblX_1 = new JLabel("x");
		lblX_1.addMouseListener(new MouseAdapter() {
			@Override
		//verride
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblX_1.setForeground(new Color(255, 0, 0));
		lblX_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblX_1.setBounds(537, 26, 16, 22);
		panel.add(lblX_1);
		
		pass = new JPasswordField();
		pass.setBounds(219, 175, 203, 20);
		panel.add(pass);
		
		JLabel lblConfirmPassward = new JLabel("confirm passward");
		lblConfirmPassward.setForeground(Color.BLUE);
		lblConfirmPassward.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblConfirmPassward.setBounds(219, 208, 207, 22);
		panel.add(lblConfirmPassward);
		
		confirmpass = new JPasswordField();
		confirmpass.setBounds(219, 239, 203, 20);
		panel.add(confirmpass);
		
		JLabel lblLogin = new JLabel("                                            LOGIN");
		lblLogin.setForeground(new Color(0, 153, 204));
		lblLogin.setFont(new Font("The Bold Font", Font.PLAIN, 18));
		lblLogin.setBounds(155, 45, 292, 34);
		panel.add(lblLogin);
		
		JLabel label_1 = new JLabel("");
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setIcon(new ImageIcon(Home.class.getResource("/image/pp (1).jpg")));
		label_1.setBounds(10, 7, 640, 370);
		panel.add(label_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setRollover(true);
		toolBar.setBounds(33, 63, 87, 16);
		panel.add(toolBar);
	}
}
