package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class LogInView extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel = new JLabel("Name");
	private JButton btnLogIn = new JButton("Log In");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInView frame = new LogInView();
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
	public LogInView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(243, 87, 214, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		lblNewLabel.setBounds(43, 93, 89, 12);
		contentPane.add(lblNewLabel);
		
		
		btnLogIn.setBounds(393, 214, 84, 20);
		contentPane.add(btnLogIn);
		btnLogIn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						ChatView frame = new ChatView();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		this.dispose();
	}
}
