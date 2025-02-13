package com.yukito.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AdmFuncWin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdmFuncWin frame = new AdmFuncWin();
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
	public AdmFuncWin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdmFuncWin.class.getResource("/images/logo.ico")));
		setResizable(false);
		setTitle("功能一览");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		setLocationRelativeTo(null); // 窗体居中
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("功能一览");
		lblNewLabel.setFont(new Font("隶书", Font.BOLD, 35));
		
		JButton checkBookButton = new JButton("书籍信息查询");
		checkBookButton.setBackground(new Color(255, 255, 255));
		checkBookButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkBookActionPerformed(e);
			}
		});
		checkBookButton.setFont(new Font("楷体", Font.BOLD, 16));
		
		JButton saleButton = new JButton("销售管理");
		saleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saleActionPerformed(e);
			}
		});
		saleButton.setBackground(new Color(255, 255, 255));
		saleButton.setFont(new Font("楷体", Font.BOLD, 16));
		
		JButton inventoryButton = new JButton("库存管理");
		inventoryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inventoryActionPerformed(e);
			}
		});
		inventoryButton.setBackground(new Color(255, 255, 255));
		inventoryButton.setFont(new Font("楷体", Font.BOLD, 16));
		
		JButton exitButton = new JButton("退出");
		exitButton.setBackground(new Color(255, 255, 255));
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exitActionPerformed(e);
			}
		});
		exitButton.setFont(new Font("楷体", Font.BOLD, 16));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(320)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(exitButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
						.addComponent(inventoryButton, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
						.addComponent(checkBookButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(saleButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
					.addGap(314))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(36)
					.addComponent(lblNewLabel)
					.addGap(34)
					.addComponent(checkBookButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addComponent(saleButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(inventoryButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(89, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

	/**
	 * 打开销售管理界面
	 * @param e
	 */
	private void saleActionPerformed(ActionEvent e) {
		SalesManageWin saleManageWin = new SalesManageWin();
		saleManageWin.setVisible(true);
	}

	/**
	 * 打开库存管理界面
	 * @param e
	 */
	private void inventoryActionPerformed(ActionEvent e) {
		InventoryManageWin inventoryManageWin = new InventoryManageWin();
		inventoryManageWin.setVisible(true);
	}

	/**
	 * 打开书籍信息查询界面
	 * @param e
	 */
	private void checkBookActionPerformed(ActionEvent e) {
		BookInfoCheckWin bookInfoCheckWin = new BookInfoCheckWin();
		bookInfoCheckWin.setVisible(true);
	}

	/**
	 * 返回登录界面
	 * @param e
	 */
	private void exitActionPerformed(ActionEvent e) {
		if (JOptionPane.showConfirmDialog(null, "是否返回登录界面？", "提示信息", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
			LoginWin loginWin = new LoginWin();
			this.setVisible(false);
			loginWin.setVisible(true);
		}
	}
}
