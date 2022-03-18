package vieuw;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import java.awt.BorderLayout;
import javax.swing.JToggleButton;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginView {

	private JFrame frame;
	private static JTextField txtLogin;
	private static JPasswordField passwordField;
	private static JButton btnNewButton;
	private static JLabel buttonStatusConnect;
	
	
	
	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Renaud Vidal\\eclipse-workspace\\BiotrakerCoeur\\IMG\\logoBio.png"));
		frame.setResizable(false);
		frame.setBounds(100, 100, 344, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(121, 152, 97, 20);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(121, 183, 97, 20);
		frame.getContentPane().add(passwordField);
		
		btnNewButton = new JButton("Se Connecter\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(121, 214, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		buttonStatusConnect = new JLabel("");
		buttonStatusConnect.setForeground(Color.ORANGE);
		buttonStatusConnect.setHorizontalAlignment(SwingConstants.CENTER);
		buttonStatusConnect.setBounds(56, 233, 244, 38);
		frame.getContentPane().add(buttonStatusConnect);
		
				
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Renaud Vidal\\eclipse-workspace\\BiotrakerCoeur\\IMG\\logoBio.png").getImage().getScaledInstance(120, 150, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(106, 0, 127, 141);
		frame.getContentPane().add(lblNewLabel);
		
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public static JTextField getTxtLogin() {
		return txtLogin;
	}

	public static void setTxtLogin(JTextField txtLogin) {
		LoginView.txtLogin = txtLogin;
	}

	public static JPasswordField getPasswordField() {
		return passwordField;
	}

	public static void setPasswordField(JPasswordField passwordField) {
		LoginView.passwordField = passwordField;
	}

	public static JButton getBtnNewButton() {
		return btnNewButton;
	}

	public static void setBtnNewButton(JButton btnNewButton) {
		LoginView.btnNewButton = btnNewButton;
	}

	public static JLabel getButtonStatusConnect() {
		return buttonStatusConnect;
	}
}
