package Giaodien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hoa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hoa frame = new Hoa();
					frame.setLocationRelativeTo(null);
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
	public Hoa() {
		setTitle("Tic Tac Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 254);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216,191,216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDraw = new JLabel("Hòa");
		lblDraw.setForeground(new Color(199,21,133));
		lblDraw.setFont(new Font("Arial", Font.BOLD, 40));
		lblDraw.setBounds(166, 29, 106, 59);
		contentPane.add(lblDraw);
		
		JButton btnOk = new JButton("Đồng Ý");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hoa.this.setVisible(false);
			}
		});
		btnOk.setVerifyInputWhenFocusTarget(false);
		btnOk.setForeground(Color.WHITE);
		btnOk.setFont(new Font("Arial", Font.BOLD, 30));
		btnOk.setFocusPainted(false);
		btnOk.setDefaultCapable(false);
		btnOk.setBounds(new Rectangle(2, 2, 0, 0));
		btnOk.setBackground(new Color(221,160,221));
		btnOk.setBounds(125, 125, 170, 47);
		contentPane.add(btnOk);
	}

}
