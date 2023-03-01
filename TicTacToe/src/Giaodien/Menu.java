package Giaodien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.Point;
import java.awt.ComponentOrientation;
import javax.swing.JLabel;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JButton btnOnePlayer;
	private JButton btnExit;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setLocationByPlatform(true);
		setForeground(Color.WHITE);
		setTitle("Tic Tac Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 826, 544);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setBackground(new Color(216,191,216));
		contentPane.setForeground(new Color(221,160,221));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnOnePlayer = new JButton("PLAY GAME");
		btnOnePlayer.setForeground(Color.WHITE);
		btnOnePlayer.setFocusPainted(false);
		btnOnePlayer.setHideActionText(true);
		btnOnePlayer.setDefaultCapable(false);
		btnOnePlayer.setHorizontalTextPosition(SwingConstants.CENTER);
		btnOnePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Level fram = new Level();
				fram.setLocationByPlatform(true);
				fram.setLocationRelativeTo(null);
				fram.setVisible(true);
				Menu.this.setVisible(false);
			}
		});
		btnOnePlayer.setVerifyInputWhenFocusTarget(false);
		btnOnePlayer.setFont(new Font("Arial", Font.BOLD, 30));
		btnOnePlayer.setBounds(new Rectangle(10,10,10,10));
		btnOnePlayer.setBackground(new Color(221,160,221));
		btnOnePlayer.setBounds(279, 210, 243, 50);
		contentPane.add(btnOnePlayer);
		
		btnExit = new JButton("EXIT");
		btnExit.setForeground(Color.WHITE);
		btnExit.setFocusPainted(false);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChooseExit frame =  new ChooseExit();
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
			}
		});
		btnExit.setVerifyInputWhenFocusTarget(false);
		btnExit.setFont(new Font("Arial", Font.BOLD, 30));
		btnExit.setDefaultCapable(false);
		btnExit.setBounds(new Rectangle(10,10,10,10));
		btnExit.setBackground(new Color(221,160,221));
		btnExit.setBounds(279, 340, 243, 47);
		contentPane.add(btnExit);
		
		lblNewLabel = new JLabel("Tic Tac Toe");
		lblNewLabel.setForeground(new Color(199,21,133));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 50));
		lblNewLabel.setBounds(260, 82, 355, 47);
		contentPane.add(lblNewLabel);
	}

	
}
