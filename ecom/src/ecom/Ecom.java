package ecom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ecom {

	private JFrame frame;
	int i=0;
	int bill=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ecom window = new Ecom();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ecom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 713, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amazon");
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 45));
		lblNewLabel.setBounds(256, 24, 196, 61);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Pictures\\1.PNG"));
		lblNewLabel_1.setBounds(35, 126, 179, 227);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Pictures\\3.PNG"));
		lblNewLabel_2.setBounds(259, 126, 177, 227);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Pictures\\Capture.PNG"));
		lblNewLabel_3.setBounds(471, 126, 179, 240);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("₹ 255");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_4.setBounds(83, 377, 75, 35);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("₹ 419");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_4_1.setBounds(307, 377, 75, 35);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("₹ 599");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_4_2.setBounds(516, 377, 75, 35);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		JLabel lb = new JLabel("Cart : 0");
		lb.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lb.setBounds(567, 11, 96, 41);
		frame.getContentPane().add(lb);
		JLabel lb1 = new JLabel("Bill : 0");
		lb1.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lb1.setBounds(567, 44, 111, 41);
		frame.getContentPane().add(lb1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Downloads\\4.png"));
		lblNewLabel_6.setBounds(516, 11, 46, 37);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Add To Cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("Cart : "+i);
				bill=bill+255;
				lb1.setText("Bill : "+ bill);
				
			}
		});
		
		
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(34, 139, 34));
		btnNewButton.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 15));
		btnNewButton.setBounds(61, 423, 134, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add To Cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("Cart : "+i);
				bill=bill+419;
				lb1.setText("Bill : "+ bill);
				
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 15));
		btnNewButton_1.setBackground(new Color(34, 139, 34));
		btnNewButton_1.setBounds(286, 423, 134, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add To Cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("Cart : "+i);
				bill=bill+599;
				lb1.setText("Bill : "+ bill);
			}
		});
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 15));
		btnNewButton_2.setBackground(new Color(34, 139, 34));
		btnNewButton_2.setBounds(497, 423, 134, 35);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Downloads\\Amazon-logo-meaning (2).jpg"));
		lblNewLabel_5.setBounds(-12, 11, 75, 55);
		frame.getContentPane().add(lblNewLabel_5);
		
		
	}
}
