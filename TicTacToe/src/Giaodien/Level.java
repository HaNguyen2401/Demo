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

public class Level extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Level frame = new Level();
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
	public Level() {
		setTitle("Tic Tac Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 379);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216,191,216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChooseTheLevel = new JLabel("Chọn cấp độ chơi");
		lblChooseTheLevel.setForeground(new Color(199,21,133));
		lblChooseTheLevel.setFont(new Font("Arial", Font.BOLD, 38));
		lblChooseTheLevel.setBounds(110, 32, 384, 59);
		contentPane.add(lblChooseTheLevel);
		
		JButton btnEasy = new JButton("Dễ");
		btnEasy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MotNguoiChoi frame = new MotNguoiChoi();
				frame.setLocationByPlatform(true);
				frame.setLocationRelativeTo(null);
				frame.setLevel(true);
				frame.setVisible(true);
				Level.this.setVisible(false);
			}
		});
		btnEasy.setVerifyInputWhenFocusTarget(false);
		btnEasy.setForeground(Color.WHITE);
		btnEasy.setFont(new Font("Arial", Font.BOLD, 30));
		btnEasy.setFocusPainted(false);
		btnEasy.setDefaultCapable(false);
		btnEasy.setBounds(new Rectangle(2, 2, 0, 0));
		btnEasy.setBackground(new Color(221,160,221));
		btnEasy.setBounds(194, 137, 176, 47);
		contentPane.add(btnEasy);
		
		JButton btnDifficult = new JButton("Khó");
		btnDifficult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MotNguoiChoi frame = new MotNguoiChoi();
				frame.setLocationByPlatform(true);
				frame.setLocationRelativeTo(null);
				frame.setLevel(false);
				frame.setVisible(true);
				Level.this.setVisible(false);
			}
		});
		btnDifficult.setVerifyInputWhenFocusTarget(false);
		btnDifficult.setForeground(Color.WHITE);
		btnDifficult.setFont(new Font("Arial", Font.BOLD, 30));
		btnDifficult.setFocusPainted(false);
		btnDifficult.setDefaultCapable(false);
		btnDifficult.setBounds(new Rectangle(2, 2, 0, 0));
		btnDifficult.setBackground(new Color(221,160,221));
		btnDifficult.setBounds(194, 225, 176, 47);
		contentPane.add(btnDifficult);
	}
}
