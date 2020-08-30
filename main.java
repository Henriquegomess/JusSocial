package main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main {
	
	public static class App extends JFrame{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public App() {
			super("App");
			setSize(300, 500);
			setLocationRelativeTo(null);
			setLayout(new FlowLayout(1, 500, 5));
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

	}

	public static class Menu extends JFrame{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JLabel lbUsername, lbPassword;
		private JTextField txUsername;
		private JPasswordField txPassword;
		private JButton btLogin, btSignUp;
		
		public Menu() {
			super("Menu");
			setSize(300, 500);
			setLocationRelativeTo(null);
			setLayout(new FlowLayout(1, 500, 5));
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			lbUsername = new JLabel("Email");
			add(lbUsername);

			txUsername = new JTextField(10);
			add(txUsername);

			lbPassword = new JLabel("Senha");
			add(lbPassword);

			txPassword = new JPasswordField(10);
			add(txPassword);

			btLogin = new JButton("Login");
			add(btLogin);

			btSignUp = new JButton("Sign Up");
			add(btSignUp);
			
			btLogin.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					dispose();
					App app = new App();
					app.setVisible(true);
				}
			});
			
			
		}

	}
	
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		
	}

}
